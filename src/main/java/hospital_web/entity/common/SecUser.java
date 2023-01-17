package hospital_web.entity.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

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
