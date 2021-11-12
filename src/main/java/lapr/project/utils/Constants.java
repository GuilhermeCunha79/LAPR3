package lapr.project.utils;

public class Constants {



    public Constants(){
        throw new IllegalStateException("Utility class");
    }

    //SHIP
    public static final double LAT_MAX = 90;
    public static final double LAT_MIN = -90;
    public static final double LON_MAX = 180;
    public static final double LON_MIN = -180;
    public static final double POWER_OUTPUT = 20;
    public static final int CALL_SIGN_DIGITS = 5;
    public static final int MMSI_DIGITS = 9;
    public static final double COG_HEAD_MIN = 0;
    public static final double COG_HEAD_MAX = 359;
    public static final String NOT_AVAILABLE = "not available";
    //HAVERSINE
    public static final double EARTH_RADIUS=6371;
    public static final int METERS=1000;
    public static final int DIVISION=2;
    //ROLES
    public static final String ROLE_HUMAN_RESOURCES ="HUMAN RESOURCES";
    public static final String ROLE_CLIENT = "CLIENT";
    public static final String ROLE_FLEET_MANAGER = "FLEET MANAGER";
    public static final String ROLE_TRAFFIC_MANAGER = "TRAFFIC MANAGER";
    public static final String ROLE_WAREHOUSE_STAFF ="WAREHOUSE STAFF";
    public static final String ROLE_WAREHOUSE_MANAGER ="WAREHOUSE MANAGER";
    public static final String ROLE_PORT_STAFF ="PORT STAFF";
    public static final String ROLE_PORT_MANAGER ="PORT MANAGER";
    public static final String ROLE_SHIP_CAPTAIN ="SHIP CAPTAIN";
    public static final String ROLE_SHIP_CHIEF_ELETRICAL_ENGINEER ="SHIP CHIEF ELETRICAL ENGINEER";
    public static final String ROLE_TRUCK_DRIVER ="TRUCK DRIVER";
    //COMMON ERRORS
    public static final String STRING_BLANK_EXEPT = " cannot be empty.";
    public static final String STRING_NULL_EXEPT = " cannot be null.";
    public static final String NON_ALPHANUM_EXEPT = " has non alphanumeric chars.";
    public static final String PARAMS_FILENAME = "config.properties";
    public static final String PARAMS_COMPANY_DESIGNATION = "Company.Designation";
    //FILE
    public static final String FILE_NAME = "sships.csv";
    //RESTRCTIONS
    public static final int MAX_TRAV_DIST=5000;
    public static final int MAX_TRAVELLED_DISTANCE=10000;
}
