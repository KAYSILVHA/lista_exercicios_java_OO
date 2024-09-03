package polimorfismo.ex_1;

public class Carro implements IMeioTransporte {

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando rapidamente.");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando suavemente.");
    }
}
