package hospital_web.entity.common;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@Setter
@Getter
public abstract class BaseEntityWithArchive extends BaseEntity {

    @Column(name = "archive_ts")
    @Temporal(TemporalType.TIMESTAMP)
    protected Date archiveTs;
}
