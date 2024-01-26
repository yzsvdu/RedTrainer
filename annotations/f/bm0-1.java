/*  1 */ package f;public final class bm0 extends SI0 { public final void p4(kf paramkf) { if (this.Gd
/*  2 */       .FI0 == paramkf
/*  3 */       .AD
/*  4 */       .hG0())
/*    */     { String str, arrayOfString[];
/*    */       
/*  7 */       byte b = this.Gd.FI0;
/*    */       hm0 hm0;
/*  9 */       if ((hm0 = paramkf.AD.N0(b, this.Gd.md)) != null) { str = hm0.fA(); } else { str = ""; }
/*    */       
/* 11 */       switch (Zk0.yE(this.XQ)) { case 4: (arrayOfString = new String[1])[0] = str; paramkf
/*    */             
/* 13 */             .Kq(Ml0.tG((byte)2, F40.ef0, 8, 47, arrayOfString)); break;case 3: paramkf.Kq(Ml0.Go(6067, str)); paramkf.Kq(Ml0.Qf0(F40.ef0, 15, 72)); break;case 2: paramkf.Kq(Ml0.OH0(5023)); break;case 1: paramkf.Kq(Ml0.Qf0(F40.ef0, 15, 74)); break;case 0: km.pm0.bL((byte)2, (short)1386); paramkf.Kq(Ml0.Qf0(F40.ef0, 15, 72)); break; }  }  if (this
/* 14 */       .XQ == 6) {
/* 15 */       String str = "";
/*    */       
/*    */       QZ qZ;
/*    */       
/* 19 */       if ((qZ = paramkf.AD.wB(this.Gd.FI0)) != null) str = K5();  paramkf.Kq(Ml0.Go(5040, str));
/*    */     }  }
/*    */ 
/*    */   
/*    */   public final mJ Gd;
/*    */   public final int XQ;
/*    */   
/*    */   public bm0(mJ parammJ, int paramInt) {
/*    */     this.Gd = parammJ;
/*    */     this.XQ = paramInt;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/bm0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */