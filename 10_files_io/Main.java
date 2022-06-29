import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.annotation.processing.Filer;

public class Main {
	public static void main(String[] args) throws IOException {
		File dir = new File("out");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		// 8 bit
		// FileInputStream in = null;
		// FileOutputStream out = null;

		// 16 bit
		FileReader in = null;
		FileWriter out = null;

		try {
			in = new FileReader("in/input.txt");
			out = new FileWriter("out/output.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}

			out.write("\nEND::");
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
