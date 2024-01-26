/* 1 */ package f;public final class qa0 { public final void tY() { short s; nD0[] arrayOfND0; for (this
/* 2 */       .Ue0 = new nD0[(short)(this.KX - 1)], s = 0; s < (arrayOfND0 = this.Ue0).length; ) { nD0 nD01; int i = this.Mg0;
/*   */       
/* 4 */       short s1 = f1(s, this.KX); this(i, s, s1); arrayOfND0[s] = nD01; s = (short)(s + 1); }
/*   */      }
/*   */ 
/*   */   
/*   */   public int Mg0;
/*   */   public byte yw;
/*   */   public byte U0;
/*   */   public String Vx;
/*   */   public short KX;
/*   */   public ky fH0;
/*   */   public long Gr;
/*   */   public byte b20;
/*   */   public int rq;
/*   */   public oU[] Xe = new oU[0];
/*   */   public byte Mr0 = 15;
/*   */   public jc[] gb = null;
/*   */   public nD0[] Ue0;
/*   */   public HashMap Br0 = new HashMap<>();
/*   */   public DO[] Lm;
/*   */   public final boolean Q40;
/*   */   public boolean pR = false;
/*   */   
/*   */   public static short f1(short paramShort1, short paramShort2) {
/*   */     short s = 0;
/*   */     int j = 0;
/*   */     int i;
/*   */     while ((i = paramShort2 / 2) > 0 && (j += i) <= paramShort1) {
/*   */       i = (short)i;
/*   */       s = (short)(s + 1);
/*   */     } 
/*   */     return s;
/*   */   }
/*   */   
/*   */   public qa0(int paramInt1, byte paramByte1, byte paramByte2, String paramString, short paramShort, byte paramByte3, ky paramky, long paramLong, byte paramByte4, int paramInt2, byte paramByte5, boolean paramBoolean1, boolean paramBoolean2) {
/*   */     this.Mg0 = paramInt1;
/*   */     this.yw = paramByte1;
/*   */     this.U0 = paramByte2;
/*   */     this.Vx = paramString;
/*   */     this.KX = paramShort;
/*   */     Arrays.asList(this.Lm = DO.f6(paramByte3));
/*   */     this.fH0 = paramky;
/*   */     this.Gr = paramLong;
/*   */     this.b20 = paramByte4;
/*   */     this.rq = paramInt2;
/*   */     this.Mr0 = paramByte5;
/*   */     this.Q40 = paramBoolean1;
/*   */     if (paramBoolean2 && DK.Pm(paramky, Ab0()) != null)
/*   */       this.pR = paramBoolean2; 
/*   */     if (paramByte4 == 1)
/*   */       this.pR = true; 
/*   */     tY();
/*   */   }
/*   */   
/*   */   public final int jK0() {
/*   */     return this.Mg0;
/*   */   }
/*   */   
/*   */   public final String P8() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield Vx : Ljava/lang/String;
/*   */     //   4: ldc 'SEASONFINALE'
/*   */     //   6: invokevirtual startsWith : (Ljava/lang/String;)Z
/*   */     //   9: ifeq -> 211
/*   */     //   12: aload_0
/*   */     //   13: iconst_0
/*   */     //   14: istore_0
/*   */     //   15: aconst_null
/*   */     //   16: astore_1
/*   */     //   17: iconst_0
/*   */     //   18: istore_2
/*   */     //   19: getfield Vx : Ljava/lang/String;
/*   */     //   22: ldc '-'
/*   */     //   24: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*   */     //   27: dup
/*   */     //   28: dup
/*   */     //   29: iconst_1
/*   */     //   30: aaload
/*   */     //   31: invokestatic parseByte : (Ljava/lang/String;)B
/*   */     //   34: istore_0
/*   */     //   35: iconst_2
/*   */     //   36: aaload
/*   */     //   37: invokestatic parseByte : (Ljava/lang/String;)B
/*   */     //   40: invokestatic com4 : (B)Lf/DK;
/*   */     //   43: astore_1
/*   */     //   44: iconst_3
/*   */     //   45: aaload
/*   */     //   46: invokestatic parseInt : (Ljava/lang/String;)I
/*   */     //   49: ifle -> 57
/*   */     //   52: iconst_1
/*   */     //   53: istore_2
/*   */     //   54: goto -> 63
/*   */     //   57: iconst_0
/*   */     //   58: istore_2
/*   */     //   59: goto -> 63
/*   */     //   62: pop
/*   */     //   63: aload_1
/*   */     //   64: ldc '?'
/*   */     //   66: astore_3
/*   */     //   67: ifnull -> 145
/*   */     //   70: aload_1
/*   */     //   71: getfield Iq : Z
/*   */     //   74: ifeq -> 136
/*   */     //   77: getstatic f/DK.gw : [Lf/DK;
/*   */     //   80: dup
/*   */     //   81: astore #4
/*   */     //   83: arraylength
/*   */     //   84: istore #5
/*   */     //   86: iconst_0
/*   */     //   87: istore #6
/*   */     //   89: iload #6
/*   */     //   91: iload #5
/*   */     //   93: if_icmpge -> 134
/*   */     //   96: aload #4
/*   */     //   98: iload #6
/*   */     //   100: aaload
/*   */     //   101: dup
/*   */     //   102: astore #7
/*   */     //   104: getfield Qu : I
/*   */     //   107: aload_1
/*   */     //   108: getfield Qu : I
/*   */     //   111: if_icmpne -> 128
/*   */     //   114: aload #7
/*   */     //   116: getfield Iq : Z
/*   */     //   119: ifne -> 128
/*   */     //   122: aload #7
/*   */     //   124: astore_1
/*   */     //   125: goto -> 136
/*   */     //   128: iinc #6, 1
/*   */     //   131: goto -> 89
/*   */     //   134: aconst_null
/*   */     //   135: astore_1
/*   */     //   136: aload_1
/*   */     //   137: ifnull -> 145
/*   */     //   140: aload_1
/*   */     //   141: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   144: astore_3
/*   */     //   145: iload_2
/*   */     //   146: sipush #5402
/*   */     //   149: istore_1
/*   */     //   150: iconst_3
/*   */     //   151: anewarray java/lang/String
/*   */     //   154: dup
/*   */     //   155: dup
/*   */     //   156: astore_2
/*   */     //   157: iconst_0
/*   */     //   158: aload_3
/*   */     //   159: aastore
/*   */     //   160: new java/lang/StringBuilder
/*   */     //   163: dup
/*   */     //   164: iload_0
/*   */     //   165: swap
/*   */     //   166: invokespecial <init> : ()V
/*   */     //   169: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*   */     //   172: ldc ''
/*   */     //   174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   177: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   180: iconst_1
/*   */     //   181: swap
/*   */     //   182: aastore
/*   */     //   183: iconst_2
/*   */     //   184: istore_0
/*   */     //   185: ifeq -> 194
/*   */     //   188: sipush #5403
/*   */     //   191: goto -> 197
/*   */     //   194: sipush #5404
/*   */     //   197: invokestatic OH0 : (I)Ljava/lang/String;
/*   */     //   200: astore_3
/*   */     //   201: iload_1
/*   */     //   202: aload_2
/*   */     //   203: dup
/*   */     //   204: iload_0
/*   */     //   205: aload_3
/*   */     //   206: aastore
/*   */     //   207: invokestatic sB : (I[Ljava/lang/String;)Ljava/lang/String;
/*   */     //   210: areturn
/*   */     //   211: aload_0
/*   */     //   212: getfield Vx : Ljava/lang/String;
/*   */     //   215: invokestatic LU : (Ljava/lang/String;)Ljava/lang/String;
/*   */     //   218: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 71
/*   */     //   #2	-> 77
/*   */     //   #3	-> 141
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   19	34	62	java/lang/Exception
/*   */     //   35	43	62	java/lang/Exception
/*   */     //   44	49	62	java/lang/Exception
/*   */   }
/*   */   
/*   */   public final DO Ab0() {
/*   */     return DO.Qd(this.Lm);
/*   */   }
/*   */   
/*   */   public final String MU() {
/*   */     byte b;
/*   */     if ((b = this.b20) != 1) {
/*   */       if (b != 2)
/*   */         return (b != 3) ? Ml0.OH0(61) : (NumberFormat.getInstance().format(this.rq) + " " + Ml0.OH0(121)); 
/*   */       return B40.df("$").append(NumberFormat.getInstance().format(this.rq)).toString();
/*   */     } 
/*   */     return Ml0.OH0(9121);
/*   */   }
/*   */   
/*   */   public final nD0 rv(short paramShort) {
/*   */     nD0[] arrayOfND0;
/*   */     return (paramShort < 0 || paramShort >= (arrayOfND0 = this.Ue0).length) ? null : this[paramShort];
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/qa0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */