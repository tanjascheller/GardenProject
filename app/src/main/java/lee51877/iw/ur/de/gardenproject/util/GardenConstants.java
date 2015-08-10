package lee51877.iw.ur.de.gardenproject.util;

/**
 * Created by Ema on 10.08.2015.
 */
public class GardenConstants {

    public static final String CONSUMER_KEY = "44ddf62e027cabe2d340e64b68773c31";
    public static final String CONSUMER_SECRET = "978a4172f0bf07eb06d3b5f2ec889304";
    public static final String BASE_URL = "http://api.mygarden.org/";
    public static final String REQUEST_TOKEN = BASE_URL + "oauth/request_token";
    public static final String ACCESS_TOKEN = BASE_URL + "oauth/access_token";
    public static final String AUTHORIZE_URL = BASE_URL + "oauth/authorize" + "?oauth_token=%s";

    //Retrieve the activities linked to a plant
    //public static final String RESSOURCE_PLANT_ACTIVITIES = "http://api.mygarden.org/activities/plant?plant_id=";

    //Retrieve all plants
    public static final String RESSOURCE_ALL_PLANTS = "http://api.mygarden.org/plants/all";

    //Retrieve the detailed info of a plant
    public static final String RESSOURCE_PLANT_SHOW = "http://api.mygarden.org/plants/show?plant_id=";

    //Retrieve the popular plants
    public static final String RESSOURCE_POPULAR_PLANTS = "http://api.mygarden.org/plants/top";

    //Search for specific plants- Your search request should contain at least 3 characters (e.g. apple)
    public static final String RESSOURCE_SEARCH_PLANT = "http://api.mygarden.org/plants/search?query=";

    //Retrieve all actions of a plant, e.g. cutting (id: 17)
    public static final String RESSOURCE_PLANT_ACTIONS = "http://api.mygarden.org/plants/actions?plant_id=";

    //Retrieve a specific action of a specific plant
    public static final String RESSOURCE_PLANT_SPEC_ACTION = "http://api.mygarden.org/plants/actions/show?plant_id=17&plant_action_id=";

    //Retrieve all photos of a plant
    public static final String RESSOURCE_PLANT_FOTOS = "http://api.mygarden.org/plant-photos/plant?plant_id=";

}
