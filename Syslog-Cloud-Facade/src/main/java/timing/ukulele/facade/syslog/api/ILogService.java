package timing.ukulele.facade.syslog.api;

import com.github.pagehelper.Page;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.common.data.ResponseVO;
import timing.ukulele.facade.syslog.model.persistent.SysLog;

import java.util.Map;

public interface ILogService {
    /**
     * 添加日志
     *
     * @param log 日志实体
     */
    @PostMapping("/log")
    ResponseData<SysLog> add(@RequestBody SysLog log);

    /**
     * 分页查询日志信息
     *
     * @param params 分页对象
     * @return 分页对象
     */
    @GetMapping("/logPage")
    Page logPage(@RequestParam Map<String, Object> params);

    /**
     * 根据ID
     *
     * @param id ID
     * @return success/false
     */
    @DeleteMapping("/{id}")
    ResponseVO delete(@PathVariable Long id);

    /**
     * 添加日志
     *
     * @param log    日志实体
     * @param result 错误信息
     */
    @PostMapping
    void add(@RequestBody SysLog log, BindingResult result);
}
