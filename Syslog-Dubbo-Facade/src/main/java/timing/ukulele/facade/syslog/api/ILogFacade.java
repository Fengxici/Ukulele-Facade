package timing.ukulele.facade.syslog.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.facade.syslog.model.persistent.SysLog;

public interface ILogFacade {
    /**
     * 添加日志
     *
     * @param log 日志实体
     */
    @PostMapping("/log")
    ResponseData<SysLog> add(@RequestBody SysLog log);

    /**
     * 根据ID
     *
     * @param id ID
     * @return success/false
     */
    @DeleteMapping("/{id}")
    ResponseData<Boolean> delete(@PathVariable(value = "id") Long id);

}
