/* 1 */ package f;public final class s10 { public final String[] Nj(byte paramByte1, byte paramByte2, String... paramVarArgs) { Vc0[] arrayOfVc0; if (paramByte1 < 0 || paramByte1 >= (arrayOfVc0 = this.vw0).length)
/* 2 */       return My0;  Vc0 vc0; if ((vc0 = this[paramByte1]) == null) return My0;  ss ss; if ((ss = (ss)this.ix.Ha0(paramByte2)) == null) return My0;  int[] arrayOfInt; if ((arrayOfInt = this.i7) != null) { int i; String[] arrayOfString; byte b; for (arrayOfString = new String[i = arrayOfInt.length], b = 0; b < i; ) { arrayOfString[b] = Ml0.sB(this.i7[b], paramVarArgs); b++; }  return arrayOfString; }  return this.Jc0; }
/*   */ 
/*   */   
/*   */   public static final String[] My0 = new String[0];
/*   */   public static final s10 hU = new s10();
/*   */   public Vc0[] vw0 = new Vc0[11];
/*   */   
/*   */   public s10() {
/*   */     byte b = 0;
/*   */     Vc0[] arrayOfVc0;
/*   */     while (b < (arrayOfVc0 = this.vw0).length) {
/*   */       Vc0 vc0;
/*   */       this();
/*   */       arrayOfVc0[b] = vc0;
/*   */       byte b1 = (byte)(b + 1);
/*   */     } 
/*   */   }
/*   */   
/*   */   public static s10 JD() {
/*   */     return hU;
/*   */   }
/*   */   
/*   */   public final String vG0(byte paramByte1, byte paramByte2, int paramInt) {
/*   */     String[] arrayOfString;
/*   */     return ((arrayOfString = Nj(paramByte1, paramByte2, new String[0])).length <= paramInt) ? "" : this[paramInt];
/*   */   }
/*   */   
/*   */   public final void a2(byte paramByte, String... paramVarArgs) {
/*   */     this(paramByte, paramVarArgs);
/*   */     ss ss;
/*   */     Vc0.Ss(this.vw0[10], this);
/*   */   }
/*   */   
/*   */   public final void sf0(byte paramByte, int... paramVarArgs) {
/*   */     this(paramByte, paramVarArgs);
/*   */     ss ss;
/*   */     Vc0.Ss(this.vw0[10], this);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/s10.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */