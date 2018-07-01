package com.byshj.common.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 分页模型
 * @author SXJ
 *
 * @param <T>
 */
public class Page<T> implements Serializable{

	private static final long serialVersionUID = -2083558708915192567L;
	
	private int pageNo;//当前的页数
	private int pageSize;//每页显示多少数据
	private long totalElements;//代表查询表中的总数据条数
	private int totalPage;//总共有多少页
	private List<T> items;//根据查询条件查询出的数据内容
	
	public Page() {	}
	
	public Page(int pageNo, int pageSize) {
		this.pageNo = pageNo;
		this.pageSize = pageSize;
	}



	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public long getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}
	public int getTotalPage() {
		return (int)(((totalElements-1)+pageSize)/pageSize);//根据总数据量和每页显示的数据条数，来算出总共会有多少页
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = (int)(((totalElements-1)+pageSize)/pageSize);
	}
	
	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "Page [pageNo=" + pageNo + ", pageSize=" + pageSize + ", totalElements=" + totalElements + ", totalPage="
				+ totalPage + ", item=" + items + "]";
	}
	
	
	

}
