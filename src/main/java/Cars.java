import java.util.Scanner;

public class Cars {
    Scanner scanner;
    int speed;
    String name;

    public Cars() {
        this.scanner = new Scanner(System.in);
        this.speed = 0;
        this.name = null;
    }

    public void setCar() {
        System.out.println("Назввание: ");
        this.name = this.scanner.nextLine();
        System.out.println("Скорость: ");

        while(!this.scanner.hasNextInt()) {
            this.scanner.next();
            System.out.println("Скорость может быть выражена только целым числом, попробуйте ещё раз: ");
        }

        this.speed = this.scanner.nextInt();
        if (!(this.speed > 0 & this.speed <= 250)) {
            while(!(this.speed > 0 & this.speed <= 250)) {
                System.out.println("Скорость должна быть больше 0 и меньше 250, попробуйте указать её ещё раз:");

                while(!this.scanner.hasNextInt()) {
                    this.scanner.next();
                    System.out.println("Скорость может быть выражена только целым числом, попробуйте ещё раз: ");
                }

                this.speed = this.scanner.nextInt();
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
