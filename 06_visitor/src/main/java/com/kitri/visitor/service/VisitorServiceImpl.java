package com.kitri.visitor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitri.visitor.dao.VisitorDao;
import com.kitri.visitor.vo.VisitorVO;

//controller���� resource�� ���� DI �� �� �ְ� Bean��ü ���
@Service
public class VisitorServiceImpl implements VisitorService{
	
	//Dao��ü DI
	@Autowired
	VisitorDao visitorDao;
	
	@Override
	public int visitorRegist(VisitorVO vo) {
		
		return visitorDao.visitorRegist(vo);
	}

	@Override
	public List<VisitorVO> visitorList() {
		
		return visitorDao.visitorList();
	}

	@Override
	public String visitorUpdate(VisitorVO vo) {
		//�۹�ȣ�� ��й�ȣ ��Ī ��� ��ȯ
		int vNo = visitorDao.visitorPasswordCheck(vo);
		
		String msg = null;
		//��Ī�� ���� ������
		if (vNo == 0) {
			msg = "��й�ȣ ����";
		} else {
			//��Ī�� �Ǿ�����
			
			//������Ʈ ���ۿ��� ��ȯ
			int updateCheck = visitorDao.visitorUpdate(vo);
			
			//������Ʈ ���� ������ ���
			if (updateCheck == 0) {
				msg = "���� ����";
			} else {
				//������Ʈ ���� ����
				msg = "���� �Ϸ�";
			}
		}
		return msg;
	}

	@Override
	public String visitorDelete(int vNo, String vPwd) {
		
		VisitorVO vo = new VisitorVO();
		
		vo.setvNo(vNo);
		vo.setvPwd(vPwd);
		
		int result = visitorDao.visitorPasswordCheck(vo);
		
		vo = null;
		String msg =null;
		
		if (result == 0) {
			msg="��й�ȣ ����";
		}else {
			int deleteCheck = visitorDao.visitorDelete(vNo, vPwd);
			
			if (deleteCheck==0) {
				msg="��������";
			}else {
				msg="��������";
			}
		}
		
		return msg;
	}

}
