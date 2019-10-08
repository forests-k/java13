public class Tester_02 {

    public static void main(String... args) {

        System.out.println("function hello() {\n" +
                "    print('\"Hello, world\"');\n" +
                "}\n" +
                "hello();\n");

        System.out.println("""
        function hello() {
            print('"Hello, world"');
        }
        hello();
        """);
    }
}