package timing.ukulele.facade.portal.model.view;

import lombok.Data;
import timing.ukulele.facade.portal.model.persistent.AntIcon;

import java.io.Serializable;

@Data
public class AntMenuVO implements Serializable {
    private Long id;
    private Boolean enable;
    private Boolean parentId;
    private String key;
    private String text;
    private String i18n;
    private Boolean group;
    private String link;
    private Boolean linkExact;
    private String externalLink;
    private String target;
    private String icon;
    private Long iconId;
    private Integer badge;
    private Boolean badgeDot;
    private String badgeStatus;
    private Boolean disabled;
    private Boolean hide;
    private Boolean hideInBreadcrumb;
    private String acl;
    private Boolean shortcut;
    private Boolean shortcutRoot;
    private Boolean reuse;
    private Boolean open;
    private AntIcon antIcon;
}
