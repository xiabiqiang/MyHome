package Mining;

import Bean.Director;
import Bean.Program;
import org.junit.Test;

import java.util.*;

public class DataminingTest {


    /*谁导演次数最多？请列出前五名的导演名字及执导的次数。*/
    @Test
    public void test() throws Exception {
        List<Director> list = DataMiningUtils.read("src/1983-2022_director_ presenter.txt");
        Map<String,Integer> map=new HashMap<>();
            for(Director dir:list){
                String name = dir.getName();
                if(map.containsKey(name)){
                    map.put(name,map.get(name)+1);
                }
                else{
                    map.put(name,1);
                }
            }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Object[] objects = entries.toArray();
        DataMiningUtils.compare(objects);

        for (int i = 0; i < 5; i++) {
            System.out.println(objects[i]);
        }
}

/*谁主持春晚次数最多？请列出前十名主持人的名字及主持的次数。*/
    @Test
    public void test1() throws Exception {
        List<Director> list = DataMiningUtils.read("src/1983-2022_director_ presenter.txt");
       Map<String,Integer> map=new HashMap<>();
        for(Director dir:list){
                for (String host:dir.getHost()){
                    if(map.containsKey(host)){
                        map.put(host,map.get(host)+1);
                    }
                    else{
                        map.put(host,1);
                    }
                }
                }
                Set<Map.Entry<String, Integer>> entries = map.entrySet();
            Object[] objects = entries.toArray();
            DataMiningUtils.compare(objects);

        for (int i = 0; i < 5; i++) {
        System.out.println(objects[i]);
        }
    }

        /*节目类型比例分析。将节目分为歌曲、舞蹈、相声、小品、其他五类（除歌曲、舞蹈、相声、小品外的类型均归类为其他）。*/
    @Test
    public void test2() throws Exception {
        List<Program> programs = DataMiningUtils.readProg("src/1983-2022_chinese_year.txt");
        Map<String,Integer> map=new HashMap<>();
        int count=0;
        for(Program program:programs){
            count++;
            String typename=program.getProgType();
            if(!(typename.equals("歌曲")||typename.equals("小品")||typename.equals("相声")||typename.equals("舞蹈"))){
                typename="其他";
            }
                if(map.containsKey(typename)){
                    map.put(typename,map.get(typename)+1);
                }
                else{
                    map.put(typename,1);
                }
            }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Object[] objects = entries.toArray();
        DataMiningUtils.compare(objects);

        for (int i = 0; i < objects.length; i++) {
            Map.Entry<String, Integer>  e= (Map.Entry<String, Integer>) objects[i];
            double a= (double) e.getValue() ;
            Double rate=a/count*100;
            System.out.println("节目"+e.getKey()+"的比例是"+Math.round(rate)+"%");
        }
        }
// 列出参加春晚次数最多的演员名字及参演次数。（前十名）
    @Test
    public void test3() throws Exception {
        List<Program> programs = DataMiningUtils.readProg("src/1983-2022_chinese_year.txt");
        Map<String,Integer> map=new HashMap<>();
        for(Program program:programs){
            for (String host:program.getProgActors()){
                if(map.containsKey(host)){
                    map.put(host,map.get(host)+1);
                }
                else{
                    map.put(host,1);
                }
            }
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Object[] objects = entries.toArray();
        DataMiningUtils.compare(objects);

        for (int i = 0; i < 10; i++) {
            System.out.println(objects[i]);
        }

    }
}
