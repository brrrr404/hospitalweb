package hospital_web.entity.staff;

import hospital_web.entity.Record;
import hospital_web.entity.Treatment;
import hospital_web.entity.User;
import hospital_web.entity.common.BaseEntity;
import hospital_web.entity.staff.DepartmentType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "staff")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Staff extends BaseEntity {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(name = "department")
    private DepartmentType department;

    @Column(name = "position")
    private String position;

    @OneToMany(mappedBy = "staff")
    private List<Record> recordList = new ArrayList<>();

    @OneToMany(mappedBy = "staff")
    private List<Treatment> treatmentList = new ArrayList<>();
}
