package google.drivetch.domain;

import google.drivetch.domain.*;
import google.drivetch.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private String fileId;
    private String url;
}
