package java100;

import java.util.Arrays;

/**
 * @program:IntelliJ IDEA
 * @Description:
 * @Author:Matinal
 * @Date:2021-08-14 16:39
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        TestDemo testDemo = new TestDemo();
        arr = testDemo.arrayOfReverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
