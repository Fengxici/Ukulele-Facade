package timing.ukulele.facade.portal.model.persistent;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import timing.ukulele.persistence.model.BaseModel;

/**
 * <p>
 * 部门管理
 * </p>
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("sys_dept")
public class SysDept extends BaseModel {

    /**
     * 部门名称
     */
    @TableField("name_")
    private String name;
    /**
     * 排序
     */
    private Integer orderNum;

    private Long parentId;

}
