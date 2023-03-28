package google.drivetch.domain;

import google.drivetch.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private String path;
    private String type;
    private String customerId;
    private Integer size;
}
