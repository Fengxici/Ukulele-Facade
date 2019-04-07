package timing.ukulele.facade.portal.model.persistent;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import timing.ukulele.persistence.model.BaseModel;

/**
 * <p>
 * 角色与部门对应关系
 * </p>
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("sys_role_dept")
public class SysRoleDept extends BaseModel {
    /**
     * 角色ID
     */
    private Long roleId;
    /**
     * 部门ID
     */
    private Long deptId;
}
