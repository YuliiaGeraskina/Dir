import java.io.File;

public class Main {
	public static void main(String[] args) {
		
		String[] list={"d:\\Folder1","d:\\Folder2","d:\\Folder3"};
		MonitorDir m = new MonitorDir(list, new DirEvent());
		m.start();
	}
}
