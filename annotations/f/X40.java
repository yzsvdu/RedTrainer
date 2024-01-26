/* 1 */ package f;public final class X40 extends me { public final void Ad0(short[] paramArrayOfshort) { lpt1 lpt12; byte b1; lpt1 lpt11; byte b3, arrayOfByte1[], arrayOfByte2[]; byte b; byte b5; if (paramArrayOfshort.length < 1) return;  switch (paramArrayOfshort[0]) { default: return;case 410: if (paramArrayOfshort.length < 4) return;  b2 = (byte)paramArrayOfshort[1]; b3 = (byte)paramArrayOfshort[2]; b4 = (byte)paramArrayOfshort[3]; if ((arrayOfByte2 = this.H40[b2])[b3] == b4) return;  arrayOfByte2[b3] = b4; (this.Qc[b2][b3]).k = 1.0F; this.Qc[b2][b3].rd(b4, false, null);case 409: if (b2.length < 
/* 2 */           2) return;  b2 = (byte)b2[1]; b4 = (arrayOfByte1 = this.Zs)[b2];
/* 3 */         if ((b5 = (arrayOfByte2 = this.H40[b2])[0]) == 0 && arrayOfByte2[1] == 0) { b = 3; } else if (b5 == 0) { b = 2; } else if (b[1] == 0) { b = 1; } else { b = 0; }  arrayOfByte1[b2] = b;
/* 4 */         (lpt12 = this.Yl[b2]).k = 1.0F; b2 = Cz0(b4, b);
/* 5 */         rd(b2, false, null);case 407: if (b2.length < 3) return;  b1 = (byte)b2[1]; b2 = (byte)b2[2]; (lpt11 = ((X40)super).OI0[b1][b2]).k = 1.0F; b2 = 0; rd(b2, false, null);case 406: break; }  if (b2.length < 
/* 6 */       2) return;  byte b2 = b2[1]; byte arrayOfByte[][], b4;
/* 7 */     for (arrayOfByte = new byte[3][2], b4 = 0; b4 < 3; ) { for (b = 0; b < 2; ) { if ((b2 & 1 << b4 * 2 + b) != 0) arrayOfByte[b4][b] = 1;  b++; }  b4++; }  ((X40)super)
/* 8 */       .H40 = arrayOfByte; super.Rh(); }
/*   */ 
/*   */   
/*   */   public lpt1 Xt;
/*   */   public lpt1[] Yl = new lpt1[3];
/*   */   public lpt1[][] Qc = new lpt1[3][2];
/*   */   public lpt1[][] OI0 = new lpt1[3][2];
/*   */   public byte[][] H40 = new byte[3][2];
/*   */   public byte[] Zs = new byte[3];
/*   */   
/*   */   public X40(pI parampI) {
/*   */     super(parampI);
/*   */     Ve0.Mw().getClass();
/*   */     lpt1 lpt11 = Ve0.XI0();
/*   */     lpt11.mh.g7(8.0F, 0.0F, 8.0F);
/*   */     kc(this.Xt);
/*   */     float[] arrayOfFloat1;
/*   */     (arrayOfFloat1 = new float[3])[0] = 3.125F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 7.75F;
/*   */     float[][] arrayOfFloat;
/*   */     (arrayOfFloat = new float[3][])[0] = arrayOfFloat1;
/*   */     (arrayOfFloat1 = new float[3])[0] = 10.625F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 5.25F;
/*   */     (new float[3][])[1] = arrayOfFloat1;
/*   */     (arrayOfFloat1 = new float[3])[0] = 6.875F;
/*   */     (new float[3])[1] = 1.5F;
/*   */     (new float[3])[2] = 6.5F;
/*   */     (new float[3][])[2] = arrayOfFloat1;
/*   */     byte b;
/*   */     lpt1[] arrayOfLpt1;
/*   */     for (b = 0; b < (arrayOfLpt1 = this.Yl).length; b++) {
/*   */       Ve0.Mw().getClass();
/*   */       arrayOfLpt1[b] = Ve0.av0();
/*   */       float f1 = arrayOfFloat[b][0];
/*   */       float f2 = arrayOfFloat[b][1];
/*   */       float f3 = arrayOfFloat[b][2];
/*   */       (this.Yl[b]).mh.g7(f1, f2, f3);
/*   */       if (b == 0)
/*   */         (this.Yl[b]).mh.N8(eo.Y, 180.0F); 
/*   */       kc(this.Yl[b]);
/*   */       this.Yl[b].Q1(0.75F, 0.75F, 0.75F);
/*   */     } 
/*   */     for (b = 0; b < this.Yl.length; b++) {
/*   */       for (byte b1 = 0; b1 < 2; b1++) {
/*   */         boolean bool;
/*   */         float f6;
/*   */         lpt1[] arrayOfLpt11 = this.Qc[b];
/*   */         Ve0 ve0 = Ve0.Mw();
/*   */         if (b1 == 1) {
/*   */           bool = true;
/*   */         } else {
/*   */           bool = false;
/*   */         } 
/*   */         ve0.getClass();
/*   */         arrayOfLpt11[b1] = Ve0.Xu(bool);
/*   */         Matrix4 matrix42 = (this.Qc[b][b1]).mh;
/*   */         float f3 = arrayOfFloat[b][0];
/*   */         float f4 = arrayOfFloat[b][1];
/*   */         float f5 = arrayOfFloat[b][2];
/*   */         if (b == 0) {
/*   */           f6 = -0.5F;
/*   */         } else {
/*   */           f6 = 0.5F;
/*   */         } 
/*   */         float f1 = f5 + f6;
/*   */         matrix42.g7(f3, f4, f1);
/*   */         if (b == 0)
/*   */           (this.Qc[b][b1]).mh.N8(eo.Y, 180.0F); 
/*   */         kc(this.Qc[b][b1]);
/*   */         this.Qc[b][b1].Q1(0.75F, 0.75F, 0.75F);
/*   */         Ve0.Mw().getClass();
/*   */         this.OI0[b][b1] = Ve0.Z0();
/*   */         Matrix4 matrix41 = (this.OI0[b][b1]).mh;
/*   */         float[] arrayOfFloat2;
/*   */         f4 = (arrayOfFloat2 = arrayOfFloat[b])[0];
/*   */         if (b1 == 0) {
/*   */           f5 = -1.25F;
/*   */         } else {
/*   */           f5 = 1.25F;
/*   */         } 
/*   */         float f2 = f4 + f5;
/*   */         f4 = arrayOfFloat2[1];
/*   */         f5 = arrayOfFloat2[2];
/*   */         if (b == 0) {
/*   */           f6 = -0.375F;
/*   */         } else {
/*   */           f6 = 0.375F;
/*   */         } 
/*   */         matrix41.g7(f2, f4, f5 + f6);
/*   */         this.OI0[b][b1].uq();
/*   */         kc(this.OI0[b][b1]);
/*   */         this.OI0[b][b1].Q1(0.75F, 0.75F, 0.75F);
/*   */       } 
/*   */     } 
/*   */     Rh();
/*   */   }
/*   */   
/*   */   public static byte Cz0(byte paramByte1, byte paramByte2) {
/*   */     return (paramByte2 != 1) ? ((paramByte2 != 2) ? ((paramByte2 != 3) ? ((paramByte1 == 1) ? 7 : 5) : ((paramByte1 == 1) ? 3 : 1)) : ((paramByte1 == 3) ? 0 : 4)) : ((paramByte1 == 3) ? 2 : 6);
/*   */   }
/*   */   
/*   */   public final void Rh() {
/*   */     lpt1[] arrayOfLpt1;
/*   */     for (byte b = 0; b < (arrayOfLpt1 = this.Yl).length; ) {
/*   */       byte b2;
/*   */       byte[] arrayOfByte1 = this.Zs;
/*   */       byte arrayOfByte2[], b3;
/*   */       if ((b3 = (arrayOfByte2 = this.H40[b])[0]) == 0 && arrayOfByte2[1] == 0) {
/*   */         b2 = 3;
/*   */       } else if (b3 == 0) {
/*   */         b2 = 2;
/*   */       } else if (b2[1] == 0) {
/*   */         b2 = 1;
/*   */       } else {
/*   */         b2 = 0;
/*   */       } 
/*   */       arrayOfByte1[b] = b2;
/*   */       lpt11.k = 1.0E8F;
/*   */       lpt1 lpt11;
/*   */       (lpt11 = arrayOfLpt1[b]).rd(Cz0(b2, b2), false, null);
/*   */       for (byte b1 = 0; b1 < 2; ) {
/*   */         (this.Qc[b][b1]).k = 1.0E8F;
/*   */         this.Qc[b][b1].rd(this.H40[b][b1], false, null);
/*   */         b1++;
/*   */       } 
/*   */       b++;
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/X40.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */