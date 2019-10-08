package defaultmethod;

import org.apache.commons.collections4.bag.SynchronizedBag;
import org.apache.commons.collections4.collection.SynchronizedCollection;

import java.util.*;

/**
 * @author Jerry
 * @Date 2019/10/8 8:31 上午
 */
public class ChildInterface {

    public static void main(String[] args) {
        //演示synchronizedCollection
        Vector<String> vector = new Vector<String>();
        vector.add("11");
        vector.add("12");
        vector.add("13");
        vector.add("14");

        Collection<String> c = Collections.synchronizedCollection(vector);
        System.out.println("Sunchronized view is :"+c);



        SynchronizedCollection strings = SynchronizedCollection.synchronizedCollection(vector);

    }


}
