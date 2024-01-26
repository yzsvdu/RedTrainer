/* 1 */ package f;public final class Ge0 extends Fy0 { public static kt my0(String paramString, int paramInt, kt paramkt) { paramString = LF.Ll0(paramString.substring(0, paramInt), true);
/* 2 */     this(); ArrayList<String> arrayList; for (Iterator iterator = yk0.cw().jQ().iterator(); ((DA0)iterator).hasNext();)
/*   */     
/*   */     { 
/* 5 */       if (!Ml0.OH0((wD = (WD)((Ke)iterator).q00()).iz).contains("☆") && 
/*   */         
/* 7 */         LF.qS(Ml0.OH0(wD.iz), paramString)) arrayList
/*   */           
/* 9 */           .add(Ml0.OH0(wD.iz));  }  return arrayList.isEmpty() ? null : new TW(true, arrayList); }
/*   */ 
/*   */   
/*   */   public Ge0(M60 paramM60, String paramString, int paramInt, Fy0[] paramArrayOfFy0) {
/*   */     super(paramString, 0, 0);
/*   */   }
/*   */   
/*   */   public static void Nz(PF0 paramPF0, short paramShort, int paramInt1, int paramInt2) {
/*   */     // Byte code:
/*   */     //   0: iload_3
/*   */     //   1: bipush #66
/*   */     //   3: if_icmpne -> 264
/*   */     //   6: aload_0
/*   */     //   7: getfield LpT5 : Lf/of;
/*   */     //   10: getfield F2 : Lf/ak0;
/*   */     //   13: getfield PH0 : Ljava/lang/StringBuilder;
/*   */     //   16: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   19: iconst_1
/*   */     //   20: invokestatic Ll0 : (Ljava/lang/String;Z)Ljava/lang/String;
/*   */     //   23: dup
/*   */     //   24: astore_0
/*   */     //   25: invokevirtual isEmpty : ()Z
/*   */     //   28: ifeq -> 32
/*   */     //   31: return
/*   */     //   32: invokestatic cw : ()Lf/yk0;
/*   */     //   35: dup
/*   */     //   36: aload_0
/*   */     //   37: swap
/*   */     //   38: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   41: pop
/*   */     //   42: invokevirtual toLowerCase : ()Ljava/lang/String;
/*   */     //   45: astore_3
/*   */     //   46: getfield iu : Lf/qw0;
/*   */     //   49: dup
/*   */     //   50: astore #4
/*   */     //   52: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   55: pop
/*   */     //   56: new f/iL
/*   */     //   59: dup
/*   */     //   60: aload #4
/*   */     //   62: invokespecial <init> : (Lf/qw0;)V
/*   */     //   65: invokevirtual iterator : ()Ljava/util/Iterator;
/*   */     //   68: astore #4
/*   */     //   70: aload #4
/*   */     //   72: checkcast f/DA0
/*   */     //   75: invokevirtual hasNext : ()Z
/*   */     //   78: ifeq -> 114
/*   */     //   81: aload #4
/*   */     //   83: checkcast f/Ke
/*   */     //   86: invokevirtual q00 : ()Ljava/lang/Object;
/*   */     //   89: checkcast f/WD
/*   */     //   92: dup
/*   */     //   93: astore #5
/*   */     //   95: getfield iz : I
/*   */     //   98: invokestatic OH0 : (I)Ljava/lang/String;
/*   */     //   101: invokevirtual toLowerCase : ()Ljava/lang/String;
/*   */     //   104: aload_3
/*   */     //   105: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   108: ifeq -> 70
/*   */     //   111: goto -> 117
/*   */     //   114: aconst_null
/*   */     //   115: astore #5
/*   */     //   117: aload #5
/*   */     //   119: ifnull -> 170
/*   */     //   122: getstatic f/km.u4 : Lf/R8;
/*   */     //   125: new java/lang/StringBuilder
/*   */     //   128: dup
/*   */     //   129: invokespecial <init> : ()V
/*   */     //   132: ldc '//setskill '
/*   */     //   134: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   137: iload_1
/*   */     //   138: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*   */     //   141: ldc ' '
/*   */     //   143: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   146: iload_2
/*   */     //   147: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*   */     //   150: ldc ' '
/*   */     //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   155: aload #5
/*   */     //   157: getfield HA : S
/*   */     //   160: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*   */     //   163: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   166: invokevirtual lF : (Ljava/lang/String;)V
/*   */     //   169: return
/*   */     //   170: invokestatic cw : ()Lf/yk0;
/*   */     //   173: invokevirtual jQ : ()Lf/iL;
/*   */     //   176: invokevirtual iterator : ()Ljava/util/Iterator;
/*   */     //   179: astore_3
/*   */     //   180: aload_3
/*   */     //   181: checkcast f/DA0
/*   */     //   184: invokevirtual hasNext : ()Z
/*   */     //   187: ifeq -> 264
/*   */     //   190: aload_3
/*   */     //   191: checkcast f/Ke
/*   */     //   194: invokevirtual q00 : ()Ljava/lang/Object;
/*   */     //   197: checkcast f/WD
/*   */     //   200: dup
/*   */     //   201: astore #4
/*   */     //   203: getfield iz : I
/*   */     //   206: invokestatic OH0 : (I)Ljava/lang/String;
/*   */     //   209: aload_0
/*   */     //   210: invokestatic qS : (Ljava/lang/String;Ljava/lang/String;)Z
/*   */     //   213: ifeq -> 180
/*   */     //   216: getstatic f/km.u4 : Lf/R8;
/*   */     //   219: new java/lang/StringBuilder
/*   */     //   222: dup
/*   */     //   223: invokespecial <init> : ()V
/*   */     //   226: ldc '//setskill '
/*   */     //   228: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   231: iload_1
/*   */     //   232: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*   */     //   235: ldc ' '
/*   */     //   237: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   240: iload_2
/*   */     //   241: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*   */     //   244: ldc ' '
/*   */     //   246: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   249: aload #4
/*   */     //   251: getfield HA : S
/*   */     //   254: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*   */     //   257: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   260: invokevirtual lF : (Ljava/lang/String;)V
/*   */     //   263: return
/*   */     //   264: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 7
/*   */     //   #2	-> 10
/*   */     //   #3	-> 13
/*   */     //   #4	-> 16
/*   */     //   #5	-> 20
/*   */     //   #6	-> 25
/*   */     //   #7	-> 42
/*   */     //   #8	-> 56
/*   */     //   #9	-> 65
/*   */     //   #10	-> 95
/*   */     //   #11	-> 98
/*   */     //   #12	-> 101
/*   */     //   #13	-> 122
/*   */     //   #14	-> 157
/*   */     //   #15	-> 160
/*   */     //   #16	-> 203
/*   */     //   #17	-> 206
/*   */     //   #18	-> 210
/*   */     //   #19	-> 251
/*   */     //   #20	-> 254
/*   */   }
/*   */   
/*   */   public final boolean i2(oa0 paramoa0) {
/*   */     // Byte code:
/*   */     //   0: bipush #8
/*   */     //   2: invokestatic zg0 : (I)Z
/*   */     //   5: ifeq -> 163
/*   */     //   8: aload_1
/*   */     //   9: getfield cz0 : I
/*   */     //   12: dup
/*   */     //   13: istore_2
/*   */     //   14: invokestatic Pg : (I)Z
/*   */     //   17: ifeq -> 163
/*   */     //   20: iload_2
/*   */     //   21: iconst_3
/*   */     //   22: if_icmpne -> 163
/*   */     //   25: aload_1
/*   */     //   26: getfield vl : I
/*   */     //   29: iconst_1
/*   */     //   30: if_icmpeq -> 36
/*   */     //   33: goto -> 163
/*   */     //   36: getstatic f/km.u4 : Lf/R8;
/*   */     //   39: getstatic f/aq0.LI : Lf/aq0;
/*   */     //   42: invokevirtual s40 : (Lf/aq0;)Lf/Uc0;
/*   */     //   45: aload_0
/*   */     //   46: getfield R7 : Lf/M60;
/*   */     //   49: getfield E30 : I
/*   */     //   52: invokevirtual de0 : (I)Lf/j40;
/*   */     //   55: dup
/*   */     //   56: astore_2
/*   */     //   57: ifnonnull -> 66
/*   */     //   60: aload_0
/*   */     //   61: aload_1
/*   */     //   62: invokespecial i2 : (Lf/oa0;)Z
/*   */     //   65: ireturn
/*   */     //   66: aload_2
/*   */     //   67: getfield Zs : Lf/Q90;
/*   */     //   70: getfield Tl0 : S
/*   */     //   73: istore_1
/*   */     //   74: new f/B3
/*   */     //   77: dup
/*   */     //   78: astore_2
/*   */     //   79: aload_0
/*   */     //   80: aload_2
/*   */     //   81: invokespecial <init> : ()V
/*   */     //   84: new f/Wg0
/*   */     //   87: dup
/*   */     //   88: dup
/*   */     //   89: dup2
/*   */     //   90: astore_3
/*   */     //   91: aload_0
/*   */     //   92: iload_1
/*   */     //   93: invokespecial <init> : (Lf/Ge0;S)V
/*   */     //   96: ldc 'editfield'
/*   */     //   98: invokevirtual Xu : (Ljava/lang/String;)V
/*   */     //   101: iconst_1
/*   */     //   102: putfield n00 : Z
/*   */     //   105: <illegal opcode> Nj0 : ()Lf/CF0;
/*   */     //   110: invokevirtual Aw0 : (Lf/CF0;)V
/*   */     //   113: new f/PF0
/*   */     //   116: dup
/*   */     //   117: dup
/*   */     //   118: astore #4
/*   */     //   120: iload_1
/*   */     //   121: aload_0
/*   */     //   122: aload_2
/*   */     //   123: aload #4
/*   */     //   125: aload_3
/*   */     //   126: invokespecial <init> : (Lf/Wg0;)V
/*   */     //   129: getfield aV : Ljava/util/ArrayList;
/*   */     //   132: aload #4
/*   */     //   134: invokevirtual add : (Ljava/lang/Object;)Z
/*   */     //   137: pop
/*   */     //   138: getfield ht0 : I
/*   */     //   141: <illegal opcode> SX : (Lf/PF0;SI)Lf/a70;
/*   */     //   146: putfield Wy : Lf/a70;
/*   */     //   149: getfield lD0 : [Lf/Fy0;
/*   */     //   152: aload_0
/*   */     //   153: getfield ht0 : I
/*   */     //   156: aaload
/*   */     //   157: invokestatic Yo : (Lf/B3;Lf/JG0;)Lf/F7;
/*   */     //   160: pop
/*   */     //   161: iconst_1
/*   */     //   162: ireturn
/*   */     //   163: aload_0
/*   */     //   164: aload_1
/*   */     //   165: invokespecial i2 : (Lf/oa0;)Z
/*   */     //   168: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 9
/*   */     //   #2	-> 14
/*   */     //   #3	-> 26
/*   */     //   #4	-> 36
/*   */     //   #5	-> 67
/*   */     //   #6	-> 70
/*   */     //   #7	-> 74
/*   */     //   #8	-> 102
/*   */     //   #9	-> 105
/*   */     //   #10	-> 129
/*   */     //   #11	-> 138
/*   */     //   #12	-> 146
/*   */     //   #13	-> 149
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ge0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */