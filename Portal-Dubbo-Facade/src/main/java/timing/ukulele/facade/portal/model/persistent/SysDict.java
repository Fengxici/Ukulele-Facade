package timing.ukulele.facade.portal.model.persistent;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import timing.ukulele.persistence.model.BaseModel;

import java.math.BigDecimal;

/**
 * <p>
 * 字典表
 * </p>
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("sys_dict")
public class SysDict extends BaseModel {

    /**
     * 数据值
     */
    @TableField("value_")
    private String value;
    /**
     * 标签名
     */
    @TableField("label_")
    private String label;
    /**
     * 类型
     */
    @TableField("type_")
    private String type;
    /**
     * 描述
     */
    @TableField("description_")
    private String description;
    /**
     * 排序（升序）
     */
    @TableField("sort_")
    private BigDecimal sort;
    /**
     * 备注信息
     */
    @TableField("remark_")
    private String remark;

}
