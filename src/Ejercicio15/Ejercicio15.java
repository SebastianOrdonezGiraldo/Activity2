package Ejercicio15;

public class Ejercicio15 {
    public int n1;
    public int n2;
    public int n3;

    public String calculate() {
        if (n1 >= n2 && n1 >= n3) {
            return "el número mayor es " + n1;
        } else if (n2 >= n1 && n2 >= n3) {
            return "el número mayor es " + n2;
        } else {
            return "el número mayor es " + n3;
        }
    }
}
