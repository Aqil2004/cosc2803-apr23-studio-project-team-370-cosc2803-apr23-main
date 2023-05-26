package app.controllers;

import java.util.HashMap;
import java.util.Map;

import io.javalin.http.Handler;

import static app.Constants.*;

public class MissionController {
    public static Handler serveMissionPage = ctx -> {
        Map<String, Object> model = new HashMap<String, Object>();
        ctx.render(Templates.MISSION, model);
    };
}
