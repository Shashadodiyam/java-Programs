import java.io.*;
public class FileWandR{
	public static void main(String[] args) throws IOException{
		FileWriter writer=new FileWriter("Output.txt");
		writer.write("Hello,Java FileWriter");
		writer.close();
		FileReader reader=new FileReader("Output.txt");
		int ch;
		while((ch=reader.read())!=-1){
			System.out.print((char)ch);
		}
		reader.close();
	}
}