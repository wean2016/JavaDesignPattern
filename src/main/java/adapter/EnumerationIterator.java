package adapter;

import java.util.Enumeration;

/**
 * @version V1.0.0
 * @Description 适配器模式：适配器
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/22 16:00
 */
public class EnumerationIterator implements Iterator {

    private final Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration){
        this.enumeration = enumeration;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    public boolean remove() {
        throw new RuntimeException("remove 不可用！");
    }
}
