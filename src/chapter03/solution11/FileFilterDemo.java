package chapter03.solution11;

import java.io.File;
import java.io.FileFilter;

public class FileFilterDemo {
    public static File[] filterDirectoryWithLambda(String dirName) {
        File someFile = new File(dirName);
        return someFile.listFiles(file -> file.isDirectory());
    }

    public static File[] filterDirectoryWithMethodReference(String dirName) {
        File someFile = new File(dirName);
        return someFile.listFiles(File::isDirectory);
    }

    public static File[] filterDirectoryWithAnonymousClass(String dirName) {
        File someFile = new File(dirName);
        return someFile.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isDirectory();
            }
        });
    }

    public static void main(String[] args) {
        var dirs1 = filterDirectoryWithLambda("./src");
        for (var dir : dirs1) {
            System.out.println(dir.getName());
        }
        System.out.println("======");

        var dirs2 = filterDirectoryWithMethodReference("./src");
        for (var dir : dirs2) {
            System.out.println(dir.getName());
        }
        System.out.println("======");

        var dirs3 = filterDirectoryWithAnonymousClass("./src");
        for (var dir : dirs3) {
            System.out.println(dir.getName());
        }
    }
}
