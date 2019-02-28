public class State {

    private String name;
    private Integer population;
    private City capital;
    private City mPopulated;

    public State(String name, Integer population, String capital, Integer cPopulation, String mPopulated, Integer mPopulation){
        this.name=name;
        this.population=population;
        this.capital=new City(capital, cPopulation);
        this.mPopulated=new City(mPopulated, mPopulation);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the population
     */
    public Integer getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\nPoblación: %d\nCapital: %s\nPoblacion Capital: %d\nCiudad mas poblada: %s\nPoblación Ciudad mas poblada: %d", this.name, this.population, this.capital.getName(), this.capital.getPopulation(), this.mPopulated.getName(),this.mPopulated.getPopulation());
    }

}

final class City {

    private String name;
    private Integer population;

    public City(String name, Integer population){
        this.name=name;
        this.population=population;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the population
     */
    public Integer getPopulation() {
        return population;
    }
    
}