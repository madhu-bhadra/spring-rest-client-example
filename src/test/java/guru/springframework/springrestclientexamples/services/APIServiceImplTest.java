package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class APIServiceImplTest extends TestCase {

    @Autowired
    APIService apiService;

    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testGetUsers() throws Exception{
        List<User> users = apiService.getUser(3);
        assertEquals(3, users.size());
    }
}