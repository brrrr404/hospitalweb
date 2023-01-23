package hospital_web.entity.common;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;

@Entity
@Table(name = "sec_user")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SecUser extends BaseEntityWithArchive {

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;
}
