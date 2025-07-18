 import java.io.*;
 import java.net.*;
 class Server{
    public static void main(String[] args) throws Exception{
        ServerSocket ss= new ServerSocket(4000);
        System.out.println("server running on 4000");
        Socket s=ss.accept();
        System.out.println("client connected");
        DataInputStream dis= new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());

        String msg=dis.readUTF();
        System.out.println("Client msg"+msg);
        dos.writeUTF(msg.toUpperCase());
        dos.close();
        dis.close();
        s.close();
        ss.close();


    }
 }