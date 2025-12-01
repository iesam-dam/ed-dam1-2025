import features.Cliente;
public class Main {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente();
        cli1.setNombre("Juan");
        cli1.setApellidos("perez lozano");
        cli1.setNif("737377379X");
        cli1.setDireccion("calle la granja #22");
        cli1.setLocalidad("Avila");
        cli1.setProvincia("avila");
        cli1.setTelefono(677899877);
        cli1.setEmail("juanpe@gmail.com");

        System.out.println(" cliente 1 : ");
        System.out.println(cli1.getNombre());
        System.out.println(cli1.getApellidos());
        System.out.println(cli1.getNif());
        System.out.println(cli1.getDireccion());
        System.out.println(cli1.getLocalidad());
        System.out.println(cli1.getProvincia());
        System.out.println(cli1.getTelefono());
        System.out.println(cli1.getEmail());

        Cliente cli2 = new Cliente();
        cli2.setNombre(" Laura ");
        cli2.setApellidos(" Hernandez");
        cli2.setNif("838388838L");
        cli2.setDireccion(" avenidad madrid 12");
        cli2.setLocalidad("Madrid");
        cli2.setProvincia("Madrid");
        cli2.setTelefono(920224512);
        cli2.setEmail("lauher12@gmail.com ");

        System.out.println("Cliente 2 :");
        System.out.println(cli2.getNombre());
        System.out.println(cli2.getApellidos());
        System.out.println(cli2.getNif());
        System.out.println(cli2.getDireccion());
        System.out.println(cli2.getLocalidad());
        System.out.println(cli2.getProvincia());
        System.out.println(cli2.getTelefono());
        System.out.println(cli2.getEmail());

        Cliente cli3 = new Cliente();
        cli3.setNombre(" Mario");
        cli3.setApellidos(" Saez Lopez");
        cli3.setNif("82452615M");
        cli3.setDireccion(" avenida la paz 34");
        cli3.setLocalidad("Valladolid");
        cli3.setProvincia("Valladolid");
        cli3.setTelefono(678908767);
        cli3.setEmail("mariosapez89@gmail.com");

        System.out.println(" cliente 3 : ");
        System.out.println(cli3.getNombre());
        System.out.println(cli3.getApellidos());
        System.out.println(cli3.getNif());
        System.out.println(cli3.getDireccion());
        System.out.println(cli3.getLocalidad());
        System.out.println(cli3.getProvincia());
        System.out.println(cli3.getTelefono());
        System.out.println(cli3.getEmail());


    }
}