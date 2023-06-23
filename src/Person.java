public class Person {
    // írj egy statikus fieldet popular néven
    private static int population = 0;

    // írj egy konstruktort ami megnöveli a statikus fieldünket
    public Person() {
        population++;
    }

    // írj egy metódust ami vissza adja a popular értékét

    public static int getPopulation() {
        return population;
    }


    // írj egy katasztrófa statikus metódust ami nulláza a populart
    public static void catastrophe() {
        population = 0;
    }
}
