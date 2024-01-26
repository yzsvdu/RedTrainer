/*  1 */ package f;public final class AM extends SI0 { public final void p4(kf paramkf) { if (!(paramkf instanceof qq0)) return;  for (byte b = 0; b < this.kj.length; ) {
/*  2 */       hm0 hm0; if ((hm0 = paramkf.AD.N0(b, (byte)0)) != null)
/*  3 */         hm0.Ui0
/*    */           
/*  5 */           .re = this.kj[b];  b = (byte)(b + 1);
/*  6 */     }  this(paramkf); ql ql; Z5 z5; gf0 gf0; ub ub;
/*  7 */     paramkf.YP
/*  8 */       .add(z5);
/*  9 */     this(paramkf);
/* 10 */     paramkf.YP.add(gf0);
/* 11 */     this(this, paramkf);
/* 12 */     paramkf.YP.add(ub);
/* 13 */     this(paramkf);
/* 14 */     paramkf.YP.add(this); }
/*    */ 
/*    */   
/*    */   public byte ox0;
/*    */   public byte[] mu;
/*    */   public byte[] Sz0;
/*    */   public short[] kj;
/*    */   
/*    */   public AM(byte paramByte, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, short[] paramArrayOfshort) {
/*    */     this.ox0 = paramByte;
/*    */     this.mu = paramArrayOfbyte1;
/*    */     this.Sz0 = paramArrayOfbyte2;
/*    */     this.kj = paramArrayOfshort;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/AM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */