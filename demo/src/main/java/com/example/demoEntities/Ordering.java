package com.example.demoEntities;

import java.time.LocalTime;

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
	private int numberPeople;
	private LocalTime time;


	public Ordering(int numberOrder, String note, Table table, int numberPeople, LocalTime time) {

		this.numberOrder = numberOrder;
		this.note = note;
		this.table = table;
		this.numberPeople = numberPeople;
		this.time = time;
	}


	@Override
	public String toString() {
		return "Ordering [Number=" + numberOrder + ", Note=" + note + ", Table=" + table + ", Number People="
				+ numberPeople + ", Time=" + time + "]";
	}


}
