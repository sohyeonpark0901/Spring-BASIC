package com.kitri.visitor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitri.visitor.dao.VisitorDao;
import com.kitri.visitor.vo.VisitorVO;

//controller에서 resource를 통해 DI 할 수 있게 Bean객체 등록
@Service
public class VisitorServiceImpl implements VisitorService{
	
	//Dao객체 DI
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
		//글번호와 비밀번호 매칭 결과 반환
		int vNo = visitorDao.visitorPasswordCheck(vo);
		
		String msg = null;
		//매칭이 되지 않으면
		if (vNo == 0) {
			msg = "비밀번호 오류";
		} else {
			//매칭이 되었을때
			
			//업데이트 동작여부 반환
			int updateCheck = visitorDao.visitorUpdate(vo);
			
			//업데이트 동작 실패인 경우
			if (updateCheck == 0) {
				msg = "수정 실패";
			} else {
				//업데이트 정상 동작
				msg = "수정 완료";
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
			msg="비밀번호 오류";
		}else {
			int deleteCheck = visitorDao.visitorDelete(vNo, vPwd);
			
			if (deleteCheck==0) {
				msg="삭제실패";
			}else {
				msg="삭제성공";
			}
		}
		
		return msg;
	}

}
