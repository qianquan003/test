//package com.xi.videoDemo;
//
//import net.sf.json.JSONObject;
//
//public class Sample {
//
//    //设置APPID/AK/SK
//    public static final String APP_ID = "你的 App ID";
//    public static final String API_KEY = "你的 Api ID";
//    public static final String SECRET_KEY = "你的 Secret Key";
//
//    public static void main(String[] args) {
//
//        // 初始化一个FaceClient
//        AipSpeech client = new AipSpeech(APP_ID, API_KEY, SECRET_KEY);
//
//        // 可选：设置网络连接参数
//        client.setConnectionTimeoutInMillis(2000);
//        client.setSocketTimeoutInMillis(60000);
//
//        // 调用API
//        JSONObject res = client.asr("test.pcm", "pcm", 16000, null);
//        System.out.println(res.toString(2));
//    }
//    public void synthesis(AipSpeech client)
//    {
//        // 对本地语音文件进行识别
//        String path = "D:\\code\\java-sdk\\speech_sdk\\src\\test\\resources\\16k_test.pcm";
//        JSONObject asrRes = client.asr(path, "pcm", 16000, null);
//        System.out.println(asrRes);
//
//        // 对语音二进制数据进行识别
//        byte[] data = Util.readFileByBytes(path);     //readFileByBytes仅为获取二进制数据示例
//        JSONObject asrRes2 = client.asr(data, "pcm", 16000, null);
//        System.out.println(asrRes);
//
//        // 对网络上音频进行识别
//        String url = "http://somehost/res/16k_test.pcm";
//        String callback = "http://callbackhost/aip/dump";
//        JSONObject res = client.asr(url, callback, "pcm", 16000, null);
//        System.out.println(res);
//    }
//}