package quack;

public class BuJiaoImpl implements Quackable {

    private String name;
    @Override
    public void quack() {
        System.out.println(name+"不会叫");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
