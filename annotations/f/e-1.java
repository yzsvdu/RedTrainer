/*    */ package f;public final class e extends GS implements Np0 {
/*    */   public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) {
/*  3 */     LPT3 lPT3 = Of.eH.On0(this.aQ); if (paramhm02.XW() == 0) return;  if (this
/*  4 */       .DL0 == 0) { i = 153;
/*    */       
/*  6 */       i = (this.zl.It0 - 1) * 3 + i;
/*  7 */       if (this.aG0 < 0) i += 21;  paramkf
/*    */ 
/*    */         
/* 10 */         .Kq(Ml0.sB(5043, new String[] { paramhm02.fA(), Ml0.OH0(lPT3.Iu) })); } else { i = 938;
/*    */       
/* 12 */       i = (this.zl.It0 - 1) * 3 + i; }
/*    */     
/* 14 */     int i = (Math.min(this.DL0, 3) - 1) * 21 + i; F40 f40 = F40.ef0; paramShort = 14;
/*    */     
/* 16 */     i = paramkf.AD.ex(i, paramhm02); String[] arrayOfString; (arrayOfString = new String[2])[0] = paramhm02.fA(); (new String[2])[1] = 
/* 17 */       Ml0.OH0(lPT3.Iu);
/*    */ 
/*    */     
/* 20 */     paramkf.Kq(Ml0.lz((byte)2, f40, paramShort, i, arrayOfString)); byte b;
/* 21 */     if ((b = this.DL0) != 0) {
/*    */       i70 i70;
/* 23 */       hR hR1 = this.zl;
/* 24 */       this(paramkf, paramhm02, paramhm02, this, b, true);
/* 25 */       paramkf.YP.add(i70);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final short aQ;
/*    */   public final hR zl;
/*    */   public byte aG0;
/*    */   public byte DL0;
/*    */   
/*    */   public e(short paramShort, hR paramhR, byte paramByte1, byte paramByte2) {
/*    */     this.aQ = paramShort;
/*    */     this.zl = paramhR;
/*    */     this.aG0 = paramByte1;
/*    */     this.DL0 = paramByte2;
/*    */   }
/*    */   
/*    */   public final byte YG0() {
/*    */     return 56;
/*    */   }
/*    */ }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */