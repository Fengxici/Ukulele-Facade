package timing.ukulele.facade.portal.api;

import com.github.pagehelper.Page;
import org.springframework.web.bind.annotation.*;
import timing.ukulele.common.data.ResponseVO;
import timing.ukulele.facade.portal.model.data.RoleDTO;
import timing.ukulele.facade.portal.model.persistent.SysRole;

import java.util.List;
import java.util.Map;

@RequestMapping("/role")
public interface IRoleService {
    /**
     * 通过ID查询角色信息
     *
     * @param id ID
     * @return 角色信息
     */
    @GetMapping("/{id}")
    SysRole role(@PathVariable Long id);

    /**
     * 添加角色
     *
     * @param roleDto 角色信息
     * @return success、false
     */
    @PostMapping
    ResponseVO role(@RequestBody RoleDTO roleDto);

    /**
     * 修改角色
     *
     * @param roleDto 角色信息
     * @return success/false
     */
    @PutMapping
    ResponseVO roleUpdate(@RequestBody RoleDTO roleDto);

    @DeleteMapping("/{id}")
    ResponseVO roleDel(@PathVariable Long id);

    /**
     * 获取角色列表
     *
     * @param deptId 部门ID
     * @return 角色列表
     */
    @GetMapping("/roleList/{deptId}")
    List<SysRole> roleList(@PathVariable Long deptId);

    /**
     * 分页查询角色信息
     *
     * @param params 分页对象
     * @return 分页对象
     */
    @GetMapping("/rolePage")
    Page rolePage(@RequestParam Map<String, Object> params);

    /**
     * 更新角色菜单
     *
     * @return success、false
     */
    @PutMapping("/roleMenuUpd")
    ResponseVO roleMenuUpd(@RequestBody Map data);
}