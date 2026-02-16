public class RepeatedCharWordFinder {
    public static String findWordWithMaxRepeats(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "-1";
        }

        String[] words = input.split("\\s+"); 
        String result = "-1";
        int maxRepeatCount = 1; 

        for (String word : words) {
            int[] freq = new int[256]; 
            int currentMax = 1;

            for (char c : word.toCharArray()) {
                freq[c]++;
                if (freq[c] > currentMax) {
                    currentMax = freq[c];
                }
            }
            if (currentMax > maxRepeatCount) {
                maxRepeatCount = currentMax;
                result = word;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String input1 = "Microsoft google";
        System.out.println("Input: " + input1 + " -> Output: " + findWordWithMaxRepeats(input1));

        String input2 = "crayon blue";
        System.out.println("Input: " + input2 + " -> Output: " + findWordWithMaxRepeats(input2));
    }
}
