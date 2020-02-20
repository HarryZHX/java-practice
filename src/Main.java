public class Main {

    public static void main(String[] args) {
        printStrg();
        int[] ary = {1, 2, 3, 4, 5};
        printAryIndex(ary,3);
        handleExc(ary);
    }

    public static void printStrg(){
        for (int i = 0; i < 11; i ++){
            if (i == 7){
                continue;
            }
            else {
                System.out.println(i);
            }
        }
    }
    public static void printAryIndex(int[] ary, int n){
        System.out.println(ary[n]);
    }
    public static void handleExc(int[] ary){
        try{
            int var = ary.length;
            System.out.println(ary[var]);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
