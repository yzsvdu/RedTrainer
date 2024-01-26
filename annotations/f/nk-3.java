/*  1 */ package f;public final class nk extends Wv0 { public no i2; public fA0 S80; public final void Ki(int paramInt) { fA0 fA01; super.Ki(paramInt); no[] arrayOfNo; if ((arrayOfNo = no.FV).length <= paramInt) return;  no no1 = arrayOfNo[paramInt]; no no2; if ((no2 = this.i2) == no1) { if ((fA01 = this.S80.xs0()) != null) { if (this.S80 != fA01) { this.S80 = fA01;
/*  2 */           mw0(); WH(); }  }
/*  3 */       else { throw new NullPointerException("order"); }  } else { if (fA01 != null) { if (no2 != fA01) { this
/*  4 */             .i2 = (no)fA01;
/*  5 */           mw0(); WH(); }  return; }
/*  6 */        throw new NullPointerException("column"); }  }
/*  7 */   public QF0 Qc; public CoM7 Ac0; public nk(nUL paramnUL) { CoM7 coM7; Ve ve; uL uL; this.i2 = no.BB; this.S80 = fA0.pz; this.Qc = new QF0(); this(paramnUL); this.Ac0 = new CoM7(); jA(this); this(); ek(Un.class, this); this(); ek(Q20.class, this); Xu("/member-table"); Gb0(true); zs0(); Pb0(0); mw0(); } public final void WH() { this(); ArrayList<qk> arrayList; for (qk qk : km.u4.qH0) { QF0 qF0; if ((qF0 = this.Qc) == null || qF0.kr(qk)) arrayList.add(qk);  }  Collections.sort(arrayList, this.i2.Z70); if (this.S80 == fA0.tk) Collections.reverse(arrayList);  qk[] arrayOfQk1 = arrayList.<qk>toArray(new qk[0]); CoM7 coM7; qk[] arrayOfQk2; if ((arrayOfQk2 = (coM7 = this.Ac0).ux0).length > 0) in0(arrayOfQk2.length);  this.ux0 = arrayOfQk1; i2(arrayOfQk1.length);
/*    */     QK0 qK0;
/*  9 */     if ((qK0 = km.u4.qH0)
/* 10 */       .t40) this
/* 11 */         .t40 = false;  }
/*    */ 
/*    */   
/*    */   public final void V90(throws paramthrows) {
/*    */     boolean bool;
/*    */     super.V90(paramthrows);
/*    */     QK0 qK0;
/*    */     if ((qK0 = km.u4.qH0).t40) {
/*    */       qK0.t40 = false;
/*    */       bool = true;
/*    */     } else {
/*    */       bool = false;
/*    */     } 
/*    */     if (bool)
/*    */       WH(); 
/*    */   }
/*    */   
/*    */   public final void mw0() {
/*    */     int i = this.i2.ordinal();
/*    */     df0(i, this.S80);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/nk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */