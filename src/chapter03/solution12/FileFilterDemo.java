package chapter03.solution12;

import java.io.File;

public class FileFilterDemo {
    public static String[] listFileByExtension(String dirName, String fileExtension) {
        File someFile = new File(dirName);
        // captures `fileExtension` variable
        return someFile.list((dir, fileName) -> fileName.endsWith(fileExtension));
    }

    public static void main(String[] args) {
        var fileNames = listFileByExtension("./src/chapter03/solution02", ".java");
        for (var name : fileNames) {
            System.out.println(name);
        }
    }
}
