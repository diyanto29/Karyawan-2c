public class KaryawanTest{
	public static void main(String[] args){
		System.out.println(" Gaji Karyawan POLINDRA");
		System.out.println(" ");
		Desaigner desainer = new Desaigner();
		desainer.setNama("DIYANTO");
		desainer.setAlamat("Desa Sukasari RT 04 RW 01 ");
		desainer.setGaji(50);

		System.out.println(" ");
		Pm projectmanager = new Pm();
		projectmanager.setNama("ATO DIYANTO");
		projectmanager.setAlamat("Desa dongkal");
		projectmanager.setGaji(100);

		System.out.println(" ");
		Programmer programmer = new Programmer();
		programmer.setNama("IRMA ");
		programmer.setAlamat("Indramayu");
		programmer.setGaji(90);

	}
}