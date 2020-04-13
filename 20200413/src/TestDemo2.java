/**
 * @program: 20200413
 * @description
 * @author: LiuXinYu
 * @create: 2020-04-13 17:20
 **/

public class TestDemo2 {
    public static void main(String[] args) {

    }






    /**
     *
     * 方法的重载（overload）：
     *  1. 方法名相同
     *  2. 返回值不做要求， 可以不同
     *  3. 参数列表不同（参数的个数或者类型不同）
     *  4. 在同一个类中
     */
    public static void main2(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(sum(a,b));
        double d1 = 19.9;
        double d2 = 18.8;
        System.out.println(sum(d1,d2));
    }
    public static int sum(int a ,int b){
        return a + b;
    }
    public static double sum(double a, double b){
        return a + b;
    }
    public static double sum(double a, double b, double c){
        return a + b + c;
    }







    public static void swap(int x, int y){
        int tmp = x;
        x = y;
        y = tmp;
    }
    public static void main1(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a + " " + b);
    }
}
//形参是实参的一份拷贝
//所以上面的代码并没有把a和b的值交换
