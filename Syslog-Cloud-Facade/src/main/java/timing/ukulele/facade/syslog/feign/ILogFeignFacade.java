package timing.ukulele.facade.syslog.feign;

import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.common.data.ResponseCode;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.data.syslog.view.LogVO;
import timing.ukulele.facade.syslog.ILogFacade;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@FeignClient(name = "syslog-service", fallback = ILogFeignFacade.SysLogHystrixClientFallback.class)
public interface ILogFeignFacade extends ILogFacade {
    class SysLogHystrixClientFallback implements ILogFeignFacade {

        @Override
        public ResponseData<Boolean> add(LogVO log) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> delete(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<LogVO>> getByParam(HttpServletRequest request) {
            return null;
        }
    }
}
