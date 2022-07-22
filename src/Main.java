public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Alberto Ramos");
        cliente.setEdad(24);
        cliente.setTelefono("676654320");
        cliente.setCredito(7000.00);

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Alberto Ramos");
        trabajador.setEdad(24);
        trabajador.setTelefono("676654320");
        trabajador.setSalario(3000.00);

        System.out.println("El cliente " + cliente.getNombre() + " de " + cliente.getEdad()+ " años de edad " + "cuyo número de teléfono es " + cliente.getTelefono() + " tiene un crédito de " + cliente.getCredito() + " euros.");
        System.out.println("El trabajador " + trabajador.getNombre() + " de " + trabajador.getEdad()+ " años de edad " + "cuyo número de teléfono es " + trabajador.getTelefono() + " tiene un salario de " + trabajador.getSalario() + " euros.");
    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    }

class Cliente extends Persona {
    double credito;


    public double getCredito() {
        return this.credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    double salario;

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
