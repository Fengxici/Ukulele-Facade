package timing.ukulele.facade.portal.model.view;

import lombok.Data;

import java.io.Serializable;

@Data
public class AntIconVO implements Serializable {
    private Long id;
    private Boolean enable;
    private String type;
    private String value;
    private String theme;
    private Boolean spin;
    private String twoToneColor;
    private String iconfont;
}
