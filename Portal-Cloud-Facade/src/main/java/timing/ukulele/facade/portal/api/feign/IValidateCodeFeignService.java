package timing.ukulele.facade.portal.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.facade.portal.api.IValidateCodeService;

import javax.servlet.http.HttpServletResponse;

@FeignClient(name = "portal-service", fallback = IValidateCodeFeignService.ValidateCodeHystrixClientFallback.class)
public interface IValidateCodeFeignService extends IValidateCodeService {
    class ValidateCodeHystrixClientFallback implements IValidateCodeFeignService{

        @Override
        public void createCode(String randomStr, HttpServletResponse response) throws Exception {

        }
    }
}
