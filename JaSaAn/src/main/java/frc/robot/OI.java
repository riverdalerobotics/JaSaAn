package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

public class OI {
    XboxController operatorController;
    
    
    public OI() {
        operatorController = new XboxController(0);
    }
    /**
     * A button to lift the intake
     * @return True if the left bumper is pressed
     */
    public boolean intake(){
        return operatorController.getLeftBumper();
    }
    /**
     * 
     * @return true if the A button is pressed
     */
    public boolean indexForwards() {
        return operatorController.getAButton();
    }
    /**
     * 
     * @return true if the B button is pressed
     */
    public boolean indexBackwards() {
        return operatorController.getBButton();
    }
 //   public double 

    
}
