public class Jaeger {
    
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {
    }

    public Jaeger(String modelName, String mark, String origin, float height, 
            float weight, int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public boolean drift() {
        System.out.println(modelName + " вошел в дрифт");
        return true;
    }

    public void move() {
        System.out.println(modelName + " сделал 5 шагов");
    }

    public String scanKaiju() {
        return "Кайдзю обнаружено";
    }

    public void useVortexCannon() {
        System.out.println(modelName + " совершил удар электро-вихревой пушкой");
    }

    public void useCoreSalvoCharges() {
        System.out.println(modelName + " совершил залп электрическим зарядом");
    }

    public void useArcWhip() {
        System.out.println(modelName + " Воспользовался электрическим кнутом");
    }

    public void displayInfo() {
        System.out.println("\nЕгерь : " + modelName);
        System.out.println("Информация о егере :");
        System.out.println("Модель :" + mark);
        System.out.println("Страна производитель : " + origin);
        System.out.println("Высота : " + height + " м.");
        System.out.println("Вес : " + weight + " тыс.тонн");
        System.out.println("Скорость : " + speed);
        System.out.println("Мощность : " + strength);
        System.out.println("Броня : " + armor);
    }
}