package middle;

public class _02 {
    public static void main(String[] args) {
        char[] letters = {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'};

        String str1 = "";
        String str2 = "";
        String str3 = "";
        String str4 = "";

        for (int i = 0; i < letters.length; i++){
            if(i % 4 == 0){
                str1 += letters[i];
            } else if(i % 4 == 1){
                str2 += letters[i];
            } else if(i % 4 == 2) {
                str3 += letters[i];
            } else {
                str4 += letters[i];
            }
        }

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
