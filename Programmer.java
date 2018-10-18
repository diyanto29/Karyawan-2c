public class Programmer extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=90){
			System.out.println("Gaji  programmer sebesar = Rp. "+gaji);
		}else {
			System.out.println("Manfaatkan Gaji Anda dengan bijak");
		}
	}
}