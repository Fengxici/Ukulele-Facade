package timing.ukulele.facade.portal.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletResponse;

/**
 * 验证码
 */
public interface IValidateCodeFacade {

    /**
     * 创建验证码
     *
     * @throws Exception
     */
    @GetMapping("/code/{randomStr}")
    void createCode(@PathVariable(value = "randomStr") String randomStr, HttpServletResponse response)
            throws Exception;
}
