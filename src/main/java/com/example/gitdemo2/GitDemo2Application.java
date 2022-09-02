package com.example.gitdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemo2Application {

    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("hello world 2");
        System.out.println("hello world 3");
        SpringApplication.run(GitDemo2Application.class, args);
    }

}
