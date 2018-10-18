public class Pm extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=100){
			System.out.println("Gaji Sebagai Project Manager Sebesar = Rp. "+gaji);
		}else{
			System.out.println("Maanfaatkan Gaji anda!!");
		}
	}
}