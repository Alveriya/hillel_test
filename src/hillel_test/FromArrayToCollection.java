package hillel_test;

import java.util.Collection;

public class FromArrayToCollection {

    static <T> void fromArrayToCollection (T[] array, Collection<T> collection){
        for (T i: array){
            collection.add(i);
        }
    }
}
