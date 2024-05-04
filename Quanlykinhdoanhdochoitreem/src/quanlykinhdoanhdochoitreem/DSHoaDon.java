package quanlykinhdoanhdochoitreem;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class DSHoaDon implements Serializable {
    ArrayList<HoaDon> lstHoaDon;

    public DSHoaDon() {
    }

    public DSHoaDon(ArrayList<HoaDon> lstHoaDon) {
        this.lstHoaDon = lstHoaDon;
    }
    
    public void nhapDSHD() throws ClassNotFoundException, IOException{
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so luong hoa don: ");
        n = sc.nextInt();
        lstHoaDon = new ArrayList<HoaDon>();
        for(int i=0; i<n; i++){
            System.out.println("Nhap hoa don thu "+(i+1)+" :");
            HoaDon hd = new HoaDon();
            hd.nhap();
            lstHoaDon.add(hd);
        }
    }
    
    public void xuatDSHD(){
        for(HoaDon hd : lstHoaDon){
            hd.xuat();
            System.out.println();
        }
    }
    
    public void tinhTongTien(){
        float tong = 0;
        for(HoaDon hd : lstHoaDon ){
            tong+= hd.tinhtienHD();
        }
        System.out.println("\nTong tien cac hoa don la: "+ tong);
    }
    
    public void tinhTongTientheongay(){
        float tong = 0;
        Scanner sc = new Scanner(System.in);
        String x;
        System.out.print("\nNhap ngay muon tinh tong tien cac hoa don: ");
        x = sc.nextLine();
        for(HoaDon hd : lstHoaDon){
            if(hd.getNgayBan().compareTo(x)==0){
                tong+= hd.tinhtienHD();
            }
        }
        System.out.println("\nTong tien cac hoa don theo ngay "+x+" la: "+tong);
    }
    
    public void timkiem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap ma hoa don can tim: ");
        String x;
        x = sc.nextLine();
        for(HoaDon hd : lstHoaDon){
            if(hd.getMaHD().compareTo(x)==0){
                hd.xuat();
            }else{
		    System.out.println("Khong tim thay hoa don");
		    break;
            }
        }
    }
    
    public void sapxep(){
        Collections.sort(lstHoaDon, new SXHoaDon());
    }
    
    public void xoa(){
        Scanner sc = new Scanner(System.in);
        String x;
        System.out.print("\nNhap ma hoa don can xoa: ");
        x =sc.nextLine();
        for(int i=0;i<lstHoaDon.size();i++){
            if(lstHoaDon.get(i).getMaHD().compareTo(x)==0){
                lstHoaDon.remove(i);
            }
            else{
		System.out.println("Khong tim thay hoa don");
		break;
            }
        }           
    }
    
    public void them() throws ClassNotFoundException, IOException{
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so hoa don can them: ");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            HoaDon x = new HoaDon();
            x.nhap();
            lstHoaDon.add(x);
        }   
    }
    
    public void ghiDSHDfile() throws FileNotFoundException, IOException{
        File f = new File("hoadon.dat");
        FileOutputStream fout = new FileOutputStream(f);
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(lstHoaDon);
        out.close();
        fout.close();
        System.out.println("Luu File hoadon.dat thanh cong!!!");
    }
    
    public void docDSHDfile() throws FileNotFoundException, IOException, ClassNotFoundException{
        File f = new File("hoadon.dat");
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream in = new ObjectInputStream(fin);
        lstHoaDon = new ArrayList<HoaDon>();
        lstHoaDon = (ArrayList)in.readObject();
        in.close();
        fin.close();
	System.out.print("Doc file hoadon.dat thanh cong!!!");
        System.out.println();
    }
//    public void xDeny(){
//        
//    }
    
}
