package com.qfedu.ams.realm;

import com.qfedu.ams.dao.AdminMapper;
import com.qfedu.ams.entity.Admin;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;

public class MyRealm extends AuthorizingRealm {

    @Autowired
    private AdminMapper adminMapper;

    // 获取授权信息
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        // 获取登陆用户的用户名
        String username = (String) principalCollection.getPrimaryPrincipal();
        // 从数据库中查询用户的角色和权限列表信息
        List<String> perms = adminMapper.findPermsByName(username);
        List<String> roles = adminMapper.findRolesByName(username);

        //创建授权信息对象
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        // 设置角色的权限信息
        info.setRoles(new HashSet<>(roles));
        info.setStringPermissions(new HashSet<>(perms));

        return info;
    }

    // 获取认真信息
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        // 获取token中的用户名
        String username = (String) authenticationToken.getPrincipal();

        // 认证信息对象
        SimpleAuthenticationInfo simpleAuthenticationInfo = null;
        // 从数据库中获取用户信息
        Admin admin = adminMapper.findByName(username);
        if (admin == null) {
            // 第一个参数 用户身份信息
            // 第二个参数 用户的合法密码
            // 第三个参数 realm的名称
            simpleAuthenticationInfo = new SimpleAuthenticationInfo(null, null, this.getName());
        } else {
            simpleAuthenticationInfo = new SimpleAuthenticationInfo(username, admin.getPassword(), this.getName());
        }

        return simpleAuthenticationInfo;
    }
}
