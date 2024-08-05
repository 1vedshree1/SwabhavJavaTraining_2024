package com.techlabs.list.test;

import java.util.PriorityQueue;
import java.util.Queue;

import com.techlabs.list.model.Student;
import com.techlabs.list.model.StudentComparator;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Vedshree", 90);
        Student s2 = new Student(2, "Shruti", 99);
        Student s3 = new Student(3, "Rishika", 80);
        
        
        Queue<Student> students = new PriorityQueue<>(new StudentComparator.RollNumberComparator());

        
        students.add(s1);
        students.add(s2);
        students.add(s3);

       
        while (!students.isEmpty()) {
            System.out.println(students.poll());
        }
    }
}

