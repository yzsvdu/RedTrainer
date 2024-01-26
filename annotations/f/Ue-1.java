/*  1 */ package f;public final class Ue extends Wv0 { public oJ RD0; public fA0 sw0; public final void Ki(int paramInt) { fA0 fA01; super.Ki(paramInt); oJ[] arrayOfOJ; if ((arrayOfOJ = oJ.Cg0).length <= paramInt) return;  oJ oJ1 = arrayOfOJ[paramInt]; oJ oJ2; if ((oJ2 = this.RD0) == oJ1) { fA01 = this.sw0.xs0(); if (this.sw0 != fA01) { this.sw0 = fA01;
/*  2 */         N60(); sJ(); }  } else if (oJ2 != fA01) { this
/*  3 */         .RD0 = (oJ)fA01;
/*  4 */       N60(); sJ(); }  }
/*  5 */   public Qp0 GX; public Ue() { Qp0 qp0; Ve ve; uL uL; this.RD0 = oJ.Yk0; this.sw0 = fA0.pz; this(); this.GX = new Qp0(); jA(this); this(); ek(Un.class, this); this(); ek(Q20.class, this); Xu("instance-table"); Gb0(true); zs0(); Pb0(0); N60(); } public final void sJ() { ak ak; (ak = LPT5.tD0.EJ0).getClass(); this(new Ux(ak)); ArrayList<?> arrayList; Collections.sort(arrayList = new ArrayList(), this.RD0.F90); if (this.sw0 == fA0.tk) Collections.reverse(arrayList);  iq[] arrayOfIq1 = arrayList.<iq>toArray(new iq[0]); Qp0 qp0; iq[] arrayOfIq2;
/*  6 */     if ((arrayOfIq2 = (qp0 = this.GX).NA).length > 
/*  7 */       0)
/*  8 */       in0(arrayOfIq2.length);  this.NA = arrayOfIq1;
/*    */     
/* 10 */     i2(arrayOfIq1.length); }
/*    */ 
/*    */   
/*    */   public final void d40() {
/*    */     mM();
/*    */     super.d40();
/*    */   }
/*    */   
/*    */   public final void N60() {
/*    */     int i = this.RD0.ordinal();
/*    */     df0(i, this.sw0);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */