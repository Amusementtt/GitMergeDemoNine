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
        System.out.println("dev分支的提交");
    }

    public void helloMaster(){
        System.out.println("master分支的提交");
        System.out.println("master分支的提交");
        System.out.println("master分支的提交");
    }

    public void helloRelease(){
        System.out.println("release分支提交");
    }

    public void releaseModify() {
        System.out.println("release分支的提交");
    }

    public void devModify(){
        System.out.println("dev分支提交");
    }

    public void originMaster(){
        System.out.println("master远程提交");
    }

    public void originMasterOne(){
        System.out.println("master远程提交One");
    }

    public void originMasterTwo(){
        System.out.println("masterTwo远程提交");
    }

    public void originMasterThree(){
        System.out.println("masterThree远程提交");
    }
}
