package Envio;

public class Envio {
    //ATRIBUTOS
    int numeroGuia;
    int fecha;
    String tipoEmbalaje;
    int cedulaCliente;
    int peso;
    String ciudadOrigen;
    String ciudadDestino;
    double costo;
    String estadoEnvio;
    public static final float TARIFA_POR_KG = 15000f;

    //METODO DE LA CLASE
    public float calcularCosto(){
        return (this.peso * TARIFA_POR_KG);
    }

}



