package team.ryunosuke.web.ssm_web_base.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import team.ryunosuke.web.ssm_web_base.dao.AccountsMapper;

public class MybatisTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			SqlSession session  = sqlSessionFactory.openSession();
			AccountsMapper mapper = session.getMapper(AccountsMapper.class);
			
			System.out.println(mapper.selectByPrimaryKey(1).getUsername());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
