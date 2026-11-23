package counter;

/**
 * Step 1: Complete the Counter interface contract.
 *
 * An interface defines a set of operations that classes must provide.
 * Methods declared in an interface have no body and are implicitly public and abstract.
 *
 * Your tasks in Step 1:
 * 1. Declare the method to count words in a sentence:
 *    int countWords(String sentence);
 * 2. Declare the method to count letters in a sentence:
 *    int countLetters(String sentence);
 * 3. Declare the method to get total sentence length:
 *    int getLength(String sentence);
 * 4. Add informative Javadoc comments to each method describing its purpose.
 */
public interface Counter {

    // TODO [Step 1.1]: Declare int countWords(String sentence);
    int countWords(String sentence);

    // TODO [Step 1.2]: Declare int countLetters(String sentence);
    int countLetters(String sentence);

    // TODO [Step 1.3]: Declare int getLength(String sentence);
    int getLength(String sentence);
}
