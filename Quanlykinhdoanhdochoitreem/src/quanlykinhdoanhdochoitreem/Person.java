package quanlykinhdoanhdochoitreem;

import java.io.Serializable;
import java.util.Scanner;


public class Person implements Serializable{
    private String HoTen;
    private String SoDT;
    private String GioiTinh;
    
    public Person(){
    }

    public Person(String HoTen, String SoDT, String GioiTinh) {
        this.HoTen = HoTen;
        this.SoDT = SoDT;
        this.GioiTinh = GioiTinh;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten:");
        HoTen = sc.nextLine();
        System.out.print("Nhap so dien thoai:");
        SoDT = sc.nextLine();
        System.out.print("Nhap gioi tinh:");
        GioiTinh = sc.nextLine();
    }
    
    public void xuat(){
        System.out.printf("\n%15s", HoTen);
        System.out.printf("%15s", SoDT);
        System.out.printf("%5s", GioiTinh);
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getSoDT() {
        return SoDT;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }
    
  }
