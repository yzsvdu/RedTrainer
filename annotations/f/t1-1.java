/*   */ package f;public final class t1 extends Qa0 implements r60 { public final boolean i2(oa0 paramoa0) {
/* 2 */     if (B8.Wm0(paramoa0.cz0) && paramoa0
/* 3 */       .oO() && 
/*   */       
/* 5 */       h1.J20(paramoa0.GG0, BM.lc)) { this.h70.zt0(); return true; }  return super.i2(paramoa0);
/*   */   }
/*   */   
/*   */   public final pA h70;
/*   */   public rS LG;
/*   */   public Ip Os;
/*   */   
/*   */   public t1(pA parampA, oD0 paramoD0, Jj0[] paramArrayOfJj0) {
/*   */     super(km.XU());
/*   */     Wv0 wv0;
/*   */     uL uL;
/*   */     this.h70 = parampA;
/*   */     Xu("high-score-window");
/*   */     Lo(Ml0.Go(1129, paramoD0.toString()));
/*   */     EP(1);
/*   */     TG0(parampA::zt0);
/*   */     this.LG = new rS();
/*   */     this();
/*   */     (new Wv0()).Xu("high-score-table");
/*   */     (new Wv0()).jA(new ij(paramoD0, paramArrayOfJj0));
/*   */     this();
/*   */     (new Wv0()).ek(Q20.class, uL);
/*   */     this.LG.Gz0(wv0);
/*   */     this.Os = new Ip();
/*   */     if (km.XU()) {
/*   */       this.Os.rK0(this.Os.d7().Ya(this.LG));
/*   */     } else {
/*   */       byte b;
/*   */       if (t90.bigCJKFontSizes()) {
/*   */         b = 0;
/*   */       } else {
/*   */         b = 32;
/*   */       } 
/*   */       this.Os.rK0(this.Os.d7().Aq(b).Ya(this.LG).Aq(b));
/*   */     } 
/*   */     this.Os.WN(this.Os.d7().cOM8(new U90[] { this.Os.mE0().Mg(new JG0[] { this.LG }) }));
/*   */     J8(this.Os);
/*   */   }
/*   */   
/*   */   public final void LM(throws paramthrows) {
/*   */     super.LM(paramthrows);
/*   */     VA0.c90(this);
/*   */   }
/*   */   
/*   */   public final void d40() {
/*   */     if (km.XU())
/*   */       QI(); 
/*   */     super.d40();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/t1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */