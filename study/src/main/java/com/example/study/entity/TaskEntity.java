package com.example.study.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class TaskEntity {

	/** userId */
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TaskStatus taskStatus;
	@Column(nullable = false)
	private String taskName;
	@Column(nullable = false)
	private String priority;
	@Column(nullable = false)
	private Date deadline;

	@ManyToOne
	@JoinColumn(name = "ownerMenberId")
    private MemberEntity ownerMenber;
	
}
