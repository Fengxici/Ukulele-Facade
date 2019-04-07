package timing.ukulele.facade.portal.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletResponse;

/**
 * 验证码提供
 */
public interface IValidateCodeService {

    /**
     * 创建验证码
     *
     * @throws Exception
     */
    @GetMapping("/code/{randomStr}")
    void createCode(@PathVariable String randomStr, HttpServletResponse response)
            throws Exception;
}
