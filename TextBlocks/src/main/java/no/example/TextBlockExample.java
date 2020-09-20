package no.example;

public class TextBlockExample {

    static String writeHTML() {
        return """
                $(
                <html>
                    <body>
                        <p>Hello World.</p>
                    </body>
                </html>
                """;
    }

    static String writeJson() {
        return """
                {
                    greeting: "hello",
                    audience: "text blocks",
                    punctuation: "!",
                    value: "" 
                }
                """;
    }


    public static void main(String[] args) {
        String fargenavn = """
                rød
                grønn
                blå
                """;
        System.out.println("name = " + fargenavn);
        System.out.println("writeHTML = " + writeHTML());
        System.out.println("writeJson = " + writeJson());
    }
}
