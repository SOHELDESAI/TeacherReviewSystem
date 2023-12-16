package org.cdac.rating;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.cdac.teacher.Teacher;

public class RatingCounter {
    LinkedList<Teacher> teacherList = new LinkedList<Teacher>();

    public boolean isAddTeacher(Teacher teacher) {
        boolean b = teacherList.add(teacher);
        return b;
    }

    public void rateToTeacher(int rating, String name, int id, String textReview) {
        boolean flag = false;
        ArrayList rat = new ArrayList();
        ArrayList review = new ArrayList();
        for (Teacher teacher : teacherList) {


            if (teacher.getName().equals(name)) {
                rat.add(rating);
                review.add(textReview);
            }
            teacher.setRating(rat);
            teacher.setTextreview(review);
        }
    }

    public void viewAllRating() {
        for (Object obj : teacherList) {
            Teacher t = (Teacher) obj;
            System.out.println(t.getId() + "\t" + t.getName() + "\t" + t.getRating());
        }
        //}
        //public void viewAllRating() {
        // TODO Auto-generated method stub

        //}
    }

    public void viewPositiveRating() {
        //String reviews[] = {"Good","Excellent","Better"};
        for (Object obj : teacherList) {
            Teacher t = (Teacher) obj;
            ArrayList reviewList = t.getTextreview();
            Iterator i = reviewList.iterator();
            while (i.hasNext()) {
                String review = (String) i.next();
                System.out.println("View Positive Rating : ");
                if (review.equals("Good") || review.equals("Excellent") || review.equals("Better")) {
                    System.out.println(review);
                }
            }
        }
    }

}
