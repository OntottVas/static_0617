public class Main {
    public static void main(String[] args) {
        // írd meg a person osztályt

        // példányosísd 3 szor a persont
        Person firstPerson = new Person();
        Person secondPerson = new Person();
        Person thirdPerson = new Person();

        // kérd le a statikus fieldet
        System.out.println(Person.getPopulation());

        // példányosísd még 1 szer
        Person fourthPerson = new Person();

        // kérd le a statikus fieldet

        System.out.println(Person.getPopulation());

        // hívd meg a katasztofa metódust
        Person.catastrophe();

        System.out.println(Person.getPopulation());
    }
}
