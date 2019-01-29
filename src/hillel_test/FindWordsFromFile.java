package hillel_test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FindWordsFromFile {

    public List<String> getWords(String fileName) {
        List<String> wordList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                line = line.toLowerCase();
                StringTokenizer stringTokenizer = new StringTokenizer(line, " .,/-;:");
                while (stringTokenizer.hasMoreTokens()) {
                    String string = stringTokenizer.nextToken();
                    if (!wordList.contains(string)) {
                        wordList.add(string);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordList;
    }
}

