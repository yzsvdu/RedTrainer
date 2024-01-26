/* 1 */ package f;public final class Prn { public BM dL0; public final String QH(ah0 paramah0) { int i; if (paramah0 == null || (i = this.f5) == 0)
/*   */     {
/*   */ 
/*   */ 
/*   */ 
/*   */ 
/*   */       
/* 8 */       return "ERROR"; }  if ((i = Zk0.yE(i)) != 0) { if (i != 1) return "-";  if (this.iD0) return N.Gl0(B40.df("Axis #"), this.Com8, "+");  return N.Gl0(B40.df("Axis #"), this.Com8, "-"); }  return B40.df("Button ").append(this.wd0).toString(); }
/*   */ 
/*   */   
/*   */   public int f5 = 0;
/*   */   public int wd0;
/*   */   public int Com8;
/*   */   public boolean iD0;
/*   */   
/*   */   public Prn(BM paramBM) {
/*   */     this.dL0 = paramBM;
/*   */   }
/*   */   
/*   */   public final Prn nx(int paramInt, boolean paramBoolean) {
/*   */     this.f5 = 2;
/*   */     this.Com8 = paramInt;
/*   */     this.iD0 = paramBoolean;
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final Prn yH0(int paramInt) {
/*   */     if (paramInt < 0) {
/*   */       this.f5 = 0;
/*   */       this.wd0 = 0;
/*   */       return this;
/*   */     } 
/*   */     this.f5 = 1;
/*   */     this.wd0 = paramInt;
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final boolean m6(ah0 paramah0) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield f5 : I
/*   */     //   4: dup
/*   */     //   5: istore_2
/*   */     //   6: ifne -> 11
/*   */     //   9: iconst_0
/*   */     //   10: ireturn
/*   */     //   11: iload_2
/*   */     //   12: invokestatic yE : (I)I
/*   */     //   15: dup
/*   */     //   16: istore_2
/*   */     //   17: ifeq -> 166
/*   */     //   20: iload_2
/*   */     //   21: iconst_1
/*   */     //   22: if_icmpeq -> 27
/*   */     //   25: iconst_0
/*   */     //   26: ireturn
/*   */     //   27: aload_0
/*   */     //   28: getfield iD0 : Z
/*   */     //   31: ifeq -> 100
/*   */     //   34: aload_1
/*   */     //   35: aload_0
/*   */     //   36: getfield Com8 : I
/*   */     //   39: istore_0
/*   */     //   40: checkcast f/BI
/*   */     //   43: astore_1
/*   */     //   44: getstatic f/BI.D2 : Lf/y10;
/*   */     //   47: iload_0
/*   */     //   48: invokevirtual get : (I)Ljava/lang/Object;
/*   */     //   51: checkcast f/kB
/*   */     //   54: dup
/*   */     //   55: astore_0
/*   */     //   56: ifnonnull -> 64
/*   */     //   59: fconst_0
/*   */     //   60: fstore_0
/*   */     //   61: goto -> 87
/*   */     //   64: aload_1
/*   */     //   65: getfield Fp0 : Lcom/studiohartman/jamepad/ControllerIndex;
/*   */     //   68: aload_0
/*   */     //   69: invokevirtual QK0 : (Lf/kB;)F
/*   */     //   72: fstore_0
/*   */     //   73: goto -> 87
/*   */     //   76: pop
/*   */     //   77: goto -> 81
/*   */     //   80: pop
/*   */     //   81: aload_1
/*   */     //   82: invokevirtual hp0 : ()V
/*   */     //   85: fconst_0
/*   */     //   86: fstore_0
/*   */     //   87: fload_0
/*   */     //   88: ldc 0.5
/*   */     //   90: fcmpl
/*   */     //   91: ifle -> 98
/*   */     //   94: iconst_1
/*   */     //   95: goto -> 99
/*   */     //   98: iconst_0
/*   */     //   99: ireturn
/*   */     //   100: aload_1
/*   */     //   101: aload_0
/*   */     //   102: getfield Com8 : I
/*   */     //   105: istore_0
/*   */     //   106: checkcast f/BI
/*   */     //   109: astore_1
/*   */     //   110: getstatic f/BI.D2 : Lf/y10;
/*   */     //   113: iload_0
/*   */     //   114: invokevirtual get : (I)Ljava/lang/Object;
/*   */     //   117: checkcast f/kB
/*   */     //   120: dup
/*   */     //   121: astore_0
/*   */     //   122: ifnonnull -> 130
/*   */     //   125: fconst_0
/*   */     //   126: fstore_0
/*   */     //   127: goto -> 153
/*   */     //   130: aload_1
/*   */     //   131: getfield Fp0 : Lcom/studiohartman/jamepad/ControllerIndex;
/*   */     //   134: aload_0
/*   */     //   135: invokevirtual QK0 : (Lf/kB;)F
/*   */     //   138: fstore_0
/*   */     //   139: goto -> 153
/*   */     //   142: pop
/*   */     //   143: goto -> 147
/*   */     //   146: pop
/*   */     //   147: aload_1
/*   */     //   148: invokevirtual hp0 : ()V
/*   */     //   151: fconst_0
/*   */     //   152: fstore_0
/*   */     //   153: fload_0
/*   */     //   154: ldc -0.5
/*   */     //   156: fcmpg
/*   */     //   157: ifge -> 164
/*   */     //   160: iconst_1
/*   */     //   161: goto -> 165
/*   */     //   164: iconst_0
/*   */     //   165: ireturn
/*   */     //   166: aload_1
/*   */     //   167: aload_0
/*   */     //   168: getfield wd0 : I
/*   */     //   171: istore_0
/*   */     //   172: checkcast f/BI
/*   */     //   175: astore_1
/*   */     //   176: getstatic f/BI.r0 : Lf/y10;
/*   */     //   179: iload_0
/*   */     //   180: invokevirtual get : (I)Ljava/lang/Object;
/*   */     //   183: checkcast f/s3
/*   */     //   186: dup
/*   */     //   187: astore_0
/*   */     //   188: ifnull -> 207
/*   */     //   191: aload_1
/*   */     //   192: getfield Fp0 : Lcom/studiohartman/jamepad/ControllerIndex;
/*   */     //   195: aload_0
/*   */     //   196: invokevirtual t50 : (Lf/s3;)Z
/*   */     //   199: ifeq -> 207
/*   */     //   202: iconst_1
/*   */     //   203: istore_0
/*   */     //   204: goto -> 223
/*   */     //   207: iconst_0
/*   */     //   208: istore_0
/*   */     //   209: goto -> 223
/*   */     //   212: pop
/*   */     //   213: goto -> 217
/*   */     //   216: pop
/*   */     //   217: aload_1
/*   */     //   218: invokevirtual hp0 : ()V
/*   */     //   221: iconst_0
/*   */     //   222: istore_0
/*   */     //   223: iload_0
/*   */     //   224: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 44
/*   */     //   #2	-> 65
/*   */     //   #3	-> 102
/*   */     //   #4	-> 110
/*   */     //   #5	-> 131
/*   */     //   #6	-> 168
/*   */     //   #7	-> 176
/*   */     //   #8	-> 192
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   44	54	80	f/l9
/*   */     //   44	54	76	java/lang/NullPointerException
/*   */     //   64	72	80	f/l9
/*   */     //   64	72	76	java/lang/NullPointerException
/*   */     //   110	120	146	f/l9
/*   */     //   110	120	142	java/lang/NullPointerException
/*   */     //   130	138	146	f/l9
/*   */     //   130	138	142	java/lang/NullPointerException
/*   */     //   176	186	216	f/l9
/*   */     //   176	186	212	java/lang/NullPointerException
/*   */     //   191	199	216	f/l9
/*   */     //   191	199	212	java/lang/NullPointerException
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Prn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */