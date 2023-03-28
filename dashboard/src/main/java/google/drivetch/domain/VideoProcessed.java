package google.drivetch.domain;

import google.drivetch.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private String fileId;
    private String url;
}
