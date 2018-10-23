package quack;

public class QuackableImpl implements Quackable {
private String name;
    @Override
    public void quack() {
        System.out.println(name+"会呱呱叫");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
