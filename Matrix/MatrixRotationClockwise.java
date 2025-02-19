import java.util.Scanner;
public class MatrixRotationClockwise
{
    public static void swap(int[][] arr,int r,int c){
        int i=0,j=0,curr=0,prev=0;
        while(i<r && j<c){
            if(i+1==r||j+1==c)
                break;
            prev=arr[i+1][j];
            for(int k=j;k<c;k++){
                curr=arr[i][k];
                arr[i][k]=prev;
                prev=curr;
            }
            i++;
            for(int k=i;k<r;k++){
                curr=arr[k][c-1];
                arr[k][c-1]=prev;
                prev=curr;
            }
            c--;
            if(i<r){
                for(int k=c-1;k>=j;k--){
                    curr=arr[r-1][k];
                    arr[r-1][k]=prev;
                    prev=curr;
                }
                r--;
            }
            
            if(j<c){
                for(int k=r-1;k>=i;k--){
                    curr=arr[k][j];
                    arr[k][j]=prev;
                    prev=curr;
                }
                j++;
            }
            
        }
    }
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
	    
	    swap(arr,r,c);
	    for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
	    }
		
	}
}