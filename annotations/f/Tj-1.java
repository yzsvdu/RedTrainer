/*  1 */ package f;public final class Tj extends GS implements Np0 { public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) { if (paramhm02 == null || paramhm02.XW() == 0) return;  int i; if ((i = this.y60) == 0) { i = 153;
/*    */       
/*  3 */       i = (this.uH0.It0 - 1) * 3 + i;
/*  4 */       if (this.RT < 0) i += 21;  } else { i = 27;
/*    */       
/*  6 */       i = (this.uH0.It0 - 1) * 3 + i;
/*  7 */       i = (Math.min(Math.abs(i), 3) - 1) * 21 + i;
/*  8 */       if (this.y60 < 0) i += 63;  }  if (this
/*  9 */       .y60 != 0 && this
/* 10 */       .ar) { F40 f40 = F40.ef0; paramShort = 14;
/*    */       
/* 12 */       i = paramkf.AD.ex(i, paramhm02); String[] arrayOfString; (arrayOfString = new String[1])[0] = paramhm02.fA();
/*    */       
/* 14 */       paramkf.cr(Ml0.lz((byte)2, f40, paramShort, i, arrayOfString)); } else { F40 f40 = F40.ef0; paramShort = 14;
/*    */       
/* 16 */       i = paramkf.AD.ex(i, paramhm02); String[] arrayOfString; (arrayOfString = new String[1])[0] = paramhm02.fA();
/*    */       
/* 18 */       paramkf.Kq(Ml0.lz((byte)2, f40, paramShort, i, arrayOfString)); }
/* 19 */      hR hR1 = this.uH0;
/* 20 */     byte b = this.y60;
/* 21 */     boolean bool = this.ar; this(paramkf, paramhm01, paramhm02, this, b, bool); i70 i70;
/* 22 */     paramkf.YP
/* 23 */       .add(i70); }
/*    */ 
/*    */   
/*    */   public final hR uH0;
/*    */   public byte RT;
/*    */   public byte y60;
/*    */   public boolean ar;
/*    */   
/*    */   public Tj(hR paramhR, byte paramByte1, byte paramByte2, boolean paramBoolean) {
/*    */     this.uH0 = paramhR;
/*    */     this.RT = paramByte1;
/*    */     this.y60 = paramByte2;
/*    */     this.ar = paramBoolean;
/*    */   }
/*    */   
/*    */   public final byte YG0() {
/*    */     return 1;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Tj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */