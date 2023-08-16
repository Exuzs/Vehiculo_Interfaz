public class Vehiculo {
    protected int ruedas;
    protected String marca;
    protected String modelo;

    public Vehiculo(int ruedas, String marca, String modelo) {
        this.ruedas = ruedas;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void obtenerInformacion() {
        System.out.println("Tipo: Vehiculo");
        System.out.println("Ruedas: " + ruedas);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
