package timing.ukulele.facade.portal.api;

import org.springframework.web.bind.annotation.*;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.facade.portal.model.data.MenuAntTree;
import timing.ukulele.facade.portal.model.persistent.SysMenuAnt;

import java.util.List;
import java.util.Map;

@RequestMapping("/menu-ant")
public interface IMenuAntFacade {
    /**
     * 通过ID查询
     *
     * @param id ID
     * @return SysDept
     */
    @GetMapping("/{id}")
    ResponseData<SysMenuAnt> get(@PathVariable(value = "id") Long id);

    /**
     * 根据参数获取列表
     *
     * @param params 参数集合
     * @return 列表
     */
    @GetMapping("/getByParam")
    ResponseData<List<SysMenuAnt>> getDeptByParam(@RequestParam("params") Map<String, Object> params);

    /**
     * 返回树形菜单集合
     *
     * @return 树形菜单
     */
    @GetMapping(value = "/tree")
    ResponseData<List<MenuAntTree>> getDeptTree();

    /**
     * 添加
     *
     * @param sysMenuAnt 实体
     * @return success/false
     */
    @PostMapping()
    ResponseData<Boolean> add(@RequestBody SysMenuAnt sysMenuAnt);
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
     * @param sysMenuAnt 实体
     * @return success/false
     */
    @PutMapping()
    ResponseData<Boolean> edit(@RequestBody SysMenuAnt sysMenuAnt);
}
