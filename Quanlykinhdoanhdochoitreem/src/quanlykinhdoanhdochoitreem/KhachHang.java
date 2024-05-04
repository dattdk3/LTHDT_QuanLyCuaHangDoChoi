package quanlykinhdoanhdochoitreem;

import java.io.Serializable;
import java.util.Scanner;


public class KhachHang extends Person implements Serializable{
    private String DiaChi;
    
    public KhachHang(){
    }

    public KhachHang(String DiaChi, String HoTen, String SoDT, String GioiTinh) {
        super(HoTen, SoDT, GioiTinh);
        this.DiaChi = DiaChi;
    }
    
    public void nhap(){
        super.nhap();
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap dia chi: ");
        DiaChi= sc.nextLine();
    }
    public void xuat(){
        super.xuat();
        System.out.printf("%15s", DiaChi);
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
    
    public String getTenKH(){
        return super.getHoTen();
    }
    
    public String getGTKH(){
        return super.getGioiTinh();
    }
    
    public String getSDTKH(){
        return super.getSoDT();
    }

    public String getDiaChi() {
        return DiaChi;
    }
}
