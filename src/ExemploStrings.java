import java.util.Scanner;
import java.util.Locale;

public class ExemploStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String original = "abcde FGHIJ ABC abc DEFG   ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9); // inicio | fim
        String s06 = original.replace('a','x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println(original);
        System.out.println(s01 + " - todas minusculas");
        System.out.println(s02 + " - todas maiusculas");
        System.out.println(s03 + " - tira espacamento");
        System.out.println(s04 + " - data o inicio");
        System.out.println(s05 + " - data o inicio e fim");
        System.out.println(s06 + " - oldChar | newChar"); // '' replace char
        System.out.println(s07 + " - target | replacement"); // "" replacement
        System.out.println(i + " - primeira posicao de 'bc' ");
        System.out.println(j + " - ultima posicao de 'bc' ");


        sc.close();
    }
}
