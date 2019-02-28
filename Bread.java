public class Bread {

    public final static String MOTTO="The staff of life";
    private String type;
    private Integer calories;
    
    public Bread(String type, Integer calories){
        this.type=type;
        this.calories=calories;
    }

    /**
     * @return the calories
     */
    public Integer getCalories() {
        return calories;
    }
    
    /**
     * @return the motto
     */
    public static String getMotto() {
        return MOTTO;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param calories the calories to set
     */
    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

}