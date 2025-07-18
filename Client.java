import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception{
        Socket s= new Socket("localhost",4000);
        DataInputStream dis= new DataInputStream(s.getInputStream());
        DataOutputStream dos= new DataOutputStream(s.getOutputStream());
        dos.writeUTF("purnima");
        String reply=dis.readUTF();
        System.out.println("Server Reply"+reply);
        dos.close();
        dis.close();
        s.close();

    }
    
}
