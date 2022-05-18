package com.tarento.assetManagement;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class ApplicationTest {

	@Test
	public void contextLoads() throws Exception {
		Application.main(new String[] { "Hello" });
	}
}
