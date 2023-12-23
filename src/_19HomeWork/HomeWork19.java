package _19HomeWork;

import _14Homework.HomeWork;

public class HomeWork19 {
    public String[] abc1(String[]...a){
        int leng =0;
        for (int i = 0; i<a.length;i++){
            if(a[i] instanceof String[]){
                leng += a[i].length;
            }
        }

        String[] absAr = new String[leng];
        for (String[]s:a) {
            for (String ss:s) {
                el: for (int k =0; k<absAr.length;k++){
                    if(absAr[k] == null){
                        absAr[k] = ss;
                        break el;
                    }
                }
            }
        }

        return absAr;
    }

}

class Test999{
    public static void main(String[] args) {
        HomeWork19 ttt = new HomeWork19();
        String[] res = ttt.abc1(new String[]{"one", "two"}, new String[]{"Three", "four","five"}, new String[]{"seven"});
        for (String l:res) {
            System.out.print(l + " ");
        }
    }
}
