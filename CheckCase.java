import java.util.Scanner;
public class CheckCase{
  public static void main(String[] args){
    char ch;
    Scanner userinput = new Scanner(System.in);
    System.out.println("Enter the character: ");
    ch = userinput.next().charAt(0);;

    if (ch >= 'A' && ch <= 'Z'){
      System.out.println(ch+" is an upper case letter.");
    } else if (ch >= 'a' && ch <= 'z'){
      System.out.println(ch+" is a lower case letter.");
    }
    else {
      System.out.println(ch+" is not a letter.");
    }
  }
}
