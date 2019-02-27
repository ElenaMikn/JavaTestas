public class Main {
    public static void main(String[] args )
    {

        //Kurie iš priskyrimo sakinių yra sintaksiškai teisingi JAVA JDK 1.8?
        int skaicius ='x';
        System.out.println(skaicius );
        char simbolis = 64;
        System.out.println(simbolis);
        char zenklas = 0xAB;
        System.out.println(zenklas );
        float su_kableliu = 9.9f;
        System.out.println(su_kableliu );
        String simboliu_eilute = 22+"";
        System.out.println(simboliu_eilute );

        //
        Seimas seimas= new Seimas();
        Parlamentaras parlamentaras = new Parlamentaras("Petras","Petraitis");
        seimas.prideti_seimo_nary(parlamentaras);
        seimas.perziureti_narius();

        //5 ats: Į ekrana išves "Automobilis{ratas=Michellin}" Nes perrašėmeme standartines funkcijas kad tokiu fomratu.
        System.out.println(new Automobilis(new Ratas()));
    }
}
