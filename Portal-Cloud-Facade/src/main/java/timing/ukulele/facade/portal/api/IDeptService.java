package timing.ukulele.facade.portal.api;

import org.springframework.web.bind.annotation.*;
import timing.ukulele.facade.portal.model.data.DeptTree;
import timing.ukulele.facade.portal.model.persistent.SysDept;

import java.util.List;

/**
 * <p>
 * 部门管理 前端控制器
 * </p>
 */
//@RequestMapping("/dept")
public interface IDeptService {

    /**
     * 通过ID查询
     *
     * @param id ID
     * @return SysDept
     */
    @GetMapping("/dept/{id}")
    SysDept get(@PathVariable(value="id") Integer id);

    /**
     * 返回树形菜单集合
     *
     * @return 树形菜单
     */
    @GetMapping(value = "/dept/tree")
    List<DeptTree> getDeptTree() ;

    /**
     * 添加
     *
     * @param sysDept 实体
     * @return success/false
     */
    @PostMapping(value="/dept")
    Boolean add(@RequestBody SysDept  sysDept);

    /**
     * 删除
     *
     * @param id ID
     * @return success/false
     */
    @DeleteMapping("/dept/{id}")
    Boolean delete(@PathVariable(value="id") Integer id);

    /**
     * 编辑
     *
     * @param sysDept 实体
     * @return success/false
     */
    @PutMapping("/dept")
    Boolean edit(@RequestBody SysDept sysDept) ;
}
