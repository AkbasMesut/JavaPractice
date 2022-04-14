package Tasks.Day24_CustomMethodsReturnMethods;

public class Task01_FrequencyOfWord {

    public static void main(String[] args) {


        System.out.println(frequencyOfWord("avajava dava devejeve","java"));

    }


    public static int frequencyOfWord (String sentence,String word){

        int count =0;
        while (sentence.contains(word) ){

            sentence=sentence.replaceFirst(word,"");
            count++;

        }

        return count;
    }

}

/*
    create a method named frequencyOfWord that passes two parameters:
 string sentence and String word, then returns the frequency of word from the sentence

                    Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */