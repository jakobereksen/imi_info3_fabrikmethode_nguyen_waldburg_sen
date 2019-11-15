public class KonkreterErzeugerB extends Erzeuger {
    @Override

    public void operation() {}

    public KonkretesProduktB fabrikmethode() {

        return new KonkretesProduktB();
    };
}