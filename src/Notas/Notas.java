package Notas;

public class Notas {
    public int fisica;
    public int quimica;
    public int biologia;
    public int matematicas;
    public int informatica;

    public double porcentaje(double total, double parte){
        return (parte / total) * 100;
    }
}
