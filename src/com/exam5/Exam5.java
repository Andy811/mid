package com.exam5;

import java.util.Scanner;

public class Exam5 {
	/*
	 * 第五題 郵局便利箱 40分 假設郵局有兩種便利箱: Box5: 長23，寬14，高13 (cm) Box3: 長39.5，寬27.5，高23
	 * (cm) 1. 請利用物件導向的類別設計這兩個類別，並在這兩個類別中設計方法: public boolean validate(float
	 * length, float width, int height) {
	 * 
	 * } 並在這方法中設計會回傳(boolean)該箱子是否能容納傳入的長、寬、高的物體。
	 * 
	 * 2. 在本程式的main方法中設計讓使用者輸入他想寄送物件的長寬高，並 利用Box5與Box3兩個類別完成以下的設計: Please enter
	 * object's length: 15 Please enter object's width: 18 Please enter object's
	 * height: 10 Box3 或 Please enter object's length: 20 Please enter object's
	 * width: 11 Please enter object's height: 9 Box5 ● 判斷時未使用Box3與Box5類別 無分數
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter object's length: ");
		float length = scanner.nextInt();
		System.out.println("Please enter object's width: ");
		float width = scanner.nextInt();
		System.out.println("Please enter object's height: ");
		int height = scanner.nextInt();

		Box5 b5 = new Box5();
		Box3 b3 = new Box3();
	
		if (b5.validate(length, width, height)) {
			System.out.println("Box5");
		} else if ( b3.validate(length, width, height)) {
			System.out.println("Box3");
		}

	}

}
