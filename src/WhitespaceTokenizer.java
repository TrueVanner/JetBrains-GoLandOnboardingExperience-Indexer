public class WhitespaceTokenizer implements Tokenizer {

    protected final String delimiter = "\\w+";
    @Override
    public String[] tokenize(String input) {
        return input.split(delimiter);
    }
}
