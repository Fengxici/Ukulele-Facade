package timing.ukulele.facade.auth;

import timing.ukulele.common.data.ResponseData;
import timing.ukulele.data.auth.persistent.OAuthClientDetailsModel;

import java.util.List;
import java.util.Map;

public interface IClientFacade {

    /**
     * 根据参数获取client集合
     *
     * @param params 参数集合
     * @return client集合
     */
    ResponseData<List<OAuthClientDetailsModel>> getClientByParam(Map<String, Object> params);

    /**
     * 通过ID查询
     *
     * @param id ID
     * @return SysOauthClientDetails
     */
    ResponseData<OAuthClientDetailsModel> get(Integer id);


    /**
     * 添加
     *
     * @param client 实体
     * @return success/false
     */
    ResponseData<Boolean> add(OAuthClientDetailsModel client);

    /**
     * 删除
     *
     * @param id ID
     * @return success/false
     */
    ResponseData<Boolean> delete(String id);

    /**
     * 编辑
     *
     * @param client 实体
     * @return success/false
     */
    ResponseData<Boolean> edit(OAuthClientDetailsModel client);
}
