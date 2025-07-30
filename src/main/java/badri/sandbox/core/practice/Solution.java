package badri.sandbox.core.practice;

public class Solution implements Action {
    public static int countActionObjects;

    private int param;

    private Action solutionAction = new Action() {
        @Override
        public void someAction() {
            if (param > 0) {
                FirstClass firstClass = new FirstClass() {
                    @Override
                    public Action getDependantAction() {
                        param--;
                        if (param > 0) {
                            return solutionAction; // recursion
                        } else {
                            return new SecondClass();
                        }
                    }
                };
                firstClass.someAction();
                firstClass.getDependantAction().someAction();
            } else {
                new SecondClass().someAction();
            }
        }
    };

    public Solution(int param) {
        this.param = param;
    }



    public static void main(String[] args) {
        Solution solution = new Solution(5);
        solution.someAction();
        System.out.println("Count of created Action objects is " + countActionObjects);

        solution = new Solution(-1);
        solution.someAction();
        System.out.println("Count of created Action objects is " + countActionObjects);
    }

    @Override
    public void someAction() {

    }
}
