package timing.ukulele.facade.portal;

import timing.ukulele.common.data.ResponseData;
import timing.ukulele.data.portal.view.DictIndexVO;
import timing.ukulele.data.portal.view.DictVO;

import java.util.List;

/**
 * <p>
 * 字典
 * </p>
 */
public interface IDictFacade {

    /**
     * 通过ID查询字典项信息
     *
     * @param id ID
     * @return 字典信息
     */
    ResponseData<DictVO> dict(Long id);

    /**
     * 添加字典项
     *
     * @param sysDict 字典信息
     * @return success、false
     */
    ResponseData<Boolean> dict(DictVO sysDict);

    /**
     * 修改字典项
     *
     * @param sysDict 字典信息
     * @return success/false
     */
    ResponseData<Boolean> editDict(DictVO sysDict);

    /**
     * 删除字典项
     *
     * @param id id
     * @return
     */
    ResponseData<Boolean> deleteDict(Long id);

    /**
     * 通过字典索引查找字典
     *
     * @param key 索引键名
     * @return 同类型字典
     */
    ResponseData<List<DictVO>> findDictByIndex(String key);

    /**
     * 通过ID查询字索引信息
     *
     * @param id ID
     * @return 字典信息
     */
    ResponseData<DictIndexVO> dictIndex(Long id);

    /**
     * 添加字典项
     *
     * @param sysDictIndex 字典索引信息
     * @return success、false
     */
    ResponseData<Boolean> dictIndex(DictIndexVO sysDictIndex);

    /**
     * 修改字典索引
     *
     * @param sysDict 字典索引信息
     * @return success/false
     */
    ResponseData<Boolean> editDictIndex(DictIndexVO sysDict);

    /**
     * 删除字典索引
     *
     * @param id id
     * @return success/false
     */
    ResponseData<Boolean> deleteDictIndex(Long id);

}
