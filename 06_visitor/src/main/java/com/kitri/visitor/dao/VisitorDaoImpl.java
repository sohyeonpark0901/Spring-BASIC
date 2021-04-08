package com.kitri.visitor.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kitri.visitor.vo.VisitorVO;

@Repository
public class VisitorDaoImpl implements VisitorDao{

	@Inject
	SqlSessionTemplate sqlSession;
	
	//±€¿€º∫
	@Override
	public int visitorRegist(VisitorVO vo) {
		// TODO Auto-generated method stub
		return sqlSession.insert("visitor.visitorRegist", vo);
	}

	@Override
	public List<VisitorVO> visitorList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("visitor.visitorList");
	}

	@Override
	public int visitorUpdate(VisitorVO vo) {
		// TODO Auto-generated method stub
		return sqlSession.update("visitor.visitorUpdate", vo);
	}

	@Override
	public int visitorDelete(int vNo, String vPwd) {
		Map<String,String> map = new HashMap<String, String>();
		map.put("vNo", String.valueOf(vNo));
		map.put("vPwd",vPwd);
		
		return sqlSession.delete("visitor.visitorDelete",map);
		
	}

	@Override
	public int visitorPasswordCheck(VisitorVO vo) {
		
		return sqlSession.selectOne("visitor.visitorPasswordCheck", vo);
	}

}
