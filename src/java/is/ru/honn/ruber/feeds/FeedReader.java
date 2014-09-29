package is.ru.honn.ruber.feeds;

/**
 * Created by elibjon on 28/09/14.
 */
public interface FeedReader
{
    public void read(String url) throws FeedException;
    public void setFeedHandler(FeedHandler handler);
}
