package javanew;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java7NIO2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// testFile();
		// testCopy();
		testWatch();
	}

	public static void testFile() {
		Path path = Paths.get("C:/windows");
		System.out.println("�ļ��ڵ���:" + path.getNameCount());
		System.out.println("�ļ�����:" + path.getFileName());
		System.out.println("�ļ���Ŀ¼:" + path.getRoot());
		System.out.println("�ļ��ϼ�����Ŀ¼:" + path.getParent());
	}

	public static void testCopy() {
		try {
			Files.copy(Paths.get("C:/a.txt"), Paths.get("C:/b.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void testWatch() {
		/* ���Ŀ��·�� */
		Path path = Paths.get("C:/");
		try {
			/* �����ļ���ض��� */
			WatchService watchService = FileSystems.getDefault()
					.newWatchService();

			/* ע���ļ���ص������¼����� */
			path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
					StandardWatchEventKinds.ENTRY_DELETE,
					StandardWatchEventKinds.ENTRY_MODIFY);

			/* ѭ������ļ� */
			while (true) {
				WatchKey watchKey = watchService.take();

				/* ���������¼��������ļ� */
				for (WatchEvent<?> event : watchKey.pollEvents())
					System.out.println(event.context().toString() + " �¼����ͣ�"
							+ event.kind());
				if (!watchKey.reset())
					return;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
