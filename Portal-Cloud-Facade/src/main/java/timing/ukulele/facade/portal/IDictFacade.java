package timing.ukulele.facade.portal;

import org.springframework.web.bind.annotation.*;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.data.portal.view.DictIndexVO;
import timing.ukulele.data.portal.view.DictVO;

import java.util.List;

/**
 * <p>
 * 字典
 * </p>
 */
@RequestMapping("/dict")
public interface IDictFacade {

    /**
     * 通过ID查询字典项信息
     *
     * @param id ID
     * @return 字典信息
     */
    @GetMapping("/{id}")
    ResponseData<DictVO> dict(@PathVariable(value = "id") Long id);

    /**
     * 添加字典项
     *
     * @param sysDict 字典信息
     * @return success、false
     */
    @PostMapping()
    ResponseData<Boolean> dict(@RequestBody DictVO sysDict);

    /**
     * 修改字典项
     *
     * @param sysDict 字典信息
     * @return success/false
     */
    @PutMapping()
    ResponseData<Boolean> editDict(@RequestBody DictVO sysDict);

    /**
     * 删除字典项
     *
     * @param id id
     * @return
     */
    @DeleteMapping("/{id}")
    ResponseData<Boolean> deleteDict(@PathVariable(value = "id") Long id);

    /**
     * 通过字典索引查找字典
     *
     * @param key 索引键名
     * @return 同类型字典
     */
    @GetMapping("/index/key/{key}")
    ResponseData<List<DictVO>> findDictByIndex(@PathVariable(value = "key") String key);

    /**
     * 通过ID查询字索引信息
     *
     * @param id ID
     * @return 字典信息
     */
    @GetMapping("/index/{id}")
    ResponseData<DictIndexVO> dictIndex(@PathVariable(value = "id") Long id);

    /**
     * 添加字典项
     *
     * @param sysDictIndex 字典索引信息
     * @return success、false
     */
    @PostMapping("/index")
    ResponseData<Boolean> dictIndex(@RequestBody DictIndexVO sysDictIndex);

    /**
     * 修改字典索引
     *
     * @param sysDict 字典索引信息
     * @return success/false
     */
    @PutMapping("/index")
    ResponseData<Boolean> editDictIndex(@RequestBody DictIndexVO sysDict);

    /**
     * 删除字典索引
     *
     * @param id id
     * @return success/false
     */
    @DeleteMapping("/index/{id}")
    ResponseData<Boolean> deleteDictIndex(@PathVariable(value = "id") Long id);

}
