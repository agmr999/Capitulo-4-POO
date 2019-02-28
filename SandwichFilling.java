public class SandwichFilling {

    private String fillingtype;
    private Integer caloriesserve;

    public SandwichFilling(String type, Integer calories){
        this.fillingtype=type;
        this.caloriesserve=calories;
    }

    /**
     * @return the caloriesserve
     */
    public Integer getCaloriesserve() {
        return caloriesserve;
    }

    /**
     * @return the fillingtype
     */
    public String getFillingtype() {
        return fillingtype;
    }

    /**
     * @param caloriesserve the caloriesserve to set
     */
    public void setCaloriesserve(Integer caloriesserve) {
        this.caloriesserve = caloriesserve;
    }

    /**
     * @param fillingtype the fillingtype to set
     */
    public void setFillingtype(String fillingtype) {
        this.fillingtype = fillingtype;
    }

    

}