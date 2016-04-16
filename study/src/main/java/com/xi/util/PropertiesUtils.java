
package com.xi.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;


/**
 *
 * <b>类名称：</b>PropertiesUtil <br />
 * <b>类描述：</b> <br />
 * <b>创建人：</b>hugq <br />
 * <b>修改人：</b> <br />
 * <b>修改时间：</b> <br />
 * <b>修改备注：</b> <br />
 * @version 1.0
 */
public class PropertiesUtils {
    private static String default_properties = "memcache.properties";
    private static Properties prop;
    public static void initLocation(String location){

        try {
            default_properties=location;
            prop = new Properties();
            InputStream is = new BufferedInputStream(new FileInputStream(location));
            prop.load(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }

    public static String getProperty(String key, String defaultValue) {
        String value = prop.getProperty(key);
        if (value == null)
            return defaultValue;

        return value;
    }

    public static boolean getBooleanProperty(String name, boolean defaultValue) {
        String value = prop.getProperty(name);

        if (value == null)
            return defaultValue;

        return (new Boolean(value)).booleanValue();
    }

    public static int getIntProperty(String name) {
        return getIntProperty(name, 0);
    }

    public static int getIntProperty(String name, int defaultValue) {
        String value = prop.getProperty(name);

        if (value == null)
            return defaultValue;

        return (new Integer(value)).intValue();
    }

    public static String getPath() {
        return Thread.currentThread().getContextClassLoader().getResource("").getPath();
    }
}
