package Adaptee;

public class FeatherTurkey implements Turkey{

    @Override
    public void fly() {
        System.out.println("Turkey is flying");
    }

    @Override
    public void gobble() {
        System.out.println("Turkey is gobbling");
    }
}
