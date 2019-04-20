package timing.ukulele.facade.syslog.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.common.data.ResponseCode;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.facade.syslog.api.ILogFacade;
import timing.ukulele.facade.syslog.model.persistent.SysLog;


@FeignClient(name = "syslog-service", fallback = ILogFeignFacade.SysLogHystrixClientFallback.class)
public interface ILogFeignFacade extends ILogFacade {
    class SysLogHystrixClientFallback implements ILogFeignFacade {

        @Override
        public ResponseData<SysLog> add(SysLog log) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> delete(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }
    }
}
