import java.util.Scanner;
public class nextFive {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character");
        char ch = sc.next().charAt(0);
        for(int i = 0; i<5 ; i++)
        {
            ch++ ;
            if (ch > 'z'){
                ch = 'A';
                System.out.print(ch + " ");

            }
            else if ( ch > 'Z' && ch <'a'){
                ch = 'a';
                System.out.print(ch + " ");
            }
            else{
                System.out.print(ch + " ");
            }

        }
        }
    }
    
