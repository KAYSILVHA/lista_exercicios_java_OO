package polimorfismo.ex_1;

public class Bicicleta implements IMeioTransporte {

    @Override
    public void acelerar() {
        System.out.println("A bicicleta está ganhando velocidade aos poucos.");
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta está freando com os pedais.");
    }
}
