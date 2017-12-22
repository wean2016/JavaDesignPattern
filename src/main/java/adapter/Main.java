package adapter;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @version V1.0.0
 * @Description 适配器模式：测试代码
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/22 16:03
 */
public class Main {

    public static void main(String[] args) {
        Enumeration enums = getEnum();
        EnumerationIterator enumerationIterator = new EnumerationIterator(enums);
        while (enumerationIterator.hasNext()){
            System.out.println(enumerationIterator.next());
        }
    }


    private static Enumeration getEnum(){
        Vector vector = new Vector();
        vector.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
        return vector.elements();
    }
}