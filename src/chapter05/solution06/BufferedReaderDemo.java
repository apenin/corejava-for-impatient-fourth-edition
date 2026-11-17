package chapter05.solution06;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BufferedReaderDemo {
    public static void processA(Path path) {
        BufferedReader in = null;
        try {
            in = Files.newBufferedReader(path);
            // Some actions with in
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.err.println("Caught IOException in close(): " + ex.getMessage());
                }
            }
        }
    }

    public static void processB(Path path) {
        try {
            BufferedReader in = null;

            try {
                in = Files.newBufferedReader(path);
                // Some actions with in
            } finally {
                if (in != null) {
                    in.close();
                }
            }
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        }
    }

    public static void processC(Path path) {
        try (BufferedReader in = Files.newBufferedReader(path)) {
            // Some actions with in
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        }
    }
}
