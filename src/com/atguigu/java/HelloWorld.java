package com.atguigu.java;

import java.util.ArrayList;
import java.util.Date;

/*
快捷键的使用：
一.执行(run)      alt+r
二.提示补全(Class Name Completion)     alt+/
三.单行注释                          ctrl+/
四.多行注释 ctrl+shift+/
五.向下复制一行(Duplicate Lines)     ctrl+alt+down
六.删除一行或者选中一行(delete line)      ctrl+d
七.向下移动一行(move statement down)               alt+down
八.向上移动一行(move statement up)          alt+up
九.向下开始新的一行(start new line)            shift+enter
十.向上开始新的一行(Start New Line before current)                      ctrl+shift+enter
十一.如何查看源码(class)                         ctrl+选中指定的结构 或 ctrl + shift +t
十二.万能解错/生成返回值变量                       alt+enter
十三.退回到前一个编辑的页面(back)                alt+left
十四.进入到下一个编辑的页面(针对于上条) (forward)            alt+right
十五.查看继承关系(type hierarchy)                F4

十六.格式化代码(reformat code)      ctrl+shift+F
十七.提示方法参数类型(Parameter Info)     ctrl+alt+/
十八.选中数行，整体往后移动        tab
十九.选中数行，整体往前移动          shift + tab
二十.重构：修改变量名与方法名(rename)     alt+shift+r
二十一.大小写转换(toggle case)       ctrl+shift+y
二十二.生成构造器/get/set/toString        alt+shift +s

二十三.查看文档说明(quick documentation)    F2
二十四.收其所有的方法()                  alt+shift+c
二十五.打开所有方法(expand all)      alt+shift+x
二十六.打开代码所在硬盘文件夹(show in explorer)    ctrl+shift+x
二十七.生成try-catch等(surround WITH)       alt+shift+f
二十八.局部变量抽取为成员变量(INTRODUCE field)   alt+shift+f
二十九.查找/替换(当前)/(全局)  ctrl+f/h
三十.查找文件                     double shift
三十一.查看类的继承结构图(show UML Diagram)         ctrl+ shift+u
三十二.查看方法的多层重写结构(method hierarchy)   ctrl+alt+h
三十三.添加到收藏(add to favorites)    ctrl+alt+f
三十三.抽取方法(Extract Method)              alt+shift+m
三十四.打开最近修改的文件(Recently Files)    ctrl+E
三十五.关闭当前打开的代码栏(close)         ctrl+w

三十六.关闭打开的所有代码栏(close all)  ctrl+shift+w
三十七.快速搜索类中的错误(next highlighted error)     ctrl+shift+q
三十八.选择要粘贴的内容(Show in Explorer)    ctrl+shift+v
三十九.查找方法在哪里被调用(Call Hierarchy)    ctrl+shift+h
 */
public class HelloWorld {

    private static final int INITIAL_SIZE = 10;


    public static void main(String[] args) {

        System.out.println("helloWorld!!!");
        System.out.println("helloWorld!!!");
        System.out.println("helloWorld!!!");

        ArrayList list = new ArrayList();
        ArrayList list1 = null;

        new Date();

        list.add(0, 123);
    }

    public static void method() {
    //FileInputStream fis = new FileInputStream("hello.txt");

    }
}
