package com.example.demoEntities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@NoArgsConstructor
@Slf4j
public class Ordering {
	private int numberOrder;
	private String note;
	private Table table;



	public Ordering(int numberOrder, String note, Table table) {

		this.numberOrder = numberOrder;
		this.note = note;
		this.table = table;
	}

	@Override
	public String toString() {
		return "Order [number Order=" + numberOrder + ", note=" + note + ", table=" + table + "]";
	}

}
