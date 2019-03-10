package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author Mr. Xie Jintao
 * @create 2019-03-10-18:10
 * @date 2019/3/10 - 18:10
 * <p>
 * 1,IDEA中代码模板所处的位置：settings - Editor - Live Templates/Postfix Completion
 * 2,常用的模板
 */
public class TemplatesTest {

    //模板六：prsf:可生成private static final
    private static final Customer CUST =new Customer();

    //变形：psf

    //变形：psfi

    //变形：psfs

    //变形：psfs



    //模板一：psvm
    public static void main(String[] args) {


        //模板二：sout
        //变形：soutp /soutm /soutv /xxx.sout

        //模板三：fori

        //变形：iter

        //变形：itar

        //模板四：list.for

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        //变形：list.fori


        //变形：list.forr 倒序遍历
    }

    public void method() {
        System.out.println("TemplatesTest.method");
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        //模板五：ifn

    }
    //变形：inn

    //变形：xxx.nn/xxx.null

}
