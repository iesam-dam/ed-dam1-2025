import Dominio.Cliente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setNombre("miguel");
        cliente.setApellidos("");
        cliente.setNIF("");
        cliente.setDireccion("");
        cliente.setLocalidad("");
        cliente.setProvincia("");
        cliente.setTelefono("");
        cliente.setEmail("");


        System.out.println(cliente.getNombre());
        System.out.println(cliente.getApellidos());
        System.out.println(cliente.getNIF());
        System.out.println(cliente.getDireccion());
        System.out.println(cliente.getLocalidad());
        System.out.println(cliente.getProvincia());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getEmail());


    }
}