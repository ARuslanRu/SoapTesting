import com.example.springsoapslient.SpellerClient;
import com.example.springsoapslient.SpellerConfiguration;
import com.example.springsoapslient.wsdl.CheckTextResponse;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;


import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SomeTest {

    private static ApplicationContext context;

    @BeforeAll
    public static void setUp() {

        context = new AnnotationConfigApplicationContext(SpellerConfiguration.class);

    }

    @Test
    @Step("Some Step")
    public void testOne() throws UnsupportedEncodingException {

        String time = new SimpleDateFormat("yyyy.MM.dd / hh:mm").format(Calendar.getInstance().getTime());
        Allure.step("Time step: " + time);

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
