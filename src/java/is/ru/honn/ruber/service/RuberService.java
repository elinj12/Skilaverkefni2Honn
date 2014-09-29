package is.ru.honn.ruber.service;

import is.ru.honn.ruber.domain.*;

import java.util.Collection;
import java.util.List;

public interface RuberService
{
        public List<Product> getProducts(double latitude, double longitude) throws ServiceException;
        public List<Price> getPriceEstimates(double startLatitude, double startLongitude,
                                   double endLatitude, double endLongitude) throws ServiceException;
        public void addTrip(Trip trip);
        public String getUser(User user);
        public Collection<Trip> getHistory();
}
