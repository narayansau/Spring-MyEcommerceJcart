package com.ecomerece.jcartcore;

import com.sivalabs.jcart.common.services.EmailService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//@RunWith(value=SpringRunner.class)
//@RunWith(SpringJUnit4ClassRunner.class)

//@ContextConfiguration(classes = JcartCoreApplication.class)
//@SpringApplicationConfiguration(classes = JcartCoreApplication.class)

/*******************
 *
 *
 */


@RunWith(SpringRunner.class)
@SpringBootTest


/*****************
 *
 */

//@SpringBootTest

public class JcartCoreApplicationTests{

    @Autowired
    DataSource dataSource;
  //  @Autowired
 //   EmailService emailService;

    @Test
    public void testDummy() throws SQLException
    {
        String schema = dataSource.getConnection().getCatalog();
        System.out.println( "SCheme is : " + schema );
        assertTrue("jcart".equalsIgnoreCase(schema));
        assertEquals("jcart", schema);
    }

    @Test
    @Ignore
    public void testSendEmail()
    {
      //  emailService.sendEmail("admin@gmail.com", "JCart - Test Mail", "This is a test email from JCart");
    }

    @Test

    public void contextLoads() {
    }

}
