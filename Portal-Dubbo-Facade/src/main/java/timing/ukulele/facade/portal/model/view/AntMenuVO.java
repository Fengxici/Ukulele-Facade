package timing.ukulele.facade.portal.model.view;

import lombok.Data;
import timing.ukulele.facade.portal.model.persistent.AntIcon;

import java.io.Serializable;

@Data
public class AntMenuVO implements Serializable {
    private Long id;
    private Boolean enable;
    private long parentId;
    private String key;
    private String text;
    private String i18n;
    private boolean group;
    private String link;
    private boolean linkExact;
    private String externalLink;
    private String target;
    private long iconId;
    private String icon;
    private int badge;
    private boolean badgeDot;
    private String badgeStatus;
    private boolean disabled;
    private boolean hide;
    private boolean hideInBreadcrumb;
    private String acl;
    private boolean shortcut;
    private boolean shortcutRoot;
    private boolean reuse;
    private boolean open;
    private AntIcon antIcon;
}