package chapter01;

public class Solution16 {
    public static void main(String[] args) {
        String code = """
            public class Solution16 {
                public static void main(String[] args) {
                    String code = \"""
                        %s
                        \""";
                    System.out.println(code.formatted(code));
                }
            }
            """;

        System.out.printf(code + "%n", code);
    }
}
