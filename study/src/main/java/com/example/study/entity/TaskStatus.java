package com.example.study.entity;

/**
 * タスク状態
 * @author watari
 */
public enum TaskStatus {
	NEW(0)
	,WORK(10)
	,DONE(90);
	
	private int code;
	
	TaskStatus(int code) {
        this.code = code;
    }
	public int getCode(){
		return this.code;
	}
	
}
