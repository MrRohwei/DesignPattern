package fly;

public class BuHuiFlyImpl implements Flyable {

    private String name;

    @Override
    public void fly() {
        System.out.println(name+"不会飞");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
