public class Main {

    public static void main(String[] args) {
        String str = "Was it a cat I saw";
        checkPalindrome(str);
    }


    public static void checkPalindrome(String str) {
        String allLowStr = str.toLowerCase();
        String cleanStr = allLowStr.replaceAll("\\s+", "");
        int finalIndex = cleanStr.length() - 1;
        for (int i = 0; i < cleanStr.length(); i++) {
            if (cleanStr.charAt(i) == cleanStr.charAt(finalIndex - i)) {
                if( i == finalIndex){

                    System.out.println("This string is a palindrome");
                }
            }
            else {
                System.out.println("This string is not a palindrome");
                break;
            }
        }
    }
}

