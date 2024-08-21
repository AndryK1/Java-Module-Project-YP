public class Rase {
    float time = 24.0F;

    public Rase() {
    }

    public void whoIsWinner(int s1, int s2, int s3, String n1, String n2, String n3) {
        if (s1 > s2 & s1 > s3) {
            System.out.println("Самая быстрая машина: " + n1);
        } else if (s2 > s1 & s2 > s3) {
            System.out.println("Самая быстрая машина: " + n2);
        } else if (s3 > s1 & s3 > s2) {
            System.out.println("Самая быстрая машина: " + n3);
        } else if (s1 == s2 & s2 == s3) {
            System.out.println("Победителей нет!");
        } else if (s1 == s2 & s2 > s3) {
            System.out.println("Победителей нет!");
        } else if (s1 == s3 & s3 > s2) {
            System.out.println("Победителей нет!");
        } else if (s2 == s3 & s3 > s1) {
            System.out.println("Победителей нет!");
        }

    }
}