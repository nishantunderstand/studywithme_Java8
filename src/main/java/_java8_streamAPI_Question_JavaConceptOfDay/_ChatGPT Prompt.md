I'm creating Java 8 Stream API practice template files — one file per question, in package `_java8_streamAPI_Question_JavaConceptOfDay`.

For each question, generate a file with this exact structure:

package _java8_streamAPI_Question_JavaConceptOfDay;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
* @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
*     Java 8 Interview Sample Coding Questions </a>
*/
public class <ClassName> {

    public static void main(String[] args) {

    }
}

Rules:
1. main() body must be completely empty — no TODO comments, no variable declarations, no helper methods. I'll write the logic myself.
2. Class name format: <letter>_<S.no>_<PascalCaseDescription>
    - letter = alphabet index of the question's S.no, 1-based (1→a, 2→b, ... 20→t, 21→u ... 26→z)
    - Past z (S.no 27+), continue as za, zb, zc, zd, zf... (i.e., prefix "z" + next letter) so filenames still sort correctly after z — because "z_" (underscore) sorts before "za" alphabetically, keeping S.no order intact when listed in a file browser.
    - S.no = the actual question number, included right after the letter, e.g. a_1_SeparateOddAndEvenNumbers, za_27_FirstRepeatedCharacter
3. Class name must exactly match the filename (no .java extension).
4. Description in the class name should be a short PascalCase paraphrase of the question (not the full question text).
5. One file per question — don't combine multiple questions in one file.
6. After generating all files, zip them into a single archive named java8_streamAPI_questions.zip preserving the package folder structure, and share the zip.

Questions:
1) ...
2) ...
   (list all questions here)