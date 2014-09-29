package is.ru.honn.ruber.domain;

import java.util.ArrayList;

/**
 * Created by elibjon on 28/09/14.
 */
public class History {
        private int offset;
        private int limit;
        private int count;
        private ArrayList trip;
        public History() {
        }
        public History(int offset, int limit, int count, ArrayList trip) {
            this.offset = offset;
            this.limit = limit;
            this.count = count;
            this.trip = trip;
        }
        public int getOffset() {
            return offset;
        }
        public void setOffset(int offset) {
            this.offset = offset;
        }
        public int getLimit() {
            return limit;
        }
        public void setLimit(int limit) {
            this.limit = limit;
        }
        public int getCount() {
            return count;
        }
        public void setCount(int count) {
            this.count = count;
        }
        public ArrayList getTrip() {
            return trip;
        }
        public void setTrip(ArrayList trip) {
            this.trip = trip;
        }
}
