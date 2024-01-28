package Ejercicio10;

public class Ejercicio10 {
    //CARACTERISTICAS
    public int wage1 = 30000;
    public int wage2 = 33000;
    public int hoursAmount;
    public String name;
    //METODO
    public int hours(){
        if (this.hoursAmount >= 1 && this.hoursAmount <= 10){
            return this.hoursAmount * wage1;
        } else if (this.hoursAmount > 10) {
            return this.hoursAmount * wage2;
        }
        return 0;
    }
}

