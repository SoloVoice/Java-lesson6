public class lesson6 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Буся");
        Cat cat2 = new Cat("Белка");
        Dog dog1 = new Dog("Бабай");
        Dog dog2 = new Dog("Фил");
        cat1.run(100);
        dog1.run(150);
        dog1.jump(0.2f);
        dog1.swim(10);
    }
}
