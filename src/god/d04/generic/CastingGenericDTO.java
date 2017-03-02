package god.d04.generic;

import java.io.Serializable;

/**
 * Created by 이성희 on 2017-03-02.
 */
public class CastingGenericDTO<T> implements Serializable {
    private T object;

    public void setObject(T obj) {
        this.object = obj;
    }

    public T getObject() {
        return object;
    }
}