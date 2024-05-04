package quanlykinhdoanhdochoitreem;

import java.io.IOException;
import java.io.Serializable;


public class XuLyNhanVien implements Serializable{
    DSNhanVien x = new DSNhanVien();
    public void addNV(NhanVien a) throws ClassNotFoundException, IOException {
		x.docFileNV();
		x.themNV(a);
		x.luuFileNV();
	}
	public NhanVien kiemtraMa(String MaNV) throws ClassNotFoundException, IOException {
		x.docFileNV();
		return x.kiemtra(MaNV);
	}
}
