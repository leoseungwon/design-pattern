package decoratorPattern.basic.Decorator;

import decoratorPattern.basic.Component.Component;

public abstract class Additional implements Component{

    private Component defaultComp;

    public Additional(Component comp) {
       this.defaultComp = comp;
    }


    public void operation() {
        defaultComp.operation();
    }

    protected abstract void addtionOperation();

    

}
