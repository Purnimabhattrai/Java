 import java.io.*;
 import java.net.*;

 class Client{
    public static void main(String[] args) throws Exception{
        Socket s= new Socket("localhost",6000);
        DataInputStream dis= new DataInputStream(s.getInputStream());
        DataOutputStream dos= new DataOutputStream(s.getOutputStream());
        dos.writeInt(3);
         int sq=dis.readInt();
        System.out.println("Server reply"+sq);
        dos.close();
        dis.close();
        s.close();


    }
 }