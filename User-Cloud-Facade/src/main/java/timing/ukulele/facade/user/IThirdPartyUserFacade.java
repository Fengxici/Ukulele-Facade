package timing.ukulele.facade.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.data.user.view.ThirdPartyUserVO;

@RequestMapping("/thirdparty")
public interface IThirdPartyUserFacade {

//    /**
//     * 查询第三方用户
//     * @param platId 第三方平台用户标识 如openid
//     * @param userId 平台用户标识
//     * @param plat 第三方平台类型，1小程序
//     * @return
//     */
//    @GetMapping("/wx/{platId}/{userId}/{plat}")
//    ResponseData<ThirdPartyUserVO> getThirdUserByAll(@PathVariable("platId") String platId, @PathVariable("userId")Long userId, @PathVariable("plat")Integer plat);

    /**
     * 查询第三方用户
     * @param platId 第三方平台用户标识 如openid
     * @param plat 第三方平台类型，1小程序
     * @return
     */
    @GetMapping("/{platId}/{plat}")
    ResponseData<ThirdPartyUserVO> getUserByThirdInfo(@PathVariable("platId") String platId, @PathVariable("plat")Integer plat);
}
