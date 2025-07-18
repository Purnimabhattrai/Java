import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket ss= new ServerSocket(7000);
        System.out.println("Server running at 7000");
        Socket s= ss.accept();
        System.out.println("Client connected");
        DataInputStream dis= new DataInputStream(s.getInputStream());
        DataOutputStream dos= new DataOutputStream(s.getOutputStream());
        String msg= dis.readUTF();
        String check= isPalindrome(msg);
        dos.writeUTF(check);
        dos.close();
        dis.close();
        s.close();
        ss.close();

    }
    public static String isPalindrome(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev= rev+str.charAt(i);
        }
        if(rev.equalsIgnoreCase(str)){
            return"Palindrome";

        }
        return"not Plaindrome";
    }

    
}
