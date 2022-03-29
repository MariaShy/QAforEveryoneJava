import java.util.Locale;

public class CodeWarsExtra {

    public static String abbrevName(String name) {
        name = name.toUpperCase();
        String[] str = name.split(" ");
        return str[0].charAt(0) + "." + str[1].charAt(0);
    }

    public int getCount(String str) {
        int vowelsCount = 0;
        for (int i=0;i <str.length(); i++){
            if ( str.charAt(i) =='a'||
                    str.charAt(i) =='e'||
                    str.charAt(i) =='i'||
                    str.charAt(i) =='o'||
                    str.charAt(i) =='u'){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
