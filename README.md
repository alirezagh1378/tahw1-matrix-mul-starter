# TA HW - Matrix Multiplication

[![Grader Status](YOUR_GRADER_BADGE)](YOUR_GRADER_BADGE)

YOUR_GRADER_BADGE looks like this: https://kntu-grader.herokuapp.com/minimal?repo=<REPO_NAME>&id=<YOUR_STUDENT_ID>




# Assignment discription

<div dir="rtl" align="right">
تابعی مطابق با امضای تعریف شده زیر تعریف کنید تا عملیات ضرب ماتریسی به وسیله آرایه دو بعدی را پیاده سازی کند
</div>



```
package ir.ac.kntu;

public class MatrixSolution{

    public static int[][] multiply(int[][] matA,int[][] matB){
        //return null when multiplication is not possible

    }

    public static void main(String[] args){
        int[][] d = {{1, 2, 3, 5},{4, 5, 6, 8}};
        int[][] c = {{1, 2, 3},{4, 5, 6},{9, 1, 3},{9, 1, 3}};
        int[][] multiply = multiply(d, c);
        System.out.println("multiply = " + Arrays.deepToString(multiply));
    }

}
```
