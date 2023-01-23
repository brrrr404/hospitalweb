package hospital_web.repository;

import hospital_web.entity.common.SecUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SecUserRepository extends JpaRepository<SecUser, Long> {

    boolean existsByLoginAndArchiveTsIsNull(String login);

    boolean existsByLoginAndPasswordAndArchiveTsIsNull(String login, String password);

    Optional<SecUser> findByLoginAndArchiveTsIsNull(String login);
}
