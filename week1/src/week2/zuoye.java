package week2;

import java.util.Scanner;

public class zuoye {
      public static void main(String args[]) {
    	  
    	  
    	  
    	  
    	  //定义变量
    	  int box,bigBox,total;
    	  
    	      	      
    	  //为变量赋值
    	  Scanner scan=new Scanner(System.in);
    	  //输入数据
    	     	  
    	  System.out.println("请输入饼干数：");
    	  total=scan.nextInt();
    	  
    	
    	  //数据处理
    	   box=total/24;
    	  bigBox=box/75;
    	  
    	  
    	  //输出
    	    System.out.println("小盒子的个数："+box);
    	  System.out.println("大盒子的个数："+bigBox);
    	  
    	  
    	  
    	  
    	  
      }
}
