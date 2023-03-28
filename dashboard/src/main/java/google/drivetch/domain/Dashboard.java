package google.drivetch.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Dashboard_table")
@Data
public class Dashboard {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Integer size;
    private String path;
    private String name;
    private Boolean isUploaded;
    private Boolean isIndexed;
    private String videoUrl;
}
