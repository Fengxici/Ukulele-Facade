package timing.ukulele.facade.portal.model.view;

import lombok.Data;

import java.io.Serializable;

/**
 * 部门视图对象
 */
@Data
public class SysDeptVO implements Serializable {
    private Long id;
    private String name;
    /**
     * 排序
     */
    private Integer orderNum;

    private Long parentId;
}
