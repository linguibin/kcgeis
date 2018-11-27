package com.kcgeis.service;

import com.kcgeis.pojo.TbUsers;

import java.util.List;

public interface MainService {

	public List<TbUsers> selUserList();

	public List<TbUsers> selUsersToday();

	public List<TbUsers> selUsersYestoday();
	
	public List<TbUsers> selUsersYearWeek();
	
	public List<TbUsers> selUsersMonth();

	public int seUserCountBygender(int i);
}
