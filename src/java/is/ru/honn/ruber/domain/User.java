package is.ru.honn.ruber.domain;

/**
 * Created by elibjon on 28/09/14.
 */
    public class User {
        private String UuId;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private String picture;
        private String promoCode;
        public User() {
        }
        public User(String uuId, String firstName, String lastName, String email, String password, String picture, String promoCode) {
            UuId = uuId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.password = password;
            this.picture = picture;
            this.promoCode = promoCode;
        }
        public String getUuId() {
            return UuId;
        }
        public void setUuId(String uuId) {
            UuId = uuId;
        }
        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        public String getPicture() {
            return picture;
        }
        public void setPicture(String picture) {
            this.picture = picture;
        }
        public String getPromoCode() {
            return promoCode;
        }
        public void setPromoCode(String promoCode) {
            this.promoCode = promoCode;
        }
    }
