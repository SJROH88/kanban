package controllers.member;

import controllers.Controller;
import controllers.URLRouter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberURLRouter implements URLRouter {
    private Controller controller;

    @Override
    public void route(HttpServletRequest request, HttpServletResponse response, String location) {
        String mode = getMode(request.getRequestURI(), "member");
        if(mode == null || mode.isBlank()){
            return;
        }
        String method = request.getMethod().toUpperCase();
        if(mode.equals("join")){
            controller = new JoinController();
        }else if(mode.equals("login")){
            controller = new LoginController();
        }else if(mode.equals("info")){
            controller = new InfoController();
        }
    }
}











