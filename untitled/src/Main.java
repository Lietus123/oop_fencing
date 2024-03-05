import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.FileWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Fencer fencer1 = new Fencer("Latvia", "Maksims Lasijs", 17, "Male", "Daniels Loginovs", 185, 72.5, 10, 12.34);
        Fencer fencer2 = new Fencer("Latvia", "Nikita Anisko", 18, "Male", "Daniels Loginovs", 188, 70.3, 11, 9.47);
        Fencer fencer3 = new Fencer("Ukraine", "Viacheslav Agalakov", 25, "Male", "Bogdan Nikishin", 192, 68.7, 13, 14.56);
        Fencer fencer4 = new Fencer("Ukraine", "Serhiy Chkalikov", 32, "Male", "Bogdan Nikishin", 182, 65.9, 6, 7.21);
        Fencer fencer5 = new Fencer("Estonia", "Katrina Lehis", 28, "Female", "Sergej Novosjolov", 185, 60.5, 10, 11.34);
        Fencer fencer6 = new Fencer("Estonia", "Dinara Kirpu", 23, "Female", "Sergej Novosjolov", 179, 59.5, 8, 12.54);
        Fencer fencer7 = new Fencer("German", "Alisa Klasic", 27, "Femaale", "Aleksandrs Peterson", 175, 62.5, 9, 12.84);
        Fencer fencer8 = new Fencer("German", "Sofia Grozneva", 35, "Femaale", "Aleksandrs Peterson", 173, 55.5, 7, 14.94);


        ArrayList<Fencer> fencers = new ArrayList<>();
        fencers.add(fencer1);
        fencers.add(fencer2);
        fencers.add(fencer3);
        fencers.add(fencer4);
        fencers.add(fencer5);
        fencers.add(fencer6);
        fencers.add(fencer7);
        fencers.add(fencer8);

        Scanner sc = new Scanner(System.in);
        int option = 0;
        System.out.println("1. Print out Fencers' data by their coach\n"
                + "2. Print out data about Fencer by their name\n"
                + "3. Compare 2 Fencers by their names\n"
                + "4. Print out top-1 Fencers with best points per minute\n"
                + "5. Exit");
        do {
            System.out.println("Write number of action (1, 2, 3, 4 or 5)");
            option = sc.nextByte();
        } while (option != 1 && option != 2 && option != 3 && option != 4 && option != 5);

        switch (option) {
            case 1:
                System.out.println("Write name of coach");
                sc.nextLine();
                String coachname = sc.nextLine();
                for (int i = 0; i < fencers.size(); i++) {
                    if (coachname.equalsIgnoreCase(fencers.get(i).getCoach())) {
                        fencers.get(i).soutfencer();
                    }
                }
                break;
            case 2:
                System.out.println("Write name and surname of Fencer");
                sc.nextLine();
                String fencername = sc.nextLine();
                for (int i = 0; i < fencers.size(); i++) {
                    if (fencername.equalsIgnoreCase(fencers.get(i).getNamesurname())) {
                        fencers.get(i).soutfencer();
                    }
                }
                break;
            case 3:
                System.out.println("Write name and surname of 1st Fencer");
                sc.nextLine();
                String fencername1 = sc.nextLine();
                System.out.println("Write name and surname of 2st Fencer");
                String fencername2 = sc.nextLine();
                int a = -1;
                int b = -1;
                for (int i = 0; i < fencers.size(); i++) {
                    if (fencername1.equalsIgnoreCase(fencers.get(i).getNamesurname())) {
                        a = i;
                    }
                    if (fencername2.equalsIgnoreCase(fencers.get(i).getNamesurname())) {
                        b = i;
                    }
                }
                if (fencers.get(a).getHeight() > fencers.get(b).getHeight()) {
                    System.out.println("Fencer " + fencers.get(a).getNamesurname() + " is higher by " + (fencers.get(a).getHeight() - fencers.get(b).getHeight()) + " cm");
                } else {
                    System.out.println("Fencer " + fencers.get(b).getNamesurname() + " is higher by " + (fencers.get(b).getHeight() - fencers.get(a).getHeight()) + " cm");
                }
                if (fencers.get(a).getWeight() > fencers.get(b).getWeight()) {
                    System.out.println("Fencer " + fencers.get(a).getNamesurname() + " has bigger weight by " + (double) (fencers.get(a).getWeight() - fencers.get(b).getWeight()) + " kg");
                } else {
                    System.out.println("Fencer " + fencers.get(b).getNamesurname() + " has bigger weight by " + (double) (fencers.get(b).getWeight() - fencers.get(a).getWeight()) + " kg");
                }
                if (fencers.get(a).getPoints() > fencers.get(b).getPoints()) {
                    System.out.println("Fencer " + fencers.get(a).getNamesurname() + " has more points by " + (fencers.get(a).getPoints() - fencers.get(b).getPoints()) + " point");
                } else {
                    System.out.println("Fencer " + fencers.get(b).getNamesurname() + " has more points by " + (fencers.get(b).getPoints() - fencers.get(a).getPoints()) + " point");
                }
                if (fencers.get(a).getTime() > fencers.get(b).getTime()) {
                    System.out.println("Fencer " + fencers.get(a).getNamesurname() + " has more time by " + (double) (fencers.get(a).getTime() - fencers.get(b).getTime()) + " minuts");
                } else {
                    System.out.println("Fencer " + fencers.get(b).getNamesurname() + " has more time by " + (double) (fencers.get(b).getTime() - fencers.get(a).getTime()) + " minuts");
                }

                break;
            case 4:
                int c = -1;
                double max = Integer.MIN_VALUE;
                for (int i = 0; i < fencers.size(); i++) {
                    if (fencers.get(i).pointsperminute() > max) {
                        c = fencers.indexOf(fencers.get(i));
                        max = (double) fencers.get(i).pointsperminute();
                    }
                }
                System.out.println("The best fencer is - " + fencers.get(c).getNamesurname() + " his result is -  " + max);


                break;
            case 5:

                break;

        }


        String str = "";

        FileWriter fw;

        try {
            fw = new FileWriter(("fence.txt"));
            System.out.println("All fencers: ");
            for (Fencer i : fencers) {
                str = i.soutfencer();
                fw.write(str);
            }
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}
