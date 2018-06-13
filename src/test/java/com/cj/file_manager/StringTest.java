package com.cj.file_manager;


import javassist.compiler.ast.FieldDecl;
import org.junit.Test;

import java.lang.reflect.Field;

public class StringTest {

    @Test
    public void name() {
    }

    @Test
    public void stringTest1(){
        String str = "    ";

        System.out.print(str.length());


    }  @Test
    public void stringTest2(){
        String str = "    ";

        System.out.print(str.length());


    }
    @Test
    public void stringTest3() throws NoSuchFieldException, IllegalAccessException {
        Integer a = 1;
        Integer b = 2;
        System.out.println(a+"------------"+b);
        swap(a,b);
        System.out.println(a+"------------"+b);

    }
    public static void swap(Integer number1,Integer numebr2) throws NoSuchFieldException, IllegalAccessException {
        int tempNumber = number1.intValue();

        Field declaredField = Integer.class.getDeclaredField("value");

        declaredField.setAccessible(true);

        declaredField.setInt(number1,numebr2);

        declaredField.setInt(numebr2,tempNumber);

    }


}
