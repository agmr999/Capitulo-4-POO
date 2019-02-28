public class FormLetterWritter {

    private String fname;
    private String lname;

    public FormLetterWritter(){

    }

    public FormLetterWritter(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    public String displaySalutation(String lname){
        return String.format("Dear Mr. or Ms. %s\nThank you for your recent order", lname);
    }

    public String displaySalutation(String fname, String lname){
        return String.format("Dear %s %s\nThank you for your recent order", fname, lname);
    }
    
}