package User;

public class User {
        public Boolean userBase = true;
        public String userLogin = "admin";
        public int userPassword = 12345;
        public boolean passwordEntered = true;
        public boolean systemStatus = true;

    public String validateStatus(){
        if (this.userBase.equals(true)){
            return "Allowed";
        }else{
return"Not allowed";
        }
    }

}


