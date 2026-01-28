package duck;

import behaviour.FlyBehavior;
import behaviour.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    void swim() {
        System.out.println("All ducks float!");
    }

    public abstract void display();
}
