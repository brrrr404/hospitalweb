package hospital_web.service.authorization;

import hospital_web.entity.common.SecUser;
import hospital_web.exception.BusinessException;
import hospital_web.repository.SecUserRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;

@Service
@RequiredArgsConstructor
public class AuthorizationServiceImpl implements AuthorizationService {

    private final static String MODIFICATION = "SecretShop";

    private final SecUserRepository secUserRepository;

    @Override
    public void registryAccount(String login, String password) {
        validLogin(login);

        SecUser secUser = new SecUser();
        secUser.setLogin(login);
        secUser.setPassword(getModificationPassword(password));

        secUserRepository.save(secUser);
    }

    @Override
    public void authorization(String login, String password) {
        SecUser account = secUserRepository.findByLoginAndArchiveTsIsNull(login)
                .orElseThrow(() -> new BusinessException("Указанного пользователя не существует"));

        password = getModificationPassword(password);

        if (!password.equals(account.getPassword())) {
            throw new BusinessException("Указан неверный пароль");
        }
    }

    public void registryProfile() {
    }

    @SneakyThrows
    private String getModificationPassword(String password) {
        MessageDigest md = MessageDigest.getInstance("MD5");

        String newPassword = password + MODIFICATION;
        md.update(newPassword.getBytes());
        byte[] digest = md.digest();
        return DatatypeConverter.printHexBinary(digest).toUpperCase();
    }

    private void validLogin(String login) {
        boolean existsLogin = secUserRepository.existsByLoginAndArchiveTsIsNull(login);

        if (existsLogin) {
            throw new BusinessException("Данный логин занят другим пользователем.");
        }
    }
}
