package lee51877.iw.ur.de.gardenproject.util;

import org.scribe.builder.api.DefaultApi10a;
import org.scribe.model.Token;

/**
 * Created by Ema on 10.08.2015.
 */
public class GardenAPI  extends DefaultApi10a {
    @Override
    public String getAccessTokenEndpoint()
    {
        return GardenConstants.ACCESS_TOKEN;
    }

    @Override
    public String getRequestTokenEndpoint()
    {
        return GardenConstants.REQUEST_TOKEN;
    }

    @Override
    public String getAuthorizationUrl(Token requestToken)
    {
        return String.format(GardenConstants.AUTHORIZE_URL, requestToken.getToken());
    }

}
