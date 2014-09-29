package is.ru.honn.ruber.domain;

import java.util.ArrayList;

/**
 * Created by elibjon on 28/09/14.
 */
public class Trip {
    String uuid;
    int requestTime;
    String productId;
    double distance;
    int startTime;
    ArrayList startLocation;
    int endTime;
    ArrayList endLocation;
    public enum TripStatus{
        Completed;
    }
    public Trip() {
    }
    public Trip(String uuid, int requestTime, String productId, double distance, int startTime, ArrayList startLocation, int endTime, ArrayList endLocation) {
        this.uuid = uuid;
        this.requestTime = requestTime;
        this.productId = productId;
        this.distance = distance;
        this.startTime = startTime;
        this.startLocation = startLocation;
        this.endTime = endTime;
        this.endLocation = endLocation;
    }
    public String getUuid() {
        return uuid;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    public int getRequestTime() {
        return requestTime;
    }
    public void setRequestTime(int requestTime) {
        this.requestTime = requestTime;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public double getDistance() {
        return distance;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }
    public int getStartTime() {
        return startTime;
    }
    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }
    public ArrayList getStartLocation() {
        return startLocation;
    }
    public void setStartLocation(ArrayList startLocation) {
        this.startLocation = startLocation;
    }
    public int getEndTime() {
        return endTime;
    }
    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
    public ArrayList getEndLocation() {
        return endLocation;
    }
    public void setEndLocation(ArrayList endLocation) {
        this.endLocation = endLocation;
    }
    @Override
    public String toString() {
        return "Completed";
    }
}
