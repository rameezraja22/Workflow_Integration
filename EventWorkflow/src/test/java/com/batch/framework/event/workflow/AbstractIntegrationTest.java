package com.batch.framework.event.workflow;

import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {InfrastructureConfiguration.class})
public abstract class AbstractIntegrationTest {

}
