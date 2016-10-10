package structural_patterns.flyweight;

/**
 * Created by imKrish on 10/10/16.
 */
public class FlyweightEverydayDemo {

    public static void main(String args[]) throws Exception {

        Integer firstInt = Integer.valueOf(5); // Same object
        Integer secondInt = Integer.valueOf(5); // Same object
        Integer thirdInt = Integer.valueOf(10);
        Integer fourthInt = 5; // Same object

        System.out.println(System.identityHashCode(firstInt));
        System.out.println(System.identityHashCode(secondInt));
        System.out.println(System.identityHashCode(thirdInt));
        System.out.println(System.identityHashCode(fourthInt));
    }
}
