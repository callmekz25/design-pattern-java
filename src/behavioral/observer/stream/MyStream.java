package behavioral.observer.stream;

import java.util.ArrayList;
import java.util.List;

public class MyStream<T> {
    private final List<MyStreamListener<T>> listeners = new ArrayList<>();
    public void addEvent(T t){
        for (MyStreamListener<T> l : listeners) {
            l.listen(t);
        }
    }
    public void addListener(MyStreamListener<T> listener) {
        listeners.add(listener);
    }
}
