package timing.ukulele.facade.portal;

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
    void createCode(String randomStr, HttpServletResponse response)
            throws Exception;
}
