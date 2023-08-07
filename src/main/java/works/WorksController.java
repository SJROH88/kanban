package works;

import controllers.URLRouter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/works/*")
public class WorksController extends HttpServlet {
    private URLRouter router;

    @Override
    public void init() throws ServletException {
        router = new WorksURLRouter();
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        router.route(req,resp,"works");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        router.route(req,resp,"works");
    }
}
