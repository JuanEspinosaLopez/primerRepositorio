package com.prueba;

import com.prueba.web.i18n.I18NService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PruebaApplicationTests {

	@Autowired
	private I18NService i18NService;

	@Test
	public void testMessageByLocaleService() throws Exception
	{
		String expecterResult="Bootstrap starter template";
		String messageId="index.main.callout";
		String actual=i18NService.getMessage(messageId);
		org.junit.Assert.assertEquals("The actual and expected Strings don´t match", expecterResult, actual);
	}
}
