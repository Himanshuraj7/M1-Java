package com.cpg.lab10.exercise1;

import java.lang.Math;

public class LamdaXPowerYmain {

        public static void main(String[] args) {
        	LamdaXPowerY obj=new LamdaXPowerY();
            obj.getInput();
            
            returnable obj2=(x,y)->(Math.pow(x, y));
            System.out.println(obj2.sqaureInteger(obj.num1, obj.num2));

        }
}