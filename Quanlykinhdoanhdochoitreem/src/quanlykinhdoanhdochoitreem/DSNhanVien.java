package quanlykinhdoanhdochoitreem;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DSNhanVien implements Serializable {
    ArrayList<NhanVien>lstNV;

    public DSNhanVien() {
    }

    public DSNhanVien(ArrayList<NhanVien> lstNV) {
        this.lstNV = lstNV;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so nhan vien: ");
        n = sc.nextInt();
        lstNV =new ArrayList<NhanVien>();
        for(int i=0;i<n;i++){
            NhanVien nv = new NhanVien();
            nv.nhap();
            lstNV.add(nv);
        }
    }
    
    public void xuat(){
        System.out.print("Hien danh sach nhan vien: ");
        for(NhanVien nv: lstNV ){
            nv.xuat();
        }
    }
    
    public void luuFileNV() throws FileNotFoundException, IOException{
        File f= new File("nhanvien.dat");
        FileOutputStream fout= new FileOutputStream(f);
        ObjectOutputStream out= new ObjectOutputStream(fout);
        out.writeObject(lstNV);
        out.close();
        fout.close();
        System.out.println("\n------------------");
        System.out.println("Luu File nhanvien.dat thanh cong");
    }
    
    public void docFileNV()throws FileNotFoundException, IOException, ClassNotFoundException{
        File f= new File("nhanvien.dat");
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream in = new ObjectInputStream(fin);
        lstNV = new ArrayList<NhanVien>();
        lstNV = (ArrayList)in.readObject();
        in.close();
        fin.close();
	System.out.print("Doc file nhanvien.dat thanh cong");
    }
    
    public void themNV(NhanVien a) {
		lstNV.add(a);
	}
    
    public NhanVien kiemtra(String MaNV) {
		for (NhanVien nhanVien : lstNV) {
			if(nhanVien.getMaNV().compareTo(MaNV)==0) 
				return nhanVien;
			
		}
		return null;
	}
}
