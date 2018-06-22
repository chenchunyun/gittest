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
		System.out.println("文件节点数:" + path.getNameCount());
		System.out.println("文件名称:" + path.getFileName());
		System.out.println("文件根目录:" + path.getRoot());
		System.out.println("文件上级关联目录:" + path.getParent());
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
		/* 监控目标路径 */
		Path path = Paths.get("C:/");
		try {
			/* 创建文件监控对象 */
			WatchService watchService = FileSystems.getDefault()
					.newWatchService();

			/* 注册文件监控的所有事件类型 */
			path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
					StandardWatchEventKinds.ENTRY_DELETE,
					StandardWatchEventKinds.ENTRY_MODIFY);

			/* 循环监测文件 */
			while (true) {
				WatchKey watchKey = watchService.take();

				/* 迭代触发事件的所有文件 */
				for (WatchEvent<?> event : watchKey.pollEvents())
					System.out.println(event.context().toString() + " 事件类型："
							+ event.kind());
				if (!watchKey.reset())
					return;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
