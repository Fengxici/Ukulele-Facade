package timing.ukulele.facade.portal.api;


import com.github.pagehelper.Page;
import org.springframework.web.bind.annotation.*;
import timing.ukulele.common.data.ResponseVO;
import timing.ukulele.facade.portal.model.persistent.SysDict;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 字典表 前端控制器
 * </p>
 */
@RequestMapping("/dict")
public interface IDictService {

    /**
     * 通过ID查询字典信息
     *
     * @param id ID
     * @return 字典信息
     */
    @GetMapping("/{id}")
    SysDict dict(@PathVariable Integer id);

    /**
     * 分页查询字典信息
     *
     * @param params 分页对象
     * @return 分页对象
     */
    @GetMapping("/dictPage")
    Page dictPage(@RequestParam Map<String, Object> params);

    /**
     * 通过字典类型查找字典
     *
     * @param type 类型
     * @return 同类型字典
     */
    @GetMapping("/type/{type}")
    List<SysDict> findDictByType(@PathVariable String type);

    /**
     * 添加字典
     *
     * @param sysDict 字典信息
     * @return success、false
     */
    @PostMapping
    ResponseVO dict(@RequestBody SysDict sysDict);

    /**
     * 删除字典，并且清除字典缓存
     *
     * @param id   ID
     * @param type 类型
     * @return R
     */
    @DeleteMapping("/{id}/{type}")
    ResponseVO deleteDict(@PathVariable Integer id, @PathVariable String type);

    /**
     * 修改字典
     *
     * @param sysDict 字典信息
     * @return success/false
     */
    @PutMapping
    ResponseVO editDict(@RequestBody SysDict sysDict);
}
