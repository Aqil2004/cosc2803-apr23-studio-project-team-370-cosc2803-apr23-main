package app.controllers;

import java.util.HashMap;
import java.util.Map;

import io.javalin.http.Handler;

import static app.Constants.*;

public class LandingController {

    public static Handler serveLandingPage = ctx -> {
        Map<String, Object> model = new HashMap<String, Object>();
        // model.put("range for population", new String("1960 - 2020"));
        // model.put("range for temperature", new String("1740 - 2013"));
        ctx.render(Templates.LANDING, model);
    };
}
