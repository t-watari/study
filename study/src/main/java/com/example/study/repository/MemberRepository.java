package com.example.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.study.entity.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, Long>{

	public MemberEntity findByUsername(String username);
}
