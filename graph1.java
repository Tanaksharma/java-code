import java.util.*;
public class graph{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("enter the matrix graph:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int edge=sc.nextInt();
                arr[i][j]=edge;
                arr[j][i]=edge;

            }
        }
    }
}