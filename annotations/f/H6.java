/* 1 */ package f;public final class H6 extends me { public final void Ic0(float paramFloat) { super.Ic0(paramFloat); vn vn1; if ((vn1 = this.eP) != null) {
/* 2 */       int i; if ((i = (int)((zm0.u20 - this.qS) / 33L)) >= vn1
/* 3 */         .X9) { this
/* 4 */           .eP = null; this.tk0.run(); return; }  vh0 vh0; if ((vh0 = km.a3) == null) return;  float f2 = 0.25F; if (i >= 34)
/*   */       {
/* 6 */         vh0.Ct.J
/* 7 */           .Jg0 = true; } 
/* 8 */       this.VZ.mh.b8(this.a00); float f1 = this.eP.P3(1, i) / 16.0F * f2; this.VZ.mh.g7(this.eP.P3(0, i) / 16.0F * 0.25F, f1, this.eP.P3(2, i) / 16.0F * f2);
/*   */     }  }
/*   */ 
/*   */   
/*   */   public static final short[][] GS;
/*   */   public static final byte[][] MH0 = new byte[10][4];
/*   */   public static final short[][][] PX = new short[10][4][3];
/*   */   public lpt1[] Tj0 = new lpt1[10];
/*   */   public lpt1 VZ;
/*   */   public vn eP = null;
/*   */   public long qS;
/*   */   public eo a00 = new eo();
/*   */   public rg0 tk0 = null;
/*   */   
/*   */   public static void np(byte paramByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/*   */     MH0[paramInt1][paramByte] = (byte)paramInt2;
/*   */     arrayOfShort[0] = (short)paramInt3;
/*   */     arrayOfShort[1] = (short)paramInt4;
/*   */     short[] arrayOfShort;
/*   */     (arrayOfShort = PX[paramInt1][paramByte])[2] = (short)paramInt5;
/*   */   }
/*   */   
/*   */   public H6(pI parampI) {
/*   */     super(parampI);
/*   */     lpt1[] arrayOfLpt1;
/*   */     for (byte b = 0; b < (arrayOfLpt1 = this.Tj0).length; b = (byte)(b + 1)) {
/*   */       Ve0.Mw().getClass();
/*   */       arrayOfLpt1[b] = Ve0.FH();
/*   */       float f1 = (GS[b][0] + 0.5F) * 0.25F;
/*   */       float f2 = GS[b][2] * 0.25F;
/*   */       float f3 = (GS[b][1] + 0.5F) * 0.25F;
/*   */       (this.Tj0[b]).mh.bb0(f1, f2, f3);
/*   */       kc(this.Tj0[b]);
/*   */       for (byte b1 = 0; b1 < 4; b1 = (byte)(b1 + 1)) {
/*   */         if (MH0[b][b1] >= 1) {
/*   */           short s1 = GS[b][0];
/*   */           short s2 = GS[b][1];
/*   */           switch (b1) {
/*   */             case 3:
/*   */               s1--;
/*   */               break;
/*   */             case 2:
/*   */               s1++;
/*   */               break;
/*   */             case 1:
/*   */               s2++;
/*   */               break;
/*   */             case 0:
/*   */               s2--;
/*   */               break;
/*   */           } 
/*   */           parampI.G1(s1, s2).wu0(new dy(this, b, b1));
/*   */         } 
/*   */       } 
/*   */     } 
/*   */     Ve0.Mw().getClass();
/*   */     this.VZ = Ve0.J00(0);
/*   */   }
/*   */   
/*   */   static {
/*   */     np((byte)0, 0, 10, 15, 35, 0);
/*   */     np((byte)1, 0, 9, 15, 19, 2);
/*   */     np((byte)2, 1, 12, 3, 19, 4);
/*   */     np((byte)3, 1, 11, 21, 19, 2);
/*   */     np((byte)2, 2, 13, 10, 29, 4);
/*   */     np((byte)1, 3, 14, 10, 13, 4);
/*   */     np((byte)3, 3, 15, 20, 25, 4);
/*   */     np((byte)2, 4, 17, 5, 13, 4);
/*   */     np((byte)3, 4, 16, 25, 13, 4);
/*   */     np((byte)0, 5, 18, 5, 34, 6);
/*   */     np((byte)3, 6, 19, 26, 36, 6);
/*   */     np((byte)1, 7, 20, 26, 4, 6);
/*   */     np((byte)2, 8, 21, 15, 6, 10);
/*   */     np((byte)0, 9, 22, 15, 32, 0);
/*   */   }
/*   */   
/*   */   public final void dispose() {
/*   */     super.dispose();
/*   */     vh0 vh0;
/*   */     if ((vh0 = km.a3) == null)
/*   */       return; 
/*   */     Jo jo;
/*   */     if ((jo = this.Ct) != null) {
/*   */       this.pm.getClass();
/*   */       eo eo1 = eo.Zero;
/*   */       this.pm.KC(null, false, this);
/*   */     } 
/*   */   }
/*   */   
/*   */   static {
/*   */     short[] arrayOfShort;
/*   */     (arrayOfShort = new short[3])[0] = 15;
/*   */     (new short[3])[1] = 28;
/*   */     (new short[3])[2] = 0;
/*   */     (new short[10][])[0] = arrayOfShort;
/*   */     (arrayOfShort = new short[3])[0] = 10;
/*   */     (new short[3])[1] = 19;
/*   */     (new short[3])[2] = 2;
/*   */     (new short[10][])[1] = arrayOfShort;
/*   */     (arrayOfShort = new short[3])[0] = 20;
/*   */     (new short[3])[1] = 29;
/*   */     (new short[3])[2] = 4;
/*   */     (new short[10][])[2] = arrayOfShort;
/*   */     (arrayOfShort = new short[3])[0] = 10;
/*   */     (new short[3])[1] = 25;
/*   */     (new short[3])[2] = 4;
/*   */     (new short[10][])[3] = arrayOfShort;
/*   */     (arrayOfShort = new short[3])[0] = 15;
/*   */     (new short[3])[1] = 13;
/*   */     (new short[3])[2] = 4;
/*   */     (new short[10][])[4] = arrayOfShort;
/*   */     (arrayOfShort = new short[3])[0] = 5;
/*   */     (new short[3])[1] = 8;
/*   */     (new short[3])[2] = 6;
/*   */     (new short[10][])[5] = arrayOfShort;
/*   */     (arrayOfShort = new short[3])[0] = 7;
/*   */     (new short[3])[1] = 36;
/*   */     (new short[3])[2] = 6;
/*   */     (new short[10][])[6] = arrayOfShort;
/*   */     (arrayOfShort = new short[3])[0] = 26;
/*   */     (new short[3])[1] = 34;
/*   */     (new short[3])[2] = 6;
/*   */     (new short[10][])[7] = arrayOfShort;
/*   */     (arrayOfShort = new short[3])[0] = 24;
/*   */     (new short[3])[1] = 6;
/*   */     (new short[3])[2] = 6;
/*   */     (new short[10][])[8] = arrayOfShort;
/*   */     (arrayOfShort = new short[3])[0] = 15;
/*   */     (new short[3])[1] = 3;
/*   */     (new short[3])[2] = 10;
/*   */     GS = new short[][] { null, null, null, null, null, null, null, null, null, arrayOfShort };
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/H6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */