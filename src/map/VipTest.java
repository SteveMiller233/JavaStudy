package map;

import java.util.TreeSet;

public class VipTest {
    public static void main(String[] args) {
        TreeSet<Vip> map = new TreeSet<>();
        map.add(new Vip("KroFin",13));
        map.add(new Vip("Steve" , 12));
        map.add(new Vip("Miller" , 11));
        for (Vip vip : map){
            System.out.println(vip);
        }
    }
}
