package com.tarento.assetManagement;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tarento.assetManagement.Application;

/**
 * Tests for {@link Application}.
 * 
 * @author Dave Syer
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class SpringTestSampleSimpleApplicationTests {

	@Test
	public void testContextLoads() throws Exception {
	}

}
