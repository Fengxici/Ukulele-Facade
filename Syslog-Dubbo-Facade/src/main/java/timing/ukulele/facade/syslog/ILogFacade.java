package timing.ukulele.facade.syslog;

import timing.ukulele.common.data.ResponseData;
import timing.ukulele.data.syslog.view.LogVO;

import java.util.List;
import java.util.Map;

public interface ILogFacade {
    /**
     * 添加日志
     *
     * @param log 日志实体
     */
    ResponseData<Boolean> add(LogVO log);

    /**
     * 根据ID
     *
     * @param id ID
     * @return success/false
     */
    ResponseData<Boolean> delete(Long id);


    ResponseData<List<LogVO>> getByParam(Map<String, Object> params);

}
