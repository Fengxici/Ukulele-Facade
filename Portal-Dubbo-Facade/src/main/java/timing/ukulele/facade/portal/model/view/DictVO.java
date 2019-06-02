package timing.ukulele.facade.portal.model.view;

import lombok.Data;

/**
 * 字典视图对象
 */
@Data
public class DictVO {
    /**
     * 主键
     */
    private Long id;
    /**
     * 数据值
     */
    private String value;
    /**
     * 标签名
     */
    private String label;
    /**
     * 索引表id
     */
    private Long indexId;
    /**
     * 排序（升序）
     */
    private Integer sort;
    /**
     * 备注信息
     */
    private String remark;
    /**
     * 启警用
     */
    private Boolean enable;
}
