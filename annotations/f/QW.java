/*  1 */ package f;public final class QW extends Wr { public long jB0; public QW(js paramjs, String paramString, int paramInt) { MK0 mK0; this.Rk = false; if (paramInt < 0) paramInt = 5000;  EP(1); Xu("notification"); this.Km = paramjs; this.jB0 = System.currentTimeMillis() + paramInt;
/*  2 */     this(this, paramString); (new MK0()).Xu("label"); (new Ip()).rK0((new Ip()).mE0().Ya(mK0)); (new Ip()).WN((new Ip()).d7().Ya(mK0)); J8(new Ip()); } public js Km; public boolean Rk; public final boolean i2(oa0 paramoa0) { int i; int j; if (B8.Pg(i = paramoa0.cz0) && ((
/*  3 */       j = paramoa0.vl) == 1 || j == 0) && i == 3) this
/*  4 */         .jB0 = System.currentTimeMillis(); 
/*  5 */     return super.i2(paramoa0); } public final void V90(throws paramthrows) { if (this.Rk)
/*    */     { if (System.currentTimeMillis() >= this.jB0 + 300L)
/*    */         UB0.Kg0.fN(new W80(this));  }
/*    */     else if (System.currentTimeMillis() >= this.jB0)
/*  9 */     { this.Rk = true; char c = 'ú'; this(new KO(this.O, Wr.Ny), pRn.WHITE);
/* 10 */       this.db0 = new I(); I i;
/* 11 */       if ((i = this.db0) == null && !this.dP) i
/* 12 */           .oC0(0);  i
/* 13 */         .oC0(c); }  super
/* 14 */       .V90(paramthrows); }
/*    */ 
/*    */   
/*    */   public final void CQ(boolean paramBoolean) {
/*    */     super.CQ(paramBoolean);
/*    */     if (!paramBoolean)
/*    */       UB0.Kg0.fN(new W80(this)); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/QW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */