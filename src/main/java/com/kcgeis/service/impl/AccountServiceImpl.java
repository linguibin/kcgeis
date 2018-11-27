package com.kcgeis.service.impl;

import com.kcgeis.mapper.TbUsersMapper;
import com.kcgeis.pojo.TbUsers;
import com.kcgeis.pojo.TbUsersExample;
import com.kcgeis.pojo.TbUsersExample.Criteria;
import com.kcgeis.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private TbUsersMapper tbUsersMapper;

	@Override
	public TbUsers selUserByCodeAndStatus(String eCode,String status) {
		TbUsersExample example=new TbUsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andECodeEqualTo(eCode);
		criteria.andStatusEqualTo(status);
		List<TbUsers> users = tbUsersMapper.selectByExample(example);
		if(users!=null&&users.size()>0){
			return users.get(0);
		}
		return null;
	}

	@Override
	public void updUserStatus(TbUsers user) {
		tbUsersMapper.updateByPrimaryKey(user);
	}

}
