# TA HW 1 - Matrix Multiplication - 50 Points

[![Grader Status](https://github.com/k-n-toosi-university-of-technology/tahw1-matrix-mul-alirezagh1378.git)](https://github.com/k-n-toosi-university-of-technology/tahw1-matrix-mul-alirezagh1378.git)

YOUR_GRADER_BADGE looks like this: https://kntu-grader.herokuapp.com/minimal?repo=<REPO_NAME>&id=<9729153>




# Assignment discription

<div dir="rtl" align="right">
تابعی مطابق با امضای تعریف شده زیر تعریف کنید تا عملیات ضرب ماتریسی به وسیله آرایه دو بعدی را پیاده سازی کند.


</div>



```java
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

# ورودی
نیازی به دریافت ورودی نیست. امضای متد تعریف شده را تغییر ندهید در صورت نیاز متد های خودتان را اضافه کنید.
# خروجی
نیازی به چاپ خروجی نیست.
