package org.cdac.clientapp;

import org.cdac.rating.RatingCounter;
import org.cdac.teacher.Teacher;

import java.util.Scanner;
public class RatingClientApplication {

	public static void main(String[] args)
	{
		RatingCounter r = new RatingCounter();
		do {
			Scanner ch = new Scanner(System.in);
			System.out.println("7.Exit");
			System.out.println("1.Add New Teacher : ");
			System.out.println("2.Rate To Teacher : ");
			System.out.println("3.View Teacher Rating : ");
			System.out.println("4.View Positive Rating : ");
			System.out.println("5.View Negative Rating : ");
			System.out.println("6.View Average Rating : ");
			System.out.println("Enter Your Choice : ");
			int choice = ch.nextInt();
			switch(choice)
			{
			case 1:
				ch.nextLine();
				System.out.println("Enter Name of Teacher : ");
				String name = ch.nextLine();
				System.out.println("Enter ID of Teacher : ");
				int id = ch.nextInt();
				Teacher t = new Teacher();
				t.setId(1);
				t.setName(name);
				boolean b = r.isAddTeacher(t);
				if(b)
				{
					System.out.println("Teacher Added Successsfully....");
				}
				else
				{
					System.out.println("Teacher Not Added");
				}
				break;
			case 2:
				ch.nextLine();
				System.out.println("Enter the Teacher Name : ");
				name =ch.nextLine();
				System.out.println("Enter the text for review for teacher : ");
				String textReview = ch.nextLine();
				System.out.println("Enter ID of Teacher : ");
				id = ch.nextInt();
				System.out.println("Enter the Rating to Teacher : ");
				int rating = ch.nextInt();
				r.rateToTeacher(rating, name, id, textReview);
				break;
			case 3:
				r.viewAllRating();
				break;
			case 4:
				r.viewPositiveRating();
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Choice");
			}
		}while(true);

	}

}
