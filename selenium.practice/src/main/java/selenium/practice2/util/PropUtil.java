package selenium.practice2.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 属性文件访问单元
 */
public class PropUtil {
	private Properties prop;
	private	String filePath;
	
	/*
	 * 构造方法
	 */
	public PropUtil(String filePath) {
		this.filePath = filePath;
		this.prop = readProperties();
	}
	
	
	/*
	 * 读取配置文件
	 */
	private Properties readProperties() {
		Properties properties = new Properties();
		try {
//			InputStream inputStream = new FileInputStream(filePath);
//			InputStream in = new BufferedInputStream(inputStream);
			InputStream inputStream =this.getClass().getResourceAsStream(filePath);
			properties.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;
	}

	/**
	 * 获取配置项的值
	 * @param key
	 * @return
	 */
	public String getProp(String key) {
		if (prop.containsKey(key)) {
			String username = prop.getProperty(key);
			return username;
		}else {
			System.out.println("key不对");
			return "";
		}
		
	}
//	public static void main(String[] args) throws Exception {
//		PropUtil pro = new PropUtil();
//		pro.getProp();
//	}
	 
}
