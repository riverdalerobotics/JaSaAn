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
 //   public double 

    
}
