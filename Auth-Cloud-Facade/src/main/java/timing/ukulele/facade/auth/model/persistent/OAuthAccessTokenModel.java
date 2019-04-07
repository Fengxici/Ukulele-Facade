package timing.ukulele.facade.auth.model.persistent;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@TableName("oauth_access_token")
public class OAuthAccessTokenModel {
    private String tokenId;
    private byte[] token;
    private String authenticationId;
    private String userName;
    private String clientId;
    private String authentication;
    private String refreshToken;
}
