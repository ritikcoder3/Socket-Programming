import java.net.*;
import java.io.*;
class ServerApp
{
public static void main(String[]e)throws Exception
{
ServerSocket ss=new ServerSocket(4444);
Socket s=ss.accept();

InputStream is=s.getInputStream();
BufferedReader br1=new BufferedReader(new InputStreamReader(is));
String data1=br1.readLine();
System.out.println(data1);

BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
String data2=br2.readLine();
OutputStream os=s.getOutputStream();
PrintStream ps=new PrintStream(os);
ps.println(data2);
}
}