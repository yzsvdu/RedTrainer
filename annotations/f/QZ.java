/*  1 */ package f;public abstract class QZ implements iq0 { public byte Fu; public boolean C10; public QZ(byte paramByte) { this.Fu = paramByte; } public final byte g7() { return this.Fu; } public String FM(Gp0 paramGp0) { this(); ArrayList<String> arrayList; (arrayList = new ArrayList<>()).add(dy()); byte b = 0; byte b1 = 0; while (b1 < paramGp0
/*  2 */       .wI(this.Fu))
/*    */     { hm0 hm0;
/*  4 */       if ((hm0 = paramGp0.N0(this.Fu, b1)) != null && 
/*  5 */         !hm0.K0.AL()) { b++; arrayList
/*  6 */           .add(hm0.fA()); }  b1 = (byte)(b1 + 1); }  if (b < 1) return "";  int i = b + 16; if (paramGp0
/*  7 */       .rx
/*    */       
/*  9 */       .coM9(this.Fu) > 3) { i = 5022; arrayList.clear(); arrayList.add(dy()); }  F40 f40 = F40.ef0; String[] arrayOfString = arrayList.<String>toArray(new String[0]);
/* 10 */     return Ml0.lz((byte)2, this, 15, i, arrayOfString); } public byte ZY() { return 1; } public boolean lJ0() { return this.C10; } public abstract ET PN(); public String dn(Gp0 paramGp0) { return ""; } public abstract String DP(); public QZ cP(byte paramByte) { return this; } public void s6(float paramFloat1, float paramFloat2) {} public void zV() {} public List lK() { return null; } public void kO(int paramInt1, int paramInt2) {} public boolean GT(kf paramkf, boolean paramBoolean, String paramString, byte paramByte, hj[] paramArrayOfhj, int paramInt) { if (this.Fu != paramkf.AD.hG0()) { paramBoolean = false; while (paramBoolean < paramkf.AD.wI(this.Fu)) { hm0 hm0; if ((hm0 = paramkf.AD.N0(this.Fu, paramBoolean)) != null && !hm0.K0.AL() && 
/*    */           
/* 12 */           hm0.rF0.FC0
/* 13 */           .x > 0.0F)
/* 14 */         { (new fq0(hm0))
/* 15 */             .ju0 = false;
/* 16 */           paramkf.t80(new fq0(hm0)); }  byte b = (byte)(paramBoolean + 1); }  }  this(this, (byte)0); H8 h8; paramkf
/* 17 */       .YP.add(h8); boolean bool = false; if (paramArrayOfhj != null && paramArrayOfhj.length > 
/* 18 */       0) { int i; byte b; for (i = paramArrayOfhj.length, b = 0; b < i; ) { bool |= paramkf.CoM5(paramArrayOfhj[b]); b++; }  }  return bool; }
/*    */ 
/*    */   
/*    */   public void up(float paramFloat1, float paramFloat2, byte paramByte) {}
/*    */   
/*    */   public void Oi() {}
/*    */   
/*    */   public mi pW() {
/*    */     return null;
/*    */   }
/*    */   
/*    */   public boolean mL() {
/*    */     return this instanceof BR ^ true;
/*    */   }
/*    */   
/*    */   public String Lc() {
/*    */     return "";
/*    */   }
/*    */   
/*    */   public boolean Us() {
/*    */     return this instanceof Yu;
/*    */   }
/*    */   
/*    */   public abstract String dy();
/*    */   
/*    */   public String K5() {
/*    */     return dy();
/*    */   }
/*    */   
/*    */   public String s7(byte paramByte) {
/*    */     return "";
/*    */   }
/*    */   
/*    */   public boolean jj(byte paramByte) {
/*    */     return this instanceof BR;
/*    */   }
/*    */   
/*    */   public byte d5() {
/*    */     return km.a3.eA;
/*    */   }
/*    */   
/*    */   public short COm8() {
/*    */     ET eT = PN();
/*    */     byte b;
/*    */     short[] arrayOfShort;
/*    */     if ((b = km.a3.eA) < 0 || b >= (arrayOfShort = this.vl).length)
/*    */       return this.vl[0]; 
/*    */   }
/*    */   
/*    */   public byte Gp() {
/*    */     return km.a3.eA;
/*    */   }
/*    */   
/*    */   public short p7() {
/*    */     ET eT = PN();
/*    */     byte b;
/*    */     short[] arrayOfShort;
/*    */     if ((b = km.a3.eA) < 0 || b >= (arrayOfShort = this.ii0).length)
/*    */       return this.ii0[0]; 
/*    */     return arrayOfShort[b];
/*    */   }
/*    */   
/*    */   public byte WW() {
/*    */     return 6;
/*    */   }
/*    */   
/*    */   public void dispose() {}
/*    */   
/*    */   public void synchronized() {}
/*    */   
/*    */   public void ub(int paramInt1, int paramInt2, boolean paramBoolean) {}
/*    */   
/*    */   public final void dg0() {
/*    */     this.C10 = true;
/*    */   }
/*    */   
/*    */   public void Ll0(tH paramtH) {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/QZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */