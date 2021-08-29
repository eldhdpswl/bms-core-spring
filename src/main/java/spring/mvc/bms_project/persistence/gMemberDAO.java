package spring.mvc.bms_project.persistence;

import java.util.Map;

import spring.mvc.bms_project.vo.gMemberVO;

public interface gMemberDAO {
	//중복확인체크
	public int idCheck(String strId);
	
	//회원가입
	public int insertMember(gMemberVO vo);
	
	//로그인 처리
	//public int check(String strId, String strPwd);
	public int pwdCheck(Map<String, Object> map);
	
	
	//회원탈퇴 처리
	public int memberDelete(String strId);
	
	//회원정보 상세페이지
	public gMemberVO getMemberInfo(String strId);
	
	//회원정보 수정
	public int updateMember(gMemberVO vo);
	
	
	
	
	
}
