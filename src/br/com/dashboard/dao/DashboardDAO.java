package br.com.dashboard.dao;

import java.util.List;

import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import br.com.dashboard.model.Course;

public class DashboardDAO {
	
	private static final String DB_URL = "jdbc:mysql://localhost:3306/moodle";
	private static final String USER = "root";
	private static final String PASS = "root";
	
	private static final String LIST_ALL_COURSES = "SELECT id, category, fullname FROM mdl_course";
	
	Sql2o sql2o = new Sql2o(DB_URL, USER, PASS);

	public List<Course> listCourses(){
		List<Course> courses = null;
		try(Connection con = sql2o.open()) {
		    courses = con.createQuery(LIST_ALL_COURSES)
		    		  .executeAndFetch(Course.class);    
		   return courses;
		}catch (Sql2oException e) {
			System.out.println("Error occured when list courses " + e.getMessage());
		}
		return courses;
	}
	
}
