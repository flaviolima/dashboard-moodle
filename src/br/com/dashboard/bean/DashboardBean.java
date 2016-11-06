package br.com.dashboard.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.dashboard.model.KeyValue;
import br.com.dashboard.service.DashboardService;

@ManagedBean
//@ViewScoped
public class DashboardBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String chartDoneNotDoneAct;
	private String chartTimeElapsedAct;
	private String chartGrades;	
	private List<KeyValue> chartDoneNotDoneActList;
	private List<KeyValue> chartTimeElapsedActList;
	private List<KeyValue> chartGradesList;

	public DashboardBean() {
		this.chartDoneNotDoneActList = DashboardService.getPieDataList();
		this.chartTimeElapsedActList = DashboardService.getPieDataList2();
		this.chartGradesList = DashboardService.getPieDataList2();
	}

	public String getChartDoneNotDoneAct() {
		if (chartDoneNotDoneAct == null || chartDoneNotDoneAct.trim().length() <= 0) {
			populateData(chartDoneNotDoneAct, chartDoneNotDoneActList);
		}
		return chartDoneNotDoneAct;
	}
	
	public String getChartTimeElapsedAct() {
		if (chartTimeElapsedAct == null || chartTimeElapsedAct.trim().length() <= 0) {
			populateData(chartTimeElapsedAct, chartTimeElapsedActList);
		}
		return chartTimeElapsedAct;
	}
	
	public String getChartGrades() {
		if (chartGrades == null || chartGrades.trim().length() <= 0) {
			populateData(chartGrades, chartGradesList);
		}
		return chartGrades;
	}

	private void populateData(String chartData, List<KeyValue> chartList) {
		StringBuilder stringBuilder = new StringBuilder();
		for (KeyValue pieData : chartList) {
			stringBuilder.append("[");
			stringBuilder.append("'");
			stringBuilder.append(pieData.getKey());
			stringBuilder.append("'");
			stringBuilder.append(",");
			stringBuilder.append(pieData.getValue());
			stringBuilder.append("]");
			stringBuilder.append(",");
		}
		chartData = stringBuilder.toString().substring(0, stringBuilder.toString().length() - 1);
	}
}
