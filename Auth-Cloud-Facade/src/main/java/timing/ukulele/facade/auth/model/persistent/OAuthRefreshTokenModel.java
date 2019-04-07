package timing.ukulele.facade.auth.model.persistent;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class OAuthRefreshTokenModel {
    private String tokenId;
    private byte[] token;
    private byte[] authentication;
}
