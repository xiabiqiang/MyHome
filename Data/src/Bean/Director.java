package Bean;

import java.util.Arrays;
import java.util.Date;

public class Director {

    private int year;
    private String name;
    private String[] host;

    @Override
    public String toString() {
        return "Director{" +
                "year=" + year +
                ", name='" + name + '\'' +
                ", host=" + Arrays.toString(host) +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getHost() {
        return host;
    }

    public void setHost(String[] host) {
        this.host = host;
    }

    public Director() {
    }

    public Director(int year, String name, String[] host) {
        this.year = year;
        this.name = name;
        this.host = host;
    }
}
