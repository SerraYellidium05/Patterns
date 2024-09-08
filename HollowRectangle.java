import java.util.*;
public class HollowRectangle {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int n=value.nextInt();
        int m=value.nextInt();
        int i,j;
        //outer loop
        for(i=1;i<=n;i++){
            //inner loop
            for(j=i;j<=m;j++){
                // print only those * where they have cell no either i value is 1 or n else j value 1 or m for boundary of any pattern 
                if(i==1 || j==1 || i==n || j==m){
                System.out.print("*");
            }   
          //  else {
            //    System.err.print("    ");
            //}
        }
            System.out.print("\n");
        }
    }
        
}
