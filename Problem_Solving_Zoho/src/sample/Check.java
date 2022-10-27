package sample;

import java.util.Scanner;
public class Check {
    static String[][] matrix;
    public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
          AbstractMatrix mod1=new Module1();
          AbstractMatrix mod2=new Module2();
          AbstractMatrix mod3=new Module3();
          AbstractMatrix mod4=new Module4();
          AbstractMatrix mod5=new Module5();
          int n=0;
          do{
              System.out.println("-----------Baloon--------------");
              System.out.println("1.Module");
              System.out.println("2.Module");
              System.out.println("3.Module");
              System.out.println("4.Module");
              System.out.println("5.Module");
              System.out.println("6.Exit");
              n=s.nextInt();
              switch (n){
                  case 1:{
                      mod1.getInput(mod1,matrix);
                      break;
                  }
                  case 2:{
                      mod2.getInput(mod2,matrix);
                      break;
                  }
                  case 3:{
                      mod3.getInput(mod3,matrix);
                      break;
                  }
                  case 4:{
                      mod4.getInput(mod4,matrix);
                      break;
                  }
                  case 5:{
                      mod5.getInput(mod5,matrix);
                      break;
                  }
              }
          }while (n!=6);

    }
}
abstract class AbstractMatrix{
    public abstract String[][] drop(String[][] matrix,int column,String color);
    Scanner s=new Scanner(System.in);
    public final void getInput(AbstractMatrix Amatrix,String[][] matrix) {
        System.out.print("Enter the row: ");
        int n=s.nextInt();
        System.out.print("Enter the col: ");
        int m=s.nextInt();
        matrix=createMatrix(matrix,n,m);
        while(true) {
            System.out.print("Enter the col number: ");
            int column=s.nextInt();
            System.out.print("Enter the Ballon color: ");
            String color=s.next();
            matrix=Amatrix.drop(matrix,column,color);
            System.out.println("Contents of the matrix: ");
            display(matrix);
            System.out.print("Do you wish to continue(Y/N): ");
            char wish=s.next().charAt(0);
            if(wish=='Y')
                continue;
            if(wish=='N')
                break;
        }
    }
    public final static String[][] createMatrix(String[][] matrix,int n,int m) {
        matrix=new String[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                matrix[i][j]="-";
            }
        }
        return matrix;
    }
    public final void display(String[][] matrix) {
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix.length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class Module1 extends AbstractMatrix{
    public String[][] drop(String[][] matrix,int column,String color) {
        for(int i=matrix[column-1].length-1;i>=0;i--) {
            if(matrix[i][column-1]=="-") {
                matrix[i][column-1]=color;
                return matrix;
            }

        }
        return matrix;
    }
}
class Module2 extends AbstractMatrix{
    @Override
    public String[][] drop(String[][] matrix, int column, String color) {
        if(matrix[0][column-1]!="-"){
            System.out.println("Column is filled completely.Program is terminated");
            System.exit(0);
        }
        for(int i=matrix[column-1].length-1;i>=0;i--) {
            if(matrix[i][column-1]=="-") {
                matrix[i][column-1]=color;
                return matrix;
            }

        }
        return matrix;
    }
}
class Module3 extends AbstractMatrix{
    public String[][] drop(String[][] matrix,int column,String color){
        for(int i=matrix.length-1;i>=0;i--) {
            if (matrix[i][column - 1] == "-") {
                matrix[i][column - 1] = color;
                return matrix;
            }
            for(int j=0;j<matrix[column-1].length;j++){
                if(matrix[i][j]=="-"){
                    matrix[i][j]=color;
                    return matrix;
                }
            }
        }

        return matrix;
    }
}
class Module4 extends AbstractMatrix{
    @Override
    public String[][] drop(String[][] matrix, int column, String color) {
        for(int i=matrix.length-1;i>=0;i--) {
            if (matrix[i][column - 1] == "-") {
                matrix[i][column - 1] = color;
                return matrix;
            }
            for(int j=0;j<matrix[column-1].length;j++){
                if(matrix[i][j]=="-"){
                    matrix[i][j]=color;
                    return matrix;
                }
            }
        }
        int count=0;
        for (int i=matrix.length-1;i>=0;i--){
            if(matrix[i][column-1].equals(color)){
                count++;
            }
        }
        if(count==2){
            for (int i=matrix.length-1;i>=0;i--){
                matrix[i][column-1]="-";
            }
        }
        return matrix;
    }
}
class Module5 extends AbstractMatrix{
    @Override
    public String[][] drop(String[][] matrix, int column, String color) {
        int count=0;
        for(int i=0;i< matrix.length;i++){
            if(matrix[matrix.length-1][i].equals(color)){
                count++;
            }
        }
        if(count==2){
            for(int i=0;i< matrix.length;i++){
                matrix[matrix.length-1][i]="-";
            }
            return matrix;
        }
        for(int i=matrix.length-1;i>=0;i--) {
            if (matrix[i][column - 1] == "-") {
                matrix[i][column - 1] = color;
                return matrix;
            }
            for(int j=0;j<matrix[column-1].length;j++){
                if(matrix[i][j]=="-"){
                    matrix[i][j]=color;
                    return matrix;
                }
            }
        }

        return matrix;
    }
}
