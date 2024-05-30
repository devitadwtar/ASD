public class kuis3 {
    public int countVowels(char[]word){
        char[] vowels = {'a', 'i', 'u','e','o'};
        int count = 0;

        for (int i = 0; i < word.length; i++ ){
            for (int j = 0; j < vowels.length; j++){
                if (word[i] == vowels [j]){
                    count++;
                }
            }
        }
        return count;
    }
}
