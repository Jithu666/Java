public class Reverse {
    public static void main(String[] args) {
        int n = 135;
        int ans = reverse(n, 0);
        System.out.println("Reverse of " + n + " is : " + ans);
    } // end of main method

    static int reverse(int n, int rev){
        if(n == 0)
            return rev;

        int rem = n % 10;
        rev = rev * 10 + rem;
        return reverse(n/10, rev);
    }
}
