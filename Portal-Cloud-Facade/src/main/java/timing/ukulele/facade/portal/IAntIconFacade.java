package timing.ukulele.facade.portal;

import org.springframework.web.bind.annotation.*;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.data.portal.view.AntIconVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/ant-icon")
public interface IAntIconFacade {
    /**
     * 通过ID查询
     *
     * @param id ID
     * @return SysDept
     */
    @GetMapping("/{id}")
    ResponseData<AntIconVO> get(@PathVariable(value = "id") Long id);

    /**
     * 根据参数获取列表
     *
     * @param request 参数集合
     * @return 列表
     */
    @GetMapping("/getByParam")
    ResponseData<List<AntIconVO>> getByParam(HttpServletRequest request);


    /**
     * 添加
     *
     * @param sysAntIcon 实体
     * @return success/false
     */
    @PostMapping()
    ResponseData<Boolean> add(@RequestBody AntIconVO sysAntIcon);
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
    ResponseData<Boolean> edit(@RequestBody AntIconVO sysAntIcon);
}
