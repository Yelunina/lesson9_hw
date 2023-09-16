public class Task1 {
    public static void main(String[] args) {
        int res = countDigits(547896220);
        System.out.println(res);
        res = countDigits(0);
        System.out.println(res);

    }

    public static int countDigits(int num) {
        if (num == 0) {
            return 1;
        }
        int res = 0;
        while (num != 0) {
            num = num / 10;
            res++;
        }
        return res;
    }
}
