package by.fedorovich;
import java.util.*;

public class City {
    public Inner[] inner;
    City(Map<String, String> info){
        this.inner = new Inner[info.size()];
        int i = 0;
        for (String key : info.keySet()) {
            inner[i] = new Inner(key,info.get(key));
            i++;
        }
    }
    void Show(){
        for (int i = 0; i < inner.length; i++) {
            System.out.print(inner[i].type + " ");
            System.out.println(inner[i].name);
        }
    }
    public class Inner{
        String name;
        String type;
        Inner(String type, String name){
            this.name = name;
            this.type = type;
        }
    }


}
