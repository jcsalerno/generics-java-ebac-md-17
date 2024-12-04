class SUV extends Carro {
    private boolean tracao4x4;

    public SUV(String modelo, String marca, boolean tracao4x4) {
        super(modelo, marca);
        this.tracao4x4 = tracao4x4;
    }

    @Override
    public String toString() {
        return "SUV { " + super.toString() + ", tracao4x4=" + tracao4x4 + " }";
    }
}