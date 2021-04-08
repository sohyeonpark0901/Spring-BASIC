package com.kitri.visitor.dao;

import java.util.List;

import com.kitri.visitor.vo.VisitorVO;

public interface VisitorDao {
	
	//���ۼ�
	public int visitorRegist(VisitorVO vo);
	//�۸��
	public List<VisitorVO> visitorList();
	//�� ����
	public int visitorUpdate(VisitorVO vo);
	//�ۻ���
	public int visitorDelete(int vNo, String vPwd);
	//��й�ȣ üũ
	public int visitorPasswordCheck(VisitorVO vo);	
}
