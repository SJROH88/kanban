package commons;

import jakarta.servlet.http.HttpServletRequest;
import models.member.Users;

public class MemberUtil {
    public static boolean isLogin(HttpServletRequest req) {
        boolean isLogin = (boolean)req.getAttribute("isLogin");

        return isLogin;
    }

    public static Users getUser(HttpServletRequest req) {
        Users userInfo = (Users)req.getAttribute("userInfo");

        return userInfo;
    }

    public static void isMine(HttpServletRequest req,long userNo){
        if(isLogin(req) && getUser(req).getUserNo() == userNo){
            return;
        }
        // 비회원 또는 회원번호 불일치
        throw new NotAuthorizationException();
    }
}