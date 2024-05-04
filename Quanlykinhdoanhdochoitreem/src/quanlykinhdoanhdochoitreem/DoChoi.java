package quanlykinhdoanhdochoitreem;

import java.io.Serializable;
import java.util.Scanner;

public class DoChoi implements Serializable{
    private String MaDC;
    private String TenDC;
    private String XuatXu;
    int Gia;
    int SoLuong;
    
    public DoChoi(){
    }

    public DoChoi(String MaDC, String TenDC, String XuatXu, int Gia, int SoLuong) {
        this.MaDC = MaDC;
        this.TenDC = TenDC;
        this.XuatXu = XuatXu;
        this.Gia = Gia;
        this.SoLuong = SoLuong;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma do choi:");
        MaDC = sc.nextLine();
        System.out.print("Nhap ten do choi:");
        TenDC = sc.nextLine();
        System.out.print("Nhap xuat xu:");
        XuatXu = sc.nextLine();
        System.out.print("Nhap gia:");
        Gia = sc.nextInt();
        System.out.print("Nhap so luong:");
        SoLuong = sc.nextInt();
    }
    
    public void xuat(){
        System.out.printf("%-21s", MaDC);
        System.out.printf("%-21s", TenDC);
	  System.out.printf("%-22s", XuatXu);
        System.out.printf("%-20d", SoLuong);
	System.out.printf("%-20d",Gia);
	System.out.printf("%f",tinhtienDC());
    }
    
    public float tinhtienDC(){
        return Gia * SoLuong;
    }

    public void setMaDC(String MaDC) {
        this.MaDC = MaDC;
    }

    public void setTenDC(String TenDC) {
        this.TenDC = TenDC;
    }

    public void setXuatXu(String XuatXu) {
        this.XuatXu = XuatXu;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getMaDC() {
        return MaDC;
    }

    public String getTenDC() {
        return TenDC;
    }

    public String getXuatXu() {
        return XuatXu;
    }

    public int getGia() {
        return Gia;
    }

    public int getSoLuong() {
        return SoLuong;
    }    
}
