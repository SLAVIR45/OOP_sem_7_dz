package Console;

import java.util.HashMap;

public class View {

    public HashMap<Integer, String> HeroClass_mapList()
    {
        HashMap <Integer, String> heroClass = new HashMap<Integer, String>();
        heroClass.put(1, "������");
        heroClass.put(2, "����");
        heroClass.put(3, "���");
        return heroClass;
    }

    public HashMap<Integer, String> Start_menu() {
        HashMap<Integer, String> heroClass = new HashMap<Integer, String>();
        heroClass.put(1, "�������� �����");
        heroClass.put(2, "�����");
        return heroClass;
    }

    public void show(HashMap<Integer, String> map)
    {
        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }


}
