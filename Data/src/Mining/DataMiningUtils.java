package Mining;

import Bean.Director;
import Bean.Program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DataMiningUtils {
    public static List<Director> read(String resources) throws IOException {
        FileReader fileReader=new FileReader(new File(resources));
        BufferedReader buffer=new BufferedReader(fileReader);
        String content="";
        List<Director> list=new ArrayList<>();
        while ((content=buffer.readLine())!=null){
            String[] split = content.trim().split("\\s+");
            Director director=new Director();
            director.setYear(Integer.parseInt(split[0]));
            director.setName(split[1]);
            String[] split1 = split[2].split("、");
            director.setHost(split1);
            list.add(director);
        }
        return list;
    }

    public static List<Program> readProg(String resources) throws IOException {
        FileReader fileReader=new FileReader(new File(resources));
        BufferedReader buffer=new BufferedReader(fileReader);
        String content="";
        List<Program> list=new ArrayList<>();
        while ((content=buffer.readLine())!=null){
            String[] split = content.trim().split("\\s+");
            Program program=new Program();
            program.setYear(Integer.parseInt(split[0]));
            program.setProgName(split[2]);
            program.setProgType(split[1]);
            String[] split1 = split[3].split("、");
            program.setProgActors(split1);
            list.add(program);
        }
        return list;
    }
    public static void compare(Object[] objects){
        Arrays.sort(objects, new Comparator<Object>() {

            @Override
            public int compare(Object o1, Object o2) {
                Map.Entry<String, Integer>entry1=(Map.Entry<String, Integer>)  o1;
                Map.Entry<String, Integer>entry2=(Map.Entry<String, Integer>)  o2;
                return -Integer.compare(entry1.getValue(),entry2.getValue());
            }
        });
    }
}
