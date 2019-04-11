package timing.ukulele.facade.portal.api.feign;

import com.github.pagehelper.Page;
import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.common.data.ResponseVO;
import timing.ukulele.facade.portal.api.IZuulRouteService;
import timing.ukulele.facade.portal.model.persistent.SysZuulRoute;

import java.util.Map;

@FeignClient(name = "portal-service", fallback = IZuulRouteFeignService.ZuulRouteHystrixClientFallback.class)
public interface IZuulRouteFeignService extends IZuulRouteService {
    class ZuulRouteHystrixClientFallback implements IZuulRouteFeignService{

        @Override
        public SysZuulRoute get(long id) {
            return null;
        }

        @Override
        public Page page(Map<String, Object> params) {
            return null;
        }

        @Override
        public ResponseVO add(SysZuulRoute sysZuulRoute) {
            return null;
        }

        @Override
        public ResponseVO delete(long id) {
            return null;
        }

        @Override
        public ResponseVO edit(SysZuulRoute sysZuulRoute) {
            return null;
        }

        @Override
        public ResponseVO apply() {
            return null;
        }
    }
}
