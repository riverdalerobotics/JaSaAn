public class OperatorInput {
    XboxController moveController;  
    XboxController intakeController;
    
    public OperatorInput() {
        moveController = new XboxController(0);
        intakeController = new XboxController(1);
    }
}
