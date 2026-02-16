public class Strings {
    public static void main(String[] args){
        String s1="MOhana";
        String s2="MOhana";
        String s3=new String("mohana");
        String s4=new String("mohana");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.err.println(s3==s4);
        System.out.println(s4.equals(s1));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.startsWith("MO"));
        System.out.println(s1.trim());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s2.charAt(3));
        System.out.println(s1.isEmpty());
        System.out.println(s2.isBlank());
        System.out.println(s2.replace("MOhana","Mouni"));
        System.out.println(s2.indexOf("O"));
        System.out.println(s2.substring(2,5));
    }
}
