package timing.ukulele.facade.portal.api;

import org.springframework.web.bind.annotation.*;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.facade.portal.model.persistent.SysAntIcon;

import java.util.List;
import java.util.Map;

@RequestMapping("/ant-icon")
public interface IAntIconFacade {
    /**
     * 通过ID查询
     *
     * @param id ID
     * @return SysDept
     */
    @GetMapping("/{id}")
    ResponseData<SysAntIcon> get(@PathVariable(value = "id") Long id);

    /**
     * 根据参数获取列表
     *
     * @param params 参数集合
     * @return 列表
     */
    @GetMapping("/getByParam")
    ResponseData<List<SysAntIcon>> getDeptByParam(@RequestParam("params") Map<String, Object> params);


    /**
     * 添加
     *
     * @param sysAntIcon 实体
     * @return success/false
     */
    @PostMapping()
    ResponseData<Boolean> add(@RequestBody SysAntIcon sysAntIcon);
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
     * @param sysAntIcon 实体
     * @return success/false
     */
    @PutMapping()
    ResponseData<Boolean> edit(@RequestBody SysAntIcon sysAntIcon);
}
