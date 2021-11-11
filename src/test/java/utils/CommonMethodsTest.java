package utils;

import app.utils.CommonMethods;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CommonMethodsTest {



    @Test(expected =InvocationTargetException.class)
    public void testConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<CommonMethods> c = CommonMethods.class.getDeclaredConstructor();
        c.setAccessible(true);
        c.newInstance();
    }

    @Test
    public void checkStringHaveAlphanumerical(){
        String ola="nome1";
        assertTrue(CommonMethods.stringHaveAlphanumerical(ola));
    }

    @Test
    public void checkStringHaveAlphanumericalWrong(){
        String ola="nome1-|";
        assertFalse(CommonMethods.stringHaveAlphanumerical(ola));
    }

    @Test
    public void checkStringLetters(){
        String ola="nome";
        assertTrue(CommonMethods.checkIfStringJustHaveLetters(ola));
    }

    @Test
    public void checkStringLettersWrong(){
        String ola="nome4";
        assertFalse(CommonMethods.checkIfStringJustHaveLetters(ola));
    }

    @Test
    public void checkStringNumbers(){
        String ola="12";
        assertTrue(CommonMethods.checkIfStringJustHaveNumbers(ola));
    }

    @Test
    public void checkStringNumbersWrong(){
        String ola="nome1-|";
        assertFalse(CommonMethods.checkIfStringJustHaveLetters(ola));
    }





}