/*    */ package f;
/*    */ public final class Hw extends Dn0 { public Hw(ys0 paramys0, JG0 paramJG0) {
/*    */     super(paramJG0);
/*    */   }
/*  5 */   public final short xR(Vp0 paramVp0) { return this.ts0.Ht0.TL0.Hd0[paramVp0.gw0]; } public final pRn eo(Vp0 paramVp0) { pRn pRn; ys0 ys01; H10 h10;
/*    */     if ((h10 = (ys01 = this.ts0).Ht0.TL0).goto == -1)
/*    */     { pRn = pRn.BLACK; }
/*  8 */     else if (!paramVp0.Ko(h10.Hd0[paramVp0.gw0])) { pRn = pRn.WHITE; }
/*    */     else
/*    */     { pRn pRn1;
/*    */ 
/*    */ 
/*    */       
/* 14 */       UX uX = UX.Er(((ys0)this).Ht0.TL0.Kw0[paramVp0.gw0]);
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 19 */       byte b1 = (byte)this.S1.Mv();
/*    */       
/* 21 */       byte b2 = (byte)this.S1.jz();
/* 22 */       byte b3 = (byte)(this.PH0 * 2);
/* 23 */       this((byte)this.S1.k90(), b1, b2, b3); pRn = pRn1; }  return this; }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Hw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */