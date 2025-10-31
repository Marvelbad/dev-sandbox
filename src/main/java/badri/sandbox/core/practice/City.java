package badri.sandbox.core.practice;

public class City implements Comparable<City> {
    private final String name;
    private final int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public int compareTo(City other) {
        return Integer.compare(this.population, other.population);
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}
