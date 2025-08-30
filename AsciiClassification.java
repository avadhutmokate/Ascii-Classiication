import java.util.Scanner;
class AsciiClassificaion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a character : ");
        char ch = sc.next().charAt(0);

        String op =
        (ch>=65 && ch<=90)?
        (ch+" is UPPERCASE"):
        ((ch>=97 && ch<=122)?
            (ch+" is a LOWERCASE"):
            (ch>=48 && ch<=57?
            ch+" is a DIGIT" :
            ch+" is a SPEACIAL character"));
            System.out.println(op);
            
    }
}