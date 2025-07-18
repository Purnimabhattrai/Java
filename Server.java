import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] arg) throws Exception{
        ServerSocket ss=new ServerSocket(6000);
        System.out.println("Server running at 6000");
        Socket s= ss.accept();
        System.out.println("client connected");
        DataInputStream dis= new DataInputStream(s.getInputStream());
        DataOutputStream dos= new DataOutputStream(s.getOutputStream());
        int number=dis.readInt();
        int result=number*number;
        dos.writeInt(result);
        dos.close();
        dis.close();
        s.close();
        ss.close();
    }
    
}
