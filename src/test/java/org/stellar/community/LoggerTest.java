package org.stellar.community;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description: TODO <br>
 * @date: 2021/4/5 16:02 <br>
 * @author: yzy <br>
 * @version: 1.0 <br>
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = CommunityApplication.class)
public class LoggerTest {

    
    private static final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
    
    @Test
    public void test(){
        System.out.println(logger.getName());

        logger.debug("debug log");
        logger.info("info log");
        logger.warn("warn log");
        logger.error( "error log");
    }
}
