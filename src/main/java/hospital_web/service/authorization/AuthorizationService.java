package hospital_web.service.authorization;

public interface AuthorizationService {
    void registryAccount(String login, String password);

    void authorization(String login, String password);
}
