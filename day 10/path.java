import java.io.*;
class Path {
	public static void main(String args[]) {
		try {
				FileWriter fl=new FileWriter("new.txt");
				String str="C:/Users/Test/video.mp$";
				fl.write(str);
				fl.close();
				System.out.println("Done");
			} catch(IOException ie) {
				e.printStackTrace();
			}
		File f=new File("new.txt");
		System.out.println("File Absolutepath: "+f.getAbsolutePath());
	}
}