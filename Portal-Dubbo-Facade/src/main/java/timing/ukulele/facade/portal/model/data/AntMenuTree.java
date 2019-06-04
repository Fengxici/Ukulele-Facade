package timing.ukulele.facade.portal.model.data;

import lombok.Data;
import lombok.EqualsAndHashCode;
import timing.ukulele.common.data.TreeNode;
import timing.ukulele.facade.portal.model.persistent.AntIcon;
import timing.ukulele.facade.portal.model.view.AntIconVO;

@EqualsAndHashCode(callSuper = true)
@Data
public class AntMenuTree extends TreeNode {
    private Boolean enable;
    private String key;
    private String text;
    private String i18n;
    private Boolean group;
    private String link;
    private Boolean linkExact;
    private String externalLink;
    private String target;
    private Long iconId;
    private AntIconVO icon;
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
