package frc.robot;

import edu.wpi.first.wpilibj.XboxController;


public class OI {
    XboxController operatorController;
    XboxController intakeController;
    
    
    public OI() {
        operatorController = new XboxController(0);
        intakeController = new XboxController(1);
    }
    public boolean intake(){
        return intakeController.getLeftBumper();
    }

    public boolean indexForwards() {
        return intakeController.getAButton();
    }
    public boolean indexBackwards() {
        return intakeController.getBButton();
    }

    // controls to move robot 
    public double getSpeed(){
        return operatorController.getLeftY();

    }
    public double getTurn (){
        return operatorController.getRightX();
    }

    public double shooter() {
        
        return operatorController.getLeftTriggerAxis();
    }

 // public boolean robot_Move (){
 //       return operatorController.getLeftStickButton();
 //       return operatorController.getRightBumper();   
 //} 
}
