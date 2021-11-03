public class Rafle{
  Terning[] terninger;

  public Rafle(int antalTerninger){
     terninger = new Terning[antalTerninger];
     for (int i = 0; i < terninger.length; i++) {
       terninger[i] = new Terning();
     }
  }

  void ryst(){
    for (Terning t : terninger){
            t.kast();
    }
  }

  int sum (){
    int resultat = 0;
    for (Terning t : terninger){
       resultat += t.vaerdi();
       System.out.println(t);
    }
    return resultat;
  }

  boolean erDerSlaaetEn(int slag){
    for (int i = 0; i < terninger.length; i++){
      if (terninger[i].vaerdi() == slag){
        return true;
      }
    }
    return false;
  }

}
