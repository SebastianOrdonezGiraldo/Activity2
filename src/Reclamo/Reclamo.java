package Reclamo;


public class Reclamo {
    //Atributos
    public int claimNumber;
    public String personName;
    public String subject;
    public String description;
    public String claimStatus;


    public Reclamo() {
        this.claimNumber = 0;
        this.personName = "";
        this.subject = "";
        this.description = "";
        this.claimStatus = "Pendiente";
    }

}
