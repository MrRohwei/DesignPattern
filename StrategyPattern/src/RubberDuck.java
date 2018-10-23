import fly.BuHuiFlyImpl;
import quack.BuJiaoImpl;

/**
 * 橡皮鸭
 * 不会飞，不会呱呱叫
 */
public class RubberDuck extends Duck {

    //橡皮鸭默认不会飞，不会呱呱叫
    public RubberDuck(){
        this.flyable = new BuHuiFlyImpl();
        this.quackable = new BuJiaoImpl();
    }
    public void display(){
        System.out.println(name+"是一个橡皮鸭");
    }
}
