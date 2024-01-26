/*  1 */ package f;public final class Jo extends tc { public static Fz0 of = new Fz0(); public String ED0; public byte CC; public byte Eh0; public boolean na; public static J; public OE0 lB0; public Kr0 pJ; public String d7; public String qE; public final void Iy() { if (this.d7.isEmpty()) { this
/*  2 */         .qE = this.ED0; return; }  this
/*    */ 
/*    */ 
/*    */       
/*  6 */       .qE = B40.df("[").append(this.d7).append("]").append(this.ED0).toString(); } public float xc; public boolean PN; public boolean k80; public boolean Hh; public boolean Zk0; public boolean Do0; public boolean xi; public byte Ml; public short com5; public Jo(int paramInt, String paramString1, byte paramByte1, byte paramByte2, H10 paramH10, G5 paramG5, byte paramByte3, Z50 paramZ50, byte paramByte4, short paramShort1, short paramShort2, byte paramByte5, String paramString2) { super(paramInt, paramG5, paramByte3); OE0 oE0; zk0 zk0; this.na = false; this.xc = 0.0F; this.PN = false; this.k80 = false; this.Hh = false; this.Ml = -1; this.com5 = -1; this.ED0 = paramString1; this.CC = paramByte1; this.Eh0 = paramByte2; this(paramByte2, paramH10); this.lB0 = oE0; q90(paramZ50); DU(paramByte4, paramShort1); this(this, paramShort2, paramByte5); this.Ae = zk0; this.d7 = paramString2; Iy(); Dx0(); } public final void Dx0() { boolean bool; R8 r8; if ((r8 = km.u4) == null) { this.PN = false; this.k80 = false; this.Hh = false; return; }  int j = this.Jg; Oc0 oc0; if ((oc0 = r8.E50) != null && oc0.tl0.return(j)) { j = 1; } else { j = 0; }  this.PN = j; mG mG; if ((mG = r8.Wn0) != null && mG
/*    */       
/*  8 */       .FH0(this.Jg)) { bool = true; } else { bool = false; }  this.k80 = bool;
/*    */     
/* 10 */     int i = this.Jg; Yp0 yp0;
/* 11 */     if ((yp0 = r8.Tr0) != null && yp0.nt0
/* 12 */       .return(i)) { i = 1; } else { i = 0; }  this
/* 13 */       .Hh = i; }
/*    */ 
/*    */   
/*    */   public final static default() {
/*    */     return this.J;
/*    */   }
/*    */   
/*    */   public final byte my() {
/*    */     byte b;
/*    */     return ((b = this.Ml) != -1) ? b : 0;
/*    */   }
/*    */   
/*    */   public final static tA() {
/*    */     this(this);
/*    */     this.J = mT;
/*    */     mT mT;
/*    */     return mT = new mT();
/*    */   }
/*    */   
/*    */   public final void mA0(Kr0 paramKr0, boolean paramBoolean) {
/*    */     G5 g5;
/*    */     Kr0 kr0;
/*    */     if ((kr0 = this.pJ) != null)
/*    */       kr0.nx0 = false; 
/*    */     this.pJ = paramKr0;
/*    */     if (paramKr0 != null) {
/*    */       paramKr0.nx0 = true;
/*    */       if (paramBoolean) {
/*    */         g5 = zk0.We(this);
/*    */       } else {
/*    */         return;
/*    */       } 
/*    */     } else {
/*    */       g5 = zk0.We((tc)this);
/*    */     } 
/*    */     ((tc)this).Ae.pm.Cb0(this);
/*    */   }
/*    */   
/*    */   public final String m() {
/*    */     return this.ED0;
/*    */   }
/*    */   
/*    */   public final byte lPt7() {
/*    */     return this.Eh0;
/*    */   }
/*    */   
/*    */   public final OE0 cM() {
/*    */     return this.lB0;
/*    */   }
/*    */   
/*    */   public final void EL(boolean paramBoolean) {
/*    */     super.EL(paramBoolean);
/*    */     vd[] arrayOfVd;
/*    */     int i;
/*    */     byte b;
/*    */     for (i = (arrayOfVd = this.lB0.ew0).length, b = 0; b < i; ) {
/*    */       (this[b]).iD0 = (int)((this[b]).iD0 + zm0.O20);
/*    */       b++;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final boolean Pf() {
/*    */     return this.na;
/*    */   }
/*    */   
/*    */   public final short D4() {
/*    */     short s;
/*    */     if (this.Eh0 == 0) {
/*    */       s = (short)0;
/*    */     } else {
/*    */       s = (short)7;
/*    */     } 
/*    */     return (UG() || VO()) ? (short)(s + 2) : (XC() ? (short)(s + 1) : s);
/*    */   }
/*    */   
/*    */   public final boolean yO() {
/*    */     return true;
/*    */   }
/*    */   
/*    */   public final String a() {
/*    */     if (!h1.QP && this.Jg == km.a3.yD)
/*    */       return ""; 
/*    */     return this.qE;
/*    */   }
/*    */   
/*    */   public final void sq(boolean paramBoolean) {
/*    */     super.sq(paramBoolean);
/*    */     this.Ae.pm.u3();
/*    */     this.Ae.pm.Cb0(zk0.We(this));
/*    */   }
/*    */   
/*    */   public final void DU(byte paramByte, short paramShort) {
/*    */     if (this.Ml != paramByte || this.com5 != paramShort) {
/*    */     
/*    */     } else {
/*    */     
/*    */     } 
/*    */     if (false) {
/*    */       NG0 nG0;
/*    */       this.Ml = paramByte;
/*    */       this.com5 = paramShort;
/*    */       if (paramByte != -1 && paramShort != -1) {
/*    */         boolean bool;
/*    */         if (!(this.J instanceof NG0)) {
/*    */           NG0 nG01;
/*    */           this(this);
/*    */           this.J = nG01;
/*    */         } 
/*    */         this.lx = paramByte;
/*    */         (nG0 = (NG0)this.J).cOM7 = paramShort;
/*    */         if (paramByte == 10) {
/*    */           bool = true;
/*    */         } else {
/*    */           bool = false;
/*    */         } 
/*    */         this.gb = bool;
/*    */         if (paramByte == 1) {
/*    */           this.Gj0 = G00.Av0.Cx0(paramByte, paramShort, false).V(12);
/*    */         } else if (paramByte == 0) {
/*    */           this.Gj0 = G00.Av0.Cx0(paramByte, paramShort, false).V(11);
/*    */         } 
/*    */       } else {
/*    */         mT mT;
/*    */         this((Jo)this);
/*    */         ((Jo)super).J = mT;
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final tc U0() {
/*    */     return this.pJ;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Jo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */