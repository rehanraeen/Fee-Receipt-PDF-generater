package com.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import com.bean.FeeReceiptBean;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class FeeImpl implements FeeInterface {

	@Override
	public void feePayment() {

			Scanner src = new Scanner(System.in);
			FeeReceiptBean r = new FeeReceiptBean();

			System.out.println("Ricipt No :");
			r.setReciptNo(src.nextInt());

			System.out.println("Student Name :");
			r.setStudentName(src.next());

			System.out.println("Mobile No :");
			r.setMobileNo(src.nextLong());

			System.out.println("Date :");
			r.setDate(src.next());

			System.out.println("course :");
			r.setCourse(src.next());

			if (r.getCourse().equals("java")) {
				r.setCourseFee(30000);
			}

			else if (r.getCourse().equals("c++")) {
				r.setCourseFee(25000);

			}

			if (r.getCourse().equals("java") || r.getCourse().equals("c++")) {

				System.out.println("Paid Fee :");
				r.setPaidFee(src.nextFloat());

			}
			r.setBalanceFee(r.getCourseFee() - r.getPaidFee());

			if (r.getPaidFee() != 0 && r.getPaidFee() <= r.getCourseFee()) {

				try {
					String a = "C:\\Users\\Admin\\Desktop\\rehan html\\Fee.pdf";

					Document doc = new Document();
					PdfWriter.getInstance(doc, new FileOutputStream(a));

					doc.open();

					Paragraph para = new Paragraph("  TECHSKILLS IT SOLUTION  ");
					Paragraph par = new Paragraph("     FEE RECEIPT    ");
					Paragraph paa = new Paragraph("");
					Paragraph pra = new Paragraph("Recipt No        :" + r.getReciptNo());
					Paragraph para1 = new Paragraph("Student Name   :" + r.getStudentName());
					Paragraph para2 = new Paragraph("Mobile No      :" + r.getMobileNo());
					Paragraph para3 = new Paragraph("Date           :" + r.getDate());
					Paragraph para0 = new Paragraph("Course         :" + r.getCourse());
					Paragraph para5 = new Paragraph("Course Fee     :" + r.getCourseFee());
					Paragraph para6 = new Paragraph("Paid Fee       :" + r.getPaidFee());
					Paragraph para7 = new Paragraph("Balance Fee    :" + r.getBalanceFee());

					doc.add(para);
					doc.add(par);
					doc.add(paa);
					doc.add(pra);
					doc.add(para1);
					doc.add(para2);
					doc.add(para3);
					doc.add(para0);
					doc.add(para5);
					doc.add(para6);
					doc.add(para7);

					doc.close();

					// System.out.println("ireo ");
				} catch (DocumentException | FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				System.out.println("Payment Receipt has been generated");
			} else {
				System.out.println("Try Again");
			}
			
			System.out.println("Thank You");

	}

	@Override
	public void viewBalanceFee() {

	}

}
