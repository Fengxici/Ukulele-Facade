package timing.ukulele.facade.portal.model.data;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 部门树
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DeptTree extends TreeNode {
    private String name;
}
