package quanlykinhdoanhdochoitreem;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class DSKhachHang implements Serializable{
  
    ArrayList<KhachHang>lstKH;

    public DSKhachHang() {
    }

    public DSKhachHang(ArrayList<KhachHang> lstKH) {
        this.lstKH = lstKH;
    }
    
    public void nhapDSKH(){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so khach hang:");
        n = sc.nextInt();
        lstKH = new ArrayList<KhachHang>();
        for(int i=0; i<n; i++){
            KhachHang kh = new KhachHang();
            kh.nhap();
            lstKH.add(kh);
        }
    }
    
    public void xuatDSKH(){
        System.out.print("Hien danh sach khach hang:");
        for(KhachHang kh: lstKH){
            kh.xuat();
        }
    }
    
    public void ghiDSKHfile() throws FileNotFoundException, IOException{
        File f = new File("khachhang.dat");
        FileOutputStream fout = new FileOutputStream(f);
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(lstKH);
        out.close();
        fout.close();
        System.out.println("\n--------------------------");
        System.out.println("Luu File khachhang.dat thanh cong!!!");
    }
    
    public void docDSKHfile() throws FileNotFoundException, IOException, ClassNotFoundException{
        File f = new File("khachhang.dat");
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream in = new ObjectInputStream(fin);
        lstKH = new ArrayList<KhachHang>();
        lstKH = (ArrayList)in.readObject();
        in.close();
        fin.close();
        System.out.println("Doc file khachhang.dat thanh cong");
    }
}
