package timing.ukulele.facade.portal.api;

import org.springframework.web.bind.annotation.*;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.common.data.ResponseVO;
import timing.ukulele.facade.portal.model.data.MenuTree;
import timing.ukulele.facade.portal.model.persistent.SysMenu;
import timing.ukulele.facade.portal.model.view.MenuVO;

import java.util.List;

@RequestMapping("/menu")
public interface IMenuFacade {
//+++++++++++++++++++++++++++++ ROLE实体操作 +++++++++++++++++++++++++++++++++++++++++++//

    /**
     * 通过ID查询菜单的详细信息
     *
     * @param id 菜单ID
     * @return 菜单详细信息
     */
    @GetMapping("/{id}")
    SysMenu menu(@PathVariable(value = "id") Long id);

    /**
     * 新增菜单
     *
     * @param sysMenu 菜单信息
     * @return success/false
     */
    @PostMapping()
    ResponseVO menu(@RequestBody SysMenu sysMenu);

    /**
     * 删除菜单
     *
     * @param id 菜单ID
     * @return success/false
     */
    @DeleteMapping("/{id}")
    ResponseVO menuDel(@PathVariable(value = "id") Long id);

    /**
     * 编辑菜单
     *
     * @param sysMenu menu实体
     * @return
     */
    @PutMapping()
    ResponseVO menuUpdate(@RequestBody SysMenu sysMenu);

    /**
     * 返回树形菜单集合
     *
     * @return 树形菜单
     */
    @GetMapping(value = "/allTree")
    List<MenuTree> getMenuTree();

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

//+++++++++++++++++++++++++++++++++ROLE_MENU实体操作++++++++++++++++++++++++++++++++++++++++++++//

    /**
     * 通过角色名称查询用户菜单
     *
     * @param role 角色名称
     * @return 菜单列表
     */
    @GetMapping("/findMenuByRole/{role}")
    List<MenuVO> findMenuByRole(@PathVariable(value = "role") String role);


//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//


    /**
     * 返回当前用户的树形菜单集合
     *
     * @return 当前用户的树形菜单
     */
    @GetMapping(value = "/userMenu")
    List<MenuTree> userMenu(@RequestHeader(name = "x-role-header") String roles);


    @GetMapping("/user/{userId")
    ResponseData<List<SysMenu>> getMenuByUserId(@PathVariable(value = "userId") Long userId);
}
