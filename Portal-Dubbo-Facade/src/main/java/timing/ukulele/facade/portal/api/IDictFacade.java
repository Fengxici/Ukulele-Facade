package timing.ukulele.facade.portal.api;

import org.springframework.web.bind.annotation.*;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.facade.portal.model.persistent.SysDict;

import java.util.List;

/**
 * <p>
 * 字典表
 * </p>
 */
@RequestMapping("/dict")
public interface IDictFacade {

    /**
     * 通过ID查询字典信息
     *
     * @param id ID
     * @return 字典信息
     */
    @GetMapping("/{id}")
    ResponseData<SysDict> dict(@PathVariable(value = "id") Long id);

    /**
     * 通过字典类型查找字典
     *
     * @param type 类型
     * @return 同类型字典
     */
    @GetMapping("/type/{type}")
    ResponseData<List<SysDict>> findDictByType(@PathVariable(value = "type") String type);

    /**
     * 添加字典
     *
     * @param sysDict 字典信息
     * @return success、false
     */
    @PostMapping()
    ResponseData<Boolean> dict(@RequestBody SysDict sysDict);

    /**
     * 删除字典，并且清除字典缓存
     *
     * @param id   ID
     * @param type 类型
     */
    @DeleteMapping("/dict/{id}/{type}")
    ResponseData<Boolean> deleteDict(@PathVariable(value = "id") Long id, @PathVariable(value = "type") String type);

    /**
     * 修改字典
     *
     * @param sysDict 字典信息
     * @return success/false
     */
    @PutMapping()
    ResponseData<Boolean> editDict(@RequestBody SysDict sysDict);
}
