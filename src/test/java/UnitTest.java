import entities.Diem;
import entities.TamGiac;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class UnitTest {

    @Test
    @DisplayName("Tinh chu vi tam giac thuong")
    void tinhChuViTamGiacThuong() {
        TamGiac tamGiac1 = new TamGiac(new Diem(0, 2), new Diem(-3, 1), new Diem(2, -5));
        double chuViTamGiac = tamGiac1.tinhChuViTamGiac();
        double actual = 18.25263722535555;
        assertEquals(chuViTamGiac, actual);
    }

    @Test
    @DisplayName("Tinh chu vi tam giac vuong")
    void tinhChuViTamGiacVuong() {
        TamGiac tamGiac1 = new TamGiac(new Diem(0, 0), new Diem(-0, 3), new Diem(4, 0));
        double chuViTamGiac = tamGiac1.tinhChuViTamGiac();
        double actual = 12d;
        assertEquals(chuViTamGiac, actual);
    }

    @Test
    @DisplayName("sasasass ha  sad")
    void sasasassHaSad() {
        
    }
