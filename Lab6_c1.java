package Lab6;

public abstract class NhanVien {
	protected String ten;
	protected long luong;
	public NhanVien(String ten, long luong) {
		super();
		this.ten = ten;
		this.luong = luong;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public long getLuong() {
		return luong;
	}
	public void setLuong(long luong) {
		this.luong = luong;
	}
	
	public  void tinhLuong() {
		
	}
	
	public String xuatLuong() {
		return "NhanVien [ten=" + ten + ", luong=" + luong + "]";
	}
	
	public abstract String loaiNhanVien() ;
}

package Lab6;

public class NhanVienFullTime extends NhanVien  {
	private int loaiChucVu;
	private int ngayLamThem;
	
	public NhanVienFullTime(String ten, long luong, int loaiChucVu, int ngayLamThem) {
		super(ten, luong);
		this.loaiChucVu = loaiChucVu;
		this.ngayLamThem = ngayLamThem;
	}
	
	public int getLoaiChucVu() {
		return loaiChucVu;
	}

	public void setLoaiChucVu(int loaiChucVu) {
		this.loaiChucVu = loaiChucVu;
	}

	public int getNgayLamThem() {
		return ngayLamThem;
	}

	public void setNgayLamThem(int ngayLamThem) {
		this.ngayLamThem = ngayLamThem;
	}

	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub
		System.out.println("day du");
		
	}
	
	@Override
	public String loaiNhanVien() {
		System.out.println("Nhan vien full time");
		return null;
	}
		
}

package Lab6;

public class NhanVienPartTime extends NhanVien {
	private  int gioLamViec;
	
	

	public NhanVienPartTime(String ten, long luong, int gioLamViec) {
		super(ten, luong);
		this.gioLamViec = gioLamViec;
	}
	

	public int getGioLamViec() {
		return gioLamViec;
	}


	public void setGioLamViec(int gioLamViec) {
		this.gioLamViec = gioLamViec;
	}


	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub
		System.out.println("Vua du");
		
	}

	


	@Override
	public String loaiNhanVien() {
		System.out.println("Nhan vien part time");
		return null;
	}
	
}

package Lab6;



public class text_lab6 {
	public static void main(String[] args) {
			NhanVienFullTime ft = new NhanVienFullTime("Van A", 120000, 04, 2/3/2000);
			ft.loaiNhanVien();
			NhanVienPartTime pt = new NhanVienPartTime("Van B", 202222, 5);
			pt.loaiNhanVien();
			
	}
}
