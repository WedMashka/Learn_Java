package _17StringB;

public class String17 {
    public static void main(String[] args) {
        StringBuilder st =  new StringBuilder("I learning java");
        StringBuilder strr= new StringBuilder(st);
        System.out.println(strr);
        System.out.println(st);
        System.out.println(st.length());
        int a = 0;

        while (a< st.length()){
            ++a;
            System.out.println("a = " + a);
        }

        char st1717 = st.charAt(11);
        System.out.println(st1717);

        int st171 = st.indexOf("java");
        System.out.println(st171);
        String ass = st.substring(st.length() - 8,st.length());
        System.out.println(ass);

        String date17 = "From";
        String date18 = "20.04.2023";
        String date19 = "year";
        String[] date20 = {date17,date18,date19};

        int month17 = 1;
        int month18 = 2;
        int month19 = 3;
        int[] month20 = {month17, month18,month19};
        appender(st, date20, month20);


        System.out.println(st);

        st.insert(15, date19);
        System.out.println(st);

        st.delete(15,19);
        System.out.println(st);


        StringBuilder sttt = new StringBuilder("Java is difficult language");
        System.out.println(sttt);
        String strr4 = "difficult";
        int itt = sttt.indexOf(strr4);
        sttt.replace(sttt.indexOf(strr4), sttt.indexOf(strr4)+strr4.length(), "easy");
        System.out.println(sttt);


    }

    public static void appender(StringBuilder a ,String[] st, int[] i){

        for (int ii =0; ii< st.length; ii++){
            a.append(" ");
            a.append(st[ii]);

        }

        for (int ii =0; ii< i.length; ii++){
            a.append(" ");
            a.append(i[ii]);

        }

        System.out.println(a);
    }
}
class Test17{

}
