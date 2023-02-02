/**
 * FatherPanda
 */
public class FatherPanda {

    public boolean isPredator;

    protected int poids;

    private int age;

    public void eat() {

        System.out.println("Après chaque repas, is " + isPredator);

        System.out.println("that , Père Panda prend du poids" + poids);

        System.out.println("Et son âge est" + age);

    }

    public static void main(String[] args) {
        FatherPanda fatherPanda = new FatherPanda();
        fatherPanda.eat();
    }

}