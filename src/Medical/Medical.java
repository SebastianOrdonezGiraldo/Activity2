package Medical;

public class Medical {
    //Atributos
    String code;
    String date;
    float hour;
    int office;
    String doctorName;
    String userName;
    String addres;

    public class Schedule{
        private String userName;
        private String doctorName;
        private String date;
        private String hour;

     public Schedule(String userName, String doctorName, String date, String hour){
         this.userName = userName;
         this.doctorName = doctorName;
         this.date = date;
         this.hour = hour;
     }


}}
