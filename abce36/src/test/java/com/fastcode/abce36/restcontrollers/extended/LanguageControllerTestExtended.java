package com.fastcode.abce36.restcontrollers.extended;

import com.fastcode.abce36.restcontrollers.core.LanguageControllerTest;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
				properties = "spring.profiles.active=test")
public class LanguageControllerTestExtended extends LanguageControllerTest {
	
	//Add your custom code here	
}
