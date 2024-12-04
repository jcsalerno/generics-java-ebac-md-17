class Carro {
    private String modelo;
    private String marca;

    public Carro(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro { modelo='" + modelo + "', marca='" + marca + "' }";
    }
}