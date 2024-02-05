public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("Мужская особь");
        wolfOne.setNickname("Бракус");
        wolfOne.setWeight(40.5f);
        wolfOne.setAge(10);
        wolfOne.setColor("Серый");

        System.out.println("Пол = " + wolfOne.getGender());
        System.out.println("Кличка = " + wolfOne.getNickname());
        System.out.println("Вес = " + wolfOne.getWeight());
        System.out.println("Возраст = " + wolfOne.getAge());
        System.out.println("Окрас = " + wolfOne.getColor());
        
        wolfOne.move();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}