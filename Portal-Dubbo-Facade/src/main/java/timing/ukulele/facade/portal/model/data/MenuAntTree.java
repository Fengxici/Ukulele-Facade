package timing.ukulele.facade.portal.model.data;

import lombok.Data;
import lombok.EqualsAndHashCode;
import timing.ukulele.common.data.TreeNode;
import timing.ukulele.facade.portal.model.persistent.SysAntIcon;

@EqualsAndHashCode(callSuper = true)
@Data
public class MenuAntTree extends TreeNode {
    private Boolean enable;
    private String key;
    private String text;
    private String i18n;
    private boolean group;
    private String link;
    private boolean linkExact;
    private String externalLink;
    private String target;
    private long icon;
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
    private SysAntIcon antIcon;
}