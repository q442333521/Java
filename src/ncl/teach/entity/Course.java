package ncl.teach.entity;

import ncl.teach.myabstract.Student;

import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class Course extends Student {
    static Map<String, String> supervisors = new HashMap<>();
    static Map<String, String> courses = new HashMap<>();
    public void setSupervisor(Student student,int NumSupervisor){
        File file = new File("resources/supervisor");
        try {
            if (student.gettypeOfStudent().equals("PGR")) {
                String studetid = student.GetStudentID();
                BufferedReader bf = new BufferedReader(new FileReader(file));
                String str;
                str = bf.readLine();
                String[] ss = str.split(",");
                supervisors.put(studetid, ss[NumSupervisor - 1]);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getSupervisor(Student student,int NumSupervisor){
        String name = supervisors.get(student.GetStudentID());
        System.out.println("Your Supervisor is "+name);
        return name;
    }
    public void setCourse(){
        File file = new File("resources/modules");
        try {
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String str;
            while ((str = bf.readLine()) != null) {
                String[] ss = str.split(",");
//                for (int i = 0; i < ss.length; i++) {
                    courses.put(ss[0], str);
                //}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    @Override
    public String getCourse() {
        Set<String> keys = courses.keySet();
        for(String key :keys){
            System.out.println(key+" "+courses.get(key));
        }
        return null;
    }
    public int getCourseGrade(String courseNo){
        //Set<String> keys = map.keySet();
        String str = courses.get(courseNo);
        if (str == null ||"".equals(str)){
            return 0;
        }
        else {
            String [] part=str.split(",");

            String num =part[2];
            num = num.trim();
            while (num.startsWith("　")) {//这里判断是不是全角空格
                num = num.substring(1, num.length()).trim();
            }
            while (num.endsWith("　")) {
                num = num.substring(0, num.length() - 1).trim();
            }

            int numint = Integer.parseInt(num);
            System.out.println(numint);
            return numint;
        }
    }
    public boolean EnoughCredits(String str, Student student){
        String[] courses = str.split(",");
        int num;
        int grades =0;
        for (String cours : courses) {
//                    String [] each=ss[i].split("=");
//                    map.put(each[0], each[1]);
            num = getCourseGrade(cours);
            grades += num;
        }
        System.out.println(grades);
        if (student.gettypeOfStudent().equals("UG") & grades > 120) {
            return true;
        }else if (student.gettypeOfStudent().equals("PGT") & grades > 180){
            return true;
        }else return student.gettypeOfStudent().equals("PGR") & grades > 0;
    }
}