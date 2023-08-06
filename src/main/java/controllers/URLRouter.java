package controllers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface URLRouter {
    void route(String URL, String location);

    default String getMode(String URL, String location) {
        String mode = null;
        String pattern = location + "/([^/]*)";
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(URL);
        if (matcher.find()) {
            mode = matcher.group(1);
        }

        return mode;
    }
}