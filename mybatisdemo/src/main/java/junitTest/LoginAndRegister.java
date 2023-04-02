package junitTest;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:Su HangFei
 * @Date:2023-04-02 16 29
 * @Project:LiGongSSM
 */
public class LoginAndRegister {
    private Map<String, String> users = new HashMap<String, String>();

    //注册用户
    public boolean register(String username, String password) {
        if (username == null || password == null) {
            throw new IllegalArgumentException("用户名和密码不能为空");
        }
        if (users.containsKey(username)) {
            return false;
        }
        users.put(username, password);
        return true;
    }

    //登录用户
    public boolean login(String username, String password) {
        if (username == null || password == null) {
            throw new IllegalArgumentException("用户名和密码不能为空y");
        }
        if (!users.containsKey(username)) {
            return false;
        }
        return users.get(username).equals(password);
    }

    //重置密码
    public void resetPassword(String username, String oldPassword, String newPassword) {
        if (!login(username, oldPassword)) {
            throw new IllegalArgumentException("用户名或密码不正确");
        }
        users.put(username, newPassword);
    }

    //删除用户
    public void deleteUser(String username, String password) {
        if (!login(username, password)) {
            throw new IllegalArgumentException("用户名或密码不正确");
        }
        users.remove(username);
    }
}
