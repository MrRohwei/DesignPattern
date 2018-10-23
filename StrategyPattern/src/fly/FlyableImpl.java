package fly;

public class FlyableImpl implements Flyable {

    private String name;

    @Override
    public void fly() {
        System.out.println(name+"会飞");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
