package za.co.reverside.recruitment.api;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

import org.mockito.runners.MockitoJUnitRunner;

import static org.springframework.test.util.ReflectionTestUtils.*;

import za.co.reverside.recruitment.repository.UserRepository;
import za.co.reverside.recruitment.resource.User;

@RunWith(MockitoJUnitRunner.class)
public class LoginServiceTest {

    @Mock
    UserRepository mUserRepository;

    LoginService loginService;

    @Before
    public void setUp() {
        loginService = new LoginService();
        setField(loginService, "userRepository", mUserRepository);
    }

    @Test
    public void testLoginWhenUserExistAndEnabled() {
        User mUser = mock(User.class);
        when(mUser.getEnabled()).thenReturn(true).toString();
        when(mUserRepository.findByUserNameAndPassword("Pradyumna", "12345")).thenReturn(mUser);

        String result = loginService.login("Pradyumna", "12345");
        assertEquals("{status:200}", result);
    }

    @Test
    public void testLoginWhenUserExistAndDisabled() {
        User mUser = mock(User.class);
        when(mUser.getEnabled()).thenReturn(false).toString();
        when(mUserRepository.findByUserNameAndPassword("Pradyumna", "12345")).thenReturn(mUser);

        String result = loginService.login("Pradyumna", "12345");
        assertEquals("{status:404}", result);
    }

    @Test
    public void testLoginWhenUserNotExist() {
        when(mUserRepository.findByUserNameAndPassword("Pradyumna", "12345")).thenReturn(null);
        String result = loginService.login("Pradyumna", "12345");
        assertEquals("{status:404}", result);
    }
}
