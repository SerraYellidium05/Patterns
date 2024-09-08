import java.util.Scanner;

public class HalfPyramid_180 {
     public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int n=value.nextInt();
        int m=value.nextInt();
        int i,j,k;
        //outer loop->rows
        for(i=1;i<=n;i++){
            // used to print spaces these spaces are acc to the n vale i.e the rows now we do n-i to get the no of spaces eg for the first row  we need 1 star and  3 spaces therefore for 3 sapces we do 4 -i now these i is the row one
            for(k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            //inner loop->cols
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        }   
    }

