
public class internalVarsitySquare {
    public static void main(String[] args) {

        int n = 4;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j < n; j++) {
                if(i == 1 || i == n || j == 1 || j == n-1){
                    System.out.print("3");
                }else{
                    System.out.print(i-1);
                }
            }
            System.out.println();
        }

    }
}
