package com.xi.api;

import com.xi.util.PropertiesUtil;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 * Created by Administrator on 2015/12/30.
 */
public class WeatherApi {
    public static void main(String[] args) {
        String httpUrl = "http://apis.baidu.com/apistore/weatherservice/citylist";
        String httpArg = "cityname=%E4%B8%8A%E6%B5%B7";
        String jsonResult = request(httpUrl, httpArg);
        System.out.println(jsonResult);
    }

    /**
     * @param urlAll
     *            :����ӿ�
     * @param httpArg
     *            :����
     * @return ���ؽ��
     */
    public static String request(String httpUrl, String httpArg) {
        BufferedReader reader = null;
        String result = null;
        StringBuffer sbf = new StringBuffer();
        httpUrl = httpUrl + "?" + httpArg;

        try {
            URL url = new URL(httpUrl);
            HttpURLConnection connection = (HttpURLConnection) url
                    .openConnection();
            connection.setRequestMethod("GET");
            // ����apikey��HTTP header
            connection.setRequestProperty("apikey", PropertiesUtil.getProperty("apikey"));
            connection.connect();
            InputStream is = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String strRead = null;
            while ((strRead = reader.readLine()) != null) {
                sbf.append(strRead);
                sbf.append("\r\n");
            }
            reader.close();
            result = sbf.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
