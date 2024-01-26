/*  1 */ package f;public final class oq extends Xf { public R30 fd; public HashMap pC; public float eG0; public static oq s2(R30 paramR30) { this(); oq1.OK = new float[28]; oq1.fd = paramR30; paramR30.sI = Qb.RW; oq oq1; (oq1 = new oq())
/*  2 */       .rv0((pe0)paramR30.Hf(0.0F)); zt zt;
/*  3 */     (zt = (new oq()).PQ).rb0 = 770; (new oq()).PQ.X50 = 771; pe0 pe0;
/*  4 */     (new oq()).TC
/*    */ 
/*    */       
/*  7 */       .x = (pe0 = zt.wq0).H0;
/*    */     
/*  9 */     (new oq()).TC.y = pe0.Vn0; (new oq()).m20(0.01F); (new oq()).Lx(1.0F, 1.0F, 1.0F, 1.0F); return new oq(); }
/* 10 */   public float qY; public Color Ny; public oq() { Color color; this.qY = 1.0F; this(1.0F, 1.0F, 1.0F, 1.0F); this.Ny = this; } public final Object clone() { this(); oq1.OK = new float[28]; Xf.yH0.JL(Xf.yH0); oq1.PL.JL(this.PL); oq1.fd = this.fd; oq oq1; (oq1 = new oq()).rv0(this.PQ.wq0); (new oq()).PQ.rb0 = 770; (new oq()).PQ.X50 = 771; pe0 pe0; (new oq()).TC.x = (pe0 = this.PQ.wq0).H0; (new oq()).TC.y = this.Vn0; (new oq()).m20(0.01F); (new oq()).Lx(1.0F, 1.0F, 1.0F, 1.0F);
/*    */     return new oq(); }
/*    */ 
/*    */   
/*    */   public static oq wU(pe0 parampe0) {
/*    */     (new oq()).OK = new float[28];
/*    */     (new oq()).rv0(parampe0);
/*    */     (new oq()).PQ.rb0 = 770;
/*    */     (new oq()).PQ.X50 = 771;
/*    */     (new oq()).TC.x = parampe0.H0;
/*    */     (new oq()).TC.y = parampe0.Vn0;
/*    */     (new oq()).m20(0.01F);
/*    */     (new oq()).Lx(1.0F, 1.0F, 1.0F, 1.0F);
/*    */     return new oq();
/*    */   }
/*    */   
/*    */   public final void a40(String paramString, R30 paramR30) {
/*    */     if (this.pC == null) {
/*    */       HashMap<Object, Object> hashMap;
/*    */       this();
/*    */       this.pC = hashMap;
/*    */     } 
/*    */     this.pC.put(paramString, paramR30);
/*    */   }
/*    */   
/*    */   public final void zM(String paramString) {
/*    */     if (this.pC.containsKey(paramString)) {
/*    */       this.fd = (R30)this.pC.get(paramString);
/*    */       this.eG0 = 0.0F;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void Lx(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*    */     this.Ny.set(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
/*    */     float f = i8.uU((int)(paramFloat4 * 255.0F) << 24 | (int)(paramFloat3 * 255.0F) << 16 | (int)(paramFloat2 * 255.0F) << 8 | (int)(paramFloat1 * 255.0F));
/*    */     this.OK[4] = f;
/*    */     this.OK[11] = f;
/*    */     this.OK[18] = f;
/*    */     this.OK[25] = f;
/*    */   }
/*    */   
/*    */   public final void Yv0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*    */     this.Hl0.set(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
/*    */     float f = i8.uU((int)(paramFloat4 * 255.0F) << 24 | (int)(paramFloat3 * 255.0F) << 16 | (int)(paramFloat2 * 255.0F) << 8 | (int)(paramFloat1 * 255.0F));
/*    */     this.OK[3] = f;
/*    */     this.OK[10] = f;
/*    */     this.OK[17] = f;
/*    */     this.OK[24] = f;
/*    */   }
/*    */   
/*    */   public final void Vr0() {
/*    */     float[] arrayOfFloat4;
/*    */     NC0 nC04;
/*    */     float f17 = ((arrayOfFloat4 = this.OK)[0] + 0.0F) * (nC04 = this.hI0).x;
/*    */     float f13 = (this.OK[1] + 0.0F) * nC04.y;
/*    */     float f18 = this.OK[2];
/*    */     float f19;
/*    */     float f23 = (f19 = this.wz.AD) * f17;
/*    */     float f24;
/*    */     f23 = (f24 = this.wz.tb0) * f18 + f23;
/*    */     arrayOfFloat4[0] = f23 - f25 * f13;
/*    */     f23 = f19 * f13;
/*    */     float f25;
/*    */     f23 = (f25 = this.wz.z60) * f17 + f23;
/*    */     arrayOfFloat4[1] = f23 - f26 * f18;
/*    */     float f5 = f19 * f18;
/*    */     float f26;
/*    */     arrayOfFloat4[2] = (f26 = this.wz.D80) * f13 + f5 - f24 * f17;
/*    */     f5 = -f26 * f17 - f24 * f13 - f25 * f18;
/*    */     this.wz.Wq();
/*    */     float[] arrayOfFloat8;
/*    */     f17 = (arrayOfFloat8 = this.OK)[0];
/*    */     f18 = this.OK[1];
/*    */     f19 = this.OK[2];
/*    */     float f12 = f5 * (f5 = tG04.D80);
/*    */     f12 = f17 * (f24 = tG04.AD) + f12;
/*    */     arrayOfFloat8[0] = f18 * (f25 = tG04.z60) + f12 - f19 * (f12 = tG04.tb0);
/*    */     f19 = f5 * f12;
/*    */     f19 = f18 * f24 + f19;
/*    */     arrayOfFloat8[1] = f19 * f5 + f19 - f17 * f25;
/*    */     f17 = f5 * f25;
/*    */     f17 = f19 * f24 + f17;
/*    */     arrayOfFloat8[2] = f17 * f12 + f17 - f18 * f5;
/*    */     TG0 tG04;
/*    */     (tG04 = this.wz).Wq();
/*    */     f12 = arrayOfFloat3[0];
/*    */     float[] arrayOfFloat3;
/*    */     eo eo4;
/*    */     (arrayOfFloat3 = this.OK)[0] = (eo4 = this.PL).x - 0.0F + f12;
/*    */     this.OK[1] = eo4.y - 0.0F + this.OK[1];
/*    */     this.OK[2] = this.OK[2] + eo4.z;
/*    */     NC0 nC03;
/*    */     float f16 = (this.OK[7] + 0.0F) * (nC03 = this.hI0).x;
/*    */     float f11 = (this.OK[8] + 0.0F) * nC03.y;
/*    */     f18 = this.OK[9];
/*    */     float f22 = (f19 = this.wz.AD) * f16;
/*    */     f22 = (f24 = this.wz.tb0) * f18 + f22;
/*    */     arrayOfFloat3[7] = f22 - f25 * f11;
/*    */     f22 = f19 * f11;
/*    */     f22 = (f25 = this.wz.z60) * f16 + f22;
/*    */     arrayOfFloat3[8] = f22 - f26 * f18;
/*    */     float f4 = f19 * f18;
/*    */     arrayOfFloat3[9] = (f26 = this.wz.D80) * f11 + f4 - f24 * f16;
/*    */     f4 = -f26 * f16 - f24 * f11 - f25 * f18;
/*    */     this.wz.Wq();
/*    */     float[] arrayOfFloat7;
/*    */     f16 = (arrayOfFloat7 = this.OK)[7];
/*    */     f18 = this.OK[8];
/*    */     f19 = this.OK[9];
/*    */     float f10 = f4 * (f4 = tG03.D80);
/*    */     f10 = f16 * (f24 = tG03.AD) + f10;
/*    */     arrayOfFloat7[7] = f18 * (f25 = tG03.z60) + f10 - f19 * (f10 = tG03.tb0);
/*    */     f19 = f4 * f10;
/*    */     f19 = f18 * f24 + f19;
/*    */     arrayOfFloat7[8] = f19 * f4 + f19 - f16 * f25;
/*    */     f16 = f4 * f25;
/*    */     f16 = f19 * f24 + f16;
/*    */     arrayOfFloat7[9] = f16 * f10 + f16 - f18 * f4;
/*    */     TG0 tG03;
/*    */     (tG03 = this.wz).Wq();
/*    */     f10 = arrayOfFloat2[7];
/*    */     float[] arrayOfFloat2;
/*    */     eo eo3;
/*    */     (arrayOfFloat2 = this.OK)[7] = (eo3 = this.PL).x - 0.0F + f10;
/*    */     this.OK[8] = eo3.y - 0.0F + this.OK[8];
/*    */     this.OK[9] = this.OK[9] + eo3.z;
/*    */     NC0 nC02;
/*    */     float f15 = (this.OK[14] + 0.0F) * (nC02 = this.hI0).x;
/*    */     float f9 = (this.OK[15] + 0.0F) * nC02.y;
/*    */     f18 = this.OK[16];
/*    */     float f21 = (f19 = this.wz.AD) * f15;
/*    */     f21 = (f24 = this.wz.tb0) * f18 + f21;
/*    */     arrayOfFloat2[14] = f21 - f25 * f9;
/*    */     f21 = f19 * f9;
/*    */     f21 = (f25 = this.wz.z60) * f15 + f21;
/*    */     arrayOfFloat2[15] = f21 - f26 * f18;
/*    */     float f3 = f19 * f18;
/*    */     arrayOfFloat2[16] = (f26 = this.wz.D80) * f9 + f3 - f24 * f15;
/*    */     f3 = -f26 * f15 - f24 * f9 - f25 * f18;
/*    */     this.wz.Wq();
/*    */     float[] arrayOfFloat6;
/*    */     f15 = (arrayOfFloat6 = this.OK)[14];
/*    */     f18 = this.OK[15];
/*    */     f19 = this.OK[16];
/*    */     float f8 = f3 * (f3 = tG02.D80);
/*    */     f8 = f15 * (f24 = tG02.AD) + f8;
/*    */     arrayOfFloat6[14] = f18 * (f25 = tG02.z60) + f8 - f19 * (f8 = tG02.tb0);
/*    */     f19 = f3 * f8;
/*    */     f19 = f18 * f24 + f19;
/*    */     arrayOfFloat6[15] = f19 * f3 + f19 - f15 * f25;
/*    */     f15 = f3 * f25;
/*    */     f15 = f19 * f24 + f15;
/*    */     arrayOfFloat6[16] = f15 * f8 + f15 - f18 * f3;
/*    */     TG0 tG02;
/*    */     (tG02 = this.wz).Wq();
/*    */     f8 = arrayOfFloat1[14];
/*    */     float[] arrayOfFloat1;
/*    */     eo eo2;
/*    */     (arrayOfFloat1 = this.OK)[14] = (eo2 = this.PL).x - 0.0F + f8;
/*    */     this.OK[15] = eo2.y - 0.0F + this.OK[15];
/*    */     this.OK[16] = this.OK[16] + eo2.z;
/*    */     NC0 nC01;
/*    */     float f14 = (this.OK[21] + 0.0F) * (nC01 = this.hI0).x;
/*    */     float f7 = (this.OK[22] + 0.0F) * nC01.y;
/*    */     f18 = this.OK[23];
/*    */     float f20 = (f19 = this.wz.AD) * f14;
/*    */     f20 = (f24 = this.wz.tb0) * f18 + f20;
/*    */     arrayOfFloat1[21] = f20 - f25 * f7;
/*    */     f20 = f19 * f7;
/*    */     f20 = (f25 = this.wz.z60) * f14 + f20;
/*    */     arrayOfFloat1[22] = f20 - f26 * f18;
/*    */     float f2 = f19 * f18;
/*    */     arrayOfFloat1[23] = (f26 = this.wz.D80) * f7 + f2 - f24 * f14;
/*    */     f2 = -f26 * f14 - f24 * f7 - f25 * f18;
/*    */     this.wz.Wq();
/*    */     float[] arrayOfFloat5;
/*    */     f14 = (arrayOfFloat5 = this.OK)[21];
/*    */     f18 = this.OK[22];
/*    */     f19 = this.OK[23];
/*    */     float f6 = f2 * (f2 = tG01.D80);
/*    */     f6 = f14 * (f24 = tG01.AD) + f6;
/*    */     arrayOfFloat5[21] = f18 * (f25 = tG01.z60) + f6 - f19 * (f6 = tG01.tb0);
/*    */     f19 = f2 * f6;
/*    */     f19 = f18 * f24 + f19;
/*    */     arrayOfFloat5[22] = f19 * f2 + f19 - f14 * f25;
/*    */     f14 = f2 * f25;
/*    */     f14 = f19 * f24 + f14;
/*    */     arrayOfFloat5[23] = f14 * f6 + f14 - f18 * f2;
/*    */     TG0 tG01;
/*    */     (tG01 = this.wz).Wq();
/*    */     float f1 = this.OK[21];
/*    */     eo eo1;
/*    */     this.OK[21] = (eo1 = this.PL).x - 0.0F + f1;
/*    */     this.OK[22] = eo1.y - 0.0F + this.OK[22];
/*    */     this.OK[23] = this.OK[23] + eo1.z;
/*    */     this.Ka0 = true;
/*    */   }
/*    */   
/*    */   public final void LJ() {
/*    */     float f2;
/*    */     float f1 = (f2 = -(f1 = this.TC.x) / 2.0F) + f1;
/*    */     float f4;
/*    */     float f3 = (f4 = (f3 = this.TC.y) / 2.0F) - f3;
/*    */     this.OK[0] = f2;
/*    */     this.OK[1] = f4;
/*    */     this.OK[2] = 0.0F;
/*    */     this.OK[7] = f1;
/*    */     this.OK[8] = f4;
/*    */     this.OK[9] = 0.0F;
/*    */     this.OK[14] = f2;
/*    */     this.OK[15] = f3;
/*    */     this.OK[16] = 0.0F;
/*    */     this.OK[21] = f1;
/*    */     this.OK[22] = f3;
/*    */     this.OK[23] = 0.0F;
/*    */     this.Ka0 = false;
/*    */   }
/*    */   
/*    */   public final void ho() {
/*    */     pe0 pe0 = this.PQ.wq0;
/*    */     byte b = 5;
/*    */     float f1 = this.mP;
/*    */     arrayOfFloat[b] = f1;
/*    */     b = 6;
/*    */     float f2 = this.WT;
/*    */     arrayOfFloat[b] = f2;
/*    */     b = 12;
/*    */     float f3 = this.zV;
/*    */     arrayOfFloat[b] = f3;
/*    */     arrayOfFloat[13] = f2;
/*    */     arrayOfFloat[19] = f1;
/*    */     b = 20;
/*    */     f1 = this.bh0;
/*    */     float[] arrayOfFloat;
/*    */     (arrayOfFloat = this.OK)[b] = f1;
/*    */     this.OK[26] = f3;
/*    */     this.OK[27] = f1;
/*    */   }
/*    */   
/*    */   public final void m40() {
/*    */     R30 r30;
/*    */     if ((r30 = this.fd) == null)
/*    */       return; 
/*    */     float f = UB0.M60.Qy * this.qY + this.eG0;
/*    */     rv0((pe0)r30.Hf(f));
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/oq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */