package tddpractice;

import io.petelleave.tddpractice.NameGreetingService;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameGreetingServiceTest {

    @Test
    public void shouldSayHelloBack(){
        NameGreetingService service = new NameGreetingService();
        String greeting = service.greet("Bob");
        assertEquals("Hello, Bob.", greeting);
    }

    @Test
    public void shouldSayHelloBackWhenNameIsNull(){
        NameGreetingService service = new NameGreetingService();
        String greeting = service.greet(null);
        assertEquals("Hello, my friend.", greeting);
    }

    @Test
    public void shouldShoutBackWhenNameIsAllCap(){
        NameGreetingService service = new NameGreetingService();
        String shouting = service.greet("JERRY");
        assertEquals("HELLO, JERRY!", shouting);
    }

    @Test
    public void shouldSupportTwoNames(){
        NameGreetingService service = new NameGreetingService();
        String greeting = service.greet("Jill&Jane");
        assertEquals("Hello, Jill and Jane.", greeting);
    }
}
