import Joyce.BloodType;
import Joyce.Factor;

public class BloodData {

    private BloodType bloodType;
    private Factor factor;

    public BloodData(){
        this.bloodType = BloodType.O;
        this.factor = Factor.POSITIVO;

    }

    public BloodData(BloodType bloodType, Factor factor){
        this.bloodType = bloodType;
        this.factor = factor;
    }

    /**
     * @param bloodType the bloodType to set
     */
    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    /**
     * @param factor the factor to set
     */
    public void setFactor(Factor factor) {
        this.factor = factor;
    }

    /**
     * @return the bloodType
     */
    public BloodType getBloodType() {
        return bloodType;
    }

    /**
     * @return the factor
     */
    public Factor getFactor() {
        return factor;
    }

}