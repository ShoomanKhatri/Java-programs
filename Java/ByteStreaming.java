import java.io.*;
public class ByteStreaming {
	public static void main(String args[]) throws IOException{
		FileInputStream in =null;
		FileOutputStream out=null;
		try {
			in=new FileInputStream("D:\\Practice\\input.txt");
			out=new FileOutputStream("D:\\\\Practice\\\\output.txt");
			int c;
			while((c=in.read())!=-1)
			{
				out.write(c);
			}
		}finally
		{
			if(in!=null) {
				in.close();
		     }
		    if(out!=null)
		    {
			    out.close();
		    }
	}
	}
}


