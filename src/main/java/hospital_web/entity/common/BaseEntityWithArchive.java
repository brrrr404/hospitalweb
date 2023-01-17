package hospital_web.entity.common;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@Setter
@Getter
public class BaseEntityWithArchive extends BaseEntity {

    @Column(name = "archive_ts", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date archiveTs;
}
