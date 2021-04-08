package com.java.member.dao;

import java.util.List;

import com.java.member.dto.MemberDto;


public interface MemberDao {
	public int memberinsert(MemberDto memberDto);
	
	public String memberidCheck(String id);

	

	public String loginOk(String id, String password);

	public MemberDto memberUpdate(String id);

	public int deleteOk(String id, String password);

	public int memberUpdateOk(MemberDto memberDto);
	
	
}
