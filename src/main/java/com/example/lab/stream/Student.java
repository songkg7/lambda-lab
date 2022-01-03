package com.example.lab.stream;

import lombok.Value;

@Value(staticConstructor = "of")
public class Student {

    String name;
    boolean isMale;
    int grade;
    int clazz;
    int score;

}
