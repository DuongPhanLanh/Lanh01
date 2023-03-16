package Lab6;

public class HOC_SINH  {
	private String hoTen;
	private int lop;
	private double toan;
	private double ly;
	private double hoa;
	public HOC_SINH(String hoTen, int lop, double toan, double ly, double hoa) {
		//super();
		this.hoTen = hoTen;
		this.lop = lop;
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getLop() {
		return lop;
	}
	public void setLop(int lop) {
		this.lop = lop;
	}
	public double getToan() {
		return toan;
	}
	public void setToan(double toan) {
		this.toan = toan;
	}
	public double getLy() {
		return ly;
	}
	public void setLy(double ly) {
		this.ly = ly;
	}
	public double getHoa() {
		return hoa;
	}
	public void setHoa(double hoa) {
		this.hoa = hoa;
	}
	public double diemTrungBinh() {
		return diemTrungBinh();
	}
	
}

package Lab6;

public class CHUYEN_TOAN extends HOC_SINH {

	public CHUYEN_TOAN(String hoTen, int lop, double toan, double ly, double hoa) {
		super(hoTen, lop, toan, ly, hoa);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double diemTrungBinh() {
		return ((this.getToan()*2+this.getLy()+this.getHoa())/4);
	}
	public static void main(String[] args) {
		CHUYEN_TOAN ct = new CHUYEN_TOAN("NAM", 12, 9, 7, 5);
		System.out.println(ct.diemTrungBinh());
	}
}
