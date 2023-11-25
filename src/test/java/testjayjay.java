import org.junit.jupiter.api.*;


public class testjayjay {


    @Test
    public void testPenjumlahan (){
        System.out.println("Penjumlahan");
        Assertions.assertEquals(4, 1+3);
    }
    @Test
    public void testPengurangan (){
        System.out.println("Pengurangan");
        Assertions.assertEquals(7, 10-3);
    }

    @BeforeAll
    public static void beforeAll (){
        System.out.println("before all");
    }

    @AfterAll
    public static void  afterAll (){
        System.out.println("after all");
    }

    @BeforeEach
    public void beforeEach () {
        System.out.println("before each");
    }

    @AfterEach
    public void afterEach () {
        System.out.println("after each");
    }

}
