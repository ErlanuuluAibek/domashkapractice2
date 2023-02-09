import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

            method(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());


    }
    public static void method(String login,String password,String confirmPassword){
        boolean onlyLatinAlphabet=login.matches("^[a-zA-Z0-9]+$");
        if(onlyLatinAlphabet||login.length()>20){
            if(password.equals(confirmPassword)||password.length()>20){
                System.out.println("вы вошли в систему");
            }else {
                throw new WrongPasswordException();
            }

        }else{
            throw new  WrongLoginException() ;
        }

    }
}