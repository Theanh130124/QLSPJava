 package Bai33;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QLSP {

    private List<SanPham> dssp;

    public QLSP() {
        this.dssp = new ArrayList<>();
    }

    public void nhapThem(SanPham sp) {
        dssp.add(sp);
    }

    public void xoaSanPham(SanPham sp) {
        dssp.remove(sp);
    }

    //Xoa theo ten , hoac theo ma 
    public void xoaSanPham(String ma) {
        dssp.removeIf(p -> p.getMasp().equals(ma));
    }

    public void xuatThongTin() // phải toString hết bên kia
    {
        for (SanPham sp : dssp) {
            System.out.println(sp);
        }
    }

    public void timKiem(String a) {
        dssp.stream().filter(p -> p.getTensp().equals(a) || p.getMasp().equals(a) || p.getMota().equals(a)).
                //                findFirst().orElse(null);
                forEach(p -> System.out.println(p.toString()));

    }

    public void timKiem(double gia) {
        dssp.stream().filter(p -> p.getGiaban() == gia).forEach(p -> System.out.println(p.toString()));
    }

    public void sapXepGiam() {
        dssp.stream().sorted(Comparator.comparing(SanPham::getMasp)/*SanPham:: CTRL +SPCAE*/.reversed()).forEach(p -> System.out.println(p.toString()));
    }

    public void sapXepGiam_gia() {
        dssp.stream().sorted(Comparator.comparingDouble(SanPham::getGiaban).reversed()).forEach(p -> System.out.println(p.toString()));
    }
}
