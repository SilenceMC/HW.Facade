public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        //5 (101) + 9 (1001) = 14 (1110)
        System.out.println(bins.sum("101", "1001"));

        //5 (101) * 9 (1001) = 45 (101101)
        System.out.println(bins.mult("101", "1001"));
    }
}