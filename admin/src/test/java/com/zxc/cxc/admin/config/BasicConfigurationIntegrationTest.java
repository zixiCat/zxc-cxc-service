// import java.io.IOException;
// import java.net.MalformedURLException;
// import java.net.URL;

// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.test.context.junit4.SpringRunner;

// @RunWith(SpringRunner.class)
// @SpringBootTest(webEnvironment = RANDOM_PORT)
// public class BasicConfigurationIntegrationTest {

//     TestRestTemplate restTemplate;
//     URL base;
//     @LocalServerPort int port;

//     @Before
//     public void setUp() throws MalformedURLException {
//         restTemplate = new TestRestTemplate("user", "password");
//         base = new URL("http://localhost:" + port);
//     }

//     @Test
//     public void whenLoggedUserRequestsHomePage_ThenSuccess()
//      throws IllegalStateException, IOException {
//         ResponseEntity<String> response =
//           restTemplate.getForEntity(base.toString(), String.class);
 
//         assertEquals(HttpStatus.OK, response.getStatusCode());
//         assertTrue(response.getBody().contains("Baeldung"));
//     }

//     @Test
//     public void whenUserWithWrongCredentials_thenUnauthorizedPage() 
//       throws Exception {
 
//         restTemplate = new TestRestTemplate("user", "wrongpassword");
//         ResponseEntity<String> response =
//           restTemplate.getForEntity(base.toString(), String.class);
 
//         assertEquals(HttpStatus.UNAUTHORIZED, response.getStatusCode());
//         assertTrue(response.getBody().contains("Unauthorized"));
//     }
// }