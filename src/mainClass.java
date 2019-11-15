
public class mainClass {
	
	public static void main(String[] args) {
		KonkreterErzeugerA erzeugerA = new KonkreterErzeugerA();
		KonkreterErzeugerB erzeugerB = new KonkreterErzeugerB();

		KonkretesProduktA produktA = erzeugerA.fabrikmethode();
		KonkretesProduktB produktB = erzeugerB.fabrikmethode();

		produktA.wasBinIch();
		produktB.wasBinIch();
	}
}
