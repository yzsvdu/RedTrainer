/*    */ package f;public final class zk0 extends tc { public static G5 We(tc paramtc) { xr0 xr01;
/*  2 */     if ((xr01 = paramtc.HW.CJ0()) == null) return new G5(paramtc
/*  3 */           .HW);
/*    */ 
/*    */     
/*    */     xr0 xr02;
/*  7 */     if ((xr02 = xr01.Q4().COm3(xr01, paramtc.HW.g50, -1)) == null || xr02.T9())
/*    */     {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 21 */       return new G5(paramtc
/* 22 */           .HW); } 
/*    */     if (xr02.bl0() != xr01.bl0())
/*    */       return new G5(paramtc.HW); 
/*    */     if (Math.abs(xr02.i00() - xr01.i00()) > 2.0F)
/*    */       return new G5(paramtc.HW); 
/*    */     byte b1 = (xr02.Q4()).E10;
/*    */     byte b2 = (xr02.Q4()).cA;
/*    */     byte b3 = (xr02.Q4()).VZ;
/*    */     boolean bool = xr02.Y00();
/*    */     short s2 = xr02.Ka(), s3 = xr02.hA0();
/*    */     byte b4 = xr02.bl0();
/*    */     short s1 = xr02.hA0();
/*    */     s1 = paramtc.HW.mm;
/*    */     s1 = LF.KU(xr02.Ka(), s1, s1, paramtc.HW.Yu0);
/*    */     return new G5(b1, b2, b3, bool, s2, s3, b4, s1); }
/*    */ 
/*    */   
/*    */   public tc jU;
/*    */   public e2 QN;
/*    */   public short YZ;
/*    */   public byte zz0;
/*    */   public boolean vj;
/*    */   
/*    */   public zk0(tc paramtc, short paramShort, byte paramByte) {
/*    */     this(paramtc, We(paramtc), paramShort, paramByte);
/*    */   }
/*    */   
/*    */   public zk0(tc paramtc, G5 paramG5, short paramShort, byte paramByte) {
/*    */     super(-10, paramG5, (byte)0);
/*    */     this(2000);
/*    */     this.QN = e21;
/*    */     this.jU = paramtc;
/*    */     e2 e21;
/*    */     (e21 = new e2()).T30();
/*    */     this.YZ = paramShort;
/*    */     this.zz0 = paramByte;
/*    */   }
/*    */   
/*    */   public final void WC(short paramShort, boolean paramBoolean, byte paramByte) {
/*    */     this.YZ = paramShort;
/*    */     this.zz0 = paramByte;
/*    */     this.vj = paramBoolean;
/*    */   }
/*    */   
/*    */   public final short nX() {
/*    */     return this.YZ;
/*    */   }
/*    */   
/*    */   public final byte wo() {
/*    */     return this.zz0;
/*    */   }
/*    */   
/*    */   public final static tA() {
/*    */     return new yF(this);
/*    */   }
/*    */   
/*    */   public final byte my() {
/*    */     return this.jU.HW.FB;
/*    */   }
/*    */   
/*    */   public final short D4() {
/*    */     return 303;
/*    */   }
/*    */   
/*    */   public final String m() {
/*    */     return "";
/*    */   }
/*    */   
/*    */   public final boolean z80() {
/*    */     return this.jU.z80();
/*    */   }
/*    */   
/*    */   public final boolean UG() {
/*    */     return this.jU.UG();
/*    */   }
/*    */   
/*    */   public final boolean b1() {
/*    */     if (this.jU.nX() != 0 && this.jU.AJ0()) {
/*    */       boolean bool;
/*    */       static static;
/*    */       if (((yF)(static = this.Y1)).Hp != null) {
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       } 
/*    */       if (bool && ((yF)this).Rg > 127);
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final static default() {
/*    */     return this.Y1;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/zk0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */