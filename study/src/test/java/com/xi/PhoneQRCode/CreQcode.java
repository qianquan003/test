package com.xi.PhoneQRCode;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;

public class CreQcode {
    public static void main(String[] args) {
        try {
//1.下面是我测试用的一个format
// BEGIN:VCARD
// "VERSION:3.0
// N:李德伟
// EMAIL:1606841559@qq.com
// TEL:12345678912
// TEL;CELL:12345678912
// ADR:山东济南齐鲁软件园
// ORG:济南
// TITLE:软件工程师
// URL:http://blog.csdn.net/lidew521
// NOTE:呼呼测试下吧。。。
// END:VCARD"
//2.根据测试结果推理
//---------------------------------------
//测试结果不加回车是不行的这样的话会出现问题
//就是扫描出来以后会没有内容
//这里可以看出,微信解析二维码的方式
//-------------------------------------------------
            //3.测试\n可以被二维码识别
//  这里也是有原因的,因为微信扫描二维码后会进行二次加工,
//  这里加工的时候,是用java代码的,因为是android系统,所以在
//  java中的回车是\n,因此这里就要用\n来分割
            String name="潘勇刚";
            String email="365851020@qq.com";
            String tel="13330122654";
            String cell="";
            String adr="江西新余";
            String org="高安二中";
            String title="教师";
            String url="http://365851020.qzone.qq.com/";
            String note="呼呼测试下吧。。。";
            String content = "BEGIN:VCARD\n" +
                    "VERSION:3.0\n" +
                    "N:"+name+"\n" +
                    "EMAIL:"+email+"\n" +
                    "TEL:"+tel+"\n" +
                    "CELL:"+cell+"\n" +
                    "ADR:"+adr+"\n" +
                    "ORG:"+org+"\n" +
                    "TITLE:"+title+"\n" +
                    "URL:"+url+"\n" +
                    "NOTE:"+note+"\n" +
                    "END:VCARD";
            String path = "D:/";

            MultiFormatWriter multiFormatWriter = new MultiFormatWriter();


            Map hints = new HashMap();
            hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            BitMatrix bitMatrix = multiFormatWriter.encode(content, BarcodeFormat.QR_CODE, 400, 400, hints);
            File file1 = new File(path, name+"名片.jpg");


            MatrixToImageWriter.writeToFile(bitMatrix, "jpg", file1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}