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

    public void originMasterThree() {
        System.out.println("masterThree远程提交");
    }

    public void originMasterFour(){
        System.out.println("masterFour远程提交");
    }

    public void originMasterFive(){
        System.out.println("masterFive远程提交");
    }

    public void originMasterSix(){
        System.out.println("masterSix远程提交");
        System.out.println("release提交");
    }

    public void originMasterSeven() {
        System.out.println("masterSeven远程提交");
        System.out.println("111");
    }

    public void originMasterSevenOne(){
        System.out.println("masterSevenOne提交");
        System.out.println("111");
        System.out.println("222");
        System.out.println("333");
    }

    public void originMasterEight(){
        System.out.println("masterEignt提交");
    }

    public void originMasterNine(){
        System.out.println("masterNine提交");
        System.out.println("hello123");
        System.out.println("helloOne");
        System.out.println("helloTwo");
        System.out.println("helloThree");
    }

    public void originMasterTen(){
        System.out.println("masterTen提交");
        System.out.println("111222333");
        System.out.println("tenOne");
        System.out.println("tenTwo");
        System.out.println("tenThree");
        System.out.println("tenFour");
        System.out.println("tenFive");
    }

    public void originMasterEleven(){
        System.out.println("masterEleven提交");
        System.out.println("hello");
        System.out.println("helloOne");
    }

    public void originMasterTwlve(){
        System.out.println("masterTwlve提交");
        System.out.println("masterThireen提交");
        System.out.println("masterFourteen提交");
        System.out.println("masterFifteen提交");
        System.out.println("helloTwo");
    }

    public void originMasterThirteen(){
        System.out.println("123");
    }

    public void originMasterFourteen(){
        System.out.println("fourTeen");
        System.out.println("111");
    }

    public void originMasterSixteen(){
        System.out.println("sixteen");
        System.out.println("hahaha");
    }
}
