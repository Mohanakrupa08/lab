public class PasswordValidator {

    public static int isValidPassword(String password) {
        if (password == null) return 0;
        if (password.length() < 4) return 0;

        if (java.lang.Character.isDigit(password.charAt(0))) return 0;

        if (password.contains(" ") || password.contains("/")) return 0;
        if (!password.matches(".*\\d.*")) return 0;     
        if (!password.matches(".*[A-Z].*")) return 0;   

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isValidPassword("aA1-67"));    
        System.out.println(isValidPassword("a987 abc012")); 
    }
}
