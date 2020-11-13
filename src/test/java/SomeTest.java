import com.example.springsoapslient.SpellerClient;
import com.example.springsoapslient.SpellerConfiguration;
import com.example.springsoapslient.wsdl.CheckTextResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;


import java.io.UnsupportedEncodingException;

public class SomeTest {

    private static ApplicationContext context;

    @BeforeAll
    public static void setUp() {

        context = new AnnotationConfigApplicationContext(SpellerConfiguration.class);

    }

    @Test
    public void testOne() throws UnsupportedEncodingException {

        CheckTextResponse response = context.getBean(SpellerClient.class).getCheckText("ru", "Превет");
        String text = response.getSpellResult().getError().get(0).getS().get(0);
//        String utf8String = new String(text.getBytes("UTF-8"), "windows-1251");

        System.err.println(text);

        Assertions.assertEquals("Привет", text);
    }

    @AfterAll
    public static void afterAll(){

    }
}
