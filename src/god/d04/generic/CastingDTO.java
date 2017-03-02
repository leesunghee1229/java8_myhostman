package god.d04.generic;

import java.io.Serializable;

/**
 * Created by 이성희 on 2017-03-02.
 */
public class CastingDTO implements Serializable {
    private Object object;
    public void setObject(Object object) {
        this.object=object;
    }
    public Object getObject() {
        return object;
    }

}
