package com.taohan.online.exam.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taohan.online.exam.dao.SubjectInfoMapper;
import com.taohan.online.exam.po.SubjectInfo;
import com.taohan.online.exam.service.SubjectInfoService;



@Service
public class SubjectInfoServiceImpl implements SubjectInfoService {

	@Autowired
	private SubjectInfoMapper subjectInfoMapper;
	
	public List<SubjectInfo> getSubjects(Map<String, Object> map) {
		return subjectInfoMapper.getSubjects(map);
	}
	
	public SubjectInfo getSubjectWithId(int subjectId) {
		return subjectInfoMapper.getSubjectWithId(subjectId);
	}

	public int getSubjectTotal() {
		return subjectInfoMapper.getSubjectTotal();
	}

	public int isAddSubject(SubjectInfo subject) {
		return subjectInfoMapper.isAddSubject(subject);
	}

	public int isUpdateSubject(SubjectInfo subject) {
		return subjectInfoMapper.isUpdateSubject(subject);
	}

	public int isDelSubject(int subjectId) {
		return subjectInfoMapper.isDelSubject(subjectId);
	}

	
	public int isAddSubjects(Map<String, Object> subjects) {
		return subjectInfoMapper.isAddSubjects(subjects);
	}

}
