package com.example.study.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.study.entity.MemberEntity;
import com.example.study.entity.TaskEntity;

public interface TaskRepository extends JpaRepository<TaskEntity, Long>{

	public List<TaskEntity> findByOwnerMenber(MemberEntity  ownerMenber);
}
