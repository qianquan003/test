package com.xi.fileDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLog {
FileInputStream fis=null;
static String temp = "";
//public ReadLog(){
//try {
////File file=new File("E:\\javastudy\\topcheer\\天正\\company file\\Cop.log_.2012-12-20");
//File file=new File("D:\\ybt.log.2014-05-25");
//fis=new FileInputStream(file);
//BufferedReader br=new BufferedReader(new InputStreamReader(fis));
//long startTime=System.currentTimeMillis();
//String str=br.readLine();
//while(str!=null){
//System.out.println(new String(str.getBytes("iso8859-1"), "utf-8"));
//}
//System.out.println("时间："+(System.currentTimeMillis()-startTime));
////byte[] buf=new byte[(int) file.length()];
////fis.read(buf);
//
////for(int i=0;i<file.length();i++){
////char str=(char)fis.read();
////
////System.out.print(str);
////}
////System.out.println();
//} catch (Exception e) {
//// TODO Auto-generated catch block
//e.printStackTrace();
//}finally{
//try {
//fis.close();
//} catch (IOException e) {
//// TODO Auto-generated catch block
//e.printStackTrace();
//}
//}
//}
/*public void Test() throws Exception{
FileInputStream fileStream = new FileInputStream("E:\\javastudy\\topcheer\\天正\\company file\\Cop.log_.2012-12-20");
BufferedReader reader = new BufferedReader(new InputStreamReader(
fileStream));

String line = null, str=null;
long startTime = System.currentTimeMillis();//获取系统毫秒
int c =0;
while ((line = reader.readLine()) != null) {
   //do nothing, only read
System.out.println(line);
for(int count=1;count<line.length();count++){
if(line.contains("交易结束")){

System.out.println("第"+count+"笔交易");
//System.out.println("交易开始"+line);
//}count++;
//else if(line.contains("交易结束")){
//System.out.println("交易结束"+line);
}
}c++;
}
System.out.println("时间:" + (System.currentTimeMillis() - startTime));
}*/
/**

*

* @param filePath      文件路径的字符串表示形式

* @param KeyWords      查找包含某个关键字的信息：非null为带关键字查询；null为全文显示

* @return      当文件存在时，返回字符串；当文件不存在时，返回null

*/

public String readFromFile(String filePath, String KeyWords){

   StringBuffer stringBuffer = null;

   File file = new File(filePath);

   if(file.exists()){

       stringBuffer = new StringBuffer();

       FileReader fileReader = null;

       BufferedReader bufferedReader = null;

       
       int total=0;

       try {

           fileReader = new FileReader(file);

           bufferedReader = new BufferedReader(fileReader);

           while((temp = bufferedReader.readLine()) != null){
//            System.out.println(temp);
               if(KeyWords ==null){

                   stringBuffer.append(temp + "\n");
//                    System.out.println(temp);

               }else{

                   if(temp.contains(KeyWords)&&!temp.contains("调用核心交易结束")&&!temp.contains("调用第三方交易结束")){

                       stringBuffer.append(temp + "\n");
                       System.out.println(temp);
                       total++;
                   }

               }

           }
           System.out.println("共"+total+"笔交易");
       } catch (FileNotFoundException e) {

           //e.printStackTrace();

       } catch (IOException e) {

           //e.printStackTrace();

       }finally{

           try {

               fileReader.close();

           } catch (IOException e) {

               //e.printStackTrace();

           }

           try {

               bufferedReader.close();

           } catch (IOException e) {

               //e.printStackTrace();

           }

       }

   }

   if(stringBuffer == null){

       return null;

   }else{

       return stringBuffer.toString();

   }

}

/**

* 将指定字符串写入文件。如果给定的文件路径不存在，将新建文件后写入。

* @param log       要写入文件的字符串

* @param filePath      文件路径的字符串表示形式，目录的层次分隔可以是“/”也可以是“\\”

* @param isAppend      true：追加到文件的末尾；false：以覆盖原文件的方式写入

*/



public static boolean writeIntoFile(String log, String filePath, boolean isAppend){

   boolean isSuccess = true;

   //如有则将"\\"转为"/",没有则不产生任何变化

   String filePathTurn = filePath.replaceAll("\\\\", "/");

   //先过滤掉文件名

   int index = filePath.lastIndexOf("/");

   String dir = filePath.substring(0, index);

   //创建除文件的路径

   File fileDir = new File(dir);

   fileDir.mkdirs();

   //再创建路径下的文件

   File file = null;

   try {

       file = new File(filePath);

       file.createNewFile();

   } catch (IOException e) {

       isSuccess = false;

       //e.printStackTrace();

   }

   //将logs写入文件

   FileWriter fileWriter = null;

   try {

       fileWriter = new FileWriter(file, isAppend);

       fileWriter.write(log);

       fileWriter.flush();

   } catch (IOException e) {

       isSuccess = false;

       //e.printStackTrace();

   } finally{
   System.out.println(filePath);
//        try {
//
//            fileWriter.close();
//
//        } catch (IOException e) {
//
//            //e.printStackTrace();
//
//        }

   }



   return isSuccess;

}

/**                                                                                              
    
* 创建文件，如果该文件已存在将不再创建（即不起任何作用）                                        
                                                                                                
* @param filePath       要创建文件的路径的字符串表示形式，目录的层次分隔可以是“/”也可以是“\\”   
                                                                                                
* @return      创建成功将返回true；创建不成功则返回false                                        
                                                                                                
*/                                                                                              
                                                                                                
public static boolean createNewFile(String filePath){                                            
                                                                                                
   boolean isSuccess = true;                                                                    
                                                                                                
   //如有则将"\\"转为"/",没有则不产生任何变化                                                   
                                                                                                
   String filePathTurn = filePath.replaceAll("\\\\", "/");                                      
                                                                                                
   //先过滤掉文件名                                                                             
                                                                                                
   int index = filePathTurn.lastIndexOf("/");                                                   
                                                                                                
   String dir = filePathTurn.substring(0, index);                                               
                                                                                                
   //再创建文件夹                                                                               
                                                                                                
   File fileDir = new File(dir);                                                                
                                                                                                
   isSuccess = fileDir.mkdirs();                                                                
                                                                                                
   //创建文件                                                                                   
                                                                                                
   File file = new File(filePathTurn);                                                          
                                                                                                
   try {                                                                                        
                                                                                                
       isSuccess = file.createNewFile();                                                        
                                                                                                
   } catch (IOException e) {                                                                    
                                                                                                
       isSuccess = false;                                                                       
                                                                                                
       //e.printStackTrace();                                                                   
                                                                                                
   }                                                                                            
                                                                                                
                                                                                                
                                                                                                
   return isSuccess;                                                                            
                                                                                                
}                                                                                                
                                                                                        

public static void main(String[] args) throws Exception {
ReadLog rl=new ReadLog();
rl.readFromFile("C:\\Users\\Administrator\\Desktop\\freecms.sql\\freecms.sql", "freecms_info");
writeIntoFile(rl.readFromFile("C:\\Users\\Administrator\\Desktop\\freecms.sql\\freecms.sql", "freecms_info"), "e:/test.log", false);
//rl.Test();
}
}
