public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "Мужская особь";
        wolfOne.nickname = "Бракус";
        wolfOne.weight = 40.5f;
        wolfOne.age = 10;
        wolfOne.color = "Серый";

        System.out.println("Пол = " + wolfOne.gender);
        System.out.println("Кличка = " + wolfOne.nickname);
        System.out.println("Вес = " + wolfOne.weight);
        System.out.println("Возраст = " + wolfOne.age);
        System.out.println("Окрас = " + wolfOne.color);
        
        wolfOne.move();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}