import java.util.Scanner;

public class HalfPyrimid_nos {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int n=value.nextInt();
        int m=value.nextInt();
        int i,j;
        //outer loop->rows
        for(i=1;i<=n;i++){
            //inner loop->cols
            for(j=1;j<=i;j++){
 /* here we took j to print the nos because the if we take i so for eg we take now when we run in each row we get 1 next 22 next 333 so this is not the output we want 
we want 
1
12
123
1234
 so to get this we should print j as now lets check so first i is 1 now take j loop so first j is also 1 checks the condition is j<=i i.e is 1<=1 so it's yes so it prints 1 
 no the inner loop runs until the condition fails no it failed so comes out goes to next line now i value gets incremented to 2 now  in the inner loop the initial j value is 1 so checks the condition it passes as 1<=2 prints 1 now j value gets incremented to 
2 and checks the condition it passes now it prints 2 next 3 fails so finally it prints 12 and rest continues .....*/ 

                System.out.printf("%d",j);
            }
            System.out.print("\n");
        }
    }
}
