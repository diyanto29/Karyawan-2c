public class Karyawan{
	String nama;
	String alamat;
	private int gaji;

	public void setGaji(int fee){
		gaji=fee;
	}

	public void setNama(String nama){
		System.out.println("nama = "+nama);
	}

	public void setAlamat(String alamat){
		System.out.println("Alamat = "+alamat);
	}

	public int getGaji(){
		return this.gaji;
	}

	
}