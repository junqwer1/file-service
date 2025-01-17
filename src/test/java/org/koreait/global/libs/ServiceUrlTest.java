package org.koreait.global.libs;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"default", "test", "dev"})
public class ServiceUrlTest {

    @Autowired
    private Utils utils;

    @Test
    void urlTest() {
        String url = utils.serviceUrl("file-service", "/upload");
        System.out.println();
    }

}
