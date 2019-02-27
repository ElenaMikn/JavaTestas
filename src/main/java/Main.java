import java.util.ArrayList;
import java.util.List;
interface Garsas {void skleisti();}
class Zebras implements Garsas{@Override public void skleisti(){}}
class Motociklas implements Garsas{@Override public void skleisti(){}}

interface Procesas extends Runnable,Cloneable,Comparable{};
//class Gija extends Process{}
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

        //6:ats: grąžina klaidą "Exception in thread "main" java.lang.ClassCastException: java.lang.Object cannot be cast to Garsas", o pašalinus šita eilute atspausdina "Zebras@445b84c0
        //Motociklas@61a52fbd" tai yra objekto klases pavadinimą ir adresą
        List<Garsas> zebru_sarasas=  new ArrayList<>();
        zebru_sarasas.add(new Zebras());
        zebru_sarasas.add(new Motociklas());
        //zebru_sarasas.add((Garsas) new Object());
        for(Garsas zebru_sarasa: zebru_sarasas)
        {
            System.out.println(zebru_sarasa);
        }
        System.out.println(koordinetes(10,20));
        System.out.println(koordinetes(8,32.0));
        System.out.println(koordinetes(8.0,32.0));

    }
    static String koordinetes(int x, int y){return "x:"+x+", y:"+y; }
    static String koordinetes(double x, double y){return "x:"+x+", y:"+y; }
    static String koordinetes(int x, double y){return "x:"+x+", y:"+y; }
}
