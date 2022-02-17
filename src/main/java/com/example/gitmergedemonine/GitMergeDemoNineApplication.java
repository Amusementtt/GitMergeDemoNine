package com.example.gitmergedemonine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitMergeDemoNineApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitMergeDemoNineApplication.class, args);
        System.out.println("123456");
        System.out.println("master测试rebase提交");
        System.out.println("dev分支提交");
        System.out.println("dev分支第二次提交");
    }

    public void hello(){
        System.out.println("master测试rebase第二次提交");
        System.out.println("dev:dev测试rebase提交");
        System.out.println("master测试rebase第三次提交");
        System.out.println("dev:dev测试rebase第三次提交");
    }

    public void helloMaster(){
        System.out.println("master分支的提交");
    }

}
