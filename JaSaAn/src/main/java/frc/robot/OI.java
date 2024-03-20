package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

public class OI {
    XboxController operatorController;
    
    public OI() {
        operatorController = new XboxController(0);
    }
    public boolean intake(){
        return operatorController.getLeftBumper();
    }

    public boolean indexForwards() {
        return operatorController.getAButtonPressed();
    }
    public boolean indexBackwards() {
        return operatorController.getBButtonPressed();
    }
 //   public double 

    
}
