<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 分页部分开始 -->
		<div style="width: 100%;text-align: right;">
			共${pageTool1.totalCount}条记录&nbsp;&nbsp; ${pageTool1.currentPageNo}/${pageTool1.totalPageCount}页
				<a href="?currentPageNo=1&pageSize=${pageTool1.pageSize}">首页</a>
				<a href="?currentPageNo=${pageTool1.prePage}&pageSize=${pageTool1.pageSize}">上一页</a>
				<a href="?currentPageNo=${pageTool1.nextPage}&pageSize=${pageTool1.pageSize}">下一页</a>
				<a href="?currentPageNo=${pageTool1.totalPageCount}&pageSize=${pageTool1.pageSize}">最后一页</a>
			<span class="page-go-form"><label>跳转至</label> 
			<input type="number" style="width:40px" name="inputPage" id="inputPage" class="page-key">页
				<button type="button" class="page-btn"
					onclick="pageTo()">GO</button>
			</span>
			&nbsp;&nbsp;&nbsp;&nbsp;
		</div>
		<script type="text/javascript">
		   function pageLink(page){			   
			   location.href = "?currentPageNo=" + page+"&pageSize=${pageTool1.pageSize}";
		   }
		
		   function pageTo(){
			   var page=document.getElementById("inputPage").value;
			   var maxPage=${pageTool.totalPageCount};
			   if(isNaN(page)){
				   alert("请输入一个数字.");
			   }else{
				   if (page==undefined||page=="") {
					   page=${pageTool.currentPageNo};
				   }
				   var realPage=parseInt(page);
				   if(parseInt(page)<=0){
					   realPage=1;
				   }
				   if (parseInt(page)>parseInt(maxPage)) {
					   realPage=maxPage;
					}
					location.href = "?currentPageNo=" + realPage+"&pageSize=${pageTool1.pageSize}";
				}
			}
		</script>
	<!-- 分页部分 结束-->