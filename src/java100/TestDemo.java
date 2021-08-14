package java100;

/**
 * @program:IntelliJ IDEA
 * @Description:
 * @Author:Matinal
 * @Date:2021-08-14 16:35
 */
public class TestDemo {
    public int[] arrayOfReverse(int[] arr){
        int i = 0;
        int j = arr.length-1;
        for (; i < j; i++,j--) {
            int tmp = arr[j];
            arr[j] = arr[i];
            arr[i] = tmp;
        }
        return arr;
    }
}
