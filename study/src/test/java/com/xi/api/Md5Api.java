package com.xi.api;

import com.xi.util.PropertiesUtil;
import com.xi.util.PropertiesUtils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Administrator on 2016/8/3.
 */
public class Md5Api {
    public static void main(String[] args) {
        /*String httpUrl = "http://apis.baidu.com/chazhao/md5decod/md5decod";
        String httpArg = "md5=DC6B7930EBC59DFF0FAF67EFE200ECD939BA3912";
        String jsonResult = request(httpUrl, httpArg);
        System.out.println(jsonResult);*/
        //图片api
        /*String httpUrl = "http://apis.baidu.com/txapi/mvtp/meinv";
        String httpArg = "num=10";
        String jsonResult = request(httpUrl, httpArg);
        System.out.println(jsonResult);*/
        //名人名言
     /* String httpUrl = "http://apis.baidu.com/avatardata/mingrenmingyan/lookup";
        String httpArg = "dtype=JSON&keyword=%E5%A4%A9%E6%89%8D&page=1&rows=20";
        String jsonResult = request(httpUrl, httpArg);
        System.out.println(jsonResult);*/
        //成语
        /*String httpUrl = "http://apis.baidu.com/avatardata/chengyu/lookup";
        String httpArg = "dtype=JOSN&id=d420b457-4b86-4ab1-b824-cb84440131fc";
        String jsonResult = request(httpUrl, httpArg);
        System.out.println(jsonResult);*/
        //名人警句
        String httpUrl = "http://apis.baidu.com/txapi/dictum/dictum";
        String httpArg = "";
        String jsonResult = request(httpUrl, httpArg);
        System.out.println(jsonResult);
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

