package Ejercicio12;

public class Ejercicio12 {
    int lavadoraGrande = 4000;
    int lavadoraPequeña = 3000;
    double descuento = 0.03;


    public String lavadora(){
        if (this.lavadoraPequeña == 1){
            return "La lavadora grande vale a 4000 por hora prestada.";
        }else if (this.lavadoraGrande == 2){
            return "La lavadora pequeña cobra a 3000 por hora prestada.";
        }
        return "Error";
    }

}
