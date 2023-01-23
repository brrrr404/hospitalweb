package hospital_web.entity;

import hospital_web.entity.common.BaseEntity;
import hospital_web.entity.common.SecUser;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User extends BaseEntity {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sec_user")
    private SecUser secUser;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "user")
    private List<Record> recordList = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Treatment> treatmentList = new ArrayList<>();
}
