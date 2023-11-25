import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class prjayjay {
    public int minum (int c, int d){
        return c - d ;
    }
    public int add (int a, int b) {
        return a + b ;
    }
    @Test
    public void tambah () {
        System.out.println("Penjumlahan");
        prjayjay calculator = new prjayjay();
        int result =calculator.add(5, 3);
        Assert.assertEquals(8, result, "hasil penjumlahan dari 5+3 adalah 8");
    }

    @Test
    public void pengurangan () {
        System.out.println("pengurangan");
        prjayjay kurang = new prjayjay();
        int result = kurang.minum(8, 5);
        Assert.assertEquals(3, result, "Hasil pengurangan dari 8-5 adalah 3");
    }
}

