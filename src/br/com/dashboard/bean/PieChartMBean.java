package br.com.dashboard.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.dashboard.data.PieChartData;
import br.com.dashboard.model.KeyValue;

@ManagedBean
//@ViewScoped
public class PieChartMBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String pieChartData;
	private String pieChartData2;
	
	private List<KeyValue> pieDataList;
	private List<KeyValue> pieDataList2;

	public PieChartMBean() {
		this.pieDataList = PieChartData.getPieDataList();
		this.pieDataList2 = PieChartData.getPieDataList2();
	}

	public String getPieChartData() {
		if (pieChartData == null || pieChartData.trim().length() <= 0) {
			populateData();
		}
		return pieChartData;
	}
	
	public String getPieChartData2() {
		if (pieChartData2 == null || pieChartData2.trim().length() <= 0) {
			populateData2();
		}
		return pieChartData2;
	}

	private void populateData() {
		StringBuilder stringBuilder = new StringBuilder();
		for (KeyValue pieData : pieDataList) {
			stringBuilder.append("[");
			stringBuilder.append("'");
			stringBuilder.append(pieData.getKey());
			stringBuilder.append("'");
			stringBuilder.append(",");
			stringBuilder.append(pieData.getValue());
			stringBuilder.append("]");
			stringBuilder.append(",");
		}
		pieChartData = stringBuilder.toString().substring(0, stringBuilder.toString().length() - 1);
	}
	
	private void populateData2() {
		StringBuilder stringBuilder = new StringBuilder();
		for (KeyValue pieData : pieDataList2) {
			stringBuilder.append("[");
			stringBuilder.append("'");
			stringBuilder.append(pieData.getKey());
			stringBuilder.append("'");
			stringBuilder.append(",");
			stringBuilder.append(pieData.getValue());
			stringBuilder.append("]");
			stringBuilder.append(",");
		}
		pieChartData2 = stringBuilder.toString().substring(0, stringBuilder.toString().length() - 1);
	}
}
