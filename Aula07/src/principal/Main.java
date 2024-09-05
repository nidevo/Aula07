package principal;

import entidade.Cachorro;
import entidade.Gato;
import entidade.Vaca;

public class Main {
    public static void main(String[] args) {
       
        Cachorro c = new Cachorro();
        System.out.println("Som do cachorro: " + c.emitirsom());

        Gato g = new Gato();
        System.out.println("Som do gato: " + g.emitirsom());

        Vaca v = new Vaca();
        System.out.println("Som da vaca: " + v.emitirsom());
    }
}
