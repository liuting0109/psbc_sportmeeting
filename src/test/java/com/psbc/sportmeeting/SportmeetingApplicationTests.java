package com.psbc.sportmeeting;

import com.psbc.sportmeeting.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Transactional
@SpringBootTest
class SportmeetingApplicationTests {


	private UserMapper userMapper;

	@Test
	void contextLoads() {
	}

}
