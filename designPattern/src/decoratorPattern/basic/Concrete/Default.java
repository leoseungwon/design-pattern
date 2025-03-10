package decoratorPattern.basic.Concrete;

import decoratorPattern.basic.Component.Component;

public class Default implements Component{

    @Override
    public void operation() {
        // TODO Auto-generated method stub
        System.out.println("기본 수행");
    }
    
}
