package pl.stripper;

public class Stripper {


    private static final String TAGS_REGEXP = "<[^>]*>";

    public static void main(String[] args) {

        Stripper stripper = new Stripper();

        String s = stripper.stripHtmlTags("<div>\n" +
                "  <p>Hello</p> <span>World!</span>\n" +
                "  <b>This is test</b>\n" +
                "</div>");

        System.out.println(s);

    }

    public String stripHtmlTags(String input) {
        return input.replaceAll(TAGS_REGEXP, "");

    }
}
