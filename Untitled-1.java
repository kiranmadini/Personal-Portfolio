import java.util*;
public class CSM{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(index:0);
        if(ch>=65 && ch<=90){
            System.out.println("it is a range capital letter upto A TO Z");
        }
        elif(ch>=97 && ch<=122){
            System.out.println("it is a range small letter");
        }
        elif(ch>=48 && ch<=57){
            System.out.println("it is a range of digits");
        }
        else{
            System.out.println("it is a symbol");
        }
    }
}