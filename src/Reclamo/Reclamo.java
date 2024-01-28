package Reclamo;


public class Reclamo {
    //Atributos
    int claimNumber;
    String namePerson;
    String issue;
    String description;
    String claimStatus;

    public class validateClaimStatus{
        public String claimStatus;
        public String namePerson;

        public validateClaimStatus(String claimStatus, String namePerson){
            this.namePerson = namePerson;
            this.claimStatus = claimStatus;
        }
    }
}
