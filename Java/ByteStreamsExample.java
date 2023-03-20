// Java program to write Bytes using ByteStream

// Importing classes
import java.io.FileOutputStream;
import java.io.IOException;

// Class
class ByteStreamsExample{

	// Main driver method
	public static void main(String args[])throws IOException
	{

		// Try block to check if any exception/s occur
		try {

			// Step 1: Creating object of the file and
			// passing local directory path of file as input
			FileOutputStream fout
				= new FileOutputStream("D:\\\\Practice\\\\demo.txt");

			// Custom text to be written down in above file
			// Step 2: Storing text into String datatype
			String s
				= "Welcome to GFG! This is an example of Java program to write Bytes using ByteStream.";

			// Step 3: Converting string into byte array
			byte b[] = s.getBytes();

			// Step 4: Write byte data to file output
			fout.write(b);

			// Step 5: Close the file using close() method
			fout.close();
		}

		// Catch block to handle exceptions
		catch (IOException e) {

			// Display and print the exception
			System.out.println(e);
		}
	}
}
