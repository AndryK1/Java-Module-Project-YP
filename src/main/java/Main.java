public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Cars c1 = new Cars();
        Cars c2 = new Cars();
        Cars c3 = new Cars();
        Rase rase = new Rase();
        System.out.println("Введите название машины номер 1 и её скорость:");
        c1.setCar();
        System.out.println("Введите название машины номер 2 и её скорость:");
        c2.setCar();
        System.out.println("Введите название машины номер 3 и её скорость:");
        c3.setCar();
        rase.whoIsWinner(c1.returnSpeed(), c2.returnSpeed(), c3.returnSpeed(), c1.returnName(), c2.returnName(), c3.returnName());
    }
}
