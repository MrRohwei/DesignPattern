public class Main {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.setName("唐老鸭");
        duck.display();
        duck.fly();
        duck.quack();


        Duck duck1 = new RedheadDuck();
        duck1.setName("丑小鸭");
        duck1.display();
        duck1.fly();
        duck1.quack();


        Duck duck2 = new RubberDuck();
        duck2.setName("橡皮鸭");
        duck2.display();
        duck2.fly();
        duck2.quack();

    }
}
