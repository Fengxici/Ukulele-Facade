package timing.ukulele.facade.syslog.api;

import org.springframework.web.bind.annotation.*;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.facade.syslog.model.persistent.SysLog;

import java.util.List;
import java.util.Map;

public interface ILogFacade {
    /**
     * 添加日志
     *
     * @param log 日志实体
     */
    @PostMapping("/log")
    ResponseData<Boolean> add(@RequestBody SysLog log);

    /**
     * 根据ID
     *
     * @param id ID
     * @return success/false
     */
    @DeleteMapping("/{id}")
    ResponseData<Boolean> delete(@PathVariable(value = "id") Long id);


    @GetMapping("/log/getByParam")
    ResponseData<List<SysLog>> getByParam(Map<String, Object> param);

}
