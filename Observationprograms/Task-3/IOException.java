package core_java;
import java.io.FileReader;
import java.io.IOException;

public class IOException {
public static void main(String[] args) {
try {
FileReader reader = new FileReader("test.txt");
reader.close();
reader.read(); // Reading from a closed stream throws IOException
} catch (IOException e) {
System.err.println("Caught IOException: An I/O error occurred.");
}
}
}
