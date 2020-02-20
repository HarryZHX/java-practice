public class Main {

    public static void main(String[] args) {
<<<<<<< Updated upstream
=======
        printStrg();
        int[] ary = {1, 2, 3, 4, 5};
        printAryIndex(ary,3);
        handleExc(ary);
        String str = "Hello Testpro";
        String result = checkEven(str);
        System.out.println(result);
    }
>>>>>>> Stashed changes

        System.out.println("Hello World!");
    }
    public static String checkEven(String str){
        String newStr = str.replaceAll("\\s+","");
        if(newStr.length() % 2 == 0){
            return "the string is even.";
        }
        else{
            return "the string is not even.";
        }
    }
}
