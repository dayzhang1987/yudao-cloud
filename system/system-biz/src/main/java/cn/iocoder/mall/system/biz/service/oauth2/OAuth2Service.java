package cn.iocoder.mall.system.biz.service.oauth2;

import cn.iocoder.mall.system.biz.bo.ouath2.OAuth2AccessTokenBO;
import cn.iocoder.mall.system.biz.dto.oatuh2.OAuth2AccessTokenAuthenticateDTO;
import cn.iocoder.mall.system.biz.dto.oatuh2.OAuth2MobileCodeAuthenticateDTO;
import cn.iocoder.mall.system.biz.dto.oatuh2.OAuth2UsernameAuthenticateDTO;

/**
 * OAuth2 Service 接口
 */
public interface OAuth2Service {

    OAuth2AccessTokenBO authenticate(OAuth2UsernameAuthenticateDTO authenticateDTO);

    OAuth2AccessTokenBO authenticate(OAuth2MobileCodeAuthenticateDTO authenticateDTO);

    OAuth2AccessTokenBO authenticate(OAuth2AccessTokenAuthenticateDTO authenticateDTO);

}