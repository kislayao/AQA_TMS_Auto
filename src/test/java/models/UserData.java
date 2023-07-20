package models;

public class UserData {

    private String firstName;
    private String lastName;
    private int postalCode;

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

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public static class Builder{

        private UserData newUserData;

        public Builder(){
            this.newUserData = new UserData();
        }

        public Builder withFirstName (String firstName){
            newUserData.firstName = firstName;
            return this;
        }

        public Builder withLastName (String lastName){
            newUserData.lastName = lastName;
            return this;
        }

        public Builder withPostalCode (int postalCode){
            newUserData.postalCode = postalCode;
            return this;
        }

        public UserData build() {
            return newUserData;
        }
    }


}
