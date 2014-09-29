package is.ru.honn.ruber.feeds;

import is.ru.honn.ruber.domain.Trip;

/**
 * Created by elibjon on 28/09/14.
 */
public interface FeedHandler {
    public void processContent(Trip trip);
}
