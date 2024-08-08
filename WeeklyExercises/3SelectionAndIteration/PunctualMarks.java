package students;
public class PunctualMarks {
    public static void main(String[] args) {
        String text = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go.\n" +
                "-that was a nice poem-\n" +
                "the end.";

        int periodCount = 0;
        int commaCount = 0;
        int hyphenCount = 0;
        int newlineCount = 0;

        for (char c : text.toCharArray()) {
            switch (c) {
                case '.':
                    periodCount++;
                    break;
                case ',':
                    commaCount++;
                    break;
                case '-':
                    hyphenCount++;
                    break;
                case '\n':
                    newlineCount++;
                    break;
            }
        }

        System.out.println("Punctuation Counts:");
        System.out.println("-------------------");
        System.out.println(".: " + periodCount);
        System.out.println(",: " + commaCount);
        System.out.println("-: " + hyphenCount);
        System.out.println("\n:" + newlineCount);
    }
}

