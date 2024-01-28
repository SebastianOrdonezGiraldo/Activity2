package Ejercicio11;

public class Ejercicio11 {
    int number1;

    public String number2(){
        if (number1<=0){
            return "a negative number";
        }else if (number1>=0){
            return "a positive number";
        }
        return "error";
    }
}
