import fly.FlyableImpl;
import quack.QuackableImpl;

/**
 * 如果鸭子种类多了造成重复代码过多。应该改变，代码复用
 */
public class MallardDuck extends Duck
//        implements Flyable,Quackable
{
    //默认会飞，并且呱呱叫
    public MallardDuck(){
        this.flyable = new FlyableImpl();
        this.quackable = new QuackableImpl();
    }

    public void display(){
        System.out.println(name + "是一个绿头鸭");
    }

//    @Override
//    public void fly() {
//        System.out.println("绿头鸭会飞");
//    }
//
//    @Override
//    public void quack() {
//        System.out.println("绿头鸭会呱呱叫");
//    }
}
