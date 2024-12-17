package _04_extends;

import java.util.ArrayList;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/16
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<AA> list = new ArrayList<>();
        list.add(new AA());
        list.add(new AA());
        list.add(new AA());

        System.out.println(list);
//        show(list);
        ArrayList<BB> listBB = new ArrayList<>();
        listBB.add(new BB());
        listBB.add(new BB());
        listBB.add(new BB());

        show(listBB);

        ArrayList<CC> listCC = new ArrayList<>();
        listCC.add(new CC("18"));
        listCC.add(new CC("17"));
        listCC.add(new CC("16"));
        show(listCC);

    }
    //TODO 此时泛型只能传入BB及BB的子类
    public static void show(ArrayList<? extends BB> bbs){
        System.out.println(bbs);
    }
}
