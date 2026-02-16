public class StringPermutations {
    public static void permute(String str, String result) {
        if (str.isEmpty()) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permute(remaining, result + ch);
        }
    }
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        String input = "men";   
        int length = input.length();
        int totalPermutations = factorial(length);

        System.out.println("Input String: " + input);
        System.out.println("Length: " + length);
        System.out.println("Total number of permutations: " + totalPermutations);
        System.out.println("Permutations are:");

        permute(input, "");
    }
}
