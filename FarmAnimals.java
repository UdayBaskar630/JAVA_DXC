package DXC;
public class FarmAnimals {

    public static void findAnimals(int heads, int legs) {
        int chickens = 0;
        int rabbits = 0;

        for (rabbits = 0; rabbits <= heads; rabbits++) {
            chickens = heads - rabbits;
            if ((chickens * 2 + rabbits * 4) == legs) {
                break;
            }
        }

        if (rabbits > heads) {
            System.out.println("Invalid input. Can't determine the number of chickens and rabbits.");
        } else {
            System.out.println("Number of chickens: " + chickens);
            System.out.println("Number of rabbits: " + rabbits);
        }
    }

    public static void main(String[] args) {
        findAnimals(3, 11);
        findAnimals(150,500);
    }
}