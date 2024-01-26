/* 1 */ package com.studiohartman.jamepad;public final class ControllerIndex { public final void SK() { if (xo()) return;  throw new l9(
/*   */         
/* 3 */         N.Gl0(B40.df("Controller at index "), this.L3, " is not connected!")); }
/*   */ 
/*   */   
/*   */   public int L3;
/*   */   public long gx;
/*   */   public boolean[] U20;
/*   */   public boolean[] Ke0;
/*   */   
/*   */   public final void R50() {
/*   */     this.gx = nativeConnectController(this.L3);
/*   */   }
/*   */   
/*   */   public final void yw() {
/*   */     long l;
/*   */     if ((l = this.gx) != 0L) {
/*   */       nativeClose(l);
/*   */       this.gx = 0L;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final boolean xo() {
/*   */     long l;
/*   */     return ((l = this.gx) != 0L && nativeIsConnected(l));
/*   */   }
/*   */   
/*   */   public final boolean t50(s3 params3) {
/*   */     boolean bool1;
/*   */     int i = params3.ordinal();
/*   */     SK();
/*   */     boolean[] arrayOfBoolean = this.Ke0;
/*   */     boolean bool;
/*   */     if ((bool = nativeCheckButton(this.gx, i)) && !this.U20[i]) {
/*   */       bool1 = true;
/*   */     } else {
/*   */       bool1 = false;
/*   */     } 
/*   */     arrayOfBoolean[i] = bool1;
/*   */     this.U20[i] = bool;
/*   */     return this.U20[params3.ordinal()];
/*   */   }
/*   */   
/*   */   public final boolean Sv(s3 params3) {
/*   */     SK();
/*   */     long l = this.gx;
/*   */     int i = params3.ordinal();
/*   */     return nativeButtonAvailable(l, i);
/*   */   }
/*   */   
/*   */   public final float QK0(kB paramkB) {
/*   */     SK();
/*   */     long l = this.gx;
/*   */     int i = paramkB.ordinal();
/*   */     return nativeCheckAxis(l, i) / 32767.0F;
/*   */   }
/*   */   
/*   */   public final boolean Ye(kB paramkB) {
/*   */     SK();
/*   */     long l = this.gx;
/*   */     int i = paramkB.ordinal();
/*   */     return nativeAxisAvailable(l, i);
/*   */   }
/*   */   
/*   */   public final String dZ() {
/*   */     SK();
/*   */     String str;
/*   */     return ((str = nativeGetName(this.gx)) == null) ? "Unnamed Controller" : this;
/*   */   }
/*   */   
/*   */   public final int Yb() {
/*   */     SK();
/*   */     return nativeGetDeviceInstanceID(this.gx);
/*   */   }
/*   */   
/*   */   public final int px0() {
/*   */     SK();
/*   */     return Zk0.s6(7)[nativeGetPowerLevel(this.gx) + 1];
/*   */   }
/*   */   
/*   */   public ControllerIndex(int paramInt) {
/*   */     this.L3 = paramInt;
/*   */     this.U20 = new boolean[(s3.values()).length];
/*   */     this.Ke0 = new boolean[(s3.values()).length];
/*   */     boolean[] arrayOfBoolean;
/*   */     for (paramInt = 0; paramInt < (arrayOfBoolean = this.U20).length; paramInt++) {
/*   */       arrayOfBoolean[paramInt] = false;
/*   */       this.Ke0[paramInt] = false;
/*   */     } 
/*   */     R50();
/*   */   }
/*   */   
/*   */   private native long nativeConnectController(int paramInt);
/*   */   
/*   */   private native void nativeClose(long paramLong);
/*   */   
/*   */   private native boolean nativeIsConnected(long paramLong);
/*   */   
/*   */   private native boolean nativeCheckButton(long paramLong, int paramInt);
/*   */   
/*   */   private native boolean nativeButtonAvailable(long paramLong, int paramInt);
/*   */   
/*   */   private native int nativeCheckAxis(long paramLong, int paramInt);
/*   */   
/*   */   private native boolean nativeAxisAvailable(long paramLong, int paramInt);
/*   */   
/*   */   private native String nativeGetName(long paramLong);
/*   */   
/*   */   private native int nativeGetDeviceInstanceID(long paramLong);
/*   */   
/*   */   private native int nativeGetPowerLevel(long paramLong); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/studiohartman/jamepad/ControllerIndex.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */