package User;

public class User {
        public Boolean userBase = true;

        public  int passwordBase = 12345;


        public String validateStatus(){
        if (this.userBase.equals(true)){
            return "Allowed";
        }else{
return"Not allowed";
        }
    }
    public String  allowAcces(){
            if(passwordBase == 12345){
        return "Allowed";
            }else{
                return "not allowed";
            }
    }
}


