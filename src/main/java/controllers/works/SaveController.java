package controllers.works;

import static commons.ScriptUtils.*;

import commons.ScriptUtils;
import commons.ViewUtils;
import controllers.Controller;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.works.SaveService;
import models.works.WorkServiceManager;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SaveController implements Controller {
    @Override
    public void get(HttpServletRequest req, HttpServletResponse resp) {
        String URI = req.getRequestURI();
        String mode = URI.indexOf("edit") != -1 ? "edit" : "add";
        if(mode.equals("edit")){
            long workNo = getWorkNo(req);

        }



        String[] addScript = {"ckeditor/ckeditor","work/form"};
        req.setAttribute("addScript",addScript);

        ViewUtils.load(req, resp, "works", mode);
    }

    @Override
    public void post(HttpServletRequest req, HttpServletResponse resp) {
        SaveService saveService = WorkServiceManager.getInstance().saveService();
        try{
            saveService.save(req);
            go(resp,req.getContextPath()+"/work","parent");
        }catch(Exception e){
            alertError(resp,e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * 작업 번호 추출
     *
     * @param req
     * @return
     */
    private long getWorkNo(HttpServletRequest req){
        String URI = req.getRequestURI();

        String pattern = "edit/(\\d*)";
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(URI);
        if(matcher.find()){
            return Long.parseLong(matcher.group(1));
        }
        return 0L;
    }
}