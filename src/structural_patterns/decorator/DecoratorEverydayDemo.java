package structural_patterns.decorator;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by imKrish on 9/10/16.
 */
public class DecoratorEverydayDemo {

    public static void main(String args[]) throws Exception {

        File file = new File("./output.txt");
        file.createNewFile();

        OutputStream oStream = new FileOutputStream(file);

        DataOutputStream doStream = new DataOutputStream(oStream);
        doStream.writeChars("text");

        doStream.close();
        oStream.close();
    }
}
