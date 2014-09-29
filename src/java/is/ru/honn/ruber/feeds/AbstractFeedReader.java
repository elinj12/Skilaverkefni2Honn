package is.ru.honn.ruber.feeds;

/**
 * Created by elibjon on 29/09/14.
 */
public abstract class AbstractFeedReader implements FeedReader
{
    protected FeedHandler handler;

    public void setFeedHandler(FeedHandler handler)
    {
        this.handler = handler;
    }

    public abstract void read(String url) throws FeedException;
}