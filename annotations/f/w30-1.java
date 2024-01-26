/*    */ package f;public final class w30 extends Kl0 { public final void Cx() {
/*    */     vh0 vh0;
/*  3 */     for (Enumeration<Integer> enumeration = (vh0 = (r8()).Qa).KO.keys(); enumeration.hasMoreElements(); ) { int i = ((Integer)enumeration.nextElement()).intValue(); if (this
/*  4 */         .yD == i) { this.Ct = null; continue; }  Jo jo; Kr0 kr0; if ((jo = this.Ct) != null && (
/*  5 */         kr0 = jo.pJ) != null && kr0
/*  6 */         .Jg == i) jo
/*  7 */           .mA0(null, false);  this
/*  8 */         .KO.remove(Integer.valueOf(i)); My my;
/*    */       WX wX;
/* 10 */       if ((wX = (WX)(my = km.si0).qb.remove(i)) != null) my.jf0(wX);  JG0 jG0; if ((jG0 = (JG0)my.l3.remove(i)) != null) my.jf0(jG0);  }
/*    */   
/*    */   }
/*    */   
/*    */   public w30(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   public final void sM() {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/w30.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */