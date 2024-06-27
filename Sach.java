package Bai33;

public class Sach extends SanPham {

    private long sotrang;

    public Sach(long sotrang, String tensp, String mota, String nhasx, double giaban) {
        super(tensp, mota, nhasx, giaban);
        this.sotrang = sotrang;
    }

    @Override
    public String toString() {
        return "Sach" + super.toString() +""+"sotrang" + this.sotrang + '}';
    }

}
