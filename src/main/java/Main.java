import java.util.ArrayList;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ArrayList<Race> carList = new ArrayList<>();
        Race race = new Race();
        int[] arrayI = new int[3];
        String[] arrayS = new String[3];
        for(int i = 0;i <3;i++ )
        {
            carList.add(new Race());
        }
        for(int i = 0; i<3;i++)
        {
            System.out.println("Введите название машины номер " + (i+1) + " и её скорость:");
            carList.get(i).setCar();
        }
        for(int i = 0; i<3;i++)
        {
            arrayS[i] = carList.get(i).returnName();
        }
        for(int i = 0; i<3;i++) {
            arrayI[i] = carList.get(i).returnSpeed();
        }
        race.getWinner(arrayI, arrayS);
    }
}
