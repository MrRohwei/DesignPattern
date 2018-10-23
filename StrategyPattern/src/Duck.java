import fly.Flyable;
import quack.Quackable;

/**
 * 鸭子类
 */
public class Duck {

    Flyable flyable;
    Quackable quackable;
    public String name;

    public Duck(){

    }

    public void setFlyable(Flyable flyable){
        this.flyable = flyable;
    }

    public void setQuackable(Quackable quackable){
        this.quackable = quackable;
    }

    //利用多态动态调用谁飞
    public void fly(){
        flyable.setName(name);
        flyable.fly();
    }
    //利用多态动态调用谁呱呱叫，谁吱吱叫，谁不叫
    public void quack(){
        quackable.setName(name);
        quackable.quack();
    }

    /**
     * 鸭子会游泳
     */
    public void swim(){
        System.out.println("");
    }

    /**
     * 鸭子会 “呱呱” 叫
     * 并不是所有的鸭子都会呱呱叫
     */
//    public void quack(){
//        System.out.println("");
//    }

    /**
     * 鸭子的长相
     */
    public void display(){
        System.out.println("");
    }

    /**
     * 鸭子会飞
     * 并不是所有的鸭子都会飞
     */
//    public void fly(){
//        System.out.println("");
//    }

    public void setName(String name){
        this.name = name;
    }
}
