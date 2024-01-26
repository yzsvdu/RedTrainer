/* 1 */ package f;public final class G5 { public final String j2() { String str; Short short_; StringBuilder stringBuilder2 = (new StringBuilder()).append(this.FB).append(" "); if (Mk0.n80(this.FB)) { String str1 = this.kD0 + "." + this.vu0; }
/* 2 */     else { short_ = Short.valueOf(Qx.mF(this.kD0, this.vu0)); }  StringBuilder stringBuilder1 = stringBuilder2.append(short_).append(" ").append(this.mm).append(" ").append(this.Yu0).append(" ").append(this.Qf0); if (this.LB0) { str = " NG"; } else { str = ""; }  return append(str).toString(); }
/*   */ 
/*   */   
/*   */   public byte FB;
/*   */   public byte kD0;
/*   */   public byte vu0;
/*   */   public boolean LB0;
/*   */   public short mm;
/*   */   public short Yu0;
/*   */   public byte Qf0;
/*   */   public byte g50;
/*   */   public byte ZJ0;
/*   */   public xr0 lT;
/*   */   
/*   */   public G5(byte paramByte1, byte paramByte2, byte paramByte3, boolean paramBoolean, short paramShort1, short paramShort2, byte paramByte4, byte paramByte5) {
/*   */     this.lT = null;
/*   */     this.FB = paramByte1;
/*   */     this.kD0 = paramByte2;
/*   */     this.vu0 = paramByte3;
/*   */     this.LB0 = paramBoolean;
/*   */     this.mm = paramShort1;
/*   */     this.Yu0 = paramShort2;
/*   */     this.Qf0 = paramByte4;
/*   */     this.g50 = paramByte5;
/*   */     this.ZJ0 = paramByte5;
/*   */   }
/*   */   
/*   */   public G5(G5 paramG5) {
/*   */     this.LB0 = false;
/*   */     this.lT = null;
/*   */     Ic(paramG5);
/*   */   }
/*   */   
/*   */   public final byte Xr() {
/*   */     return this.FB;
/*   */   }
/*   */   
/*   */   public final boolean bV() {
/*   */     return this.LB0;
/*   */   }
/*   */   
/*   */   public final float VI0() {
/*   */     xr0 xr01;
/*   */     return ((xr01 = CJ0()) == null) ? 0.0F : i00();
/*   */   }
/*   */   
/*   */   public final void Ic(G5 paramG5) {
/*   */     this.FB = paramG5.FB;
/*   */     this.kD0 = paramG5.kD0;
/*   */     this.vu0 = paramG5.vu0;
/*   */     this.mm = paramG5.mm;
/*   */     this.Yu0 = paramG5.Yu0;
/*   */     this.Qf0 = paramG5.Qf0;
/*   */     this.LB0 = paramG5.LB0;
/*   */     this.g50 = paramG5.g50;
/*   */     this.lT = null;
/*   */   }
/*   */   
/*   */   public final void Zh(boolean paramBoolean, short paramShort1, short paramShort2, byte paramByte1, byte paramByte2) {
/*   */     this.LB0 = paramBoolean;
/*   */     this.mm = paramShort1;
/*   */     this.Yu0 = paramShort2;
/*   */     this.Qf0 = paramByte1;
/*   */     this.g50 = paramByte2;
/*   */     this.lT = null;
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     if (!(paramObject instanceof G5))
/*   */       return false; 
/*   */     paramObject = paramObject;
/*   */     return (this.FB == ((G5)paramObject).FB && this.kD0 == ((G5)paramObject).kD0 && this.vu0 == ((G5)paramObject).vu0 && this.mm == ((G5)paramObject).mm && this.Yu0 == ((G5)paramObject).Yu0 && this.Qf0 == ((G5)paramObject).Qf0 && this.LB0 == ((G5)paramObject).LB0 && this.g50 == ((G5)paramObject).g50);
/*   */   }
/*   */   
/*   */   public final G5 Ef0() {
/*   */     byte b1 = this.FB;
/*   */     byte b2 = this.kD0;
/*   */     byte b3 = this.vu0;
/*   */     boolean bool = this.LB0;
/*   */     short s1 = this.mm;
/*   */     short s2 = this.Yu0;
/*   */     byte b4 = this.Qf0;
/*   */     byte b5 = this.g50;
/*   */     return new G5(b1, b2, b3, bool, s1, s2, b4, b5);
/*   */   }
/*   */   
/*   */   public final xr0 CJ0() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield lT : Lf/xr0;
/*   */     //   4: dup
/*   */     //   5: astore_1
/*   */     //   6: ifnull -> 11
/*   */     //   9: aload_1
/*   */     //   10: areturn
/*   */     //   11: getstatic f/km.a3 : Lf/vh0;
/*   */     //   14: aload_0
/*   */     //   15: dup
/*   */     //   16: dup
/*   */     //   17: getfield FB : B
/*   */     //   20: istore_1
/*   */     //   21: getfield kD0 : B
/*   */     //   24: istore_2
/*   */     //   25: getfield vu0 : B
/*   */     //   28: istore_3
/*   */     //   29: iload_1
/*   */     //   30: iload_2
/*   */     //   31: iload_3
/*   */     //   32: invokevirtual COm8 : (BBB)Lf/KI;
/*   */     //   35: dup
/*   */     //   36: astore_1
/*   */     //   37: ifnonnull -> 42
/*   */     //   40: aconst_null
/*   */     //   41: areturn
/*   */     //   42: aload_0
/*   */     //   43: getfield LB0 : Z
/*   */     //   46: ifeq -> 78
/*   */     //   49: aload_0
/*   */     //   50: aload_1
/*   */     //   51: aload_0
/*   */     //   52: dup
/*   */     //   53: dup
/*   */     //   54: getfield Qf0 : B
/*   */     //   57: istore_1
/*   */     //   58: getfield mm : S
/*   */     //   61: istore_2
/*   */     //   62: getfield Yu0 : S
/*   */     //   65: istore_3
/*   */     //   66: iload_1
/*   */     //   67: iload_2
/*   */     //   68: iload_3
/*   */     //   69: invokevirtual v4 : (BSS)Lf/xr0;
/*   */     //   72: putfield lT : Lf/xr0;
/*   */     //   75: goto -> 104
/*   */     //   78: aload_0
/*   */     //   79: aload_1
/*   */     //   80: aload_0
/*   */     //   81: dup
/*   */     //   82: dup
/*   */     //   83: getfield mm : S
/*   */     //   86: istore_1
/*   */     //   87: getfield Yu0 : S
/*   */     //   90: istore_2
/*   */     //   91: getfield Qf0 : B
/*   */     //   94: istore_3
/*   */     //   95: iload_1
/*   */     //   96: iload_2
/*   */     //   97: iload_3
/*   */     //   98: invokevirtual v50 : (III)Lf/xr0;
/*   */     //   101: putfield lT : Lf/xr0;
/*   */     //   104: aload_0
/*   */     //   105: getfield lT : Lf/xr0;
/*   */     //   108: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 17
/*   */     //   #2	-> 21
/*   */     //   #3	-> 25
/*   */     //   #4	-> 32
/*   */     //   #5	-> 54
/*   */     //   #6	-> 58
/*   */     //   #7	-> 62
/*   */     //   #8	-> 69
/*   */     //   #9	-> 83
/*   */     //   #10	-> 87
/*   */     //   #11	-> 91
/*   */     //   #12	-> 98
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/G5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */