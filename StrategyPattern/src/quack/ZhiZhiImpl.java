package quack;

public class ZhiZhiImpl implements Quackable {

    private String name;
    @Override
    public void quack() {
        System.out.println(name+"会吱吱叫");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
