package com.controller;

import java.util.Scanner;

import com.dao.FeeImpl;

public class AppController {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		FeeImpl fe = new FeeImpl();

		System.out.println("--------Welcome To Fee Payment-------");

		System.out.println("");
		while (true) {
			System.out.println("1. Payment");
		System.out.println("2. View All");
		System.out.println("3. Exit");

		int no = sc.nextInt();

			if (no == 1) {
				fe.feePayment();
			} else if (no == 2) {

			} else if (no == 3) {
				break;
			}

			else {
				System.out.println("Please chose correct option");
			}

		}
	}
}
