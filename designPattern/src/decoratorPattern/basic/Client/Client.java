package decoratorPattern.basic.Client;

import decoratorPattern.basic.Component.Component;
import decoratorPattern.basic.Concrete.Default;
import decoratorPattern.basic.Decorator.AdditionalOperation2;
import decoratorPattern.basic.Decorator.AddtionalOperation;

public class Client {
    public static void main(String[] args) {
        Component component = new Default();
        component.operation();

        System.out.println("\n");

        Component addtional = new AddtionalOperation(new AdditionalOperation2(component));
        addtional.operation();
    }
}
