package polimorfismo.ex_1;

public class Main {
    public static void main(String[] args) {
        IMeioTransporte[] transportes = new IMeioTransporte[3];

        transportes[0] = new Carro();
        transportes[1] = new Bicicleta();
        transportes[2] = new Trem();

        for (IMeioTransporte transporte : transportes) {
            transporte.acelerar();
            transporte.frear();
            System.out.println();
        }
    }
}
