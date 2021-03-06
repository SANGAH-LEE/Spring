package com.job.user.review.service;

import java.util.List;


public interface ReviewUserService {
	/*리뷰리스트*/
	/*-기업정보*/
	public ReviewUserVO reviewBizInfo(ReviewUserVO reviewUserVO);
	/*-기업리뷰*/
	public List<ReviewUserVO> reviewSelectList1(ReviewUserVO reviewUserVO);
	public int total1(String bsmno);
	/*-기업연봉*/  
	public List<ReviewUserVO> reviewSelectList2(ReviewUserVO reviewUserVO);
	public int total2(String bsmno);
	public int reviewSalChk(ReviewUserVO reviewUserVO);
	public int salChkUpdate(ReviewUserVO reviewUserVO);
	/*-면접후기*/  
	public List<ReviewUserVO> reviewSelectList3(ReviewUserVO reviewUserVO);
	public int total3(String bsmno);
	
	/*글작성*/
	public int Write(ReviewUserVO reviewUserVO);	
	public int mWrite(ReviewUserVO reviewUserVO);
	public int sWrite(ReviewUserVO reviewUserVO);
	
	/*리뷰상세보기*/
	public ReviewUserVO reviewDetailForm(int rnum);	  
	public ReviewUserVO mreviewDetailForm(int rnum);
	public ReviewUserVO salDetailForm(int rnum);

	/*리뷰 수정*/
	public int reviewUpdate(ReviewUserVO reviewUserVO);
	public int salUpdate(ReviewUserVO reviewUserVO);
	public int mreviewUpdate(ReviewUserVO reviewUserVO);

	/*리뷰 삭제*/
	public int Delete(int rnum);
	
		
}
