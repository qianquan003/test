package com.xi.api;

import com.xi.util.PropertiesUtil;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;

/**
 * Created by Administrator on 2015/12/30.
 */
public class TrainApi {
    public static void main(String[] args) {
        String httpUrl = "http://apis.baidu.com/qunar/qunar_train_service/traindetail";
        String httpArg = "version=1.0&train=G1344&from=%E6%96%B0%E4%BD%99%E5%8C%97&to=%E4%B8%8A%E6%B5%B7%E8%99%B9%E6%A1%A5&date=2016-02-18";
        String jsonResult = request(httpUrl, httpArg);
        System.out.println(jsonResult);
        try {
            //urlencode
//            String encode=URLEncoder.encode("new","UTF-8");
//            System.out.println(encode);
            //urldecode
            String urldecode= URLDecoder.decode("%E4%B8%8A%E6%B5%B7%E8%99%B9%E6%A1%A5", "UTF-8");
            System.out.println(urldecode);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param urlAll  :请求接口
     * @param httpArg :参数
     * @return 返回结果
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
            // 填入apikey到HTTP header
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
