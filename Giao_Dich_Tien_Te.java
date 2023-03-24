package BAI3;

public class Giao_Dich_Tien_Te extends Giao_Dich {
	private double tiGia;
	private String loaiTienTe;
	
	public Giao_Dich_Tien_Te(String maGiaoDich, int ngayGiaoDich, double donGia, int soLuong, double tiGia,
			String loaiTienTe) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		this.tiGia = tiGia;
		this.loaiTienTe = loaiTienTe;
	}
	
	public double getTiGia() {
		return tiGia;
	}
	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}
	public String getLoaiTienTe() {
		return loaiTienTe;
	}
	public void setLoaiTienTe(String loaiTienTe) {
		this.loaiTienTe = loaiTienTe;
	}
	
	@Override
	public String toString() {
		return "Giao_Dich_Tien_Te [tiGia=" + tiGia + ", loaiTienTe=" + loaiTienTe + "]";
	}
	
	public double TienEuro_USD() {
		return this.donGia*this.soLuong*this.tiGia;
	}
	
	public double TienVN() {
		return this.donGia*this.soLuong;
	}

}
