public class KonkreterErzeugerA extends Erzeuger {
	@Override

	public void operation() {}

	public KonkretesProduktA fabrikmethode() {

		return new KonkretesProduktA();
	};
}
