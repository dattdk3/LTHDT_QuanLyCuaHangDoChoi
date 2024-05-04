package quanlykinhdoanhdochoitreem;

import java.io.Serializable;
import java.util.Scanner;

public class NhanVien extends Person implements Serializable {
    
    private String MaNV;
    private float LuongCB;
    private float HeSL;
    
    public NhanVien(){  
    }

    public NhanVien(String MaNV, float LuongCB, float HeSL, String HoTen, String SoDT, String GioiTinh) {
        super(HoTen, SoDT, GioiTinh);
        this.MaNV = MaNV;
        this.LuongCB = LuongCB;
        this.HeSL = HeSL;
    }
    
    public void nhap(){
        super.nhap();
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ma nhan vien:");
        MaNV=sc.nextLine();
        System.out.print("Nhap Luong co ban:");
        LuongCB=sc.nextFloat();
        System.out.print("Nhap he so luong:");
        HeSL=sc.nextFloat();
    }
    
    public void xuat(){
        super.xuat();
        System.out.printf("%15s", MaNV);
        System.out.printf("%10.1f", LuongCB);
        System.out.printf("%5.1f", HeSL);
        System.out.printf("%15.1f", tinhluong());
    }
    public Float tinhluong(){
        return LuongCB*HeSL;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public void setLuongCB(float LuongCB) {
        this.LuongCB = LuongCB;
    }

    public void setHeSL(float HeSL) {
        this.HeSL = HeSL;
    }
    

    public String getMaNV() {
        return MaNV;
    }

    public float getLuongCB() {
        return LuongCB;
    }

    public float getHeSL() {
        return HeSL;
        
    }
    
    public String getTenNV(){
        return super.getHoTen();
    }
    
    public String getGTNV(){
        return super.getGioiTinh();
    }
    
    public String getSDTNV(){
        return super.getSoDT();
    }
    
}
