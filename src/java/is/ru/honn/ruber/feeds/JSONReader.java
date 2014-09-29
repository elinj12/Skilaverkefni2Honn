package is.ru.honn.ruber.feeds;

import javax.sql.rowset.spi.XmlReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import is.ru.honn.ruber.domain.Trip;
import is.ruframework.http.SimpleHttpRequest;
import org.json.simple.JSONObject;

/**
 * Created by elibjon on 29/09/14.
 */
public class JSONReader extends AbstractFeedReader
{
    String JSONObject = new String();

    public JSONReader()
    {
    }

    public void setFeedHandler(FeedHandler handler)
    {
        this.handler = handler;
    }

    public void read(String source) throws FeedException
    {
        if (handler == null)
        {
            throw new FeedException("Handler unspecified");
        }

        URL feedUrl = null;
        try
        {
            feedUrl = new URL(source);
        }
        catch (MalformedURLException murlex)
        {
            throw new FeedException ("URL is not correct", murlex);
        }

        // Open the feed
        try
        {
            JSONObject = SimpleHttpRequest.sendGetRequest("http://olafurandri.com/honn/history.json");
        }
        catch (Exception ioex)
        {
            throw new FeedException ("URL is not correct", ioex);
        }

        // Get the items and create content for each
        int length = JSONObject.length();
        Trip trip;
        while(length > 0){
            trip = new Trip();
            trip.setStartTime(trip.getStartTime());
            trip.setEndTime(trip.getEndTime());
            trip.setRequestTime(trip.getRequestTime());
            trip.setDistance(trip.getDistance());
            trip.setProductId(trip.getProductId());
            trip.setUuid(trip.getUuid());
            handler.processContent(trip);
            length--;
        }
    }
}
