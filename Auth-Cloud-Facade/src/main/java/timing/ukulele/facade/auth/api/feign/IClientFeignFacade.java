package timing.ukulele.facade.auth.api.feign;

import com.github.pagehelper.Page;
import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.common.data.ResponseVO;
import timing.ukulele.facade.auth.api.IClientFacade;
import timing.ukulele.facade.auth.model.persistent.OAuthClientDetailsModel;
import timing.ukulele.web.pojo.ResponseCode;

import java.util.List;
import java.util.Map;

@FeignClient(name = "auth-service", fallback = IClientFeignFacade.HystrixClientFallback.class)
public interface IClientFeignFacade extends IClientFacade {
    class HystrixClientFallback implements IClientFeignFacade {

        @Override
        public ResponseData<List<OAuthClientDetailsModel>> getAllClient() {
            return new ResponseData<>(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getMessage());
        }

        @Override
        public OAuthClientDetailsModel get(Integer id) {
            return null;
        }

        @Override
        public Page page(Map<String, Object> params) {
            return null;
        }

        @Override
        public ResponseVO add(OAuthClientDetailsModel client) {
            return null;
        }

        @Override
        public ResponseVO delete(String id) {
            return null;
        }

        @Override
        public ResponseVO edit(OAuthClientDetailsModel client) {
            return null;
        }
    }
}
