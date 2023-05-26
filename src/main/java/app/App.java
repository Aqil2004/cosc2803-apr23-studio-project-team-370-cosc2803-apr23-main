package app;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;
import io.javalin.rendering.template.JavalinThymeleaf;
import app.controllers.LandingController;
import app.controllers.TestController;
import app.controllers.MissionController;
import static app.Constants.*;
import static app.helpers.ThymeleafConfig.buildTemplateEngine;
import static io.javalin.apibuilder.ApiBuilder.*;

/**
 * Main Application Class.
 * <p>
 * Running this class as regular java application will start the
 * Javalin HTTP Server and our web application.
 */
public class App {

    public static void main(String[] args) {
        // Create our HTTP server and listen in port 7000
        Javalin app = Javalin.create(config -> {
            // Configure static files
            config.staticFiles.add(staticFiles -> {
                staticFiles.hostedPath = HOSTED_PATH;
                staticFiles.directory = STATIC_FILES_DIRECTORY;
                staticFiles.location = Location.CLASSPATH;
                staticFiles.precompress = false;
                staticFiles.aliasCheck = null;
                staticFiles.skipFileFunction = req -> false;
            });

            JavalinThymeleaf.init(buildTemplateEngine());

            // Enable WebJars
            config.staticFiles.enableWebjars();

            // Enable route overview
            config.plugins.enableRouteOverview(ROUTE_OVERVIEW_PATH);
        });
        
        // Configure routes
        app.routes(() -> {
            get(Web.TEST, TestController.serveTestPage);
            get(Web.LANDING, LandingController.serveLandingPage);
            get(Web.MISSION, MissionController.serveMissionPage);
        });

        // Start the server
        app.start(JAVALIN_PORT);
    }
}
