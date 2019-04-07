package timing.ukulele.facade.portal.model.data;

import lombok.Data;
import lombok.EqualsAndHashCode;
import timing.ukulele.facade.portal.model.persistent.SysRole;

/**
 * 角色Dto
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RoleDTO extends SysRole {
    /**
     * 角色部门Id
     */
    private Long roleDeptId;

    /**
     * 部门名称
     */
    private String deptName;
}
