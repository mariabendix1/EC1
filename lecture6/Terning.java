import java.util.Random;

class Terning{
  Random rand = new Random();
  // default antalSider
  int antalSider = 6;
  int slag;

  public Terning(int antalSider){
    this.antalSider = antalSider;
  }

  void kast(){
    slag = rand.nextInt(this.antalSider) + 1;
  }

  int vaerdi(){
    return slag;
  }
}
