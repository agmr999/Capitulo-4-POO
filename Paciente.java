public class Paciente {

    private Integer id;
    private Byte age;
    private BloodData bd;

    public Paciente(){
        this.id = 0;
        this.age = 0;
        this.bd = new BloodData();
    }

    public Paciente(Integer id, Byte age, BloodType tipoS, Factor factor){
        this.id = id;
        this.age = age;
        this.bd = new BloodData(tipoS, factor);
    }

    /**
     * @param age the age to set
     */
    public void setAge(Byte age) {
        this.age = age;
    }

    /**
     * @param bd the bd to set
     */
    public void setBd(BloodData bd) {
        this.bd = bd;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the age
     */
    public Byte getAge() {
        return age;
    }

    /**
     * @return the bd
     */
    public BloodData getBd() {
        return bd;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }


}