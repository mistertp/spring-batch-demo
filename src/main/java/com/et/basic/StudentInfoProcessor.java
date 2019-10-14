package com.et.basic;

import org.springframework.batch.item.ItemProcessor;

public class StudentInfoProcessor implements ItemProcessor<StudentInfo, StudentInfo> {
    @Override
    public StudentInfo process(StudentInfo studentInfo) throws Exception {
        System.out.println(studentInfo.toString());
        return studentInfo;
    }
}
