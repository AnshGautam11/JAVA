
public class patternoutline{
    public static void main(String[] args){
        int a = 5;
        int b = 4;
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                if(i == 0 || i == a-1 || j == 0 || j ==b-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
