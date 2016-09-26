package br.com.dashboard.data;

import java.util.ArrayList;
import java.util.List;

import br.com.dashboard.model.KeyValue;

public class PieChartData {

	private static final List<KeyValue> pieDataList;
	private static final List<KeyValue> pieDataList2;

	static {
		pieDataList = new ArrayList<KeyValue>();
		pieDataList.add(new KeyValue("Cálculo Numérico", "5"));
		pieDataList.add(new KeyValue("Probabilidade e Estatística", "6"));
		pieDataList.add(new KeyValue("Tópicos de Arquitetura", "7"));
	}
	
	static {
		pieDataList2 = new ArrayList<KeyValue>();
		pieDataList2.add(new KeyValue("Flavio", "5"));
		pieDataList2.add(new KeyValue("Lauro", "9"));
		pieDataList2.add(new KeyValue("Francisco", "3"));
	}

	public static List<KeyValue> getPieDataList() {
		return pieDataList;
	}
	
	public static List<KeyValue> getPieDataList2() {
		return pieDataList2;
	}
}