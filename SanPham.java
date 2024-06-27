package Bai33;

import java.time.LocalDate;

public class SanPham {

    // Ma Sp tu dong tang
    private static int dem = 0;
    private static final String d = "SP";
    private String masp;
    private String tensp;
    private String mota;
    private String nhasx;
    private double giaban;
    private int thoigian = LocalDate.now().getYear();

    {
      masp = String.format("%s%04d", d, ++dem); // "%s%04d" để ra chuổi SP0001
        // để ++ dem thì nó mới tăng lên từ 1 , nếu để dem++ thì phải dem = 1:

    }

    public SanPham(String tensp, String mota, String nhasx, double giaban) {

        this.tensp = tensp;
        this.mota = mota;
        this.nhasx = nhasx;
        this.giaban = giaban;
    }

    @Override
    public String toString() {
        return "{" + "masp=" + getMasp() + ", tensp=" + getTensp() + ", mota=" + getMota() + ", nhasx=" + getNhasx() + ", giaban=" + getGiaban();
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getNhasx() {
        return nhasx;
    }

    public void setNhasx(String nhasx) {
        this.nhasx = nhasx;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

}
