package com.kitri.visitor.service;

import java.util.List;

import com.kitri.visitor.vo.VisitorVO;

public interface VisitorService {
	
	//���ۼ�
	public int visitorRegist(VisitorVO vo);
	//�۸��
	public List<VisitorVO> visitorList();
	//�ۼ���
	public String visitorUpdate(VisitorVO vo);
	//�ۻ���
	public String visitorDelete(int vNo, String vPwd);
	
}

