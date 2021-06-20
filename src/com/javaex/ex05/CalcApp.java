package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	Add add = new Add();
    	Div div = new Div();
    	Mul mul = new Mul();
    	Sub sub = new Sub();
    	
    		int iNum01 = 0;
    		int iNum02 = 0;
    		
    		while(true) {
    			
    			System.out.println(">> ");
    			
    			String sCal = sc.nextLine();
    			
    			if(("/q").equals(sCal)) {
    				
    				System.out.println("종료합니다.");
    				break;
    				
    			} else {
    				
    				String[] sCalArray = sCal.split(" ");
    				iNum01 = Integer.parseInt(sCalArray[0]);
    				iNum02 = Integer.parseInt(sCalArray[2]);
    				
    				switch (sCalArray[1]) {
    				
    				case "+":
    					add.setValue(iNum01, iNum02);
    					System.out.println(">> " + add.calculate());
    					break;
    				
    				case "-":
    					sub.setValue(iNum01, iNum02);
    					System.out.println(">> " + sub.calculate());
    					break;
    				
    				case "*":
    					mul.setValue(iNum01, iNum02);
    					System.out.println(">> " + mul.calculate());
    					break;
    				
    				case "/":
    					
    					if(iNum02 != 0) {
    						
    						div.setValue(iNum01, iNum02);
    						System.out.println(">> " + div.calculate());
    						
    						
    					} else {
    						System.out.println("0으로는 나눌 수 없습니다.");
    					}
    				
    					break;
    				
    				default: System.out.println("알 수 없는 연산입니다.");
    				break;
    				
    				
    				}
    				
    				
    				
    			}
    			
    			
    			
    			
    			
    			
    		}
    	

    			
    			
    			
    			
    	sc.close();
    			
    }
}
