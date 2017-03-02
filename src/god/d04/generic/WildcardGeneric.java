package god.d04.generic;

/**
 * Created by 이성희 on 2017-03-02.
 */
public class WildcardGeneric<W> {
    W wildcard;
    public void setWildcard(W wildcard) {
        this.wildcard=wildcard;
    }
    public W getWildcard() {
        return wildcard;
    }
}