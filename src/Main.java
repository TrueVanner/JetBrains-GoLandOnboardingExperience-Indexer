import java.util.Arrays;

public class Main {

    /*
    Assignment description:
        Please write a Java application that provides a service for indexing text files.
        The console interface should allow for (i) specifying the indexed files and directories
        and (ii) querying files containing a given word.
        The library should be extensible by the tokenization algorithm
        (simple splitting by words/support lexers/etc.).
        State persistence between running sessions is not needed, but the application should be able
        to serve consecutive requests.
        Providing some tests and usage examples is advised.
        Usage of external libraries is discouraged.
     */

    /*
    TODO Plan:
        1. Suffix tree implementation
            - Implement extensible tokenizer [DONE]
        2. Implement creating a suffix tree from a text file
           - One per file, query specified trees concurrently
        3. Implement querying a suffix tree for a word
        4. Implement a console interface
        5. Add tests and usage examples
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
    }
}