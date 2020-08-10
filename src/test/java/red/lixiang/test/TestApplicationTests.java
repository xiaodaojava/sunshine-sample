package red.lixiang.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TestApplicationTests {

	@Autowired
	private UsersMapper usersMapper;

	@Test
	void contextLoads() {

		List<Users> all = usersMapper.findAll();
		System.out.println(all);

		UsersQC usersQC = new UsersQC();
		usersQC.setId(1L);
		List<Users> byQuery = usersMapper.findByQuery(usersQC);
		System.out.println(byQuery);

		List<Users> users = usersMapper.selectList("select * from users");
		System.out.println(users);
	}

}
