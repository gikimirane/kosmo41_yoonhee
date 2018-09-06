package com.study.jsp;

public class BPageInfo {
	
	// 총 게시물의 갯수
	int totalCount;
	// 한 페이지당 보여줄 게시물의 갯수
	int listCount = 10;
	// 총 페이지의 수
	int totalPage;
	// 현재 페이지
	int curPage;
	// 하단에 보여줄 페이지 리스트의 갯수
	int pageCount;
	// 시작 페이지
	int startPage;
	// 끝 페이지
	int endPage;
	
	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getListCount() {
		return listCount;
	}

	public void setListCount(int listCount) {
		this.listCount = listCount;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

}
