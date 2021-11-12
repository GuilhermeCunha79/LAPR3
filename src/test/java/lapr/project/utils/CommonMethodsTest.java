package lapr.project.utils;

import lapr.project.utils.CommonMethods;
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

    @Test
    public void checkIsValidLatitude(){
        double latitude=90;
        assertTrue(CommonMethods.isValidLatitude(latitude));
    }
    @Test
    public void checkIsValidLatitude1(){
        double latitude=0;
        assertTrue(CommonMethods.isValidLatitude(latitude));
    }

    @Test
    public void checkIsValidLongitude(){
        double latitude=180;
        assertTrue(CommonMethods.isValidLongitude(latitude));
    }

    @Test
    public void checkIsValidLongitude1(){
        double latitude=0;
        assertTrue(CommonMethods.isValidLongitude(latitude));
    }

    @Test
    public void imoVerificationTest(){
        String imo="IMO123";
        assertFalse(CommonMethods.imoVerification(imo));
    }

    @Test
    public void imoVerificationTest1(){
        String imo="IBO123";
        assertFalse(CommonMethods.imoVerification(imo));
    }

    @Test
    public void imoVerificationTest2(){
        String imo="OMO123";
        assertFalse(CommonMethods.imoVerification(imo));
    }

    @Test
    public void imoVerificationTest3(){
        String imo="IMB123";
        assertFalse(CommonMethods.imoVerification(imo));
    }




}