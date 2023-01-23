package hospital_web.entity;

import hospital_web.entity.common.BaseEntityWithArchiveComment;
import hospital_web.entity.staff.Staff;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "record")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Record extends BaseEntityWithArchiveComment {

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_staff")
    private Staff staff;

    @OneToOne(mappedBy = "record")
    private Treatment treatment;
}
