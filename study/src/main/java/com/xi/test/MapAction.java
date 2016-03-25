package com.xi.test;

import com.opensymphony.xwork2.ActionSupport;
import com.xi.model.Student;

import java.util.ArrayList;
import java.util.HashMap;  
import java.util.List;  
import java.util.Map; 

public class MapAction extends ActionSupport
{  
 
    private Map<String,String> map;  
     
    private Map<String,Student> studentMap;
      
    private Map<String,String[]> arrayMap;  
      
    private Map<String,List<Student>> listMap;  
      

    public String testMap()  
   {  
       map=new HashMap<String,String>();  
        map.put("1", "one");  
        map.put("2", "two");  
          
        studentMap=new HashMap<String,Student>();  
        studentMap.put("student1",new Student(new Long(1),"20034140201","张三1","男",25));  
        studentMap.put("student2",new Student(new Long(2),"20034140202","张三2","女",26));  
        studentMap.put("student3",new Student(new Long(3),"20034140202","张三3","男",27));  
         
        arrayMap=new HashMap<String,String[]>();  
        arrayMap.put("arr1", new String[]{"1","2003401","leejie","male","20"});  
        arrayMap.put("arr2", new String[]{"2","2003402","huanglie","male","25"});  
        arrayMap.put("arr3", new String[]{"3","2003403","lixiaoning","male","21"});  
          
      
        listMap=new HashMap<String,List<Student>>();  
          
        List<Student> list1=new ArrayList<Student>();  
       list1.add(new Student(new Long(1),"20034140201","张三1","男",25));  
        list1.add(new Student(new Long(2),"20034140202","张三2","男",25));  
        list1.add(new Student(new Long(3),"20034140203","张三3","男",25));  
        listMap.put("class1", list1);  
          
        List<Student> list2=new ArrayList<Student>();  
        list2.add(new Student(new Long(1),"20034140301","李四1","男",20));  
        list2.add(new Student(new Long(2),"20034140302","李四2","男",21));  
        list2.add(new Student(new Long(3),"20034140303","李四3","男",22));  
        list2.add(new Student(new Long(4),"20034140304","李四4","男",23));  
        listMap.put("class2", list2);  
          
         
         
          
        return SUCCESS;  
          
    }  
      
    public Map<String, String> getMap() {  
       return map;  
    }  
 
   public void setMap(Map<String, String> map) {  
        this.map = map;  
    }  
      
    public Map<String, Student> getStudentMap() {  
        return studentMap;  
    }  

    public void setStudentMap(Map<String, Student> studentMap) {  
        this.studentMap = studentMap;  
    }  

    public Map<String, String[]> getArrayMap() {  
       return arrayMap;  
   }  
 
 
    public void setArrayMap(Map<String, String[]> arrayMap) {  
        this.arrayMap = arrayMap;  
    }  
 
 
    public Map<String, List<Student>> getListMap() {  
        return listMap;  
    }  
 
    public void setListMap(Map<String, List<Student>> listMap) {  
        this.listMap = listMap;  
    }  
      
      
} 