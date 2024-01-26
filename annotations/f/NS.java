/* 1 */ package f;public final class NS extends me { public final void Ad0(short[] paramArrayOfshort) { short s2; VM vM; int i; if (paramArrayOfshort.length < 1) return;  switch (paramArrayOfshort[0]) { default: return;case 405: if (paramArrayOfshort.length < 4) return;  for (i = 0; i < 3; ) { boolean bool; lpt1 lpt11; (lpt11 = this.FJ[i]).k = 1.0E8F; int j; short s; if ((s = paramArrayOfshort[j = i + 1]) == 0) { bool = true; } else { bool = false; }  lpt11.rd(bool, false, null);
/* 2 */           (this.yC0[i]).k = 1.0E8F; this.yC0[i]
/* 3 */             .rd(s, false, null); i = j; } case 404: if (paramArrayOfshort.length < 
/* 4 */           3) return;  s2 = paramArrayOfshort[1]; s3 = paramArrayOfshort[2]; (this.FJ[s2]).k = 1.0F; km.pm0.bL((byte)2, (short)1744); this(); this.FJ[s2].rd(s3, false, this);case 403: break; }  if (s3.length < 3) return;  short s1 = s3[1], s3 = s3[2]; (((NS)super).yC0[s1]).k = 1.0F; ((NS)super).yC0[s1]
/* 5 */       .rd(s3, false, null); }
/*   */ 
/*   */   
/*   */   public lpt1[] FJ = new lpt1[3];
/*   */   public lpt1[] yC0 = new lpt1[3];
/*   */   public final float[][] cz0;
/*   */   public final float[][] To;
/*   */   public final short[][] jd;
/*   */   
/*   */   public NS(pI parampI) {
/*   */     super(parampI);
/*   */     float[] arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 4.5F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 13.625F;
/*   */     (new float[3][])[0] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 13.875F;
/*   */     (new float[3])[1] = 0.75F;
/*   */     (new float[3])[2] = 11.0F;
/*   */     (new float[3][])[1] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 4.375F;
/*   */     (new float[3])[1] = 1.5F;
/*   */     (new float[3])[2] = 8.5F;
/*   */     this.cz0 = new float[][] { null, null, arrayOfFloat };
/*   */     (arrayOfFloat = new float[3])[0] = 5.875F;
/*   */     (new float[3])[1] = 0.0F;
/*   */     (new float[3])[2] = 13.375F;
/*   */     (new float[3][])[0] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 14.875F;
/*   */     (new float[3])[1] = 0.75F;
/*   */     (new float[3])[2] = 10.375F;
/*   */     (new float[3][])[1] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 3.875F;
/*   */     (new float[3])[1] = 1.5F;
/*   */     (new float[3])[2] = 7.375F;
/*   */     this.To = new float[][] { null, null, arrayOfFloat };
/*   */     short[] arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = 17;
/*   */     (new short[2])[1] = 60;
/*   */     (new short[8][])[0] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = 22;
/*   */     (new short[2])[1] = 53;
/*   */     (new short[8][])[1] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = 60;
/*   */     (new short[2])[1] = 44;
/*   */     (new short[8][])[2] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = 54;
/*   */     (new short[2])[1] = 39;
/*   */     (new short[8][])[3] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = 16;
/*   */     (new short[2])[1] = 38;
/*   */     (new short[8][])[4] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = 12;
/*   */     (new short[2])[1] = 34;
/*   */     (new short[8][])[5] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = 22;
/*   */     (new short[2])[1] = 32;
/*   */     (new short[8][])[6] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = 18;
/*   */     (new short[2])[1] = 29;
/*   */     this.jd = new short[][] { null, null, null, null, null, null, null, arrayOfShort };
/*   */     byte b;
/*   */     for (b = 0; b < 3; b++) {
/*   */       lpt1 lpt11;
/*   */       Ve0.Mw().getClass();
/*   */       this.yC0[b] = Ve0.CQ();
/*   */       float f2 = this.To[b][0];
/*   */       float f4 = this.To[b][1];
/*   */       float f5 = this.To[b][2];
/*   */       (this.yC0[b]).mh.bb0(f2, f4, f5);
/*   */       kc(this.yC0[b]);
/*   */       lpt1[] arrayOfLpt1 = this.FJ;
/*   */       if (b == 1) {
/*   */         Ve0.Mw().getClass();
/*   */         lpt11 = Ve0.vr();
/*   */       } else {
/*   */         Ve0.Mw().getClass();
/*   */         lpt11 = Ve0.m70();
/*   */       } 
/*   */       arrayOfLpt1[b] = lpt11;
/*   */       float f1 = this.cz0[b][0];
/*   */       float f3 = this.cz0[b][1];
/*   */       f5 = this.cz0[b][2];
/*   */       (this.FJ[b]).mh.bb0(f1, f3, f5);
/*   */       kc(this.FJ[b]);
/*   */       (this.FJ[b]).k = 1.0E8F;
/*   */       this.FJ[b].ml0(1, false);
/*   */       short s = (short)(int)(this.To[b][0] * 4.0F);
/*   */       xr0 xr0;
/*   */       if ((xr0 = parampI.G1(s, (short)(int)(this.To[b][2] * 4.0F))) != null)
/*   */         xr0.wu0(iP.rY); 
/*   */     } 
/*   */     short[][] arrayOfShort1;
/*   */     for (b = 0; b < (arrayOfShort1 = this.jd).length; b++) {
/*   */       short s = arrayOfShort1[b][0];
/*   */       xr0 xr0;
/*   */       if ((xr0 = parampI.G1(s, arrayOfShort1[b][1])) != null)
/*   */         xr0.wu0(iP.rY); 
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/NS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */