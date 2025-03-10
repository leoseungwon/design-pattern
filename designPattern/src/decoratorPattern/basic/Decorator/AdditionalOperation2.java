package decoratorPattern.basic.Decorator;

import decoratorPattern.basic.Component.Component;

public class AdditionalOperation2 extends Additional{

    public AdditionalOperation2(Component comp) {
        super(comp);
    }

    public void operation() {
        super.operation();
        addtionOperation();
    }

    @Override
    protected void addtionOperation() {
        System.out.println("추가행동2");
    }
}
