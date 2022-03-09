package Bean;

import java.util.Arrays;

public class Program {
//    年份、节目类型、节目名称、节目参演演员四列数据。
    private int year;
    private String progType;
    private String progName;
    private String[] progActors;

    @Override
    public String toString() {
        return "Program{" +
                "year=" + year +
                ", progType='" + progType + '\'' +
                ", progName='" + progName + '\'' +
                ", progActors=" + Arrays.toString(progActors) +
                '}';
    }

    public Program(int year, String progType, String progName, String[] progActors) {
        this.year = year;
        this.progType = progType;
        this.progName = progName;
        this.progActors = progActors;
    }

    public Program() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getProgType() {
        return progType;
    }

    public void setProgType(String progType) {
        this.progType = progType;
    }

    public String getProgName() {
        return progName;
    }

    public void setProgName(String progName) {
        this.progName = progName;
    }

    public String[] getProgActors() {
        return progActors;
    }

    public void setProgActors(String[] progActors) {
        this.progActors = progActors;
    }
}
