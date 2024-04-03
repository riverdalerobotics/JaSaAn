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
        return operatorController.getAButton();
    }
    public boolean indexBackwards() {
        return operatorController.getBButton();
    }

    // controls to move robot 
    public boolean  getSpeed () {
        return operatorController.getLeftStickButton();

    }
    public boolean getTurn (){
        return operatorController.getRightStickButton();
    }
    public double shooter() {
        
        return operatorController.getLeftTriggerAxis();
    }

 // public boolean robot_Move (){
 //       return operatorController.getLeftStickButton();
 //       return operatorController.getRightBumper();   
 //} 
}
