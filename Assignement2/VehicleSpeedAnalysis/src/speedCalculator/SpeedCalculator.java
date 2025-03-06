package speedCalculator;
public class SpeedCalculator {

    public SpeedInfo calculateSpeed(double speed) {
        String speedType;;
        if (speed<0 && speed>40) {
            speedType = "slow";
        }
        else if(speed>=40 && speed<=80){
            speedType = "normal";
        }
        else{
            speedType = "over speed";
        }
        return new SpeedInfo(speed, speedType);
     
    }

}
