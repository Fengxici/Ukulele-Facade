package timing.ukulele.facade.portal.model.persistent;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import timing.ukulele.persistence.model.BaseModel;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("sys_ant_icon")
public class SysAntIcon extends BaseModel {
    @TableField("type_")
    private String type;
    @TableField("value_")
    private String value;
    @TableField("theme_")
    private String theme;
    @TableField("spin_")
    private boolean spin;
    private String twoToneColor;
    @TableField("iconfont_")
    private String iconfont;
}