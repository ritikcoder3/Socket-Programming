import java.net.*;
import java.io.*;
class ClientApp
{
public static void main(String[]e)throws Exception
{
Socket s=new Socket("localhost",4444);

OutputStream os=s.getOutputStream();
PrintStream ps=new PrintStream(os);
BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
String data1=br1.readLine();
ps.println(data1);

InputStream is=s.getInputStream();
BufferedReader br2=new BufferedReader(new InputStreamReader(is));
String data2=br2.readLine();
System.out.println(data2);
}
}