public class RemoveDupliLettersSimple {
    public static void main(String[] args) {
        String str = "application";
        int n = str.length();
        System.out.println(removeDupli(str, n));
    }

    static String removeDupli(String str, int n) {
        int index = 0;
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    break;
                }
            }
            if (j == i) { // If no duplicate is found
                str = str.substring(0, index) + str.charAt(i) + str.substring(index + 1);
                index++;
            }
        }
        return str.substring(0, index);
    }
}
