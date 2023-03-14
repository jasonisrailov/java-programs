public class StringPractice
{
  public static void main(String[] args)
  {
    String s = new String("Hello");
    String s1 = new String(" World");

    char c = s.charAt(3);
    System.out.println(c);

    s.concat(s1);
    System.out.println(s);

    String s2 = new String("hello");

    int i = s.compareTo(s2);
    System.out.println(i);

    String s3 = "Hello";
    String s4 = " World";

    boolean b1 = s3.equals(s4);

    String s5 = "hello";

    boolean b2 = s5.equalsIgnoreCase(s3);

    int i1 = s5.indexOf("o");

    for(int i2 = 0; i2 < s5.length(); i2++)
        System.out.println(s5.charAt(i2));

    s5 = "helloooo";
    s5.replace('o', 'x');
    System.out.println(s5);

    String s6 = s5.substring(5);
    System.out.println(s6);
    String s7 = s5.substring(5,8); //anything less than 5 will give an exeption erros because it starts from 0 again.
    System.out.println(s7);
  }
} // End of Classs
