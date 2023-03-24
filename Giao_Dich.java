package BAI3;

public abstract class Giao_Dich {
	protected String maGiaoDich;
	protected int NgayGiaoDich;
	protected double donGia;
	protected int soLuong;
	
	public Giao_Dich(String maGiaoDich, int ngayGiaoDich, double donGia, int soLuong) {
		// super();
		this.maGiaoDich = maGiaoDich;
		NgayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}

	public String getMaGiaoDich() {
		return maGiaoDich;
	}

	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	public int getNgayGiaoDich() {
		return NgayGiaoDich;
	}

	public void setNgayGiaoDich(int ngayGiaoDich) {
		NgayGiaoDich = ngayGiaoDich;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	@Override
	public String toString() {
		return "Giao_Dich [maGiaoDich=" + maGiaoDich + ", NgayGiaoDich=" + NgayGiaoDich + ", donGia=" + donGia
				+ ", soLuong=" + soLuong + "]";
	}
	
	
}
