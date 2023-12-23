package _20Array;

import java.util.ArrayList;

public class Test20 {
    public static void main(String[] args) {
        ArrayList someList = new ArrayList<>();
        someList.add("Text data");
        System.out.println(someList.get(0));
        Student tom = new Student();
        someList.add(tom);
        System.out.println(someList.get(1));

        ArrayList<String> stringData = new ArrayList<String>();
        stringData.add("my text");
        System.out.println(stringData.get(0));

        ArrayList <String> nextText = new ArrayList();
        nextText.add("next");
        System.out.println(nextText.get(0));
        ArrayList <String> text2 = new ArrayList<>(someList);
        System.out.println(text2.get(0));

    }
}

class Student{
    String a = "56";
}
