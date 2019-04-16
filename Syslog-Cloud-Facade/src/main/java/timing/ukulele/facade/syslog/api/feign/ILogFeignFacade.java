package timing.ukulele.facade.syslog.api.feign;

import com.github.pagehelper.Page;
import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.common.data.ResponseVO;
import timing.ukulele.facade.syslog.api.ILogFacade;
import timing.ukulele.facade.syslog.model.persistent.SysLog;
import timing.ukulele.web.pojo.ResponseCode;

import java.util.Map;


@FeignClient(name = "syslog-service", fallback = ILogFeignFacade.SysLogHystrixClientFallback.class)
public interface ILogFeignFacade extends ILogFacade {
    class SysLogHystrixClientFallback implements ILogFeignFacade {

        public ResponseData<SysLog> add(SysLog log) {
            return new ResponseData<>(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getMessage());
        }

        @Override
        public Page logPage(Map<String, Object> params) {
            return null;
        }

        @Override
        public ResponseVO delete(Long id) {
            return null;
        }

    }
}
