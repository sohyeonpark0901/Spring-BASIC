package com.java.member.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.member.dto.MemberDto;


@Component
public class MemberDaoImp implements MemberDao {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public int memberinsert(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert("member_insert",memberDto);
	}

	@Override
	public String memberidCheck(String id) {
		
		return sqlSessionTemplate.selectOne("member_id",id);
	}

	@Override
	public String loginOk(String id, String password) {
		Map<String,String> map = new HashMap<String, String>();
		map.put("id", String.valueOf(id));
		map.put("password", String.valueOf(password));
		return sqlSessionTemplate.selectOne("member_select_login",map);
	}
	@Override
	public MemberDto memberUpdate(String id) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne("member_select",id);
	}

	@Override
	public int deleteOk(String id, String password) {
		Map<String,String> map = new HashMap<String, String>();
		map.put("id", String.valueOf(id));
		map.put("password", String.valueOf(password));
		return sqlSessionTemplate.delete("member_delete",map);
	}

	@Override
	public int memberUpdateOk(MemberDto memberDto) {
		
		return sqlSessionTemplate.update("member_update",memberDto);
	}
	
	
	
	
}
