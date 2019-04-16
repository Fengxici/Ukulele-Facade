package timing.ukulele.facade.portal.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.facade.portal.api.IValidateCodeFacade;

import javax.servlet.http.HttpServletResponse;

@FeignClient(name = "portal-service", fallback = IValidateCodeFeignFacade.ValidateCodeHystrixClientFallback.class)
public interface IValidateCodeFeignFacade extends IValidateCodeFacade {
    class ValidateCodeHystrixClientFallback implements IValidateCodeFeignFacade {

        @Override
        public void createCode(String randomStr, HttpServletResponse response) throws Exception {

        }
    }
}
