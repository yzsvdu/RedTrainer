package f;

import com.badlogic.gdx.graphics.Color;

public final class sK0 extends Wr {
  public static final eo Ya = new eo();
  
  public sK0() {
    Lj0 lj01;
    Lj0 lj02;
    Xu("/resizableframe");
    TG0(new LpT2(this));
    this();
    this();
    this();
    sC(sK0::Sf);
    lj02.sC(sK0::Rp);
    lj03.sC(sK0::ik);
    Ld(-16.0F, 16.0F);
    Ng(0.05F);
    lj02.Ld(-16.0F, 16.0F);
    lj02.Ng(0.05F);
    lj03.Ld(-16.0F, 16.0F);
    lj03.Ng(0.05F);
    eo eo1;
    MF0((eo1 = Ya).x);
    lj02.MF0(eo1.y);
    Lj0 lj03;
    (lj03 = new Lj0()).MF0(eo1.z);
    (new YA0()).try(new dQ("Vector:")).Xj0(10.0F).Kw().zm0();
    (new YA0()).try(this).x70().J80(5.0F);
    (new YA0()).try(lj02).x70().J80(5.0F);
    (new YA0()).try(lj03).x70().J80(5.0F).sg(5.0F);
    J8(new YA0());
  }
  
  public sK0(Color paramColor) {
    Lj0 lj02;
    Lj0 lj03;
    Xu("/resizableframe");
    TG0(this::ra0);
    this();
    this();
    this();
    this();
    sC(paramColor::QR);
    lj02.sC(paramColor::OK);
    lj03.sC(paramColor::le);
    lj04.sC(paramColor::KB0);
    Ld(0.0F, 1.0F);
    Ng(0.01F);
    lj02.Ld(0.0F, 1.0F);
    lj02.Ng(0.01F);
    lj03.Ld(0.0F, 1.0F);
    lj03.Ng(0.01F);
    lj04.Ld(0.0F, 1.0F);
    lj04.Ng(0.01F);
    MF0(paramColor.r);
    lj02.MF0(paramColor.g);
    lj03.MF0(paramColor.b);
    Lj0 lj04;
    (lj04 = new Lj0()).MF0(paramColor.a);
    (new YA0()).try(new dQ("Color:")).Xj0(10.0F).Kw().zm0();
    (new YA0()).try(this).x70().J80(5.0F);
    (new YA0()).try(lj02).x70().J80(5.0F);
    (new YA0()).try(lj03).x70().J80(5.0F);
    (new YA0()).try(lj04).x70().J80(5.0F).sg(5.0F).zm0();
    this();
    sC(paramColor::gN);
    Lj0 lj01;
    (lj01 = new Lj0()).MF0(paramColor.r);
    (new Lj0()).Ld(0.0F, 1.0F);
    (new Lj0()).Ng(0.01F);
    (new YA0()).try(new Lj0()).x70().Yv(Integer.valueOf(5)).J80(5.0F).AuX(25.0F);
    J8(new YA0());
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/sK0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */