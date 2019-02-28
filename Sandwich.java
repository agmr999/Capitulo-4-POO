public class Sandwich {

    private Bread bread1;
    private SandwichFilling fill1;

    public Sandwich(String bread, Integer breadcalories, String fill, Integer fillcalories ){
        this.bread1=new Bread(bread, breadcalories);
        this.fill1=new SandwichFilling(fill, fillcalories);
    }

    /**
     * @return the bread1
     */
    public Bread getBread1() {
        return bread1;
    }

    /**
     * @return the fill1
     */
    public SandwichFilling getFill1() {
        return fill1;
    }

}