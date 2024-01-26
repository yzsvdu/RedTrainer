/* 1 */ package f;public final class WL0 { public WL0(int... paramVarArgs) { this
/* 2 */       .LU = PY; if (paramVarArgs.length >= 2) { this.iV = q9; this.A80 = paramVarArgs[0]; this.LU = Arrays.copyOfRange(paramVarArgs, 1, paramVarArgs.length); return; }  throw new IllegalArgumentException(); }
/*   */ 
/*   */   
/*   */   public static final int[] PY = new int[0];
/*   */   public Q9 iV;
/*   */   public gB0 N3;
/*   */   public byte A8;
/*   */   public byte Dv;
/*   */   public byte Er0;
/*   */   public byte Tz0;
/*   */   public int A80;
/*   */   public int[] LU;
/*   */   
/*   */   public WL0(Q9 paramQ9, byte paramByte1, byte paramByte2, byte paramByte3, int paramInt) {
/*   */     this(paramQ9, paramByte1, paramByte2, paramByte3, paramInt, null, (byte)0);
/*   */   }
/*   */   
/*   */   public WL0(Q9 paramQ9, byte paramByte1, byte paramByte2, byte paramByte3, int paramInt, gB0 paramgB0, byte paramByte4) {
/*   */     this(paramQ9, paramByte1, paramByte2, paramByte3, paramInt, paramgB0, paramByte4, (byte)0, (byte)0);
/*   */   }
/*   */   
/*   */   public WL0(Q9 paramQ9, byte paramByte1, byte paramByte2, byte paramByte3, int paramInt, gB0 paramgB0, byte paramByte4, byte paramByte5, byte paramByte6) {
/*   */     this.LU = PY;
/*   */     if (paramgB0 == null || paramByte4 >= 1) {
/*   */       if (paramgB0 != gB0.y8 || (paramByte5 >= 1 && paramByte6 >= 1)) {
/*   */         this.iV = paramQ9;
/*   */         this.A8 = paramByte1;
/*   */         this.Dv = paramByte2;
/*   */         this.Er0 = paramByte3;
/*   */         this.A80 = paramInt;
/*   */         this.N3 = paramgB0;
/*   */         this.Tz0 = paramByte4;
/*   */         return;
/*   */       } 
/*   */       throw new IllegalArgumentException(paramByte5 + " " + paramByte6);
/*   */     } 
/*   */     throw new IllegalArgumentException(String.valueOf(paramByte4));
/*   */   }
/*   */   
/*   */   public final void Tq() {
/*   */     byte b = 25;
/*   */     Q9 q9;
/*   */     if ((q9 = this.iV) == Q9.kE0 || q9 == Q9.uo0) {
/*   */       this.Tz0 = b;
/*   */       return;
/*   */     } 
/*   */     throw new IllegalStateException();
/*   */   }
/*   */   
/*   */   public final byte z30(int paramInt1, int paramInt2, int paramInt3) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield iV : Lf/Q9;
/*   */     //   4: invokevirtual ordinal : ()I
/*   */     //   7: tableswitch default -> 36, 0 -> 247, 1 -> 193, 2 -> 144, 3 -> 38
/*   */     //   36: iconst_m1
/*   */     //   37: ireturn
/*   */     //   38: aload_0
/*   */     //   39: getfield LU : [I
/*   */     //   42: dup
/*   */     //   43: astore_1
/*   */     //   44: arraylength
/*   */     //   45: istore_2
/*   */     //   46: iconst_0
/*   */     //   47: istore #4
/*   */     //   49: iload #4
/*   */     //   51: iload_2
/*   */     //   52: if_icmpge -> 74
/*   */     //   55: aload_1
/*   */     //   56: iload #4
/*   */     //   58: iaload
/*   */     //   59: iload_3
/*   */     //   60: if_icmpne -> 68
/*   */     //   63: iconst_1
/*   */     //   64: istore_1
/*   */     //   65: goto -> 76
/*   */     //   68: iinc #4, 1
/*   */     //   71: goto -> 49
/*   */     //   74: iconst_0
/*   */     //   75: istore_1
/*   */     //   76: iload_1
/*   */     //   77: ifeq -> 128
/*   */     //   80: aload_0
/*   */     //   81: getfield LU : [I
/*   */     //   84: iconst_0
/*   */     //   85: iaload
/*   */     //   86: istore_0
/*   */     //   87: getstatic f/Mm0.gu : Lf/Ut0;
/*   */     //   90: dup
/*   */     //   91: astore_1
/*   */     //   92: iload_3
/*   */     //   93: invokevirtual return : (I)Z
/*   */     //   96: ifeq -> 111
/*   */     //   99: aload_1
/*   */     //   100: iload_3
/*   */     //   101: invokevirtual Z6 : (I)Ljava/lang/Object;
/*   */     //   104: checkcast f/WL0
/*   */     //   107: astore_0
/*   */     //   108: goto -> 120
/*   */     //   111: aload_1
/*   */     //   112: iload_0
/*   */     //   113: invokevirtual Z6 : (I)Ljava/lang/Object;
/*   */     //   116: checkcast f/WL0
/*   */     //   119: astore_0
/*   */     //   120: aload_0
/*   */     //   121: iconst_0
/*   */     //   122: iconst_0
/*   */     //   123: iconst_m1
/*   */     //   124: invokevirtual z30 : (III)B
/*   */     //   127: ireturn
/*   */     //   128: aload_0
/*   */     //   129: getfield LU : [I
/*   */     //   132: iconst_0
/*   */     //   133: iaload
/*   */     //   134: invokestatic gt0 : (I)Lf/WL0;
/*   */     //   137: iconst_0
/*   */     //   138: iconst_0
/*   */     //   139: iconst_m1
/*   */     //   140: invokevirtual z30 : (III)B
/*   */     //   143: ireturn
/*   */     //   144: aload_0
/*   */     //   145: getfield A80 : I
/*   */     //   148: ldc 1913345
/*   */     //   150: if_icmpne -> 188
/*   */     //   153: iload_2
/*   */     //   154: aload_0
/*   */     //   155: getfield Tz0 : B
/*   */     //   158: dup
/*   */     //   159: istore_2
/*   */     //   160: if_icmpge -> 188
/*   */     //   163: iload_1
/*   */     //   164: iload_2
/*   */     //   165: if_icmplt -> 188
/*   */     //   168: iload_1
/*   */     //   169: aload_0
/*   */     //   170: getfield Dv : B
/*   */     //   173: i2d
/*   */     //   174: dstore_0
/*   */     //   175: i2f
/*   */     //   176: iload_2
/*   */     //   177: i2f
/*   */     //   178: fdiv
/*   */     //   179: f2d
/*   */     //   180: invokestatic floor : (D)D
/*   */     //   183: dload_0
/*   */     //   184: dadd
/*   */     //   185: d2i
/*   */     //   186: i2b
/*   */     //   187: ireturn
/*   */     //   188: aload_0
/*   */     //   189: getfield Dv : B
/*   */     //   192: ireturn
/*   */     //   193: aload_0
/*   */     //   194: getfield N3 : Lf/gB0;
/*   */     //   197: dup
/*   */     //   198: astore_2
/*   */     //   199: getstatic f/gB0.fc0 : Lf/gB0;
/*   */     //   202: if_acmpeq -> 212
/*   */     //   205: aload_2
/*   */     //   206: getstatic f/gB0.y8 : Lf/gB0;
/*   */     //   209: if_acmpne -> 242
/*   */     //   212: iload_1
/*   */     //   213: aload_0
/*   */     //   214: getfield Tz0 : B
/*   */     //   217: dup
/*   */     //   218: istore_2
/*   */     //   219: if_icmplt -> 242
/*   */     //   222: iload_1
/*   */     //   223: aload_0
/*   */     //   224: getfield Dv : B
/*   */     //   227: i2d
/*   */     //   228: dstore_0
/*   */     //   229: i2f
/*   */     //   230: iload_2
/*   */     //   231: i2f
/*   */     //   232: fdiv
/*   */     //   233: f2d
/*   */     //   234: invokestatic floor : (D)D
/*   */     //   237: dload_0
/*   */     //   238: dadd
/*   */     //   239: d2i
/*   */     //   240: i2b
/*   */     //   241: ireturn
/*   */     //   242: aload_0
/*   */     //   243: getfield Dv : B
/*   */     //   246: ireturn
/*   */     //   247: aload_0
/*   */     //   248: getfield Dv : B
/*   */     //   251: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 44
/*   */     //   #2	-> 81
/*   */     //   #3	-> 87
/*   */     //   #4	-> 93
/*   */     //   #5	-> 101
/*   */     //   #6	-> 124
/*   */   }
/*   */   
/*   */   public final byte tL(int paramInt1, int paramInt2) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield iV : Lf/Q9;
/*   */     //   4: invokevirtual ordinal : ()I
/*   */     //   7: tableswitch default -> 36, 0 -> 240, 1 -> 186, 2 -> 142, 3 -> 38
/*   */     //   36: iconst_m1
/*   */     //   37: ireturn
/*   */     //   38: aload_0
/*   */     //   39: getfield LU : [I
/*   */     //   42: dup
/*   */     //   43: astore_1
/*   */     //   44: arraylength
/*   */     //   45: istore_3
/*   */     //   46: iconst_0
/*   */     //   47: istore #4
/*   */     //   49: iload #4
/*   */     //   51: iload_3
/*   */     //   52: if_icmpge -> 74
/*   */     //   55: aload_1
/*   */     //   56: iload #4
/*   */     //   58: iaload
/*   */     //   59: iload_2
/*   */     //   60: if_icmpne -> 68
/*   */     //   63: iconst_1
/*   */     //   64: istore_1
/*   */     //   65: goto -> 76
/*   */     //   68: iinc #4, 1
/*   */     //   71: goto -> 49
/*   */     //   74: iconst_0
/*   */     //   75: istore_1
/*   */     //   76: iload_1
/*   */     //   77: ifeq -> 127
/*   */     //   80: aload_0
/*   */     //   81: getfield LU : [I
/*   */     //   84: iconst_0
/*   */     //   85: iaload
/*   */     //   86: istore_0
/*   */     //   87: getstatic f/Mm0.gu : Lf/Ut0;
/*   */     //   90: dup
/*   */     //   91: astore_1
/*   */     //   92: iload_2
/*   */     //   93: invokevirtual return : (I)Z
/*   */     //   96: ifeq -> 111
/*   */     //   99: aload_1
/*   */     //   100: iload_2
/*   */     //   101: invokevirtual Z6 : (I)Ljava/lang/Object;
/*   */     //   104: checkcast f/WL0
/*   */     //   107: astore_0
/*   */     //   108: goto -> 120
/*   */     //   111: aload_1
/*   */     //   112: iload_0
/*   */     //   113: invokevirtual Z6 : (I)Ljava/lang/Object;
/*   */     //   116: checkcast f/WL0
/*   */     //   119: astore_0
/*   */     //   120: aload_0
/*   */     //   121: iconst_0
/*   */     //   122: iconst_m1
/*   */     //   123: invokevirtual tL : (II)B
/*   */     //   126: ireturn
/*   */     //   127: aload_0
/*   */     //   128: getfield LU : [I
/*   */     //   131: iconst_0
/*   */     //   132: iaload
/*   */     //   133: invokestatic gt0 : (I)Lf/WL0;
/*   */     //   136: iconst_0
/*   */     //   137: iconst_m1
/*   */     //   138: invokevirtual tL : (II)B
/*   */     //   141: ireturn
/*   */     //   142: aload_0
/*   */     //   143: getfield A80 : I
/*   */     //   146: ldc 1913345
/*   */     //   148: if_icmpne -> 181
/*   */     //   151: iload_1
/*   */     //   152: aload_0
/*   */     //   153: getfield Tz0 : B
/*   */     //   156: dup
/*   */     //   157: istore_2
/*   */     //   158: if_icmplt -> 181
/*   */     //   161: iload_1
/*   */     //   162: aload_0
/*   */     //   163: getfield Er0 : B
/*   */     //   166: i2d
/*   */     //   167: dstore_0
/*   */     //   168: i2f
/*   */     //   169: iload_2
/*   */     //   170: i2f
/*   */     //   171: fdiv
/*   */     //   172: f2d
/*   */     //   173: invokestatic floor : (D)D
/*   */     //   176: dload_0
/*   */     //   177: dadd
/*   */     //   178: d2i
/*   */     //   179: i2b
/*   */     //   180: ireturn
/*   */     //   181: aload_0
/*   */     //   182: getfield Er0 : B
/*   */     //   185: ireturn
/*   */     //   186: aload_0
/*   */     //   187: getfield N3 : Lf/gB0;
/*   */     //   190: dup
/*   */     //   191: astore_2
/*   */     //   192: getstatic f/gB0.xx : Lf/gB0;
/*   */     //   195: if_acmpeq -> 205
/*   */     //   198: aload_2
/*   */     //   199: getstatic f/gB0.y8 : Lf/gB0;
/*   */     //   202: if_acmpne -> 235
/*   */     //   205: iload_1
/*   */     //   206: aload_0
/*   */     //   207: getfield Tz0 : B
/*   */     //   210: dup
/*   */     //   211: istore_2
/*   */     //   212: if_icmplt -> 235
/*   */     //   215: iload_1
/*   */     //   216: aload_0
/*   */     //   217: getfield Er0 : B
/*   */     //   220: i2d
/*   */     //   221: dstore_0
/*   */     //   222: i2f
/*   */     //   223: iload_2
/*   */     //   224: i2f
/*   */     //   225: fdiv
/*   */     //   226: f2d
/*   */     //   227: invokestatic floor : (D)D
/*   */     //   230: dload_0
/*   */     //   231: dadd
/*   */     //   232: d2i
/*   */     //   233: i2b
/*   */     //   234: ireturn
/*   */     //   235: aload_0
/*   */     //   236: getfield Er0 : B
/*   */     //   239: ireturn
/*   */     //   240: aload_0
/*   */     //   241: getfield Er0 : B
/*   */     //   244: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 44
/*   */     //   #2	-> 81
/*   */     //   #3	-> 87
/*   */     //   #4	-> 93
/*   */     //   #5	-> 101
/*   */     //   #6	-> 123
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/WL0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */