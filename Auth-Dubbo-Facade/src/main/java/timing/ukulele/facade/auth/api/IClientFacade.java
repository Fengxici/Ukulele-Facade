package timing.ukulele.facade.auth.api;

import org.springframework.web.bind.annotation.*;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.facade.auth.model.persistent.OAuthClientDetailsModel;

import java.util.List;
import java.util.Map;

@RequestMapping("/client")
public interface IClientFacade {

    /**
     * 根据参数获取client集合
     *
     * @param params 参数集合
     * @return client集合
     */
    @RequestMapping(value = "/getByParam", method = RequestMethod.GET)
    ResponseData<List<OAuthClientDetailsModel>> getClientByParam(@RequestParam Map<String, Object> params);

    /**
     * 通过ID查询
     *
     * @param id ID
     * @return SysOauthClientDetails
     */
    @GetMapping("/{id}")
    ResponseData<OAuthClientDetailsModel> get(@PathVariable(value = "id") Integer id);


    /**
     * 添加
     *
     * @param client 实体
     * @return success/false
     */
    @PostMapping
    ResponseData<Boolean> add(@RequestBody OAuthClientDetailsModel client);

    /**
     * 删除
     *
     * @param id ID
     * @return success/false
     */
    @DeleteMapping("/{id}")
    ResponseData<Boolean> delete(@PathVariable(value = "id") String id);

    /**
     * 编辑
     *
     * @param client 实体
     * @return success/false
     */
    @PutMapping
    ResponseData<Boolean> edit(@RequestBody OAuthClientDetailsModel client);
}
