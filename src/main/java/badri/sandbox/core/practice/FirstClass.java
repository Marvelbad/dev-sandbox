package badri.sandbox.core.practice;

public abstract class FirstClass implements Action {

    protected FirstClass() {
        Solution.countActionObjects++;
    }

    @Override
    public void someAction() {
        System.out.println("class FirstClass, method someAction");
    }

    public abstract Action getDependantAction();

}
