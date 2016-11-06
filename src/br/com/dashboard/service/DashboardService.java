package br.com.dashboard.service;

import java.util.ArrayList;
import java.util.List;

import br.com.dashboard.dao.DashboardDAO;
import br.com.dashboard.model.Course;
import br.com.dashboard.model.KeyValue;

public class DashboardService {

	private static final List<KeyValue> pieDataList2;
	
	static {
		pieDataList2 = new ArrayList<KeyValue>();
		pieDataList2.add(new KeyValue("Flavio", "5"));
		pieDataList2.add(new KeyValue("Lauro", "9"));
		pieDataList2.add(new KeyValue("Francisco", "3"));
	}

	public static List<KeyValue> getPieDataList() {
		List<KeyValue> pieDataList = new ArrayList<KeyValue>();
		pieDataList.add(new KeyValue("C�lculo Num�rico", "5"));
		pieDataList.add(new KeyValue("Probabilidade e Estat�stica", "6"));
		pieDataList.add(new KeyValue("T�picos de Arquitetura", "7"));
		return pieDataList;
	}
	
	public static List<KeyValue> getPieDataList2() {
		return pieDataList2;
	}
	
	public static void main(String[] args) {
		
		DashboardDAO dao = new DashboardDAO();
		
		List<Course> listCourses = dao.listCourses();
		
		for (int i = 0; i < listCourses.size(); i++) {
			System.out.println(listCourses.get(i).getFullName());		
		}
	}
}