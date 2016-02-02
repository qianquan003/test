package com.xi.json;

import com.xi.util.ReadFileUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;

/**
 * Created by Administrator on 2016/2/2.
 */
public class telDemo {
    public static void main(String[] args) {
        String json = new ReadFileUtil().ReadFile("D:\\xm\\study\\git\\test\\study\\src\\test\\java\\com\\xi\\json\\tel.json");
        if (StringUtils.isNotEmpty(json)) {
            JSONObject dataJson = JSONObject.fromObject(json);
//             System.out.println(dataJson);
            if (dataJson != null && dataJson.containsKey("Contacts")) {
                JSONObject root = dataJson.getJSONObject("Contacts");
//                 System.out.println("root:"+root);
                if (root != null && root.containsKey("Contact")) {
                    JSONArray location = root.getJSONArray("Contact");
//                     System.out.println("Contact:"+location);
                    System.out.println("主人，您共有" + location.size() + "位手机联系人");
                    for (int i = 0; i < location.size(); i++) {
//                        System.out.println("姓名：" + location.get(0));
                        if (location != null) {
                            JSONObject linkman = location.getJSONObject(i);
                            System.out.println(linkman);
//                            for(int j=0;j<linkman.size();j++){
//                                String name= linkman.getString("Name");
//                                System.out.println("姓名：" +name);
//                            }
                            if (linkman != null && linkman.containsKey("Name")) {
                                String name = linkman.getString("Name");
//                                System.out.println("姓名：" +name);
                                if (linkman != null && linkman.containsKey("PhoneList")) {
                                    JSONObject PhoneList = linkman.getJSONObject("PhoneList");
                                    System.out.println("PhoneList：" + PhoneList);
                                    if (PhoneList != null && PhoneList.containsKey("Phone")) {
                                        //只有一个电话号码时是对象
                                        JSONObject Phone = PhoneList.getJSONObject("Phone");
                                        System.out.println("Phone：" + Phone);
                                        if (Phone != null) {
                                            String tel = Phone.getString("tel");
                                            System.out.println("姓名：" +name+" tel：" + tel);
                                        }
                                        //有多个电话号码时是数组
//                                        JSONObject Phone2 = PhoneList.getJSONObject("Phone2");
//                                        System.out.println("Phone2：" + Phone2);
//                                        if (Phone2 != null) {
//                                            String tel = Phone2.getString("tel");
//                                            System.out.println("tel：" + tel);
//                                        }
                                        /*JSONArray Phone2 = PhoneList.getJSONArray("Phone2");
                                        System.out.println("Phone2：" + Phone2);
                                        if (Phone2.size()>0) {
                                            for(int index=0;i<Phone2.size();index++){
                                                JSONObject tel2 = Phone2.getJSONObject(index);
                                                System.out.println("多个tel2：" + tel2);
                                            }
                                        }*/
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
