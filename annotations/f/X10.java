/*  1 */ package f;public final class X10 extends QZ { public final ET Z4; public final QZ[] nb; public ArrayList Mk0; public final String DP() { String[] arrayOfString; byte b2; QZ[] arrayOfQZ; for (arrayOfString = new String[this.nb.length], b2 = 0; b2 < (arrayOfQZ = this.nb).length; ) { arrayOfString[b2] = arrayOfQZ[b2].dy(); b2++; }  byte b1 = 15; b2 = 10; return Ml0.lz((byte)2, F40.ef0, b1, b2, arrayOfString); } public X10(byte paramByte, ET paramET, QZ[] paramArrayOfQZ, rK paramrK) { super(paramByte); this.Z4 = paramET; this.nb = paramArrayOfQZ; if (paramrK == rK.bh) { dg0(); int i = paramArrayOfQZ.length; for (paramByte = 0; paramByte < i; paramByte++) paramArrayOfQZ[paramByte].dg0();  }  } public final byte ZY() { return (byte)this.nb.length; } public final ET PN() { return this.Z4; } public final QZ cP(byte paramByte) { QZ[] arrayOfQZ; return (paramByte < 0 || paramByte >= (arrayOfQZ = this.nb).length) ? this : arrayOfQZ[paramByte]; } public final boolean GT(kf paramkf, boolean paramBoolean, String paramString, byte paramByte, hj[] paramArrayOfhj, int paramInt) { if (this.Fu != paramkf
/*  2 */       .AD
/*  3 */       .hG0()) { byte b1 = 0; while (b1 < paramkf
/*  4 */         .AD
/*    */         
/*  6 */         .wI(this.Fu))
/*    */       { hm0 hm0;
/*    */         
/*  9 */         if ((hm0 = paramkf.AD.N0(this.Fu, b1)) != null && 
/* 10 */           !hm0.K0.AL() && 
/*    */           
/* 12 */           hm0.rF0.FC0
/* 13 */           .x > 0.0F)
/* 14 */         { (new fq0(hm0))
/* 15 */             .ju0 = false;
/* 16 */           paramkf.t80(new fq0(hm0)); }  b1 = (byte)(b1 + 1); }  }  boolean bool; byte b; for (bool = false, b = 0; b < this.nb.length; ) { H8 h8; this(this, b); paramkf
/* 17 */         .YP.add(h8); if (paramArrayOfhj != null && paramArrayOfhj.length > 
/* 18 */         b) bool |= paramkf.CoM5(paramArrayOfhj[b]);  b = (byte)(b + 1); }  if (!paramBoolean && !paramString.isEmpty()) { char c; bool = true; if (paramByte > 1) { c = '᎚'; } else { c = '᎙'; }  paramkf.Kq(Ml0.sB(c, new String[] { paramString, dy() })); }  if (!paramBoolean && paramInt > 0) { bool = true; byte b1 = 15, b2 = 58; String[] arrayOfString; (arrayOfString = new String[2])[0] = paramString; (new String[2])[1] = paramInt + ""; paramkf
/*    */         
/* 20 */         .Kq(Ml0.lz((byte)2, F40.ef0, b1, b2, arrayOfString)); }  return bool; }
/*    */ 
/*    */   
/*    */   public final void s6(float paramFloat1, float paramFloat2) {
/*    */     this();
/*    */     ArrayList arrayList;
/*    */     this.Mk0 = arrayList;
/*    */     QZ[] arrayOfQZ;
/*    */     for (byte b = 0; b < (arrayOfQZ = this.nb).length; b++) {
/*    */       if (arrayOfQZ.length > 1) {
/*    */         if (b < 1) {
/*    */           paramFloat1 = -0.46F;
/*    */         } else {
/*    */           paramFloat1 = 0.46F;
/*    */         } 
/*    */         if (b < 1) {
/*    */           paramFloat2 = -0.46F;
/*    */         } else {
/*    */           paramFloat2 = 0.46F;
/*    */         } 
/*    */       } 
/*    */       arrayOfQZ[b].s6(paramFloat1, paramFloat2);
/*    */       if (this.nb[b].lK() != null)
/*    */         this.Mk0.addAll(this.nb[b].lK()); 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void kO(int paramInt1, int paramInt2) {
/*    */     QZ[] arrayOfQZ;
/*    */     for (byte b = 0; b < (arrayOfQZ = this.nb).length; b++) {
/*    */       if (arrayOfQZ.length > 1) {
/*    */         if (b < 1) {
/*    */           paramInt1 = -24;
/*    */         } else {
/*    */           paramInt1 = 24;
/*    */         } 
/*    */         if (b < 1) {
/*    */           paramInt2 = -12;
/*    */         } else {
/*    */           paramInt2 = 12;
/*    */         } 
/*    */       } 
/*    */       arrayOfQZ[b].kO(paramInt1, paramInt2);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void Ll0(tH paramtH) {
/*    */     QZ[] arrayOfQZ;
/*    */     for (byte b = 0; b < (arrayOfQZ = this.nb).length; b++)
/*    */       arrayOfQZ[b].Ll0(paramtH); 
/*    */   }
/*    */   
/*    */   public final void synchronized() {
/*    */     QZ[] arrayOfQZ;
/*    */     int i = (arrayOfQZ = this.nb).length;
/*    */     for (byte b = 0; b < i; b++)
/*    */       this[b].synchronized(); 
/*    */   }
/*    */   
/*    */   public final void zV() {
/*    */     QZ[] arrayOfQZ;
/*    */     int i = (arrayOfQZ = this.nb).length;
/*    */     for (byte b = 0; b < i; b++)
/*    */       this[b].zV(); 
/*    */   }
/*    */   
/*    */   public final List lK() {
/*    */     return this.Mk0;
/*    */   }
/*    */   
/*    */   public final void ub(int paramInt1, int paramInt2, boolean paramBoolean) {
/*    */     QZ[] arrayOfQZ;
/*    */     for (byte b = 0; b < (arrayOfQZ = this.nb).length; b++) {
/*    */       if (arrayOfQZ.length > 1) {
/*    */         if (b < 1) {
/*    */           paramInt1 = -24;
/*    */         } else {
/*    */           paramInt1 = 24;
/*    */         } 
/*    */         if (b < 1) {
/*    */           paramInt2 = -12;
/*    */         } else {
/*    */           paramInt2 = 12;
/*    */         } 
/*    */       } 
/*    */       arrayOfQZ[b].ub(paramInt1, paramInt2, paramBoolean);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void up(float paramFloat1, float paramFloat2, byte paramByte) {
/*    */     QZ[] arrayOfQZ;
/*    */     if ((arrayOfQZ = this.nb).length > 1) {
/*    */       if (paramByte < 1) {
/*    */         paramFloat1 = -0.76F;
/*    */       } else {
/*    */         paramFloat1 = 0.76F;
/*    */       } 
/*    */       if (paramByte < 1) {
/*    */         paramFloat2 = -0.76F;
/*    */       } else {
/*    */         paramFloat2 = 0.76F;
/*    */       } 
/*    */     } 
/*    */     this[paramByte].up(paramFloat1, paramFloat2, paramByte);
/*    */   }
/*    */   
/*    */   public final mi pW() {
/*    */     return this.nb[0].pW();
/*    */   }
/*    */   
/*    */   public final boolean mL() {
/*    */     QZ[] arrayOfQZ;
/*    */     for (byte b = 0; b < (arrayOfQZ = this.nb).length; b++) {
/*    */       if (!arrayOfQZ[b].mL())
/*    */         return false; 
/*    */     } 
/*    */     return true;
/*    */   }
/*    */   
/*    */   public final String Lc() {
/*    */     return this.nb[0].Lc();
/*    */   }
/*    */   
/*    */   public final String dy() {
/*    */     this();
/*    */     StringBuilder stringBuilder;
/*    */     QZ[] arrayOfQZ;
/*    */     int i = (arrayOfQZ = this.nb).length;
/*    */     for (byte b = 0; b < i; b++) {
/*    */       QZ qZ = arrayOfQZ[b];
/*    */       if (length() > 0)
/*    */         append(" & "); 
/*    */       append(qZ.dy());
/*    */     } 
/*    */     return toString();
/*    */   }
/*    */   
/*    */   public final String s7(byte paramByte) {
/*    */     return this.nb[paramByte].s7(paramByte);
/*    */   }
/*    */   
/*    */   public final boolean jj(byte paramByte) {
/*    */     return this.nb[paramByte].jj(paramByte);
/*    */   }
/*    */   
/*    */   public final byte WW() {
/*    */     return (byte)(6 / this.nb.length);
/*    */   }
/*    */   
/*    */   public final byte d5() {
/*    */     return this.nb[0].d5();
/*    */   }
/*    */   
/*    */   public final short COm8() {
/*    */     return this.nb[0].COm8();
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     QZ[] arrayOfQZ;
/*    */     for (byte b = 0; b < (arrayOfQZ = this.nb).length; b++)
/*    */       arrayOfQZ[b].dispose(); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/X10.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */