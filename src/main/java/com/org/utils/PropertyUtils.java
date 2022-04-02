package com.org.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.arg.constants.FrameWorkConstant;
import com.org.enums.ConfigProperties;

public final class PropertyUtils {

	private PropertyUtils() {
	}

	private static final Map<String, String> CONFIGMAP = new HashMap<String, String>();
	private static Properties property = new Properties();

	static {
		try {
			FileInputStream fis = new FileInputStream(FrameWorkConstant.getConfigFilePath());
			property.load(fis);

			// converting hashtable to hashmap if retrival taking time you canuse old data
			/*
			 * for(Object key:property.keySet()) { CONFIGMAP.put(String.valueOf(key),
			 * String.valueOf(property.get(key)));
			 * 
			 * }
			 */

		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String get(ConfigProperties key) throws Exception {
		if (Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key))) {
			throw new Exception("Property Name" + key + "is not found please check config.properties file");
		}

		return CONFIGMAP.get(key.name().toLowerCase());
	}
//bfore enums
	/*public static String getValue(String key) throws Exception {

		if (Objects.isNull(key) || Objects.isNull(property.get(key))) {
			throw new Exception("Property Name" + key + "is not found please check config.properties file");
		}
		return property.getProperty(key);

	}*/

	public static String getValue(ConfigProperties key) throws Exception {

		if (Objects.isNull(key) || Objects.isNull(property.getProperty(key.name().toLowerCase()))) {
			throw new Exception("Property Name" + key + "is not found please check config.properties file");
		}
		return property.getProperty(key.name().toLowerCase());
		
	}

}
