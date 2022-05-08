package com.greatlearning.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.greatlearning.models.Floor;
import com.greatlearning.services.DistinctFloorServices;



public class DistinctFloorMain {
	public static void main(String[] args) {
		
		int totalFloorGiven ;
		Scanner sc =new Scanner(System.in);

		
		System.out.println("Enter the total no of floors in the building");
		totalFloorGiven = sc.nextInt();
		ArrayList<Floor> list = new ArrayList<Floor>(totalFloorGiven);
		
		// getting the user input for floor size on each day
		for(int i =0; i < totalFloorGiven; i++) 
		{
			System.out.println("Enter the floor size given on day :" +(i+1));		
			Floor f = new Floor();
			f.size = sc.nextInt();
			f.day = i+1;		
			list.add(i,f);		
		}
		DistinctFloorServices df = new DistinctFloorServices();
		df.sortFloor(list);
		sc.close();

	}


}
