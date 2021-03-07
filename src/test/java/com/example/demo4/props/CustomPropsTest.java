package com.example.demo4.props;

import com.example.demo4.jms.FakeJmsBroker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class CustomPropsTest {
    @Autowired
    FakeJmsBroker fakeJmsBroker;

    @Test
    public void testPropsSet() throws Exception {
        System.out.println("XXXXXXXXXXXXXXXXXXX:fakeJmsBroker=" + fakeJmsBroker.toString());
        assertThat(fakeJmsBroker.getUrl()).isEqualTo("test.jms.server");
    }
}
