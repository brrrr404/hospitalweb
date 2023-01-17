package hospital_web.entity;

import hospital_web.entity.common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "staff")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Staff extends BaseEntity {

    @OneToOne(targetEntity = User.class, fetch = FetchType.LAZY)
    @Column(name = "id_user")
    private User user;

    @Column(name = "department")
    private String department;

    @Column(name = "position")
    private String position;
}
