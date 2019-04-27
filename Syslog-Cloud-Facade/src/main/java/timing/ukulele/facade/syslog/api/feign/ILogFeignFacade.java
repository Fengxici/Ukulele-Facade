package timing.ukulele.facade.syslog.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.common.data.ResponseCode;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.facade.syslog.api.ILogFacade;
import timing.ukulele.facade.syslog.model.persistent.SysLog;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


@FeignClient(name = "syslog-service", fallback = ILogFeignFacade.SysLogHystrixClientFallback.class)
public interface ILogFeignFacade extends ILogFacade {
    class SysLogHystrixClientFallback implements ILogFeignFacade {

        @Override
        public ResponseData<Boolean> add(SysLog log) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> delete(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<SysLog>> getByParam(HttpServletRequest request) {
            return null;
        }
    }
}
