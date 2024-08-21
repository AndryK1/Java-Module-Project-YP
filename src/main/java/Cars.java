import java.util.Scanner;

public class Cars {
    Scanner scanner;
    int speed;
    String name;

    public Cars() {
        scanner = new Scanner(System.in);
        speed = 0;
        name = null;
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
