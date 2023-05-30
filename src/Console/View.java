package Console;

import java.util.HashMap;

public class View {

    public HashMap<Integer, String> HeroClass_mapList()
    {
        HashMap <Integer, String> heroClass = new HashMap<Integer, String>();
        heroClass.put(1, "Лучник");
        heroClass.put(2, "Воин");
        heroClass.put(3, "Маг");
        return heroClass;
    }

    public HashMap<Integer, String> Start_menu() {
        HashMap<Integer, String> heroClass = new HashMap<Integer, String>();
        heroClass.put(1, "Создания героя");
        heroClass.put(2, "Битва");
        return heroClass;
    }

    public void show(HashMap<Integer, String> map)
    {
        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }


}
