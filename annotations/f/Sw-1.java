/* 1 */ package f;public final class Sw extends me { public final void Ad0(short[] paramArrayOfshort) { short s1, s2; byte b; lpt1[] arrayOfLpt11, arrayOfLpt12; if (paramArrayOfshort.length < 1) return;  switch (paramArrayOfshort[0]) { default: return;case 399: for (s1 = paramArrayOfshort[1], s2 = paramArrayOfshort[2], b = 0; b < (arrayOfLpt12 = this.Sx0).length; ) { if ((s1 & 1 << b) != 0) { (arrayOfLpt12[b]).k = 1.0E8F; arrayOfLpt12[b].rd(0, false, null); }  b++; }  s1 = 0; while (s1 < (
/* 2 */           arrayOfLpt11 = this.g50).length) { if ((s2 & 1 << s1) != 0) { (arrayOfLpt11[s1]).k = 1.0E8F; arrayOfLpt11[s1]
/* 3 */               .rd(0, false, null);
/* 4 */             this.hj0[s1] = true; }  s1++; }  PF(true);case 397: (this.g50[s1[1]]).k = 1.25F; this.g50[s1[1]]
/* 5 */           .rd(0, false, null);
/* 6 */         this.hj0[s1[1]] = true;
/* 7 */         A1.L7
/* 8 */           .ac0(new Td(this), 1200L);case 396: break; }  this.Sx0[s1[1]]
/* 9 */       .rd(0, false, null); }
/*   */ 
/*   */   
/*   */   public static final short[][] Aux;
/*   */   public lpt1 rB;
/*   */   public lpt1[] rI0 = new lpt1[6];
/*   */   public boolean[] rK = new boolean[6];
/*   */   public float[][] sZ;
/*   */   public lpt1[] Sx0;
/*   */   public float[][] XH0;
/*   */   public lpt1[] g50;
/*   */   public boolean[] hj0;
/*   */   public boolean[] Mg0;
/*   */   public float[][] JI;
/*   */   
/*   */   public Sw(pI parampI) {
/*   */     super(parampI);
/*   */     float[] arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 8.125F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 4.375F;
/*   */     (new float[6][])[0] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 6.625F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 5.375F;
/*   */     (new float[6][])[1] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 9.625F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 5.375F;
/*   */     (new float[6][])[2] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 5.125F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 6.375F;
/*   */     (new float[6][])[3] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 6.625F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 7.375F;
/*   */     (new float[6][])[4] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 9.625F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 7.375F;
/*   */     this.sZ = new float[][] { null, null, null, null, null, arrayOfFloat };
/*   */     this.Sx0 = new lpt1[8];
/*   */     (arrayOfFloat = new float[3])[0] = 6.625F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 4.375F;
/*   */     (new float[8][])[0] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 9.625F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 4.375F;
/*   */     (new float[8][])[1] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 5.125F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 5.375F;
/*   */     (new float[8][])[2] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 8.125F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 5.375F;
/*   */     (new float[8][])[3] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 11.125F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 5.375F;
/*   */     (new float[8][])[4] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 6.625F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 6.375F;
/*   */     (new float[8][])[5] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 8.125F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 7.375F;
/*   */     (new float[8][])[6] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 11.125F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 7.375F;
/*   */     this.XH0 = new float[][] { null, null, null, null, null, null, null, arrayOfFloat };
/*   */     this.g50 = new lpt1[10];
/*   */     this.hj0 = new boolean[10];
/*   */     this.Mg0 = new boolean[] { false, true, false, true, false, true, true, true, false, true };
/*   */     (arrayOfFloat = new float[3])[0] = 7.625F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 4.375F;
/*   */     (new float[10][])[0] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 8.625F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 4.375F;
/*   */     (new float[10][])[1] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 6.125F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 5.375F;
/*   */     (new float[10][])[2] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 7.125F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 5.375F;
/*   */     (new float[10][])[3] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 9.125F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 5.375F;
/*   */     (new float[10][])[4] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 10.125F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 5.375F;
/*   */     (new float[10][])[5] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 5.625F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 6.375F;
/*   */     (new float[10][])[6] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 7.125F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 7.375F;
/*   */     (new float[10][])[7] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 9.125F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 7.375F;
/*   */     (new float[10][])[8] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 10.125F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 7.375F;
/*   */     this.JI = new float[][] { null, null, null, null, null, null, null, null, null, arrayOfFloat };
/*   */     byte b;
/*   */     lpt1[] arrayOfLpt1;
/*   */     for (b = 0; b < (arrayOfLpt1 = this.rI0).length; b++) {
/*   */       Ve0.Mw().getClass();
/*   */       arrayOfLpt1[b] = Ve0.native();
/*   */       float f1 = this.sZ[b][0];
/*   */       float f2 = this.sZ[b][1];
/*   */       float f3 = this.sZ[b][2];
/*   */       (this.rI0[b]).mh.g7(f1, f2, f3);
/*   */       this.rI0[b].uq();
/*   */       kc(this.rI0[b]);
/*   */     } 
/*   */     for (b = 0; b < (arrayOfLpt1 = this.Sx0).length; b++) {
/*   */       Ve0.Mw().getClass();
/*   */       arrayOfLpt1[b] = Ve0.w7();
/*   */       float f1 = this.XH0[b][0];
/*   */       float f2 = this.XH0[b][1];
/*   */       float f3 = this.XH0[b][2];
/*   */       (this.Sx0[b]).mh.g7(f1, f2, f3);
/*   */       this.Sx0[b].uq();
/*   */       kc(this.Sx0[b]);
/*   */     } 
/*   */     for (b = 0; b < (arrayOfLpt1 = this.g50).length; b++) {
/*   */       Ve0 ve0 = Ve0.Mw();
/*   */       ve0.getClass();
/*   */       arrayOfLpt1[b] = Ve0.K20(this.Mg0[b]);
/*   */       float f1 = this.JI[b][0];
/*   */       float f2 = this.JI[b][1];
/*   */       float f3 = this.JI[b][2];
/*   */       (this.g50[b]).mh.g7(f1, f2, f3);
/*   */       this.g50[b].uq();
/*   */       kc(this.g50[b]);
/*   */     } 
/*   */     Ve0.Mw().getClass();
/*   */     lpt1 lpt11 = Ve0.Cf0();
/*   */     this.mh.g7(8.125F, 0.0F, 8.375F);
/*   */     kc(this.rB);
/*   */   }
/*   */   
/*   */   static {
/*   */     short[] arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = 0;
/*   */     (new short[2])[1] = 1;
/*   */     (new short[6][])[0] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = 2;
/*   */     (new short[2])[1] = 3;
/*   */     (new short[6][])[1] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = 4;
/*   */     (new short[2])[1] = 5;
/*   */     (new short[6][])[2] = arrayOfShort;
/*   */     (arrayOfShort = new short[1])[0] = 6;
/*   */     (new short[6][])[3] = arrayOfShort;
/*   */     (arrayOfShort = new short[1])[0] = 7;
/*   */     (new short[6][])[4] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = 8;
/*   */     (new short[2])[1] = 9;
/*   */     Aux = new short[][] { null, null, null, null, null, arrayOfShort };
/*   */   }
/*   */   
/*   */   public final void PF(boolean paramBoolean) {
/*   */     for (byte b = 0; b < this.rI0.length; ) {
/*   */       boolean bool;
/*   */       if (this.rK[b])
/*   */         continue; 
/*   */       short[] arrayOfShort;
/*   */       int i = (arrayOfShort = Aux[b]).length;
/*   */       byte b1 = 0;
/*   */       while (true) {
/*   */         if (b1 < i) {
/*   */           short s = arrayOfShort[b1];
/*   */           if (!this.hj0[s]) {
/*   */             boolean bool1 = false;
/*   */             break;
/*   */           } 
/*   */           b1++;
/*   */           continue;
/*   */         } 
/*   */         bool = true;
/*   */         break;
/*   */       } 
/*   */       if (bool) {
/*   */         if (paramBoolean) {
/*   */           (this.rI0[b]).k = 1.0E8F;
/*   */         } else {
/*   */           (this.rI0[b]).k = 1.0F;
/*   */         } 
/*   */         this.rI0[b].rd(0, false, null);
/*   */         this.rK[b] = true;
/*   */       } 
/*   */       b++;
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Sw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */