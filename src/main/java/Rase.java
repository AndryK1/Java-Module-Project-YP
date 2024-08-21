public class Rase {
    int time = 24;

    public Rase() {
    }

    public void whoIsWinner(int s1, int s2, int s3, String n1, String n2, String n3) {
        int d1 = s1*time;
        int d2 = s2*time;
        int d3 = s3*time;
        if (d1 > d2 & d1 > d3) {
            System.out.println("Самая быстрая машина: " + n1);
        } else if (d2 > d1 & d2 > d3) {
            System.out.println("Самая быстрая машина: " + n2);
        } else if (d3 > d1 & d3 > d2) {
            System.out.println("Самая быстрая машина: " + n3);
        } else if (d1 == d2 & d2 == d3) {
            System.out.println("Победителей нет!");
        } else if (d1 == d2 & d2 > d3) {
            System.out.println("Победителей нет!");
        } else if (d1 == d2 & d3 > d2) {
            System.out.println("Победителей нет!");
        } else if (d1 == d3 & d3 > d1) {
            System.out.println("Победителей нет!");
        }

    }
}