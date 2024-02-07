package Ejercicio18;

public class Ejercicio18 {
    public int angle1;
    public int angle2;
    public int angle3;

    public String calcular() {
        if (this.angle1 +this.angle2 + this.angle3 == 180) {
            return "Valid";
        } else {
            return "Unvalid";
        }
    }
}

