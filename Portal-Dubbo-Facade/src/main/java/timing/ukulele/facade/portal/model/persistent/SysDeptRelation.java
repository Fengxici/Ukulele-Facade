package timing.ukulele.facade.portal.model.persistent;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("sys_dept_relation")
public class SysDeptRelation implements Serializable {

    /**
     * 祖先节点
     */
    private Long ancestor;
    /**
     * 后代节点
     */
    private Long descendant;


}
