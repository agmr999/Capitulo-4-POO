public class Circle {

    private Integer radius;
    private Integer diameter;
    private Double area;

    public Circle(){
        this.radius=1;
        this.diameter=radius*2;
        this.area=Math.PI*Math.pow(this.radius, 2);
    }

    /**
     * @return the area
     */
    public Double getArea() {
        return area;
    }

    /**
     * @return the diameter
     */
    public Integer getDiameter() {
        return diameter;
    }

    /**
     * @return the radius
     */
    public Integer getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(Integer radius) {
        this.radius = radius;
        this.diameter=radius*2;
        this.area=Math.PI*Math.pow(radius, 2);
    }
    
}