package hospital_web.entity.common;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@Setter
@Getter
public abstract class BaseEntity {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_ts", nullable = false)
    protected Date createTs;

    @PrePersist
    protected void onCreate() {
        createTs = new Date();
    }

}
