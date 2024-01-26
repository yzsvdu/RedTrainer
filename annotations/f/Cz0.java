/*  1 */ package f;public final class Cz0 { public final void Dv(pe0[] paramArrayOfpe0) { pe0 pe01; if ((pe01 = paramArrayOfpe0[6]) != null) { this.Y00 = eP(pe01, false, false); this
/*  2 */         .pG0 = (pe01 = paramArrayOfpe0[6]).H0;
/*    */       
/*  4 */       this.G9 = pe01.Vn0; } else { this.Y00 = -1; }  if ((pe01 = paramArrayOfpe0[7]) != null) { boolean bool; if (paramArrayOfpe0[6] != null || paramArrayOfpe0[8] != null) { bool = true; } else { bool = false; }  this.uI0 = eP(pe01, bool, false); this
/*    */         
/*  6 */         .xe0 = Math.max(this.xe0, (paramArrayOfpe0[7]).H0);
/*    */       
/*  8 */       this.G9 = Math.max(this.G9, (paramArrayOfpe0[7]).Vn0); } else { this.uI0 = -1; }  if ((pe01 = paramArrayOfpe0[8]) != null) { this.X20 = eP(pe01, false, false); this
/*    */         
/* 10 */         .fv0 = Math.max(this.fv0, (paramArrayOfpe0[8]).H0);
/*    */       
/* 12 */       this.G9 = Math.max(this.G9, (paramArrayOfpe0[8]).Vn0); } else { this.X20 = -1; }  if ((pe01 = paramArrayOfpe0[3]) != null) { boolean bool2, bool1 = false; if (paramArrayOfpe0[0] != null || paramArrayOfpe0[6] != null) { bool2 = true; } else { bool2 = false; }  this.qr0 = eP(pe01, bool1, bool2); this
/*    */         
/* 14 */         .pG0 = Math.max(this.pG0, (paramArrayOfpe0[3]).H0);
/*    */       
/* 16 */       this.LZ = Math.max(this.LZ, (paramArrayOfpe0[3]).Vn0); } else { this.qr0 = -1; }  if ((pe01 = paramArrayOfpe0[4]) != null) { boolean bool1, bool2; if (paramArrayOfpe0[3] != null || paramArrayOfpe0[5] != null) { bool1 = true; } else { bool1 = false; }  if (paramArrayOfpe0[1] != null || paramArrayOfpe0[7] != null) { bool2 = true; } else { bool2 = false; }  this.CoN = eP(pe01, bool1, bool2); this
/*    */         
/* 18 */         .xe0 = Math.max(this.xe0, (paramArrayOfpe0[4]).H0);
/*    */       
/* 20 */       this.LZ = Math.max(this.LZ, (paramArrayOfpe0[4]).Vn0); } else { this.CoN = -1; }  if ((pe01 = paramArrayOfpe0[5]) != null) { boolean bool2, bool1 = false; if (paramArrayOfpe0[2] != null || paramArrayOfpe0[8] != null) { bool2 = true; } else { bool2 = false; }  this.EX = eP(pe01, bool1, bool2); this
/*    */         
/* 22 */         .fv0 = Math.max(this.fv0, (paramArrayOfpe0[5]).H0);
/*    */       
/* 24 */       this.LZ = Math.max(this.LZ, (paramArrayOfpe0[5]).Vn0); } else { this.EX = -1; }  if ((pe01 = paramArrayOfpe0[0]) != null) { this.vK0 = eP(pe01, false, false); this
/*    */         
/* 26 */         .pG0 = Math.max(this.pG0, (paramArrayOfpe0[0]).H0);
/*    */       
/* 28 */       this.Oy = Math.max(this.Oy, (paramArrayOfpe0[0]).Vn0); } else { this.vK0 = -1; }  if ((pe01 = paramArrayOfpe0[1]) != null) { boolean bool; if (paramArrayOfpe0[0] != null || paramArrayOfpe0[2] != null) { bool = true; } else { bool = false; }  this.nr = eP(pe01, bool, false); this
/*    */         
/* 30 */         .xe0 = Math.max(this.xe0, (paramArrayOfpe0[1]).H0);
/*    */       
/* 32 */       this.Oy = Math.max(this.Oy, (paramArrayOfpe0[1]).Vn0); } else { this.nr = -1; }  if ((pe01 = paramArrayOfpe0[2]) != null) { this.Qy = eP(pe01, false, false); this
/*    */         
/* 34 */         .fv0 = Math.max(this.fv0, (paramArrayOfpe0[2]).H0);
/*    */       
/* 36 */       this.Oy = Math.max(this.Oy, (paramArrayOfpe0[2]).Vn0); } else { this.Qy = -1; }  int i; float[] arrayOfFloat; if ((i = this.Z80) < (arrayOfFloat = this.Lc0).length) { float[] arrayOfFloat1 = new float[i]; System.arraycopy(arrayOfFloat, 0, this, 0, i); this.Lc0 = this; }
/*    */      }
/*    */ 
/*    */   
/*    */   public static final Color XC = new Color();
/*    */   public Texture DK0;
/*    */   public int Y00;
/*    */   public int uI0;
/*    */   public int X20;
/*    */   public int qr0;
/*    */   public int CoN;
/*    */   public int EX;
/*    */   public int vK0;
/*    */   public int nr;
/*    */   public int Qy;
/*    */   public float pG0;
/*    */   public float fv0;
/*    */   public float xe0;
/*    */   public float LZ;
/*    */   public float Oy;
/*    */   public float G9;
/*    */   public float[] Lc0 = new float[180];
/*    */   public int Z80;
/*    */   public final Color JG;
/*    */   public float cOm2;
/*    */   public float nu0;
/*    */   public float uR;
/*    */   public float iF0;
/*    */   
/*    */   public final int eP(pe0 parampe0, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     Texture texture;
/*    */     if ((texture = this.DK0) == null) {
/*    */       this.DK0 = parampe0.G3;
/*    */     } else if (texture != parampe0.G3) {
/*    */       throw new IllegalArgumentException("All regions must be from the same texture.");
/*    */     } 
/*    */     float f1 = parampe0.mP, f2 = parampe0.bh0, f3 = parampe0.zV, f4 = parampe0.WT;
/*    */     cu0 cu0;
/*    */     if (this.DK0.getMagFilter() == (cu0 = cu0.IE) || this.DK0.getMinFilter() == cu0) {
/*    */       if (paramBoolean1) {
/*    */         float f = f1 + (f1 = 0.5F / this.DK0.getWidth());
/*    */         f3 -= f1;
/*    */         f1 = f;
/*    */       } 
/*    */       if (paramBoolean2) {
/*    */         float f;
/*    */         f2 -= f = 0.5F / this.DK0.getHeight();
/*    */         f4 += f;
/*    */       } 
/*    */     } 
/*    */     float[] arrayOfFloat = this.Lc0;
/*    */     arrayOfFloat[i + 3] = f1;
/*    */     arrayOfFloat[i + 4] = f2;
/*    */     arrayOfFloat[i + 8] = f1;
/*    */     arrayOfFloat[i + 9] = f4;
/*    */     arrayOfFloat[i + 13] = f3;
/*    */     arrayOfFloat[i + 14] = f4;
/*    */     arrayOfFloat[i + 18] = f3;
/*    */     arrayOfFloat[i + 19] = f2;
/*    */     this.Z80 = i + 20;
/*    */     int i;
/*    */     return i = this.Z80;
/*    */   }
/*    */   
/*    */   public final void zg0(Color paramColor) {
/*    */     this.JG.set(paramColor);
/*    */   }
/*    */   
/*    */   public final void Gm0(float paramFloat1, float paramFloat2) {
/*    */     this.pG0 *= paramFloat1;
/*    */     this.fv0 *= paramFloat1;
/*    */     this.Oy *= paramFloat2;
/*    */     this.G9 *= paramFloat2;
/*    */     this.xe0 *= paramFloat1;
/*    */     this.LZ *= paramFloat2;
/*    */     float f;
/*    */     if ((f = this.cOm2) != -1.0F)
/*    */       this.cOm2 = f * paramFloat1; 
/*    */     if ((f = this.nu0) != -1.0F)
/*    */       this.nu0 = f * paramFloat1; 
/*    */     if ((paramFloat1 = this.uR) != -1.0F)
/*    */       this.uR = paramFloat1 * paramFloat2; 
/*    */     if ((paramFloat1 = this.iF0) != -1.0F)
/*    */       this.iF0 = paramFloat1 * paramFloat2; 
/*    */   }
/*    */   
/*    */   public final void Y2(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, int paramInt) {
/*    */     float f = paramFloat1 + paramFloat3;
/*    */     paramFloat3 = paramFloat2 + paramFloat4;
/*    */     arrayOfFloat[paramInt] = paramFloat1;
/*    */     arrayOfFloat[paramInt + 1] = paramFloat2;
/*    */     arrayOfFloat[paramInt + 2] = paramFloat5;
/*    */     arrayOfFloat[paramInt + 5] = paramFloat1;
/*    */     arrayOfFloat[paramInt + 6] = paramFloat3;
/*    */     arrayOfFloat[paramInt + 7] = paramFloat5;
/*    */     arrayOfFloat[paramInt + 10] = f;
/*    */     arrayOfFloat[paramInt + 11] = paramFloat3;
/*    */     arrayOfFloat[paramInt + 12] = paramFloat5;
/*    */     arrayOfFloat[paramInt + 15] = f;
/*    */     arrayOfFloat[paramInt + 16] = paramFloat2;
/*    */     float[] arrayOfFloat;
/*    */     (arrayOfFloat = this.Lc0)[paramInt + 17] = paramFloat5;
/*    */   }
/*    */   
/*    */   public final void kE0(JX paramJX, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*    */     paramFloat4 = paramFloat1 + (paramFloat3 = this.pG0);
/*    */     float f2, f3 = paramFloat2 + (f2 = this.G9);
/*    */     float f4;
/*    */     paramFloat3 = paramFloat3 - (f4 = this.fv0) - paramFloat3;
/*    */     float f5;
/*    */     f2 = paramFloat4 - (f5 = this.Oy) - f2;
/*    */     f4 = paramFloat1 + paramFloat3 - f4;
/*    */     f5 = paramFloat2 + paramFloat4 - f5;
/*    */     float f1 = XC.set(this.JG).mul(paramJX.Bm).toFloatBits();
/*    */     int k;
/*    */     if ((k = this.Y00) != -1) {
/*    */       float f6 = this.pG0, f7 = this.G9;
/*    */       Y2(paramFloat1, paramFloat2, f6, f7, f1, k);
/*    */     } 
/*    */     if ((k = this.uI0) != -1) {
/*    */       float f = this.G9;
/*    */       Y2(paramFloat4, paramFloat2, paramFloat3, f, f1, k);
/*    */     } 
/*    */     if ((k = this.X20) != -1) {
/*    */       float f6 = this.fv0, f7 = this.G9;
/*    */       Y2(f4, paramFloat2, f6, f7, f1, k);
/*    */     } 
/*    */     int j;
/*    */     if ((j = this.qr0) != -1) {
/*    */       float f = this.pG0;
/*    */       Y2(paramFloat1, f3, f, f2, f1, j);
/*    */     } 
/*    */     if ((j = this.CoN) != -1)
/*    */       Y2(paramFloat4, f3, paramFloat3, f2, f1, j); 
/*    */     if ((j = this.EX) != -1) {
/*    */       float f = this.fv0;
/*    */       Y2(f4, f3, f, f2, f1, j);
/*    */     } 
/*    */     if ((j = this.vK0) != -1) {
/*    */       f2 = this.pG0;
/*    */       f3 = this.Oy;
/*    */       Y2(paramFloat1, f5, f2, f3, f1, j);
/*    */     } 
/*    */     int i;
/*    */     if ((i = this.nr) != -1) {
/*    */       float f = this.Oy;
/*    */       Y2(paramFloat4, f5, paramFloat3, f, f1, i);
/*    */     } 
/*    */     if ((i = this.Qy) != -1) {
/*    */       float f6 = this.fv0, f7 = this.Oy;
/*    */       Y2(f4, f5, f6, f7, f1, i);
/*    */     } 
/*    */   }
/*    */   
/*    */   public Cz0(Texture paramTexture, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*    */     this(paramTexture);
/*    */     pe0 pe0;
/*    */     this(this, paramInt1, paramInt2, paramInt3, paramInt4);
/*    */   }
/*    */   
/*    */   public Cz0(pe0 parampe0, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*    */     this.JG = new Color(Color.WHITE);
/*    */     this.cOm2 = -1.0F;
/*    */     this.nu0 = -1.0F;
/*    */     this.uR = -1.0F;
/*    */     this.iF0 = -1.0F;
/*    */     if (parampe0 != null) {
/*    */       int i = parampe0.hW() - paramInt1 - paramInt2;
/*    */       int j = parampe0.qY() - paramInt3 - paramInt4;
/*    */       pe0[] arrayOfPe0 = new pe0[9];
/*    */       if (paramInt3 > 0) {
/*    */         if (paramInt1 > 0) {
/*    */           pe0 pe01;
/*    */           this(parampe0, 0, 0, paramInt1, paramInt3);
/*    */           arrayOfPe0[0] = pe01;
/*    */         } 
/*    */         if (i > 0) {
/*    */           pe0 pe01;
/*    */           this(parampe0, paramInt1, 0, i, paramInt3);
/*    */           arrayOfPe0[1] = pe01;
/*    */         } 
/*    */         if (paramInt2 > 0) {
/*    */           pe0 pe01;
/*    */           this(parampe0, paramInt1 + i, 0, paramInt2, paramInt3);
/*    */           arrayOfPe0[2] = pe01;
/*    */         } 
/*    */       } 
/*    */       if (j > 0) {
/*    */         if (paramInt1 > 0) {
/*    */           pe0 pe01;
/*    */           this(parampe0, 0, paramInt3, paramInt1, j);
/*    */           arrayOfPe0[3] = pe01;
/*    */         } 
/*    */         if (i > 0) {
/*    */           pe0 pe01;
/*    */           this(parampe0, paramInt1, paramInt3, i, j);
/*    */           arrayOfPe0[4] = pe01;
/*    */         } 
/*    */         if (paramInt2 > 0) {
/*    */           pe0 pe01;
/*    */           this(parampe0, paramInt1 + i, paramInt3, paramInt2, j);
/*    */           arrayOfPe0[5] = pe01;
/*    */         } 
/*    */       } 
/*    */       if (paramInt4 > 0) {
/*    */         if (paramInt1 > 0) {
/*    */           pe0 pe01;
/*    */           int k = paramInt3 + j;
/*    */           this(parampe0, 0, k, paramInt1, paramInt4);
/*    */           arrayOfPe0[6] = pe01;
/*    */         } 
/*    */         if (i > 0) {
/*    */           pe0 pe01;
/*    */           int k = paramInt3 + j;
/*    */           this(parampe0, paramInt1, k, i, paramInt4);
/*    */           arrayOfPe0[7] = pe01;
/*    */         } 
/*    */         if (paramInt2 > 0) {
/*    */           pe0 pe01;
/*    */           int k = paramInt1 + i;
/*    */           int m = paramInt3 + j;
/*    */           this(parampe0, k, m, paramInt2, paramInt4);
/*    */           arrayOfPe0[8] = pe01;
/*    */         } 
/*    */       } 
/*    */       if (paramInt1 == 0 && i == 0) {
/*    */         arrayOfPe0[1] = arrayOfPe0[2];
/*    */         arrayOfPe0[4] = arrayOfPe0[5];
/*    */         arrayOfPe0[7] = arrayOfPe0[8];
/*    */         arrayOfPe0[2] = null;
/*    */         arrayOfPe0[5] = null;
/*    */         arrayOfPe0[8] = null;
/*    */       } 
/*    */       if (paramInt3 == 0 && j == 0) {
/*    */         arrayOfPe0[3] = arrayOfPe0[6];
/*    */         arrayOfPe0[4] = arrayOfPe0[7];
/*    */         arrayOfPe0[5] = arrayOfPe0[8];
/*    */         arrayOfPe0[6] = null;
/*    */         arrayOfPe0[7] = null;
/*    */         arrayOfPe0[8] = null;
/*    */       } 
/*    */       Dv(arrayOfPe0);
/*    */       return;
/*    */     } 
/*    */     throw new IllegalArgumentException("region cannot be null.");
/*    */   }
/*    */   
/*    */   public Cz0(Texture paramTexture, Color paramColor) {
/*    */     this(paramTexture);
/*    */     zg0(paramColor);
/*    */   }
/*    */   
/*    */   public Cz0(Texture paramTexture) {
/*    */     this(paramTexture);
/*    */     pe0 pe0;
/*    */     this(this);
/*    */   }
/*    */   
/*    */   public Cz0(pe0 parampe0, Color paramColor) {
/*    */     this(parampe0);
/*    */     zg0(paramColor);
/*    */   }
/*    */   
/*    */   public Cz0(pe0 parampe0) {
/*    */     this.JG = new Color(Color.WHITE);
/*    */     this.cOm2 = -1.0F;
/*    */     this.nu0 = -1.0F;
/*    */     this.uR = -1.0F;
/*    */     this.iF0 = -1.0F;
/*    */     Dv(new pe0[] { null, null, null, null, parampe0, null, null, null, null });
/*    */   }
/*    */   
/*    */   public Cz0(pe0... paramVarArgs) {
/*    */     this.JG = new Color(Color.WHITE);
/*    */     this.cOm2 = -1.0F;
/*    */     this.nu0 = -1.0F;
/*    */     this.uR = -1.0F;
/*    */     this.iF0 = -1.0F;
/*    */     if (paramVarArgs != null && paramVarArgs.length == 9) {
/*    */       Dv(paramVarArgs);
/*    */       pe0 pe01;
/*    */       if (((pe01 = paramVarArgs[0]) == null || pe01.hW() == this.pG0) && ((pe01 = paramVarArgs[3]) == null || pe01.hW() == this.pG0) && ((pe01 = paramVarArgs[6]) == null || pe01.hW() == this.pG0)) {
/*    */         if (((pe01 = paramVarArgs[2]) == null || pe01.hW() == this.fv0) && ((pe01 = paramVarArgs[5]) == null || pe01.hW() == this.fv0) && ((pe01 = paramVarArgs[8]) == null || pe01.hW() == this.fv0)) {
/*    */           if (((pe01 = paramVarArgs[6]) == null || pe01.qY() == this.G9) && ((pe01 = paramVarArgs[7]) == null || pe01.qY() == this.G9) && ((pe01 = paramVarArgs[8]) == null || pe01.qY() == this.G9)) {
/*    */             pe0 pe02;
/*    */             if (((pe01 = paramVarArgs[0]) == null || pe01.qY() == this.Oy) && ((pe01 = paramVarArgs[1]) == null || pe01.qY() == this.Oy) && ((pe02 = paramVarArgs[2]) == null || pe02.qY() == this.Oy))
/*    */               return; 
/*    */             throw new JU("Top side patches must have the same height");
/*    */           } 
/*    */           throw new JU("Bottom side patches must have the same height");
/*    */         } 
/*    */         throw new JU("Right side patches must have the same width");
/*    */       } 
/*    */       throw new JU("Left side patches must have the same width");
/*    */     } 
/*    */     throw new IllegalArgumentException("NinePatch needs nine TextureRegions");
/*    */   }
/*    */   
/*    */   public Cz0(Cz0 paramCz0) {
/*    */     this(paramCz0, paramCz0.JG);
/*    */   }
/*    */   
/*    */   public Cz0(Cz0 paramCz0, Color paramColor) {
/*    */     this(Color.WHITE);
/*    */     this.JG = color;
/*    */     this.cOm2 = -1.0F;
/*    */     this.nu0 = -1.0F;
/*    */     this.uR = -1.0F;
/*    */     this.iF0 = -1.0F;
/*    */     this.DK0 = paramCz0.DK0;
/*    */     this.Y00 = paramCz0.Y00;
/*    */     this.uI0 = paramCz0.uI0;
/*    */     this.X20 = paramCz0.X20;
/*    */     this.qr0 = paramCz0.qr0;
/*    */     this.CoN = paramCz0.CoN;
/*    */     this.EX = paramCz0.EX;
/*    */     this.vK0 = paramCz0.vK0;
/*    */     this.nr = paramCz0.nr;
/*    */     this.Qy = paramCz0.Qy;
/*    */     this.pG0 = paramCz0.pG0;
/*    */     this.fv0 = paramCz0.fv0;
/*    */     this.xe0 = paramCz0.xe0;
/*    */     this.LZ = paramCz0.LZ;
/*    */     this.Oy = paramCz0.Oy;
/*    */     this.G9 = paramCz0.G9;
/*    */     this.cOm2 = paramCz0.cOm2;
/*    */     this.uR = paramCz0.uR;
/*    */     this.iF0 = paramCz0.iF0;
/*    */     this.nu0 = paramCz0.nu0;
/*    */     float[] arrayOfFloat = new float[paramCz0.Lc0.length];
/*    */     int i = paramCz0.Lc0.length;
/*    */     System.arraycopy(paramCz0.Lc0, 0, this, 0, i);
/*    */     this.Z80 = paramCz0.Z80;
/*    */     Color color;
/*    */     (color = new Color()).set(paramColor);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Cz0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */