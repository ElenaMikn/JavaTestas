import java.util.ArrayList;
public class Seimas {
   protected  ArrayList<Parlamentaras> parlamentaras;
   public Seimas() {
       this.parlamentaras= new ArrayList<Parlamentaras>();
   }
   public Seimas(ArrayList<Parlamentaras>  parlamentaras)
   {
       this.parlamentaras=parlamentaras;
   }
   protected void prideti_seimo_nary(Parlamentaras parlamentaras)
   {
        this.parlamentaras.add(parlamentaras);
   }
   protected void perziureti_narius()
   {
       for(Parlamentaras str:this.parlamentaras)
       {
           System.out.println(str.vardas+" "+str.pavarde);
       }
   }
}
