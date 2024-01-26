/* 1 */ package f;public final class cb0 extends dw { public final boolean Dm0() { if (super.Dm0()) { (ud.Bp()).sC0
/* 2 */         .gz0(0, 0, 0); return true; }  return false; }
/*   */ 
/*   */   
/*   */   public cb0() {
/*   */     super(0);
/*   */     n2();
/*   */   }
/*   */   
/*   */   public final void Yo0(JX paramJX) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: aload_1
/*   */     //   2: invokespecial Yo0 : (Lf/JX;)V
/*   */     //   5: getstatic f/h1.SZ : Z
/*   */     //   8: ifne -> 125
/*   */     //   11: invokestatic Bp : ()Lf/ud;
/*   */     //   14: astore_0
/*   */     //   15: getstatic f/h1.zR : Z
/*   */     //   18: ifeq -> 98
/*   */     //   21: getstatic f/km.a3 : Lf/vh0;
/*   */     //   24: dup
/*   */     //   25: astore_1
/*   */     //   26: ifnull -> 91
/*   */     //   29: aload_1
/*   */     //   30: getfield Im0 : Lf/Ut0;
/*   */     //   33: dup
/*   */     //   34: astore_1
/*   */     //   35: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   38: pop
/*   */     //   39: new f/mt
/*   */     //   42: dup
/*   */     //   43: aload_1
/*   */     //   44: invokespecial <init> : (Lf/Ut0;)V
/*   */     //   47: invokevirtual iterator : ()Ljava/util/Iterator;
/*   */     //   50: astore_1
/*   */     //   51: aload_1
/*   */     //   52: checkcast f/DA0
/*   */     //   55: invokevirtual hasNext : ()Z
/*   */     //   58: ifeq -> 82
/*   */     //   61: aload_1
/*   */     //   62: checkcast f/iF0
/*   */     //   65: invokevirtual AUX : ()Ljava/lang/Object;
/*   */     //   68: checkcast f/KI
/*   */     //   71: invokevirtual A8 : ()Z
/*   */     //   74: ifeq -> 51
/*   */     //   77: iconst_1
/*   */     //   78: istore_1
/*   */     //   79: goto -> 84
/*   */     //   82: iconst_0
/*   */     //   83: istore_1
/*   */     //   84: iload_1
/*   */     //   85: ifeq -> 91
/*   */     //   88: goto -> 98
/*   */     //   91: sipush #180
/*   */     //   94: istore_1
/*   */     //   95: goto -> 102
/*   */     //   98: sipush #255
/*   */     //   101: istore_1
/*   */     //   102: aload_0
/*   */     //   103: getfield gF : Lf/Mj;
/*   */     //   106: dup
/*   */     //   107: astore_0
/*   */     //   108: getfield wB0 : I
/*   */     //   111: iload_1
/*   */     //   112: if_icmpge -> 124
/*   */     //   115: aload_0
/*   */     //   116: iconst_m1
/*   */     //   117: iload_1
/*   */     //   118: sipush #500
/*   */     //   121: invokevirtual gz0 : (III)V
/*   */     //   124: return
/*   */     //   125: aload_0
/*   */     //   126: getfield BK : J
/*   */     //   129: dup2
/*   */     //   130: lstore_0
/*   */     //   131: ldc2_w 200
/*   */     //   134: lcmp
/*   */     //   135: ifge -> 144
/*   */     //   138: lload_0
/*   */     //   139: l2i
/*   */     //   140: istore_0
/*   */     //   141: goto -> 338
/*   */     //   144: lload_0
/*   */     //   145: ldc2_w 300
/*   */     //   148: lcmp
/*   */     //   149: ifge -> 168
/*   */     //   152: lload_0
/*   */     //   153: ldc2_w 200
/*   */     //   156: lsub
/*   */     //   157: lstore_0
/*   */     //   158: ldc2_w 200
/*   */     //   161: lload_0
/*   */     //   162: lsub
/*   */     //   163: l2i
/*   */     //   164: istore_0
/*   */     //   165: goto -> 338
/*   */     //   168: lload_0
/*   */     //   169: ldc2_w 400
/*   */     //   172: lcmp
/*   */     //   173: ifge -> 186
/*   */     //   176: lload_0
/*   */     //   177: ldc2_w 200
/*   */     //   180: lsub
/*   */     //   181: l2i
/*   */     //   182: istore_0
/*   */     //   183: goto -> 338
/*   */     //   186: lload_0
/*   */     //   187: ldc2_w 600
/*   */     //   190: lcmp
/*   */     //   191: ifge -> 210
/*   */     //   194: lload_0
/*   */     //   195: ldc2_w 400
/*   */     //   198: lsub
/*   */     //   199: lstore_0
/*   */     //   200: ldc2_w 200
/*   */     //   203: lload_0
/*   */     //   204: lsub
/*   */     //   205: l2i
/*   */     //   206: istore_0
/*   */     //   207: goto -> 338
/*   */     //   210: lload_0
/*   */     //   211: ldc2_w 800
/*   */     //   214: lcmp
/*   */     //   215: ifge -> 223
/*   */     //   218: iconst_0
/*   */     //   219: istore_0
/*   */     //   220: goto -> 338
/*   */     //   223: iconst_0
/*   */     //   224: istore_0
/*   */     //   225: invokestatic Bp : ()Lf/ud;
/*   */     //   228: astore_1
/*   */     //   229: getstatic f/h1.zR : Z
/*   */     //   232: ifeq -> 312
/*   */     //   235: getstatic f/km.a3 : Lf/vh0;
/*   */     //   238: dup
/*   */     //   239: astore_2
/*   */     //   240: ifnull -> 305
/*   */     //   243: aload_2
/*   */     //   244: getfield Im0 : Lf/Ut0;
/*   */     //   247: dup
/*   */     //   248: astore_2
/*   */     //   249: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   252: pop
/*   */     //   253: new f/mt
/*   */     //   256: dup
/*   */     //   257: aload_2
/*   */     //   258: invokespecial <init> : (Lf/Ut0;)V
/*   */     //   261: invokevirtual iterator : ()Ljava/util/Iterator;
/*   */     //   264: astore_2
/*   */     //   265: aload_2
/*   */     //   266: checkcast f/DA0
/*   */     //   269: invokevirtual hasNext : ()Z
/*   */     //   272: ifeq -> 296
/*   */     //   275: aload_2
/*   */     //   276: checkcast f/iF0
/*   */     //   279: invokevirtual AUX : ()Ljava/lang/Object;
/*   */     //   282: checkcast f/KI
/*   */     //   285: invokevirtual A8 : ()Z
/*   */     //   288: ifeq -> 265
/*   */     //   291: iconst_1
/*   */     //   292: istore_2
/*   */     //   293: goto -> 298
/*   */     //   296: iconst_0
/*   */     //   297: istore_2
/*   */     //   298: iload_2
/*   */     //   299: ifeq -> 305
/*   */     //   302: goto -> 312
/*   */     //   305: sipush #180
/*   */     //   308: istore_2
/*   */     //   309: goto -> 316
/*   */     //   312: sipush #255
/*   */     //   315: istore_2
/*   */     //   316: aload_1
/*   */     //   317: getfield gF : Lf/Mj;
/*   */     //   320: dup
/*   */     //   321: astore_1
/*   */     //   322: getfield wB0 : I
/*   */     //   325: iload_2
/*   */     //   326: if_icmpge -> 338
/*   */     //   329: aload_1
/*   */     //   330: iconst_m1
/*   */     //   331: iload_2
/*   */     //   332: sipush #500
/*   */     //   335: invokevirtual gz0 : (III)V
/*   */     //   338: invokestatic Bp : ()Lf/ud;
/*   */     //   341: getfield sC0 : Lf/Mj;
/*   */     //   344: iload_0
/*   */     //   345: dup
/*   */     //   346: iconst_0
/*   */     //   347: invokevirtual gz0 : (III)V
/*   */     //   350: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 30
/*   */     //   #2	-> 39
/*   */     //   #3	-> 47
/*   */     //   #4	-> 103
/*   */     //   #5	-> 108
/*   */     //   #6	-> 121
/*   */     //   #7	-> 126
/*   */     //   #8	-> 225
/*   */     //   #9	-> 244
/*   */     //   #10	-> 253
/*   */     //   #11	-> 261
/*   */     //   #12	-> 317
/*   */     //   #13	-> 322
/*   */     //   #14	-> 335
/*   */     //   #15	-> 338
/*   */     //   #16	-> 341
/*   */     //   #17	-> 347
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/cb0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */