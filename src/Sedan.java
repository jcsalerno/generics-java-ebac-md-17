class Sedan extends Carro {
    private int capacidadePortaMalas;

    public Sedan(String modelo, String marca, int capacidadePortaMalas) {
        super(modelo, marca);
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    @Override
    public String toString() {
        return "Sedan { " + super.toString() + ", capacidadePortaMalas=" + capacidadePortaMalas + " }";
    }
}