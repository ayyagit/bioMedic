package com.spring.bioMedical;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BioMedicalApplicationTests {

	@Autowired
	private WebTestClient webClient;

	/*@Test
	public void contextLoads() {
	}*/ sdfsdf

	@Test
	public void exampleTest() {
		this.webClient.get().uri("/").exchange().expectStatus().isOk()
				.expectBody(String.class).isEqualTo("user/success");
	}

}
