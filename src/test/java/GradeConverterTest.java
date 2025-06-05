import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeConverterTest {
    private GradeConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new GradeConverter();
    }

    @Test
    public void testConvert1() {
        String expected = "A";
        String actual = converter.convert(100);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvert2() {
        String expected = "A";
        String actual = converter.convert(90);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvert3() {
        String expected = "B";
        String actual = converter.convert(80);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvert4() {
        String expected = "C";
        String actual = converter.convert(70);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvert5() {
        String expected = "D";
        String actual = converter.convert(60);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvert6() {
        String expected = "E";
        String actual = converter.convert(0);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvert7() {
        String expected = "Invalid";
        String actual = converter.convert(-1);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvert8() {
        String expected = "Invalid";
        String actual = converter.convert(101);
        assertEquals(expected, actual);
    }

    // Test cho điểm trong khoảng A (90-100)
    @Test public void testConvert_A_100() {
        assertEquals("A", converter.convert(100));
    }
    @Test public void testConvert_A_90() {
        assertEquals("A", converter.convert(90));
    }
    @Test public void testConvert_A_95() {
        assertEquals("A", converter.convert(95));
    }

    // Test cho điểm trong khoảng B (80-89)
    @Test public void testConvert_B_80() {
        assertEquals("B", converter.convert(80));
    }
    @Test public void testConvert_B_89() {
        assertEquals("B", converter.convert(89));
    }
    @Test public void testConvert_B_85() {
        assertEquals("B", converter.convert(85));
    }

    // Test cho điểm trong khoảng C (70-79)
    @Test public void testConvert_C_70() {
        assertEquals("C", converter.convert(70));
    }
    @Test public void testConvert_C_79() {
        assertEquals("C", converter.convert(79));
    }
    @Test public void testConvert_C_75() {
        assertEquals("C", converter.convert(75));
    }

    // Test cho điểm trong khoảng D (60-69)
    @Test public void testConvert_D_60() {
        assertEquals("D", converter.convert(60));
    }
    @Test public void testConvert_D_69() {
        assertEquals("D", converter.convert(69));
    }
    @Test public void testConvert_D_65() {
        assertEquals("D", converter.convert(65));
    }

    // Test cho điểm trong khoảng E (0-59)
    @Test public void testConvert_E_0() {
        assertEquals("E", converter.convert(0));
    }
    @Test public void testConvert_E_59() {
        assertEquals("E", converter.convert(59));
    }
    @Test public void testConvert_E_30() {
        assertEquals("E", converter.convert(30));
    }

    // Test cho điểm không hợp lệ (âm và lớn hơn 100)
    @Test public void testConvert_Invalid_Negative() {
        assertEquals("Invalid", converter.convert(-1000000000));
    }
    @Test public void testConvert_Invalid_Over100() {
        assertEquals("Invalid", converter.convert(100000001));
    }

}