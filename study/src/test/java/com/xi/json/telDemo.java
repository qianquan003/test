package com.xi.json;

import com.xi.util.ReadFileUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/2/2.
 */
public class telDemo {
    public static void main(String[] args) {
        telDemo t = new telDemo();
        List s = t.tel();
        System.out.println(s);
    }

    public List tel() {
        List list=new ArrayList();
        String name = null;
        String tel = null;
        String json = new ReadFileUtil().ReadFile("D:\\xm\\study\\git\\test\\study\\src\\test\\java\\com\\xi\\json\\tel.json");
        if (StringUtils.isNotEmpty(json)) {
            JSONObject dataJson = JSONObject.fromObject(json);
            if (dataJson != null && dataJson.containsKey("Contacts")) {
                JSONObject root = dataJson.getJSONObject("Contacts");
                if (root != null && root.containsKey("Contact")) {
                    JSONArray location = root.getJSONArray("Contact");
//                    System.out.println("主人，您共有" + location.size() + "位手机联系人");
                    for (int i = 0; i < location.size(); i++) {
                        if (location != null) {
                            JSONObject linkman = location.getJSONObject(i);
                            if (linkman != null && linkman.containsKey("Name")) {
                                name = linkman.getString("Name");
                            }
                            if (linkman != null && linkman.containsKey("PhoneList")) {
                                JSONObject PhoneList = linkman.getJSONObject("PhoneList");
                                if (PhoneList != null && PhoneList.containsKey("Phone")) {
                                    //只有一个电话号码时是对象
                                    JSONObject Phone = PhoneList.getJSONObject("Phone");
                                    if (Phone != null) {
                                        tel = Phone.getString("tel");
//                                        System.out.println("姓名：" + name + " tel：" + tel);
                                        String info = "姓名：" + name + " tel：" + tel;
                                        list.add(info);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return list;
    }
}
