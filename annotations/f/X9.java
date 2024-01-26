/* 1 */ package f;public final class X9 { public final pe0 QB0(byte paramByte1, byte paramByte2) { Hk hk; if ((hk = this.UW) != null) { this.UW = null; wc wc1 = this.Ki; hk.hI0(wc1, this.PE, false); }  Gh0[] arrayOfGh0; if (paramByte2 < 0 || paramByte2 >= (arrayOfGh0 = this.ls).length)
/* 2 */       return null;  return (this[paramByte2]).Ru0[paramByte1]; }
/*   */ 
/*   */   
/*   */   public wc Ki;
/*   */   public lPT9 PE;
/*   */   public Gh0[] ls;
/*   */   public BitSet[] N5 = null;
/*   */   public Hk UW = null;
/*   */   public boolean vi = false;
/*   */   
/*   */   public X9(wc paramwc, lPT9 paramlPT9, byte paramByte) {
/*   */     this.Ki = paramwc;
/*   */     this.PE = paramlPT9;
/*   */     this.ls = new Gh0[paramByte];
/*   */     byte b = 0;
/*   */     while (b < paramByte) {
/*   */       Gh0 gh0;
/*   */       this();
/*   */       this.ls[b] = gh0;
/*   */       byte b1 = (byte)(b + 1);
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void st0() {
/*   */     boolean bool = true;
/*   */     Hk hk;
/*   */     if ((hk = this.UW) != null) {
/*   */       this.UW = null;
/*   */       wc wc1 = this.Ki;
/*   */       hk.hI0(this, this.PE, bool);
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/X9.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */