package works;

import controllers.Controller;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListController implements Controller {
    @Override
    public void get(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("List Controller!");
    }

    @Override
    public void post(HttpServletRequest req, HttpServletResponse resp) {

    }
}
