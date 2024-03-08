import Adaptee.FeatherTurkey;
import Adaptee.Turkey;
import Client.Duck;
import Client.MallardDuck;

public class Main {

    public static void main(String []args) {
        Turkey featherTurkey = new FeatherTurkey();

        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(featherTurkey);

        Duck duck = new MallardDuck();

        featherTurkey.gobble();
        featherTurkey.fly();

        turkeyAdapter.quack();
        turkeyAdapter.fly();

        duck.fly();
        duck.quack();
    }

}
