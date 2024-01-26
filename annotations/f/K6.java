package f;

import java.util.ArrayList;

public final class K6 extends Ip {
  public ArrayList Fo0;
  
  public Un[] bn0;
  
  public Wv0 f30;
  
  public private KI;
  
  public of YD0;
  
  public fH0 da0;
  
  public K6(fH0 paramfH0) {
    lJ lJ;
    rS rS1;
    Un un1;
    rS rS2;
    Ip ip;
    Un un2;
    Un un3;
    this.Fo0 = new ArrayList();
    Xu("dialoglayout");
    this.da0 = paramfH0;
    fh();
    this.KI = new private(this);
    this();
    (this.f30 = new Wv0(this.KI)).ek(Un.class, lJ);
    this.f30.Xu("/table");
    this.f30.Gb0(true);
    this.f30.zs0();
    this(this.f30);
    this("Add Note: ");
    this.YD0 = new of();
    dQ dQ;
    (dQ = new dQ()).Xy();
    this.YD0.ZW();
    this(this.YD0);
    (new rS()).Xu("/text-scrollpane");
    this.YD0.Zh("");
    this();
    this("Add");
    (new Un()).tW(new PRN(this, ip));
    this("Cancel");
    (new Un()).tW(new OS(this, ip));
    (new Ip()).Xu("/adminframe-dialog");
    (new Ip()).rK0((new Ip()).mE0().ee0(ip.d7().Mg(new JG0[] { dQ })).ee0(ip.d7().Ya(rS2)).ee0(ip.d7().Mg(new JG0[] { un2, un3 })));
    (new Ip()).WN((new Ip()).d7().ee0(ip.mE0().Mg(new JG0[] { dQ })).ee0(ip.mE0().Mg(new JG0[] { rS2 })).ee0(ip.mE0().Mg(new JG0[] { un2, un3 })));
    this("Add");
    (new Un()).tW(new H9(this, ip));
    rK0(mE0().ee0(d7().Ya(un1).Aq(250)).ee0(d7().Ya(rS1)));
    WN(d7().ee0(mE0().Mg(new JG0[] { un1 })).Aq(5).ee0(mE0().Mg(new JG0[] { rS1 })));
  }
  
  public final boolean i2(oa0 paramoa0) {
    return this.YD0.p3();
  }
  
  public final void d40() {
    this.f30.Ye(0, 90);
    this.f30.Ye(1, 165);
    this.f30.Ye(2, 425);
    this.f30.Ye(3, 60);
    this.f30.mM();
    super.d40();
  }
  
  public final void fh() {
    this.bn0 = new Un[this.Fo0.size()];
    for (byte b = 0; b < this.Fo0.size(); b++) {
      Un un;
      this("Delete");
      this.bn0[b] = un;
      this.bn0[b].tW(new YD0(this, b));
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/K6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */