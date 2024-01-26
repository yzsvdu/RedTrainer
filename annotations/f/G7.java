package f;

public final class G7 extends Ip {
  public v20[] Jn0;
  
  public Un[] PA;
  
  public Wv0 gL0;
  
  public X50 zG;
  
  public of EG;
  
  public G7() {
    KF kF;
    rS rS;
    dQ dQ;
    Un un;
    this.Jn0 = new v20[0];
    Xu("dialoglayout");
    this.PA = new Un[this.Jn0.length];
    for (byte b = 0; b < this.Jn0.length; b++) {
      Un un1;
      this("Inspect Player");
      this.PA[b] = un1;
    } 
    this.zG = new X50(this);
    this();
    (this.gL0 = new Wv0(this.zG)).ek(Un.class, kF);
    this.gL0.Xu("/table");
    this.gL0.Gb0(true);
    this.gL0.zs0();
    this(this.gL0);
    this("Search Player: ");
    (this.EG = new of()).LE();
    dQ.Xy();
    this.EG.getClass();
    this("Search");
    (new Un()).tW(new QI(this));
    rK0(mE0().ee0(d7().Mg(new JG0[] { dQ, this.EG, un })).ee0(d7().Ya(rS)));
    WN(d7().ee0(mE0().Mg(new JG0[] { dQ, this.EG, un })).Aq(5).ee0(mE0().Mg(new JG0[] { rS })));
  }
  
  public final void d40() {
    this.gL0.jA(this.zG);
    super.d40();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/G7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */