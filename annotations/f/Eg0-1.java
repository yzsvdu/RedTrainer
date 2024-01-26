/*  1 */ package f;public final class Eg0 implements VJ0 { public ArrayList Jm = new ArrayList(); public e2 gw = (new e2(2000)).T30(); public long Zd; public long eF; public boolean iE0; public Eg0(long paramLong) { this.Zd = l; long l; this.eF = (l = System.nanoTime() / 1000000L) + paramLong; ru0(); this(this); NC nC; HC.k6().S(nC = new NC(), (float)paramLong / 1000.0F); } public final void ru0() { this((byte)9); Vp vp; ArrayList arrayList2; (new Vp()).iL0 = System.nanoTime() / 1000000L - this.Zd; (new Vp())
/*    */       
/*  3 */       .hp = (short)UB0.M60.fG0();
/*    */     
/*  5 */     (new Vp()).CON = (short)UB0.M60.dL();
/*  6 */     this.Jm.add(vp);
/*  7 */     ArrayList arrayList1 = this.Jm; this(); this.Jm = arrayList2; R8 r8; if ((this.Jm.size() > 200 || this.gw.Po0()) && (r8 = km.u4) != null && 
/*  8 */       !r8.XQ) r8
/*  9 */         .e20
/* 10 */         .W3(new oy0(this.iE0, arrayList1));  } public final void nN(byte paramByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) { if (this.iE0) return;  this(paramByte); Vp vp; if (paramByte != 14) { ArrayList arrayList2; switch (paramByte) { default: case 0: case 1: case 2: case 3: case 4: break; }  long l = UB0.PU.hl0.ip0 / 1000000L; vp.iL0 = l - this.Zd; vp.QH0 = (byte)paramInt1; vp.X20 = (byte)paramInt2; vp.E8 = (byte)paramInt3; vp.hp = (short)paramInt4; vp.CON = (short)paramInt5; this.Jm.add(vp);
/* 11 */       ArrayList arrayList1 = this.Jm; this(); this.Jm = arrayList2; R8 r8; if ((this.Jm.size() > 200 || this.gw.Po0()) && (r8 = km.u4) != null && 
/* 12 */         !r8.XQ) r8
/* 13 */           .e20
/* 14 */           .W3(new oy0(this.iE0, arrayList1)); 
/* 15 */       if (((System.nanoTime() / 1000000L >= this.eF)) && 
/* 16 */         !this.iE0) { ArrayList arrayList; this.iE0 = true;
/* 17 */         arrayList1 = this.Jm; this(); this.Jm = arrayList; R8 r81; if ((r81 = km.u4) != null && 
/* 18 */           !r81.XQ) r81
/* 19 */             .e20
/* 20 */             .W3(new oy0(this.iE0, arrayList1)); 
/* 21 */         km.ek.Sh0(this); }
/*    */       
/*    */       return; }
/*    */      }
/*    */ 
/*    */   
/*    */   public final boolean Zp0(int paramInt) {
/*    */     if (paramInt == 160)
/*    */       paramInt = 66; 
/*    */     int i = JP.oW(paramInt, true) + 1;
/*    */     nN((byte)0, paramInt, i, 0, 0, 0);
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final boolean XM(int paramInt) {
/*    */     if (paramInt == 160)
/*    */       paramInt = 66; 
/*    */     int i = JP.oW(paramInt, true) + 1;
/*    */     nN((byte)1, paramInt, i, 0, 0, 0);
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final boolean bD0(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*    */     nN((byte)2, paramInt4, 0, paramInt3, paramInt1, paramInt2);
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final boolean Di(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*    */     nN((byte)3, paramInt4, 0, paramInt3, paramInt1, paramInt2);
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final boolean x80(int paramInt1, int paramInt2) {
/*    */     nN((byte)4, 0, 0, 0, paramInt1, paramInt2);
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final boolean Qa0(int paramInt, boolean paramBoolean) {
/*    */     byte b;
/*    */     if (paramInt == 160)
/*    */       paramInt = 66; 
/*    */     if (paramBoolean) {
/*    */       b = 5;
/*    */     } else {
/*    */       b = 6;
/*    */     } 
/*    */     nN(b, paramInt, JP.oW(paramInt, true) + 1, 0, 0, 0);
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final boolean Xg0(int paramInt, boolean paramBoolean) {
/*    */     byte b;
/*    */     if (paramInt == 160)
/*    */       paramInt = 66; 
/*    */     if (paramBoolean) {
/*    */       b = 7;
/*    */     } else {
/*    */       b = 8;
/*    */     } 
/*    */     nN(b, paramInt, JP.oW(paramInt, true) + 1, 0, 0, 0);
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final boolean d70(char paramChar) {
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final boolean Xe(int paramInt1, int paramInt2, int paramInt3) {
/*    */     nN((byte)14, 0, 0, paramInt3, paramInt1, paramInt2);
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final boolean kG0(float paramFloat1, float paramFloat2) {
/*    */     return false;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Eg0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */