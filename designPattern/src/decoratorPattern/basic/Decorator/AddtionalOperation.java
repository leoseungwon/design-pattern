package decoratorPattern.basic.Decorator;

import decoratorPattern.basic.Component.Component;

public class AddtionalOperation extends Additional {
    
    public AddtionalOperation(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        addtionOperation();
    }

    @Override
    protected void addtionOperation() {
       
        // TODO Auto-generated method stub
        System.out.println("추가행동");
    }
    
}
