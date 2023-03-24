package BAI3;

public class Giao_Dich_Vang extends Giao_Dich {
	private String loaiVang;

	public Giao_Dich_Vang(String maGiaoDich, int ngayGiaoDich, double donGia, int soLuong, String loaiVang) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		this.loaiVang = loaiVang;
	}
	
	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}
	

	@Override
	public String toString() {
		return "Giao_Dich_Vang [loaiVang=" + loaiVang + "]";
	}

	public double thanhTien() {
		return this.soLuong* this.donGia;
	}
		
}
