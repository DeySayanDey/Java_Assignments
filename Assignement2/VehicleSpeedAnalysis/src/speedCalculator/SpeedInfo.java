package speedCalculator;

public class SpeedInfo {
    private double speed_;
    private String speedType_;
    public SpeedInfo(double speed, String speedType) {
        speed_ = speed;
        speedType_ = speedType;
    }
    public double getSpeed() {
        return speed_;
    }
    public String getSpeedType() {
        return speedType_;
    }
}
