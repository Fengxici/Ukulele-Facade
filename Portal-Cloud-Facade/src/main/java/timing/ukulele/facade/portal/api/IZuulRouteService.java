package timing.ukulele.facade.portal.api;

import com.github.pagehelper.Page;
import org.springframework.web.bind.annotation.*;
import timing.ukulele.common.data.ResponseVO;
import timing.ukulele.facade.portal.model.persistent.SysZuulRoute;

import java.util.Map;

/**
 * <p>
 * 动态路由配置表 前端控制器
 * </p>
 */
//@RequestMapping("/route")
public interface IZuulRouteService {
    /**
     * 通过ID查询
     *
     * @param id ID
     * @return SysZuulRoute
     */
    @GetMapping("/route/{id}")
    SysZuulRoute get(@PathVariable(value="id") long id);

    /**
     * 分页查询信息
     *
     * @param params 分页对象
     * @return 分页对象
     */
    @GetMapping("/route/page")
    Page page(@RequestParam Map<String, Object> params);

    /**
     * 添加
     *
     * @param sysZuulRoute 实体
     * @return success/false
     */
    @PostMapping("/route")
    ResponseVO add(@RequestBody SysZuulRoute sysZuulRoute);

    /**
     * 删除
     *
     * @param id ID
     * @return success/false
     */
    @DeleteMapping("/route/{id}")
    ResponseVO delete(@PathVariable(value="id") long id);

    /**
     * 编辑
     *
     * @param sysZuulRoute 实体
     * @return success/false
     */
    @PutMapping("/route")
    ResponseVO edit(@RequestBody SysZuulRoute sysZuulRoute);

    /**
     * 刷新配置
     *
     * @return success/fasle
     */
    @GetMapping("/route/apply")
    ResponseVO apply();
}
