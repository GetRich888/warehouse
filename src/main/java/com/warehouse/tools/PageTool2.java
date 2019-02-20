package com.warehouse.tools;

public class PageTool2 {
	
	//当前页码-来自于用户输入
	private int currentPageNo = 1;
	
	//大分类
	private int big;
	//总数量（表）
	private int totalCount = 0;
	
	//页面容量
	private int pageSize = 36;
	
	//总页数-totalCount/pageSize（+1）
	private int totalPageCount = 1;
	
	//下一页
	private int nextPage;
	
	//上一页
	private int prePage;
	
	
	
	public int getBig() {
		return big;
	}

	public void setBig(int big) {
		this.big = big;
	}

	public int getCurrentPageNo() {
		return currentPageNo;
	}

	public void setCurrentPageNo(int currentPageNo) {
		if(currentPageNo > 0){
			this.currentPageNo = currentPageNo;
		}else {
			this.currentPageNo=1;
		}
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		if(totalCount > 0){
			this.totalCount = totalCount;
			//设置总页数
			this.setTotalPageCountByRs();
		}
	}
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		if(pageSize > 0){
			this.pageSize = pageSize;
		}
	}

	public int getTotalPageCount() {
		return totalPageCount;
	}

	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	
	public void setTotalPageCountByRs(){
		if(this.totalCount % this.pageSize == 0){
			this.totalPageCount = this.totalCount / this.pageSize;
		}else if(this.totalCount % this.pageSize > 0){
			this.totalPageCount = this.totalCount / this.pageSize + 1;
		}else{
			this.totalPageCount = 0;
		}
	}
	public int getNextPage() {
        if(currentPageNo<totalPageCount){
            nextPage = currentPageNo+1;
        }else{
            nextPage = totalPageCount;
        }
        return nextPage;
    }
    public int getPrePage() {
        if(currentPageNo>1){
            prePage = currentPageNo-1;
        }else{
            prePage = 1;
        }
        return prePage;
    }    
}