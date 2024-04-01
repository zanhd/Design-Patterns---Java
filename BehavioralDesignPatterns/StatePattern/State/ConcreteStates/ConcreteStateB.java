package State.ConcreteStates;

import Context.Context;
import State.State;

public class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
        System.out.println("Handling State B");
        //Change state if necessary
        context.setState(new ConcreteStateA());
    }
}
