import java.util.Scanner;

/**
 * @program: 20200413
 * @description
 * @author: LiuXinYu
 * @create: 2020-04-13 14:30
 **/

//二进制数中多少个1
    //让当前数字和 1 进行与操作
public class TestDemo {
    /**
     * java的方法就是对应C语言中的函数
     * 方法： 功能
     * public static 返回值  方法名 （形式参数列表）{
     *     方法体
     * }
     * 方法名：要采用小驼峰的形式  maxNum
     * public static :因为当前所有的方法 写完之后 会在main方法调用
     * 因为main方法是public static的。（静态的）
     *
     * 返回值：可有可无 具体看需求。
     * 如果有返回值 那么返回值的类型需要和方法的返回值类型匹配
     * 形式参数列表 ： 形参-> 实参的一份拷贝 。
     * 方法体： 就是具体方法的实现。
     *
     * return 代表函数结束 它下面的代码将不会执行
     * @param args
     */

    public static int factor(int n){
        int sum = 0;
        for(int i = 1 ; i <= n; i++){
//            int ret = 1;
//            for(int j = 1; j <= i; j++){
//                ret *= j;
//            }
            sum +=  fac(i);
        }
        return sum;
    }
    public static int fac(int num){//求每个数字的阶乘
        int ret = 1;
        for (int i = 1; i<= num; i++){
            ret *= i;
        }
        return ret;
    }
    public static void main(String[] args) {
        System.out.println(factor(7));
    }





    public  static  int sum (int a,int b){
        return a+b;
    }
    public static void main6(String[] args) {
       int a = 10;
       int b = 20;
       int ret = sum(a,b);
       System.out.println(ret);
       int ret2=sum(4,8);
        System.out.println(ret2);
       //java 中只有按值传递
    }




    public static int maxNum (int num1,int num2) {
        return num1 > num2 ? num1 : num2;
    }
    public static int maxThreeNum(int num1,int num2,int num3){
        return maxNum(maxNum(num1,num2),num3);
    }
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        //int ret = maxThreeNum(n1,n2,n3);
        System.out.println(maxThreeNum(n1,n2,n3));
    }



    public static int maxNum (int num1,int num2,int num3){
        int max = num1 > num2 ? num1 : num2;
        return max > num3 ? max : num3;
    }
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int ret = maxNum(n1,n2,n3);
        System.out.println(ret);
    }




    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 31; i >= 1 ; i -= 2){
            System.out.print(((n >> i) & 1)+" ");
        }
        System.out.println();
        for(int i = 30; i >= 0 ; i -= 2){
            System.out.print(((n >> i) & 1)+" ");
        }
    }



    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int n = scanner.nextInt();
        while(n!=0){
            n = n & (n-1);
            count ++;
        }
        System.out.println(count);
    }


    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for(int i = 0; i < 31; i++){
            if(((n>>i)&1)==1){
                count ++;
            }
        }
        System.out.println("count : " +count);
        //   0000 1111
        //&  0000 0001
        //   0000 0001  不为0  count++
        //   右移一位
        //   0000 0111
        //&  0000 0001
        //   0000 0001  不为0  再count++
    }
}
