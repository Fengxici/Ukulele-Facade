package timing.ukulele.facade.portal.model.data;

import lombok.Data;
import lombok.EqualsAndHashCode;
import timing.ukulele.common.data.TreeNode;
import timing.ukulele.facade.portal.model.view.AntIconVO;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class AntMenuTree extends TreeNode {
    private String key;
    private String text;
    private String i18n;
    private Boolean group;
    private String link;
    private Boolean linkExact;
    private String externalLink;
    private String target;
    private Long iconId;
    private Integer badge;
    private Boolean badgeDot;
    private String badgeStatus;
    private Boolean disabled;
    private Boolean hide;
    private Boolean hideInBreadcrumb;
    private List<String> acl;
    private Boolean shortcut;
    private Boolean shortcutRoot;
    private Boolean reuse;
    private Boolean open;
    private AntIconVO icon;
}
