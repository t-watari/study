package com.example.study.entity;

/**
 * タスク重要度
 * @author watari
 */
public enum TaskPriority {
	LOW(10)
	,MIDIUM(10)
	,HIGHT(20);
	
	private int code;
	
	TaskPriority(int code) {
        this.code = code;
    }
	public int getCode(){
		return this.code;
	}
}
