import fly.BuHuiFlyImpl;
import quack.QuackableImpl;

public class RedheadDuck extends Duck{

    //默认红头鸭子不会飞，会呱呱叫
    public RedheadDuck(){
        this.flyable = new BuHuiFlyImpl();
        this.quackable = new QuackableImpl();
    }

    public void display(){
        System.out.println(name+ "是一个红头鸭");
    }
}
