
package Bai33;

public class BangDia extends SanPham {
    private long thoigianphat; 

    public BangDia(long thoigianphat, String tensp, String mota, String nhasx, double giaban) {
        super(tensp, mota, nhasx, giaban);
        this.thoigianphat = thoigianphat;
    }

    @Override
    public String toString() {
        return "BangDia"+super.toString() +""+ "thoigianphat=" + thoigianphat + '}';
    }


   
}
