/* 1 */ package f;public final class pRn { public final pRn o10(pRn parampRn) { byte b3 = parampRn.Ge;
/* 2 */     byte b1 = parampRn.fk;
/* 3 */     b1 = (byte)((this.fk & 0xFF) * (b1 & 0xFF) / 255);
/* 4 */     b3 = parampRn.Ff0;
/* 5 */     b3 = (byte)((this.Ff0 & 0xFF) * (b3 & 0xFF) / 255);
/* 6 */     byte b2 = parampRn.ls;
/* 7 */     b2 = (byte)((this.ls & 0xFF) * (b2 & 0xFF) / 255); return new pRn((byte)((this.Ge & 0xFF) * (b3 & 0xFF) / 255), b1, b3, b2); }
/*   */ 
/*   */   
/*   */   public static final pRn TRANSPARENT_WHITE = new pRn(16777215);
/*   */   public static final pRn BLACK = new pRn(-16777216);
/*   */   public static final pRn SILVER = new pRn(-4144960);
/*   */   public static final pRn GRAY = new pRn(-8355712);
/*   */   public static final pRn WHITE = new pRn(-1);
/*   */   public static final pRn MAROON = new pRn(-8388608);
/*   */   public static final pRn RED = new pRn(-65536);
/*   */   public static final pRn PURPLE = new pRn(-8388480);
/*   */   public static final pRn FUCHSIA = new pRn(-65281);
/*   */   public static final pRn GREEN = new pRn(-16744448);
/*   */   public static final pRn LIME = new pRn(-16711936);
/*   */   public static final pRn OLIVE = new pRn(-8355840);
/*   */   public static final pRn ORANGE = new pRn(-23296);
/*   */   public static final pRn YELLOW = new pRn(-256);
/*   */   public static final pRn NAVY = new pRn(-16777088);
/*   */   public static final pRn BLUE = new pRn(-16776961);
/*   */   public static final pRn TEAL = new pRn(-16744320);
/*   */   public static final pRn AQUA = new pRn(-16711681);
/*   */   public static final pRn SKYBLUE = new pRn(-7876885);
/*   */   public static final pRn LIGHTBLUE = new pRn(-5383962);
/*   */   public static final pRn LIGHTCORAL = new pRn(-1015680);
/*   */   public static final pRn LIGHTCYAN = new pRn(-2031617);
/*   */   public static final pRn LIGHTGRAY = new pRn(-2894893);
/*   */   public static final pRn LIGHTGREEN = new pRn(-7278960);
/*   */   public static final pRn LIGHTPINK = new pRn(-18751);
/*   */   public static final pRn LIGHTSALMON = new pRn(-24454);
/*   */   public static final pRn LIGHTSKYBLUE = new pRn(-7876870);
/*   */   public static final pRn LIGHTYELLOW = new pRn(-32);
/*   */   public static final pRn DARKGRAY = new pRn(-12632257);
/*   */   public static final pRn ROYAL = new pRn(-12490271);
/*   */   public static final pRn SLATE = new pRn(-9404272);
/*   */   public static final pRn SKY = new pRn(-7876885);
/*   */   public static final pRn CHARTREUSE = new pRn(-8388864);
/*   */   public static final pRn FOREST = new pRn(-14513374);
/*   */   public static final pRn GOLD = new pRn(-10496);
/*   */   public static final pRn GOLDENROD = new pRn(-2448096);
/*   */   public static final pRn BROWN = new pRn(-7650029);
/*   */   public static final pRn TAN = new pRn(-2968436);
/*   */   public static final pRn FIREBRICK = new pRn(-5103070);
/*   */   public static final pRn SCARLET = new pRn(-52196);
/*   */   public static final pRn CORAL = new pRn(-32944);
/*   */   public static final pRn SALMON = new pRn(-360334);
/*   */   public static final pRn PINK = new pRn(-38476);
/*   */   public static final pRn VIOLET = new pRn(-1146130);
/*   */   public static final pRn TRANSPARENT = new pRn(0);
/*   */   public byte Ge;
/*   */   public byte fk;
/*   */   public byte Ff0;
/*   */   public byte ls;
/*   */   
/*   */   public pRn(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4) {
/*   */     this.Ge = paramByte1;
/*   */     this.fk = paramByte2;
/*   */     this.Ff0 = paramByte3;
/*   */     this.ls = paramByte4;
/*   */   }
/*   */   
/*   */   public pRn(int paramInt) {
/*   */     this.ls = (byte)(paramInt >> 24);
/*   */     this.Ge = (byte)(paramInt >> 16);
/*   */     this.fk = (byte)(paramInt >> 8);
/*   */     this.Ff0 = (byte)paramInt;
/*   */   }
/*   */   
/*   */   public static pRn p7(String paramString) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: invokevirtual length : ()I
/*   */     //   4: ifle -> 222
/*   */     //   7: aload_0
/*   */     //   8: iconst_0
/*   */     //   9: invokevirtual charAt : (I)C
/*   */     //   12: bipush #35
/*   */     //   14: if_icmpne -> 222
/*   */     //   17: aload_0
/*   */     //   18: dup
/*   */     //   19: iconst_1
/*   */     //   20: invokevirtual substring : (I)Ljava/lang/String;
/*   */     //   23: astore_1
/*   */     //   24: invokevirtual length : ()I
/*   */     //   27: dup
/*   */     //   28: istore_2
/*   */     //   29: iconst_4
/*   */     //   30: if_icmpeq -> 166
/*   */     //   33: iload_2
/*   */     //   34: iconst_5
/*   */     //   35: if_icmpeq -> 98
/*   */     //   38: iload_2
/*   */     //   39: bipush #7
/*   */     //   41: if_icmpeq -> 81
/*   */     //   44: iload_2
/*   */     //   45: bipush #9
/*   */     //   47: if_icmpne -> 65
/*   */     //   50: new f/pRn
/*   */     //   53: dup
/*   */     //   54: aload_1
/*   */     //   55: bipush #16
/*   */     //   57: invokestatic parseLong : (Ljava/lang/String;I)J
/*   */     //   60: l2i
/*   */     //   61: invokespecial <init> : (I)V
/*   */     //   64: areturn
/*   */     //   65: new java/lang/NumberFormatException
/*   */     //   68: dup
/*   */     //   69: ldc 'Can't parse ''
/*   */     //   71: aload_0
/*   */     //   72: ldc '' as hex color'
/*   */     //   74: invokestatic AT : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*   */     //   77: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   80: athrow
/*   */     //   81: new f/pRn
/*   */     //   84: dup
/*   */     //   85: aload_1
/*   */     //   86: bipush #16
/*   */     //   88: invokestatic parseInt : (Ljava/lang/String;I)I
/*   */     //   91: ldc -16777216
/*   */     //   93: ior
/*   */     //   94: invokespecial <init> : (I)V
/*   */     //   97: areturn
/*   */     //   98: aload_1
/*   */     //   99: bipush #16
/*   */     //   101: invokestatic parseInt : (Ljava/lang/String;I)I
/*   */     //   104: dup
/*   */     //   105: dup2
/*   */     //   106: bipush #12
/*   */     //   108: ishr
/*   */     //   109: bipush #15
/*   */     //   111: iand
/*   */     //   112: bipush #17
/*   */     //   114: imul
/*   */     //   115: istore_0
/*   */     //   116: bipush #8
/*   */     //   118: ishr
/*   */     //   119: bipush #15
/*   */     //   121: iand
/*   */     //   122: bipush #17
/*   */     //   124: imul
/*   */     //   125: istore_1
/*   */     //   126: iconst_4
/*   */     //   127: ishr
/*   */     //   128: bipush #15
/*   */     //   130: iand
/*   */     //   131: bipush #17
/*   */     //   133: imul
/*   */     //   134: istore_2
/*   */     //   135: bipush #15
/*   */     //   137: iand
/*   */     //   138: bipush #17
/*   */     //   140: imul
/*   */     //   141: istore_3
/*   */     //   142: new f/pRn
/*   */     //   145: dup
/*   */     //   146: iload_0
/*   */     //   147: bipush #24
/*   */     //   149: ishl
/*   */     //   150: iload_1
/*   */     //   151: bipush #16
/*   */     //   153: ishl
/*   */     //   154: ior
/*   */     //   155: iload_2
/*   */     //   156: bipush #8
/*   */     //   158: ishl
/*   */     //   159: ior
/*   */     //   160: iload_3
/*   */     //   161: ior
/*   */     //   162: invokespecial <init> : (I)V
/*   */     //   165: areturn
/*   */     //   166: aload_1
/*   */     //   167: bipush #16
/*   */     //   169: invokestatic parseInt : (Ljava/lang/String;I)I
/*   */     //   172: dup
/*   */     //   173: dup
/*   */     //   174: bipush #8
/*   */     //   176: ishr
/*   */     //   177: bipush #15
/*   */     //   179: iand
/*   */     //   180: bipush #17
/*   */     //   182: imul
/*   */     //   183: istore_0
/*   */     //   184: iconst_4
/*   */     //   185: ishr
/*   */     //   186: bipush #15
/*   */     //   188: iand
/*   */     //   189: bipush #17
/*   */     //   191: imul
/*   */     //   192: istore_1
/*   */     //   193: bipush #15
/*   */     //   195: iand
/*   */     //   196: bipush #17
/*   */     //   198: imul
/*   */     //   199: istore_2
/*   */     //   200: new f/pRn
/*   */     //   203: dup
/*   */     //   204: iload_0
/*   */     //   205: bipush #16
/*   */     //   207: ishl
/*   */     //   208: ldc -16777216
/*   */     //   210: ior
/*   */     //   211: iload_1
/*   */     //   212: bipush #8
/*   */     //   214: ishl
/*   */     //   215: ior
/*   */     //   216: iload_2
/*   */     //   217: ior
/*   */     //   218: invokespecial <init> : (I)V
/*   */     //   221: areturn
/*   */     //   222: aload_0
/*   */     //   223: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
/*   */     //   226: invokevirtual toUpperCase : (Ljava/util/Locale;)Ljava/lang/String;
/*   */     //   229: ldc f/pRn
/*   */     //   231: swap
/*   */     //   232: invokevirtual getField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
/*   */     //   235: dup
/*   */     //   236: astore_0
/*   */     //   237: invokevirtual getModifiers : ()I
/*   */     //   240: invokestatic isStatic : (I)Z
/*   */     //   243: ifeq -> 268
/*   */     //   246: aload_0
/*   */     //   247: invokevirtual getType : ()Ljava/lang/Class;
/*   */     //   250: ldc f/pRn
/*   */     //   252: if_acmpne -> 268
/*   */     //   255: aload_0
/*   */     //   256: aconst_null
/*   */     //   257: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   260: checkcast f/pRn
/*   */     //   263: astore_0
/*   */     //   264: goto -> 270
/*   */     //   267: pop
/*   */     //   268: aconst_null
/*   */     //   269: astore_0
/*   */     //   270: aload_0
/*   */     //   271: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 69
/*   */     //   #2	-> 77
/*   */     //   #3	-> 223
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   229	235	267	finally
/*   */     //   237	243	267	finally
/*   */     //   246	252	267	finally
/*   */     //   255	263	267	finally
/*   */   }
/*   */   
/*   */   public final int LpT2() {
/*   */     return (this.ls & 0xFF) << 24 | (this.Ge & 0xFF) << 16 | (this.fk & 0xFF) << 8 | this.Ff0 & 0xFF;
/*   */   }
/*   */   
/*   */   public final void dN(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4) {
/*   */     this.Ge = paramByte1;
/*   */     this.fk = paramByte2;
/*   */     this.Ff0 = paramByte3;
/*   */     this.ls = paramByte4;
/*   */   }
/*   */   
/*   */   public final int cj() {
/*   */     return this.ls & 0xFF;
/*   */   }
/*   */   
/*   */   public final float pT() {
/*   */     return (this.Ge & 0xFF) * 0.003921569F;
/*   */   }
/*   */   
/*   */   public final float bf() {
/*   */     return (this.fk & 0xFF) * 0.003921569F;
/*   */   }
/*   */   
/*   */   public final float x3() {
/*   */     return (this.Ff0 & 0xFF) * 0.003921569F;
/*   */   }
/*   */   
/*   */   public final float Zg0() {
/*   */     return (this.ls & 0xFF) * 0.003921569F;
/*   */   }
/*   */   
/*   */   public final void gz0(int paramInt, float[] paramArrayOffloat) {
/*   */     int i = paramInt + 0;
/*   */     paramArrayOffloat[i] = pT();
/*   */     i = paramInt + 1;
/*   */     paramArrayOffloat[i] = bf();
/*   */     i = paramInt + 2;
/*   */     paramArrayOffloat[i] = x3();
/*   */     i = paramInt + 3;
/*   */     paramArrayOffloat[i] = Zg0();
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     if (this.ls != -1) {
/*   */       Object[] arrayOfObject1;
/*   */       (arrayOfObject1 = new Object[1])[0] = Integer.valueOf(LpT2());
/*   */       return String.format("#%08X", arrayOfObject1);
/*   */     } 
/*   */     Object[] arrayOfObject;
/*   */     (arrayOfObject = new Object[1])[0] = Integer.valueOf(LpT2() & 0xFFFFFF);
/*   */     return String.format("#%06X", arrayOfObject);
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     if (!(paramObject instanceof pRn))
/*   */       return false; 
/*   */     this = (pRn)paramObject;
/*   */     return (LpT2() == LpT2());
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     return LpT2();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/pRn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */