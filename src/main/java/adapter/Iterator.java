package adapter;

/**
 * @version V1.0.0
 * @Description 适配器模式：目标接口
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/22 15:58
 */
public interface Iterator {

    boolean hasNext();

    Object next();

    boolean remove();


}
