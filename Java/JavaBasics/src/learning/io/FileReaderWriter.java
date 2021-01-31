package learning.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	private final String DATA_FILE_NAME = "data.txt";

	public static void main(String[] args) throws IOException {

		String myData = "Hello world!";

		FileReaderWriter myProg = new FileReaderWriter();

		myProg.writeToFile(myData);

		myProg.readFile();

	}

	public void writeToFile(String data) throws IOException {

		File myfile = new File(DATA_FILE_NAME);

		FileWriter myWriter = new FileWriter(myfile);

		myWriter.write(data);

		myWriter.close();

	}

	public void readFile() throws IOException {
		File myfile = new File(DATA_FILE_NAME);

		FileReader myReader = new FileReader(myfile);

		BufferedReader bufferedReader = new BufferedReader(myReader);

		String thisLine = bufferedReader.readLine();

		System.out.println(thisLine);
		
		bufferedReader.close();
	}

}
