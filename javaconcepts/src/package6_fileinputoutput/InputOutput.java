package package6_fileinputoutput;

import java.io.*;

public class InputOutput {
	public static void main(String args[]) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/arpitkumar/Desktop/JavaFiles/output.txt"));
			bw.write("Arpit Kumar\n");
			bw.write("Aditya Kumar\n");
			bw.write("Ayush Agarwal");
			bw.close();
		}catch(Exception ex) {
			return;
		}	
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("/Users/arpitkumar/Desktop/JavaFiles/output.txt"));
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		}catch(Exception ex) {
			
		}
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("/Users/arpitkumar/Desktop/JavaFiles/output.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/arpitkumar/Desktop/JavaFiles/output-copy.txt"));
			String str;
			while((str = br.readLine()) != null) {
				bw.write(str + "\n");
			}
			br.close();
			bw.close();
			
		}catch(Exception ex) {
			
		}
	}
}
