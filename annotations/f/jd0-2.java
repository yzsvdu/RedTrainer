/*  1 */ package f;public final class jd0 { public cOm4 sm = null; public boolean c8; public UD0 NI; public Q90 ta; public byte Ih0; public short hp0 = 1; private void za() { if (km.MR == null) { this.c8 = false; return; }
/*    */      Wl wl; cOm4 cOm41;
/*  3 */     if ((wl = km.wI0.K7) != null && (
/*  4 */       cOm41 = this.sm) != null) wl
/*  5 */         .LW
/*  6 */         .DQ(cOm41);  this
/*  7 */       .c8 = false; } public mA M6 = mA.uZ; public boolean KL0 = false; public short y6 = -1; public EnumMap Zf = new EnumMap<>(hR.class); public byte IH0; public jd0(int paramInt) { this.ta = new Q90(paramInt); } public final void nH(short paramShort1, byte paramByte1, String paramString, byte paramByte2, byte paramByte3, byte paramByte4, short paramShort2, byte paramByte5, mA parammA, short paramShort3, short paramShort4, byte paramByte6) { this.ta.Cw0 = paramShort1; this.NI = On.v30().lpT3(this.ta.Cw0); q90.od = paramByte1; q90.nr = paramString; Q90 q90; (q90 = this.ta).am(paramByte2); this.Ih0 = paramByte3; this.IH0 = paramByte4; this.y6 = paramShort2; q90 = this.ta; if (paramByte5 < 0 || paramByte5 > 24) paramByte5 = 3;  q90
/*  8 */       .qz = paramByte5;
/*  9 */     this.M6 = parammA; q90.ok(paramShort3); this.hp0 = paramShort4; this.ta
/*    */       
/* 11 */       .u0 = (byte)(this.ta.u0 | paramByte6);
/* 12 */     pO(); }
/*    */ 
/*    */   
/*    */   public final short yw() {
/*    */     if (!this.KL0)
/*    */       return -1; 
/*    */     return this.NI.zq0(this.ta.cC);
/*    */   }
/*    */   
/*    */   public final String Qe() {
/*    */     if (this.ta.xt())
/*    */       return this.ta.nr; 
/*    */     int i = 150000;
/*    */     return Ml0.OH0(this.ta.Cw0 + i);
/*    */   }
/*    */   
/*    */   public final int Wc0() {
/*    */     return this.ta.q10;
/*    */   }
/*    */   
/*    */   public final byte Xi() {
/*    */     return this.Ih0;
/*    */   }
/*    */   
/*    */   public final Q90 w70() {
/*    */     return this.ta;
/*    */   }
/*    */   
/*    */   public final boolean AL() {
/*    */     return (this.ta.Hq0 < 1);
/*    */   }
/*    */   
/*    */   public final short Kp() {
/*    */     return this.ta.Cw0;
/*    */   }
/*    */   
/*    */   public final byte K() {
/*    */     return AL() ? 0 : this.ta.u0;
/*    */   }
/*    */   
/*    */   public final void pO() {
/*    */     if (this.sm != null && !this.c8) {
/*    */       this.c8 = true;
/*    */       UB0.Kg0.fN(this::za);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final boolean j20() {
/*    */     mA mA1;
/*    */     if (!(mA1 = this.M6).Pp()) {
/*    */       boolean bool;
/*    */       int i;
/*    */       if ((i = this.MG) == 4) {
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       } 
/*    */       if (bool || i == 2)
/*    */         return true; 
/*    */     } 
/*    */     return true;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/jd0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */