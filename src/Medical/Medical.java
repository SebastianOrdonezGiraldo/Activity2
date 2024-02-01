package Medical;

public class Medical {
    //Atributos
    public String code;
    public String hour;
    public int office;
    public String doctorName;
    public String userName;
    private String adress;
    public String date;
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public class Schedule{
        public String userName;
        public String doctorName;
        public String date;
        public String hour;



     public Schedule(String userName, String doctorName, String date, String hour){
         this.userName = userName;
         this.doctorName = doctorName;
         this.date = date;
         this.hour = hour;
     }


}}
