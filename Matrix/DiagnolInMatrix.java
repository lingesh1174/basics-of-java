import java.util.Scanner;
public class DiagnolInMatrix
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter row and column: ");
	    int r=sc.nextInt();
	    int c=sc.nextInt();
	    int arr[][]=new int[r][c];
	    System.out.println("Enter values of matrix: ");
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++)
                arr[i][j]=sc.nextInt();
		}
	    
	    for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        if(i==j)
                    System.out.print(arr[i][j]);
                else
                    System.out.print("\t");
		    }
            System.out.println();
	    }
	    
	    for(int i=0;i<r;i++){
	        int sum=0;
		    for(int j=0;j<c;j++){
		        sum+=arr[i][j];
		        if(j==c-1) 
                    arr[i][i]=sum;
		    }   
		}
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        if(i==j)
                    System.out.print(arr[i][j]);
                else
                    System.out.print("\t");
		    }
            System.out.println();
	    }
	}
}