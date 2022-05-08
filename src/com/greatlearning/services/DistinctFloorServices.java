package com.greatlearning.services;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import com.greatlearning.models.Floor;


public class DistinctFloorServices {
	
		
		public void sortFloor(ArrayList<Floor> list)
		{
			
			Queue<Floor> que = new LinkedList<Floor>();
			
			
			addElementToQueue(que, list);
			
			
			int position =0;
			while(!que.isEmpty()) 
			{
				Floor f = que.poll();
				
				int floorDay = f.day;
				if(floorDay < position) 
				{
					System.out.print(f.size +" ");				
				}
				else if(floorDay > position)
				{
					int j;
					for( j = position; j< floorDay; j++)
					{
						System.out.println();
						System.out.println("day "+ (j+1) +":");
					}
					System.out.print(f.size + " ");
					position = j;
				}	
			}
						
		}


		
		public void addElementToQueue(Queue<Floor> que, ArrayList<Floor> list)
		{
			ArrayList<Floor> tempList = new ArrayList<Floor>(list.size());
			tempList.addAll(list);
			while(!tempList.isEmpty())
			{
				int max =0;
				Floor maxFloor = new Floor();
				int index = 0;
				for(int i=0; i < tempList.size();i++)
				{
					Floor var = tempList.get(i);
					if(var.size > max)
					{
						index = i;
						max = var.size;
						maxFloor.day =var.day;
						maxFloor.size=var.size;
	
					}				
				}
				que.add(maxFloor);
				tempList.remove(index);
			}	
		}


}
