package chapter05.solution05;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;

public class ScannerPrintWriterDemo {
    public static void process(Path input, String output) throws IOException {
        Scanner in = null;
        PrintWriter out = null;
        Throwable primary = null;

        try {
            in = new Scanner(input);       // 1. can throw IOException
            out = new PrintWriter(output); // 2. can throw IOException

            while (in.hasNext()) {         // 3. can throw RuntimeException
                out.println(in.next().toLowerCase());
            }
        } catch (Throwable t) {
            primary = t;                   // store primary exception
        }

        if (out != null) {
            try {
                out.close();               // 4. can throw RuntimeException
            } catch (Throwable t) {
                if (primary != null)
                    primary.addSuppressed(t);
                else
                    primary = t;
            }
        }

        if (in != null) {
            try {
                in.close();                // 5. can throw RuntimeException
            } catch (Throwable t) {
                if (primary != null)
                    primary.addSuppressed(t);
                else
                    primary = t;
            }
        }

        if (primary != null) {
            if (primary instanceof IOException ie) throw ie;
            if (primary instanceof RuntimeException re) throw re;
            if (primary instanceof Error err) throw err;
            throw new IOException(primary);
        }
    }
}
