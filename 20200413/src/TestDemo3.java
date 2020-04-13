/**
 * @program: 20200413
 * @description
 * @author: LiuXinYu
 * @create: 2020-04-13 17:54
 **/
public class TestDemo3 {

    /**
     *
     * 斐波那契数列（不是单路递归）
     * 不建议用递归实现斐波那契数列
     * @param n
     * @return
     */
    public static int fabonaci(int n){
        if(n==1 || n==2){
            return 1;
        }
        return fabonaci(n-1)+fabonaci(n-2);
    }
    public static int fabonaci2(int n){
        int f1 = 1;
        int f2 = 1;
        //注意：如果n是1 或者 0 的时候 f3初始化就不能定为0
        int f3 = 1;
        for (int i = 3; i <= n; i++){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
    public static void main(String[] args) {
        System.out.println(fabonaci2(50));
    }




    public static int func2(int n){
        if(n<10){
            return n;
        }
        return n%10+func2(n/10);
    }
    public static void main3(String[] args) {
        System.out.println(func2(1729));
    }





    /**
     *
     * n的阶乘
     */
    public static int sum(int n){
if(n==1){
    return 1;
}
return n + sum(n-1);
}

    public static void main2(String[] args) {
        System.out.println(sum(5));
    }



    /**
     *
     * 输出数字的每一位
     * @param n
     */

    public static void func1(int n) {
        if (n > 9) {
            func1(n / 10);
        }
        System.out.println(n % 10);
    }

    public static void main1(String[] args) {
        func1(123);
    }
}
