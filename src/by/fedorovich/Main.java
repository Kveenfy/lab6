package by.fedorovich;
import  java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, String> info = new HashMap<>();
        info.put("Улица", "Ленина");
        info.put("Проспект", "Машерова");
        City city = new City(info);
        city.Show();
    }
}
