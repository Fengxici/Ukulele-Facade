package timing.ukulele.facade.portal;

import timing.ukulele.common.data.ResponseData;
import timing.ukulele.data.portal.data.DeptTree;
import timing.ukulele.data.portal.view.SysDeptVO;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 部门管理
 * </p>
 */
public interface IDeptFacade {

    /**
     * 通过ID查询
     *
     * @param id ID
     * @return SysDept
     */
    ResponseData<SysDeptVO> get(Long id);

    /**
     * 根据参数获取部门列表
     *
     * @param params 参数集合
     * @return 部门列表
     */
    ResponseData<List<SysDeptVO>> getDeptByParam(Map<String, Object> params);

    /**
     * 返回树形菜单集合
     *
     * @return 树形部门
     */
    ResponseData<List<DeptTree>> getDeptTree();

    /**
     * 添加
     *
     * @param sysDept 实体
     * @return success/false
     */
    ResponseData<Boolean> add(SysDeptVO sysDept);

    /**
     * 删除
     *
     * @param id ID
     * @return success/false
     */
    ResponseData<Boolean> delete(Long id);

    /**
     * 编辑
     *
     * @param sysDept 实体
     * @return success/false
     */
    ResponseData<Boolean> edit(SysDeptVO sysDept);
}
