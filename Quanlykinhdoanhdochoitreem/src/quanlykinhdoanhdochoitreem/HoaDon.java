package quanlykinhdoanhdochoitreem;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class HoaDon implements Serializable {
    private String MaHD;
    private String NgayBan;
    private String MaNV;
    KhachHang KH = new KhachHang();
    ArrayList<DOCHOIBAN>lstDoChoi = new ArrayList<DOCHOIBAN>();
    XuLyNhanVien b = new XuLyNhanVien();
    NhanVien c = new NhanVien();
    int s=0;

    public HoaDon() {
    }

    public HoaDon(String MaHD, String NgayBan, String MaNV, ArrayList<DoChoi> lstDoChoi) {
        this.MaHD = MaHD;
        this.NgayBan = NgayBan;
        this.MaNV = MaNV;
        this.lstDoChoi = new ArrayList<DOCHOIBAN>();
    }
    
    public void nhap() throws ClassNotFoundException, IOException{
        Scanner sc =new Scanner(System.in);
        System.out.println("\"=====================NHAP THONG TIN HOA DON=====================\"");
        System.out.print("Nhap ma hoa don: ");
        MaHD = sc.nextLine();
        System.out.print("Nhap ngay lap hoa don: ");
        NgayBan = sc.nextLine();
        System.out.println("Nhap ma nhan vien: ");
        MaNV = sc.nextLine();
        c = b.kiemtraMa(MaNV);
		if(c==null) {
			
			System.out.println("Ban da nhap ma nhan vien khong co trong cua hang hien tai moi ban chon: \n 1.Nhan phim 1 de nhap lai ma nhan vien \n 2.An phim 2 neu ban muon them nhan vien moi");
			int chon = new Scanner(System.in).nextInt();
			if(chon==1) {
				while(c==null) {
					System.out.println("Moi ban nhap lai ma nhan vien: ");
					MaNV = new Scanner(System.in).nextLine();
					c = new NhanVien();
					c = b.kiemtraMa(MaNV);
				}
			}
			if(chon==2) {
				c = new NhanVien();
				System.out.println("Moi ban nhap thong tin nhan vien moi: ");
				c.nhap();
				b.addNV(c);
			}
		}
        System.out.println("\n=====================NHAP THONG TIN KHACH HANG=====================");
	KH.nhap();
	System.out.println("=====================NHAP CAC LOAI DO CHOI=====================");
        System.out.print("Nhap so loai do choi khach muon mua: ");
        int n;
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            DOCHOIBAN x = new DOCHOIBAN();
            x.nhap();
            s+=x.tinhtienDC();
            lstDoChoi.add(x);
        }
    }
    
    public void xuat(){
        System.out.println("=====================================================HOA DON======================================================");
        System.out.printf("%-25s %-30s %-1s", "Thong tin hoa don", "* Thong tin khach hang","*Thong tin nhan vien " + "\n");
	System.out.printf("%-25s %-30s %-1s", "Ma hoa don: " + MaHD, "| Ten khach: " + KH.getTenKH(), "| Ma nhan vien:  " + c.getMaNV() + "\n");
	System.out.printf("%-25s %-30s %-1s", "Ngay lap: " + NgayBan, "| Gioi tinh: " + KH.getGTKH(), "| Ten nhan vien: " + c.getTenNV()+ "\n");
	System.out.printf("%-25s %-30s %-1s", " ", "| So dien thoai: " + KH.getSDTKH(), "| Gioi tinh: " + c.getGioiTinh() + "\n");
	System.out.printf("%-25s %-30s %-1s", " ", "| Dia chi khach: " + KH.getDiaChi(), "| So dien thoai: " + c.getSDTNV()+ "\n");
        System.out.printf("%-25s %-30s %-1s", " ", " ", "| Luong co ban: "+ c.getLuongCB() + "\n");
	System.out.printf("%-25s %-30s %-1s", " ", " ", "| He so luong: "+ c.getHeSL() + "\n");
	System.out.println("==============================================CAC LOAI DO CHOI KHACH MUA===========================================");
	System.out.printf("%-20s %-20s %-20s %-20s %-20s %s", "Ma hang hoa", "Ten hang hoa", "Xuat xu hang hoa",
				"So luong hang hoa", "Don gia hang hoa", "Thanh tien" + "\n");
	for (DoChoi x : lstDoChoi) {
            x.xuat();
            System.out.println();
	}
	System.out.println("==================================================================================================================");
	System.out.println("Tong so tien khach phai tra: " + s );
	
    }
    
    public float tinhtienHD()
    {
        float s=0;
        for(DoChoi dc:lstDoChoi)
            s+= dc.tinhtienDC();
        return s;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public void setNgayBan(String NgayBan) {
        this.NgayBan = NgayBan;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public void setKH(KhachHang KH) {
        this.KH = KH;
    }

    public void setLstDoChoi(ArrayList<DOCHOIBAN> lstDoChoi) {
        this.lstDoChoi = lstDoChoi;
    }

    public void setB(XuLyNhanVien b) {
        this.b = b;
    }

    public void setC(NhanVien c) {
        this.c = c;
    }

    public void setS(int s) {
        this.s = s;
    }

    
    public String getNgayBan() {
        return NgayBan;
    }

    public String getMaHD() {
        return MaHD;
    }
    
}
