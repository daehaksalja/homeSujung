package org.study.home.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.study.home.mapper.AttachMapper;
import org.study.home.model.AttachImageDTO;

import lombok.extern.log4j.Log4j;

@Service

public class AttachServiceImpl implements AttachService{
	@Autowired
	private AttachMapper attachMapper;
	
	
	/* 이미지 데이터 반환 */
	@Override
	public List<AttachImageDTO> getAttachList(int shipId) {

		return attachMapper.getAttachList(shipId);
	}
}
