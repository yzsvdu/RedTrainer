/*  1 */ package f;public final class kH0 extends Kl0 { public final void sM() { boolean bool; this
/*  2 */       .cM0 = this.Ws.getInt();
/*    */     
/*  4 */     this.va = this.Ws.get();
/*    */     
/*  6 */     this.DF = this.Ws.getShort();
/*    */     
/*  8 */     this.VY = this.Ws.get();
/*    */     
/* 10 */     this.JG = this.Ws.get();
/*    */     
/* 12 */     this.oe = this.Ws.get();
/*    */     
/* 14 */     this.IU = this.Ws.get();
/* 15 */     byte b1 = this.Ws.get();
/* 16 */     byte b2 = this.Ws.get();
/* 17 */     byte b3 = this.Ws.get();
/* 18 */     short s2 = this.Ws.getShort();
/* 19 */     short s3 = this.Ws.getShort();
/* 20 */     byte b4 = this.Ws.get();
/* 21 */     byte b5 = (byte)(this.Ws.get() & 0x3); if ((this.Ws.get() & 0x8) != 0) { bool = true; } else { bool = false; }  this
/* 22 */       .g70 = new G5(b1, b2, b3, bool, s2, s3, b4, b5); short s1;
/* 23 */     if (((s1 = this.Ws.getShort()) & 0x1) != 0) { this
/*    */         
/* 25 */         .DI = this.Ws.getShort();
/*    */       
/* 27 */       this.fN = this.Ws.get(); if (R00() != 0) { b2 = 1; } else { b2 = 0; }  this.O = b2; }  if ((s1 & 0x2) != 0) { b2 = 1; } else { b2 = 0; }  this.pE0 = b2; if ((s1 & 0x40) != 0) { b2 = 1; } else { b2 = 0; }  this.n = b2; if ((s1 & 0x4) != 0) { this
/*    */         
/* 29 */         .BL0 = this.Ws.get();
/*    */       
/* 31 */       this.aG0 = this.Ws.get(); }  if ((s1 & 0x8) != 0) { b2 = 1; } else { b2 = 0; }  this.mM = b2; if ((s1 & 0x10) != 0) { b2 = 1; } else { b2 = 0; }  this.CC = b2; if ((s1 & 0x20) != 0) { b2 = 1; } else { b2 = 0; }  this.bJ0 = b2; if ((s1 & 0x80) != 0) { b2 = 1; } else { b2 = 0; }  this.fq = b2; if ((s1 & 0x100) != 0) this
/*    */         
/* 33 */         .tN = this.Ws.getShort();  if ((s1 & 0x200) != 0) this.cS = k60();  if ((s1 & 0x400) != 0) { this
/*    */         
/* 35 */         .f1 = this.Ws.getShort();
/*    */       
/* 37 */       this.ty = this.Ws.get(); }  if ((s1 & 0x1000) != 0) this
/*    */         
/* 39 */         .jr0 = this.Ws.getFloat();  if ((s1 & 0x800) != 0) { s1 = 1; } else { s1 = 0; }  this.Tf = s1; }
/*    */ 
/*    */   
/*    */   public int cM0;
/*    */   public byte va;
/*    */   public short DF;
/*    */   public byte VY;
/*    */   public byte JG;
/*    */   public byte oe;
/*    */   public byte IU;
/*    */   public byte BL0 = -1;
/*    */   public byte aG0 = -1;
/*    */   public G5 g70;
/*    */   public short DI;
/*    */   public byte fN;
/*    */   public boolean O;
/*    */   public boolean pE0 = false;
/*    */   public boolean n = false;
/*    */   public boolean mM = false;
/*    */   public boolean CC = false;
/*    */   public boolean bJ0 = false;
/*    */   public boolean fq = false;
/*    */   public short tN = -1;
/*    */   public FV cS = null;
/*    */   public short f1 = -1;
/*    */   public byte ty;
/*    */   public boolean Tf;
/*    */   public float jr0 = 1.0F;
/*    */   
/*    */   public kH0(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   static {
/*    */     C00.gd(kH0.class);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     Kr0 kr0;
/*    */     if (r8() == null || (r8()).Qa == null)
/*    */       return; 
/*    */     vh0 vh0 = (r8()).Qa;
/*    */     int j = this.cM0;
/*    */     byte b1 = this.va;
/*    */     short s2 = this.DF;
/*    */     byte b2 = this.VY, b3 = this.JG, b4 = this.oe, b5 = this.IU, b6 = this.BL0, b7 = this.aG0;
/*    */     short s3 = this.DI;
/*    */     byte b8 = this.fN;
/*    */     boolean bool1 = this.O, bool2 = this.pE0, bool3 = this.mM, bool4 = this.n;
/*    */     FV fV = this.cS;
/*    */     short s4 = this.f1;
/*    */     byte b9 = this.ty;
/*    */     vh0.getClass();
/*    */     G5 g5;
/*    */     xr0 xr0;
/*    */     if ((xr0 = (g5 = this.g70).CJ0()) != null) {
/*    */       g5.kD0 = (xr0.Q4()).cA;
/*    */       g5.vu0 = (xr0.Q4()).VZ;
/*    */       g5.LB0 = xr0.Y00();
/*    */       g5.mm = xr0.Ka();
/*    */       g5.Yu0 = xr0.hA0();
/*    */       xr0.Q4().getClass();
/*    */       if (!(xr0.Q4() instanceof IF0))
/*    */         g5.Qf0 = xr0.bl0(); 
/*    */       g5.lT = null;
/*    */     } 
/*    */     tc tc2;
/*    */     if ((tc2 = (tc)vh0.KO.get(Integer.valueOf(j))) == null) {
/*    */       if (bool2) {
/*    */         this(j, b1, s2, b2, b3, b4, b5, b6, b7, g5, s3, b8, bool1, bool3, fV, s4);
/*    */       } else if (bool4) {
/*    */         this(j, b1, s2, b2, b3, b4, b5, b6, b7, g5, s3, b8, bool1, bool3, fV, s4);
/*    */       } else {
/*    */         this(j, b1, s2, b2, b3, b4, b5, b6, b7, g5, s3, b8, bool1, bool3, fV, s4);
/*    */       } 
/*    */       vh0.KO.put(Integer.valueOf(j), kr0);
/*    */     } else if (tc2 instanceof Kr0) {
/*    */       tc2.HW.Ic(g5);
/*    */       kr0.Wy0 = fV;
/*    */       kr0.Ks0 = s4;
/*    */       (kr0 = (Kr0)tc2).mn = b9;
/*    */     } else {
/*    */       kr0 = null;
/*    */     } 
/*    */     if (kr0 == null)
/*    */       return; 
/*    */     kr0.Kv = this.CC;
/*    */     Jo jo;
/*    */     if ((jo = (r8()).Qa.Ct) == null)
/*    */       return; 
/*    */     if (this.bJ0)
/*    */       jo.mA0(kr0, true); 
/*    */     Z50 z50 = Z50.RE0;
/*    */     tc1.q90(z50);
/*    */     int i;
/*    */     WX wX;
/*    */     tc tc1;
/*    */     if (this.fq && (tc1 = (r8()).Qa.Xb(i = this.cM0)) != null && (wX = (WX)km.si0.qb.Z6(i)) != null)
/*    */       wX.y00(z50); 
/*    */     short s1;
/*    */     if ((s1 = this.tN) > 0)
/*    */       kr0.WC(s1, false, (byte)0); 
/*    */     float f;
/*    */     if ((f = this.jr0) != 1.0F)
/*    */       kr0.Ku = f; 
/*    */     kr0.b50 = this.Tf;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/kH0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */