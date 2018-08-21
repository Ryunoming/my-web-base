package team.ryunosuke.web.ssm_web_base.dao;

import team.ryunosuke.web.ssm_web_base.entity.Accounts;

public interface AccountsMapper {
	
    int deleteByPrimaryKey(Integer accountId);

    int insert(Accounts record);

    int insertSelective(Accounts record);

    Accounts selectByPrimaryKey(Integer accountId);

    int updateByPrimaryKeySelective(Accounts record);

    int updateByPrimaryKey(Accounts record);
}