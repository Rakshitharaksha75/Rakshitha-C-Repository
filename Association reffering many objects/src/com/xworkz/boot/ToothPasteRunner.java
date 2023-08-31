package com.xworkz.boot;

import com.xworkz.app.Company;
import com.xworkz.app.ToothPaste;

public class ToothPasteRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("Invoking main in Toothpaste Runner");
				
				String name="Vedashakthi";
				String brand="Colgate";
				String company="Colgate-Palmolive Company";
				String[] ingredients= {"Salt", "Lavanga", "Pudina satva", "Garlic", "Karpura"};
				
				String cname="Colgate";
				String ceo="Noelwallac";
				String originCountry="United States";
				
				ToothPaste toothpaste=new ToothPaste(cname, brand, company, ingredients);
				toothpaste.printInfo();
				Company company1=new Company(name, ceo, originCountry);
				company1.printInfo();
				
						
		 	}

	}

