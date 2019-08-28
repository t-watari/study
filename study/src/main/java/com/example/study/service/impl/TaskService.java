package com.example.study.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.study.entity.MemberEntity;
import com.example.study.entity.TaskEntity;
import com.example.study.repository.TaskRepository;

@Service
public class TaskService {

	private TaskRepository taskRepository;
	
	/**
	 * 指定されたメンバー情報から、そのメンバーのタスクをすべて取得する
	 * @param ownerMenber 対象メンバー
	 * @return 指定したメンバーの保持するタスク
	 */
	public List<TaskEntity> findByOwnerMenber(MemberEntity ownerMenber){
		
		return taskRepository.findByOwnerMenber(ownerMenber);
		
	}
	
}
