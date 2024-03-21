package HomeWork.Log;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MayList mayList=new MayList();
        String[] mayArr=new String[10];
        mayList.add("ttt");
        mayList.add("ttt");
        mayList.add("ttt");
        mayList.add("1ttt");
        mayList.add("ttut");
        mayList.add("ttt2");
        mayList.add("gg");
        mayList.add(6,"yy");
        mayList.remove("ttt");
        mayList.remove(1);



        System.out.println(Arrays.toString(mayList.strings));
        mayList.clear();
        System.out.println(Arrays.toString(mayList.strings));
        System.out.println(Arrays.toString(mayList.toArray()));

    }

}
