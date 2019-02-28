public class BirdSighting {

    private String specie;
    private Integer number;
    private Integer day;

    public BirdSighting(){
        this.specie="Robin";
        this.number=1;
        this.day=1;
    }

    public BirdSighting(String specie, Integer number, Integer day){
        this.specie=specie;
        this.number=number;
        this.day=day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(Integer day) {
        this.day = day;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(Integer number) {
        this.number = number;
    }
    /**
     * @param specie the specie to set
     */
    public void setSpecie(String specie) {
        this.specie = specie;
    }

    /**
     * @return the day
     */
    public Integer getDay() {
        return day;
    }

    /**
     * @return the number
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * @return the specie
     */
    public String getSpecie() {
        return specie;
    }



}