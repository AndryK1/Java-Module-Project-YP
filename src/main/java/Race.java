import java.util.Scanner;

public class Race {
    int time = 24;
    Scanner scanner;
    int speed;
    String name;

    public Race() {
        scanner = new Scanner(System.in);
        speed = 0;
        name = null;
    }

    public void getWinner(int[] arrayI, String[] arrayS) {
        int[] s = new int[3];
        int max = 0;
        int num = -1;
        for(int i =0; i<3; i++)
        {
            s[i] = time* arrayI[i];
        }
        for(int i = 0; i<3;i++)
        {
            if(s[i]>max)
            {
                max = s[i];
                num += 1;
            }
        }
        if(max == s[0] & max == s[1] || max == s[1] & max == s[2] || max == s[0] & max == s[2] || max == s[0] & max == s[1] & max == s[2])
        {
            System.out.println("Победителей нет!");
        }
        else {
            System.out.println("Самая быстрая машина: " + arrayS[num]);
        }

    }
    public void setCar() {
        System.out.println("Назввание: ");
        name = scanner.nextLine();
        System.out.println("Скорость: ");

        while(!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Скорость может быть выражена только целым числом, попробуйте ещё раз: ");
        }

        speed = scanner.nextInt();
        if (!(speed > 0 & speed <= 250)) {
            while(!(speed > 0 & speed <= 250)) {
                System.out.println("Скорость должна быть больше 0 и меньше 250, попробуйте указать её ещё раз:");

                while(!scanner.hasNextInt()) {
                    scanner.next();
                    System.out.println("Скорость может быть выражена только целым числом, попробуйте ещё раз: ");
                }

                speed = scanner.nextInt();
            }
        }

    }

    public String returnName() {
        return this.name;
    }

    public int returnSpeed() {
        return this.speed;
    }
}
