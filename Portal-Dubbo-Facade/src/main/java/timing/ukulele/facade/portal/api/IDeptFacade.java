package timing.ukulele.facade.portal.api;

import org.springframework.web.bind.annotation.*;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.facade.portal.model.data.DeptTree;
import timing.ukulele.facade.portal.model.persistent.SysDept;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 部门管理
 * </p>
 */
@RequestMapping("/dept")
public interface IDeptFacade {

    /**
     * 通过ID查询
     *
     * @param id ID
     * @return SysDept
     */
    @GetMapping("/{id}")
    ResponseData<SysDept> get(@PathVariable(value = "id") Long id);

    /**
     * 根据参数获取部门列表
     *
     * @param params 参数集合
     * @return 部门列表
     */
    @GetMapping("/getByParam")
    ResponseData<List<SysDept>> getDeptByParam(@RequestParam("params") Map<String, Object> params);

    /**
     * 返回树形菜单集合
     *
     * @return 树形菜单
     */
    @GetMapping(value = "/tree")
    ResponseData<List<DeptTree>> getDeptTree();

    /**
     * 添加
     *
     * @param sysDept 实体
     * @return success/false
     */
    @PostMapping()
    ResponseData<Boolean> add(@RequestBody SysDept sysDept);
    /**
     * 删除
     *
     * @param id ID
     * @return success/false
     */
    @DeleteMapping("/{id}")
    ResponseData<Boolean> delete(@PathVariable(value = "id") Long id);

    /**
     * 编辑
     *
     * @param sysDept 实体
     * @return success/false
     */
    @PutMapping()
    ResponseData<Boolean> edit(@RequestBody SysDept sysDept);
}
