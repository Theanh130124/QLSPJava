package Bai33;

public class Tester {
    
    public static void main(String[] args) {
        QLSP qlsp = new QLSP();
        
        System.out.println("1.----------------THEM SAN PHAM-----------");
        SanPham sp = new Sach(150, "Di Qua Mua Ha", "Hay", "Thai Dinh", 100000);
        SanPham sp1 = new BangDia(3, "99%", "Qua Hay", "RPT MCK", 200000);
        SanPham sp2 = new Sach(120, "PhoKhongEm", "Rat Hay", "Thai Dinh", 350000);
        SanPham sp3 = new Sach(5, "Memmories", "Tuyet", "SiVan", 230000);
        qlsp.nhapThem(sp);
        qlsp.nhapThem(sp1);
        qlsp.nhapThem(sp2);
        qlsp.nhapThem(sp3);
        System.out.println("2--------------XOA SAN PHAM-------------");
//        qlsp.xoaSanPham(sp);
//        qlsp.xoaSanPham("SP0002");
        System.out.println("3.-----------TIM KIEM------------");
//        qlsp.timKiem(sp);
//        qlsp.timKiem(100000);
        qlsp.timKiem("SP0004");
        qlsp.timKiem("PhoKhongEm");
        qlsp.timKiem(200000);
        qlsp.timKiem(100000);
        System.out.println("4-----------SAP XEP GIAM");
//        qlsp.sapXepGiam();
        qlsp.sapXepGiam_gia();

        
        System.out.println("6.------------XEM DANH SACH-------------");
        qlsp.xuatThongTin();
        
    }
    
}
