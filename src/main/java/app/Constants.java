package app;

public interface Constants {
    int JAVALIN_PORT = 7001; 
    String ROUTE_OVERVIEW_PATH = "/routes";
    String HOSTED_PATH = "/";
    String STATIC_FILES_DIRECTORY = "/static";
    String DB_FOLDER = "database";

    interface HttpStatuses {
        int FORBIDDEN = 400;
        int INTERNAL_SERVER_ERROR = 500;
    }

    interface Web {
        String LANDING = "/";
        String MISSION = "/mission";
        String TEST = "/test";
    }

    interface Templates {
        String LANDING = "pages/landing.html";
        String TEST = "pages/test.html";
        String MISSION = "pages/mission.html";
    }
}
