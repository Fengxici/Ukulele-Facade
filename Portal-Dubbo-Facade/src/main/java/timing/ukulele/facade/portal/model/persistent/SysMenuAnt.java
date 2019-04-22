package timing.ukulele.facade.portal.model.persistent;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import timing.ukulele.persistence.model.BaseModel;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("sys_menu_ant")
public class SysMenuAnt extends BaseModel {
    private long parentId;
    @TableField("key_")
    private String key;
    @TableField("text_")
    private String text;
    @TableField("i18n_")
    private String i18n;
    @TableField("group_")
    private boolean group;
    @TableField("link_")
    private String link;
    private boolean linkExact;
    private String externalLink;
    @TableField("target_")
    private String target;
    @TableField("icon_")
    private long icon;
    @TableField("disabled_")
    private boolean disabled;
    @TableField("hide_")
    private boolean hide;
    private boolean hideInBreadcrumb;
    @TableField("acl_")
    private String acl;
    @TableField("shortcut_")
    private boolean shortcut;
    private boolean shortcutRoot;
    @TableField("reuse_")
    private boolean reuse;
    @TableField("open_")
    private boolean open;

    @TableField(exist = false)
    private SysAntIcon antIcon;
}
