import java.util.*;

class Matrix{

public static void main(String args[]){

System.out.println("Matrix Addition");

int[][] mat1= new int[20][20]; 
int[][] mat2= new int[20][20]; 
int[][] mat3= new int[20][20]; 


Scanner sc = new Scanner(System.in);

System.out.println("Enter matrix size [a]x[a]: ");
int size = sc.nextInt();

System.out.println("Enter values for matrix 1: ");
for(int i=0; i<size; i++){
	for(int j=0; j<size; j++){
		System.out.println("Enter element at ["+i+"]["+j+"]: ");
		mat1[i][j]=sc.nextInt();

	}
}

System.out.println("Enter values for matrix 2: ");
for(int i=0; i<size; i++){
	for(int j=0; j<size; j++){
		System.out.println("Enter element at ["+i+"]["+j+"]: ");
		mat2[i][j]=sc.nextInt();

	}
}

System.out.println("Sum of matrices: ");
for(int i=0; i<size; i++){
	for(int j=0; j<size; j++){
		mat3[i][j]=mat1[i][j]+mat2[i][j];
		System.out.print(" "+mat3[i][j]+" ");

	}
	System.out.print("\n");
}

}

}
