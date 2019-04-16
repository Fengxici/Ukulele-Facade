package timing.ukulele.facade.auth.api;

import com.github.pagehelper.Page;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.common.data.ResponseVO;
import timing.ukulele.facade.auth.model.persistent.OAuthClientDetailsModel;

import java.util.List;
import java.util.Map;

@RequestMapping("/client")
public interface IClientFacade {
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    ResponseData<List<OAuthClientDetailsModel>> getAllClient();

    /**
     * 通过ID查询
     *
     * @param id ID
     * @return SysOauthClientDetails
     */
    @GetMapping("/{id}")
    OAuthClientDetailsModel get(@PathVariable(value="id") Integer id);


    /**
     * 分页查询信息
     *
     * @param params 分页对象
     * @return 分页对象
     */
    @GetMapping("/page")
    Page page(@RequestParam Map<String, Object> params);

    /**
     * 添加
     *
     * @param client 实体
     * @return success/false
     */
    @PostMapping
    public ResponseVO add(@RequestBody OAuthClientDetailsModel client);

    /**
     * 删除
     *
     * @param id ID
     * @return success/false
     */
    @DeleteMapping("/{id}")
    ResponseVO delete(@PathVariable(value="id") String id);

    /**
     * 编辑
     *
     * @param client 实体
     * @return success/false
     */
    @PutMapping
    ResponseVO edit(@RequestBody OAuthClientDetailsModel client);
}
