package is.ru.honn.ruber.process;

import is.ru.honn.ruber.domain.Trip;
import is.ru.honn.ruber.service.RuberService;
import is.ruframework.process.RuAbstractProcess;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Collection;
import java.util.Locale;
import java.util.logging.Logger;
import is.ru.honn.ruber.feeds.FeedException;
import is.ru.honn.ruber.feeds.FeedHandler;
import is.ru.honn.ruber.feeds.FeedReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Collection;
import java.util.Locale;
import java.util.List;
import java.util.logging.Logger;

import is.ruframework.process.RuAbstractProcess;
import is.ru.honn.ruber.service.RuberService;
import is.ru.honn.ruber.service.RuberService;

/**
 * Created by elibjon on 29/09/14.
 */
    public class TripImportProcess extends RuAbstractProcess implements FeedHandler
    {
        Logger log = Logger.getLogger(this.getClass().getName());
        RuberService contentService;
        FeedReader reader;
        MessageSource msg;

        public void beforeProcess()
        {
            ApplicationContext ctx = new FileSystemXmlApplicationContext("app.xml");
            contentService = (RuberService)ctx.getBean("contentService");
            reader = (FeedReader)ctx.getBean("feedReader");   reader.setFeedHandler(this);
            msg = (MessageSource)ctx.getBean("messageSource");
            log.info(msg.getMessage("processbefore",
                    new Object[] { getProcessContext().getProcessName() } ,
                    Locale.getDefault()));
        }

        public void processContent(Object trip)
        {
            contentService.addTrip((Trip) trip);
        }


        public void startProcess()
        {
            log.info(msg.getMessage("processstart",
                    new Object[] { getProcessContext().getProcessName() },
                    Locale.getDefault()));
            try
            {
                reader.read(getProcessContext().getImportURL());
            }
            catch (FeedException e)
            {
                log.info(msg.getMessage("processreaderror",
                        new Object[] { getProcessContext().getImportFile() },
                        Locale.getDefault()));
                log.info(e.getMessage());
            }
            /*log.info(msg.getMessage("processstartdone",
                    new Object[] {contentService.getUser("7354db54-cc9b-4961-81f2-0094b8e2d215","Uber","password", "Developer","developer@uber.com","https://...","teypo")},
                    Locale.getDefault()));*/

            //"7354db54-cc9b-4961-81f2-0094b8e2d215", "Uber", "Developer","developer@uber.com","https://...","teypo"
        }

        public void afterProcess()
        {
            Collection<Trip> list = contentService.getHistory();
            for (Trip trip: list)
            {
                System.out.println(trip);
            }
        }

        public void processContent(Trip trip)
        {
            contentService.addTrip(trip);
        }
    }
