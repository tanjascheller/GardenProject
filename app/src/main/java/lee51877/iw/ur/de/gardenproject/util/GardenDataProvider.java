package lee51877.iw.ur.de.gardenproject.util;

import android.os.AsyncTask;

import org.scribe.builder.ServiceBuilder;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.SignatureType;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;

import lee51877.iw.ur.de.gardenproject.log.Log;

/**
 * Created by Ema on 10.08.2015.
 */
public class GardenDataProvider {

    public void getTestInfo(){
        DownLoadGardenInfoTask task = new DownLoadGardenInfoTask();
        task.execute();
    }

    private class DownLoadGardenInfoTask extends AsyncTask<String, Integer, String> {

        @Override
        protected String doInBackground(String... params) {

            OAuthService service = new ServiceBuilder()
                    .provider(GardenAPI.class)
                    .apiKey(GardenConstants.CONSUMER_KEY)
                    .apiSecret(GardenConstants.CONSUMER_SECRET)
                    .signatureType(SignatureType.QueryString)
                    .build();

            Token requestToken = service.getRequestToken();
            Log.d("Testing..");
            Log.d("requestToken " + requestToken);

            String authUrl = service.getAuthorizationUrl(requestToken);
            Log.d("authUrl " + authUrl);

            Verifier v = new Verifier(authUrl);
            Token accessToken = service.getAccessToken(requestToken, v);

            OAuthRequest request = new OAuthRequest(Verb.GET, GardenConstants.RESSOURCE_POPULAR_PLANTS);
            service.signRequest(accessToken, request); // the access token from step 4
            Response response = request.send();
            Log.d("Result " + response.getBody());

            OAuthRequest request2 = new OAuthRequest(Verb.GET, GardenConstants.RESSOURCE_SEARCH_PLANT + "pear");
            service.signRequest(accessToken, request2); // the access token from step 4
            Response response2 = request2.send();
            Log.d("Result2 " + response2.getBody());

            //OAuthRequest request3 = new OAuthRequest(Verb.GET, "http://api.mygarden.org/users/show?user_id=43319");
            OAuthRequest request3 = new OAuthRequest(Verb.GET, GardenConstants.RESSOURCE_PLANT_FOTOS + "4");
            service.signRequest(accessToken, request3); // the access token from step 4
            Response response3 = request3.send();
            Log.d("Result3 " + response3.getBody());

            OAuthRequest postreq = new OAuthRequest(Verb.GET, GardenConstants.RESSOURCE_PLANT_ACTIONS + "4");
            service.signRequest(accessToken, postreq); // the access token from step 4
            Response response4 = postreq.send();
            Log.d("Result4 " + response4.getBody());

            return "";
        }
    }

}
