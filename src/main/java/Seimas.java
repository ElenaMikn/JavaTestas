public class Seimas {
   protected  Parlamentaras[] parlamentaras;
   public Seimas(Parlamentaras[] parlamentaras)
   {
       this.parlamentaras=parlamentaras;
   }
   protected void prideti_seimo_nary(Parlamentaras parlamentaras)
   {
        this.parlamentaras[this.parlamentaras.length]=parlamentaras;
   }
   protected void perziureti_narius()
   {
       for (int i=0;i<this.parlamentaras.length;i++)
       {
           System.out.println(this.parlamentaras[i].vardas+this.parlamentaras[i].pavarde);
       }
   }
}
