public class Desaigner extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=70){
			System.out.println("Gaji Anda sebagai desaigner Sebesar = Rp."+gaji);
		}else{
			System.out.println("Kerja Dulu baru gaji");
		}
	}
}