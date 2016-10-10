package structural_patterns.decorator;

/**
 * Created by imKrish on 9/10/16.
 */
public class Main {

    public static void main(String args[]) {

        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(sandwich.make());
        // Dressing.make > Meat.make > Simple.make
    }
 }
