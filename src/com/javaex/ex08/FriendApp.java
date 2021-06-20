package com.javaex.ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구를 3명 등록해주세요");
		
		List<Friend> fList = new ArrayList<Friend>();
		
		while(true) {
			
			String line = sc.nextLine();
			
			if (line==null) {
				
				break;
				
			}
			
			String[] fInfo = line.split(" ");
			
			String name = fInfo[0];
			String hp = fInfo[1];
			String school = fInfo[2];
			
			Friend f = new Friend (name, hp, school);
			
			fList.add(f);
			
			
		}
		
		for ( int i = 0; i<fList.size(); i++) {
			
			fList.get(i).showInfo();
			
			
		}
		
		
		
		
		sc.close();

	}

}
