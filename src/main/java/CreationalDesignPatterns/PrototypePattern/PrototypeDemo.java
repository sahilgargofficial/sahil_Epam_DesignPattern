package CreationalDesignPatterns.PrototypePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Student Rollno");
        int rollno = Integer.parseInt(br.readLine());
        //System.out.println();
        System.out.println("Enter Student Name");
        String name = br.readLine();
        //System.out.println();
        System.out.println("Enter Student address");
        String address = br.readLine();
        //System.out.println();
        StudentRecord s1 = new StudentRecord(rollno,name,address);
        s1.showRecord();
        StudentRecord s2 = (StudentRecord)s1.getClone();
        s2.showRecord();
    }
}
