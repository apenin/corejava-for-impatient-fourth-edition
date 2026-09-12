package chapter03.solution13;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class FileSortingDemo {
    public static void sortFiles(File[] files) {
        Arrays.sort(files, Comparator
                .comparing((File f) -> !f.isDirectory())
                .thenComparing(File::getPath)
        );
    }

    public static void main(String[] args) {
        var files = new File("./src").listFiles();
        System.out.println("Before sorting: " + Arrays.toString(files));

        sortFiles(files);
        System.out.println("After sorting: " + Arrays.toString(files));
    }
}
