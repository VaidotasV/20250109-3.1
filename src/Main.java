public class Main {
    public static void main(String[] args) {

        Mapas<DnsProvider, DnsServer> dnsMapas = new Mapas<>();
        dnsMapas.ideti(DnsProvider.GOOGLE, new DnsServer("8.8.8.8", "8.8.4.4"));
        dnsMapas.ideti(DnsProvider.CLOUDFLARE, new DnsServer("1.1.1.1", "1.0.0.1"));

        Mapas<String, String> stringMapas = new Mapas<>();
        stringMapas.ideti("vardas", "Vaidotas");
        stringMapas.ideti("miestas", "Klaipeda");

        System.out.println("DnsProvider -> DnsServer:");
        System.out.println(DnsProvider.GOOGLE + ": " + dnsMapas.gauti(DnsProvider.GOOGLE));
        System.out.println(DnsProvider.CLOUDFLARE + ": " + dnsMapas.gauti(DnsProvider.CLOUDFLARE));

        System.out.println("String -> String:");
        System.out.println("vardas: " + stringMapas.gauti("vardas"));
        System.out.println("miestas: " + stringMapas.gauti("miestas"));
    }
}
