package com.job.user.review.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.job.user.biz.service.BizUserVO;
import com.job.user.review.service.ReviewUserService;
import com.job.user.review.service.ReviewUserVO;

@Service("reviewUserService")
public class ReviewUserServiceImpl implements ReviewUserService {
	
	@Resource(name="reviewUserDAO")
	private ReviewUserDAO reviewUserDAO;
	/*리뷰리스트*/
	public ReviewUserVO reviewBizInfo(ReviewUserVO reviewUserVO) {
		ReviewUserVO reviewBizInfo = reviewUserDAO.reviewBizInfo(reviewUserVO);
		return reviewBizInfo;
	}
	/*-기업리뷰*/
	@Override
	public List<ReviewUserVO> reviewSelectList1(ReviewUserVO reviewUserVO) {
		System.out.println("StartServiceImpl");
		return reviewUserDAO.reviewSelectList1(reviewUserVO);
	}
	@Override
	public int total1(String bsmno) {
		System.out.println("ReviewUserServiceImpl total1");
		return reviewUserDAO.total1(bsmno);
	}
	
	/*-기업연봉*/ 
	@Override
	public List<ReviewUserVO> reviewSelectList2(ReviewUserVO reviewUserVO) {
		System.out.println("StartServiceImpl" + reviewUserVO.getSal());
		return reviewUserDAO.reviewSelectList2(reviewUserVO);
	}
	@Override
	public int total2(String bsmno) {
		return reviewUserDAO.total2(bsmno);
	}
	
	/*-면접후기*/ 
	@Override
	public List<ReviewUserVO> reviewSelectList3(ReviewUserVO reviewUserVO) {
		System.out.println("StartServiceImpl");
		return reviewUserDAO.reviewSelectList3(reviewUserVO);
	}
	@Override
	public int total3(String bsmno) {
		return reviewUserDAO.total3(bsmno);
	}
	@Override
	public int reviewSalChk(ReviewUserVO reviewUserVO) {
		return reviewUserDAO.reviewSalChk(reviewUserVO);
	}
	@Override
	public int salChkUpdate(ReviewUserVO reviewUserVO) {
		return reviewUserDAO.salChkUpdate(reviewUserVO);
	}
	/*글작성*/
	@Override
	public int Write(ReviewUserVO reviewUserVO) {
		return reviewUserDAO.Write(reviewUserVO);
	}
	@Override
	public int mWrite(ReviewUserVO reviewUserVO) {
		return reviewUserDAO.mWrite(reviewUserVO);
	}
	@Override
	public int sWrite(ReviewUserVO reviewUserVO) {
		return reviewUserDAO.sWrite(reviewUserVO);
	}
	
	/*리뷰상세보기*/
	@Override
	public ReviewUserVO reviewDetailForm(int rnum) {
		return reviewUserDAO.reviewDetailForm(rnum);
	}
	@Override
	public ReviewUserVO mreviewDetailForm(int rnum) {
		return reviewUserDAO.mreviewDetailForm(rnum);
	}
	@Override
	public ReviewUserVO salDetailForm(int rnum) {
		return reviewUserDAO.salDetailForm(rnum);
	}
	
	/*리뷰 수정*/
	@Override
	public int reviewUpdate(ReviewUserVO reviewUserVO) {
		return reviewUserDAO.Update(reviewUserVO);
	}
	@Override
	public int salUpdate(ReviewUserVO reviewUserVO) {
		return reviewUserDAO.sUpdate(reviewUserVO);
	}
	@Override
	public int mreviewUpdate(ReviewUserVO reviewUserVO) {
		return reviewUserDAO.mUpdate(reviewUserVO);
	}

	/*리뷰 삭제*/
	@Override
	public int Delete(int rnum) {
		return reviewUserDAO.Delete(rnum);
	}
	
}
