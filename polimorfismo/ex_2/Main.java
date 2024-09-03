package polimorfismo.ex_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Vaca());

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
