package timing.ukulele.facade.syslog.api;

import org.springframework.web.bind.annotation.*;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.facade.syslog.model.view.LogVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface ILogFacade {
    /**
     * 添加日志
     *
     * @param log 日志实体
     */
    @PostMapping("/log")
    ResponseData<Boolean> add(@RequestBody LogVO log);

    /**
     * 根据ID
     *
     * @param id ID
     * @return success/false
     */
    @DeleteMapping("/{id}")
    ResponseData<Boolean> delete(@PathVariable(value = "id") Long id);


    @GetMapping("/log/getByParam")
    ResponseData<List<LogVO>> getByParam(HttpServletRequest request);

}
