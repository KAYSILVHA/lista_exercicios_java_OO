package polimorfismo.ex_1;

public class Trem implements IMeioTransporte {

    @Override
    public void acelerar() {
        System.out.println("O trem está acelerando lentamente.");
    }

    @Override
    public void frear() {
        System.out.println("O trem está freando gradualmente.");
    }
}
