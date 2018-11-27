package com.kcgeis.service.impl;

import com.kcgeis.mapper.MainMapper;
import com.kcgeis.mapper.TbUsersMapper;
import com.kcgeis.pojo.TbUsers;
import com.kcgeis.pojo.TbUsersExample;
import com.kcgeis.pojo.TbUsersExample.Criteria;
import com.kcgeis.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainServiceImpl implements MainService {
	
	@Autowired
	private TbUsersMapper tbUsersMapper;
	
	@Autowired
	private MainMapper mainMapper;

	@Override
	public List<TbUsers> selUserList() {
		TbUsersExample example=new TbUsersExample();
		return tbUsersMapper.selectByExample(example);
	}
	
	@Override
	public List<TbUsers> selUsersToday() {
		return mainMapper.selUsersToday();
	}

	@Override
	public List<TbUsers> selUsersYestoday() {
		return mainMapper.selUsersYesterday();
	}


	@Override
	public List<TbUsers> selUsersYearWeek() {
		// TODO Auto-generated method stub
		return mainMapper.selUsersYearWeek();
	}
	
	@Override
	public List<TbUsers> selUsersMonth() {
		// TODO Auto-generated method stub
		return mainMapper.selUsersMonth();
	}

	@Override
	public int seUserCountBygender(int i) {
		// TODO Auto-generated method stub
		TbUsersExample example=new TbUsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andSexEqualTo(i+"");
		List<TbUsers> list = tbUsersMapper.selectByExample(example);
		return list.size();
	}

}
