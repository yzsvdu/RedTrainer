package f;

public final class nn0 extends YA0 implements r60 {
  public int Ts;
  
  public int WU;
  
  public Un[] cw0;
  
  public YA0 mm0;
  
  public mc[] Wr;
  
  public p30 IT;
  
  public final Y aH0;
  
  public nn0(wg0 paramwg0, Y paramY) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: dup
    //   3: aload_2
    //   4: aload_0
    //   5: dup
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: iconst_0
    //   11: putfield WU : I
    //   14: iconst_0
    //   15: anewarray f/Un
    //   18: putfield cw0 : [Lf/Un;
    //   21: putfield aH0 : Lf/Y;
    //   24: ldc 'tm-target-inner-panel'
    //   26: invokevirtual Xu : (Ljava/lang/String;)V
    //   29: new f/YA0
    //   32: dup
    //   33: aload_0
    //   34: swap
    //   35: dup
    //   36: invokespecial <init> : ()V
    //   39: putfield mm0 : Lf/YA0;
    //   42: ldc 'dialoglayout'
    //   44: invokevirtual Xu : (Ljava/lang/String;)V
    //   47: bipush #6
    //   49: anewarray f/mc
    //   52: putfield Wr : [Lf/mc;
    //   55: iconst_0
    //   56: istore_3
    //   57: iload_3
    //   58: aload_0
    //   59: getfield Wr : [Lf/mc;
    //   62: dup
    //   63: astore #4
    //   65: arraylength
    //   66: if_icmpge -> 389
    //   69: aload_0
    //   70: dup
    //   71: aload #4
    //   73: iload_3
    //   74: new f/mc
    //   77: dup
    //   78: astore #4
    //   80: ldc '-'
    //   82: ldc ''
    //   84: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   87: aload #4
    //   89: aastore
    //   90: getfield Wr : [Lf/mc;
    //   93: iload_3
    //   94: aaload
    //   95: ldc '/item-use-dialog-button'
    //   97: invokevirtual Xu : (Ljava/lang/String;)V
    //   100: getfield Wr : [Lf/mc;
    //   103: iload_3
    //   104: aaload
    //   105: getstatic f/et.COM2 : Lf/et;
    //   108: invokevirtual C70 : (Lf/et;)V
    //   111: getstatic f/km.u4 : Lf/R8;
    //   114: invokevirtual dl0 : ()Lf/Uc0;
    //   117: iload_3
    //   118: invokevirtual ky : (S)Lf/j40;
    //   121: dup
    //   122: astore #4
    //   124: ifnonnull -> 140
    //   127: aload_0
    //   128: getfield Wr : [Lf/mc;
    //   131: iload_3
    //   132: aaload
    //   133: iconst_0
    //   134: invokevirtual sk0 : (Z)V
    //   137: goto -> 363
    //   140: aload_0
    //   141: getfield Wr : [Lf/mc;
    //   144: iload_3
    //   145: aaload
    //   146: invokevirtual CW : ()Lf/rH;
    //   149: dup
    //   150: dup2
    //   151: astore #5
    //   153: invokestatic TK0 : ()Lf/um0;
    //   156: aload #4
    //   158: dup
    //   159: dup
    //   160: invokevirtual eC : ()Lf/Q90;
    //   163: invokevirtual Vf0 : ()S
    //   166: istore #6
    //   168: invokevirtual s5 : ()B
    //   171: istore #7
    //   173: invokevirtual ol0 : ()Z
    //   176: iload #6
    //   178: swap
    //   179: iload #7
    //   181: invokevirtual lb : (SZB)[Lf/zh0;
    //   184: invokevirtual sm : ([Lf/zh0;)V
    //   187: bipush #36
    //   189: bipush #36
    //   191: invokevirtual tL : (II)V
    //   194: iconst_4
    //   195: iconst_2
    //   196: invokevirtual zT : (II)Lf/JG0;
    //   199: pop
    //   200: invokestatic XU : ()Z
    //   203: ifeq -> 221
    //   206: aload #5
    //   208: dup
    //   209: bipush #-5
    //   211: bipush #-12
    //   213: invokevirtual zT : (II)Lf/JG0;
    //   216: pop
    //   217: fconst_2
    //   218: invokevirtual Ii0 : (F)V
    //   221: aload #4
    //   223: aload_0
    //   224: getfield Wr : [Lf/mc;
    //   227: iload_3
    //   228: aaload
    //   229: aload #4
    //   231: invokevirtual m : ()Ljava/lang/String;
    //   234: invokevirtual s6 : (Ljava/lang/String;)V
    //   237: invokevirtual Q00 : ()Z
    //   240: ifne -> 339
    //   243: aload_2
    //   244: invokevirtual Ng : ()Lf/LPT3;
    //   247: invokevirtual a90 : ()S
    //   250: ifle -> 339
    //   253: aload #4
    //   255: invokevirtual h60 : ()Lf/UD0;
    //   258: getstatic f/KM.e6 : Lf/KM;
    //   261: aload_2
    //   262: invokevirtual Ng : ()Lf/LPT3;
    //   265: invokevirtual a90 : ()S
    //   268: invokevirtual HH0 : (Lf/KM;S)Z
    //   271: ifeq -> 339
    //   274: aload #4
    //   276: invokevirtual eC : ()Lf/Q90;
    //   279: aload_2
    //   280: invokevirtual Ng : ()Lf/LPT3;
    //   283: invokevirtual a90 : ()S
    //   286: invokevirtual Xj : (S)Z
    //   289: dup
    //   290: istore #5
    //   292: aload_0
    //   293: getfield Wr : [Lf/mc;
    //   296: iload_3
    //   297: aaload
    //   298: astore #6
    //   300: ifeq -> 309
    //   303: sipush #1868
    //   306: goto -> 311
    //   309: bipush #78
    //   311: invokestatic OH0 : (I)Ljava/lang/String;
    //   314: astore #7
    //   316: aload_0
    //   317: aload #6
    //   319: aload #7
    //   321: invokevirtual Ep0 : (Ljava/lang/String;)V
    //   324: getfield Wr : [Lf/mc;
    //   327: iload_3
    //   328: aaload
    //   329: iload #5
    //   331: iconst_1
    //   332: ixor
    //   333: invokevirtual sk0 : (Z)V
    //   336: goto -> 363
    //   339: aload_0
    //   340: dup
    //   341: getfield Wr : [Lf/mc;
    //   344: iload_3
    //   345: aaload
    //   346: bipush #79
    //   348: invokestatic OH0 : (I)Ljava/lang/String;
    //   351: invokevirtual Ep0 : (Ljava/lang/String;)V
    //   354: getfield Wr : [Lf/mc;
    //   357: iload_3
    //   358: aaload
    //   359: iconst_0
    //   360: invokevirtual sk0 : (Z)V
    //   363: iload_3
    //   364: aload_0
    //   365: getfield Wr : [Lf/mc;
    //   368: iload_3
    //   369: aaload
    //   370: aload_1
    //   371: aload_2
    //   372: aload #4
    //   374: <illegal opcode> run : (Lf/wg0;Lf/Y;Lf/j40;)Ljava/lang/Runnable;
    //   379: invokevirtual tW : (Ljava/lang/Runnable;)V
    //   382: iconst_1
    //   383: iadd
    //   384: i2s
    //   385: istore_3
    //   386: goto -> 57
    //   389: invokestatic XU : ()Z
    //   392: ifeq -> 414
    //   395: aload_0
    //   396: new f/p30
    //   399: dup
    //   400: bipush #53
    //   402: invokestatic OH0 : (I)Ljava/lang/String;
    //   405: invokespecial <init> : (Ljava/lang/String;)V
    //   408: putfield IT : Lf/p30;
    //   411: goto -> 444
    //   414: aload_0
    //   415: dup
    //   416: new f/p30
    //   419: dup
    //   420: bipush #53
    //   422: invokestatic OH0 : (I)Ljava/lang/String;
    //   425: bipush #96
    //   427: bipush #30
    //   429: invokespecial <init> : (Ljava/lang/String;II)V
    //   432: putfield IT : Lf/p30;
    //   435: getfield Dv0 : Lf/SA;
    //   438: ldc 65.0
    //   440: invokevirtual F : (F)Lf/ZP;
    //   443: pop
    //   444: aload_0
    //   445: dup
    //   446: dup
    //   447: dup2
    //   448: dup2
    //   449: dup2
    //   450: dup2
    //   451: getfield IT : Lf/p30;
    //   454: ldc 'battle-button-return'
    //   456: invokevirtual Xu : (Ljava/lang/String;)V
    //   459: getfield IT : Lf/p30;
    //   462: aload_1
    //   463: dup
    //   464: invokevirtual getClass : ()Ljava/lang/Class;
    //   467: pop
    //   468: <illegal opcode> run : (Lf/wg0;)Ljava/lang/Runnable;
    //   473: invokevirtual tW : (Ljava/lang/Runnable;)V
    //   476: getfield Dv0 : Lf/SA;
    //   479: ldc 15.0
    //   481: invokevirtual Dl0 : (F)V
    //   484: getfield Dv0 : Lf/SA;
    //   487: invokevirtual cM : ()Lf/nJ0;
    //   490: ldc_w 3.0
    //   493: invokevirtual Xj0 : (F)Lf/nJ0;
    //   496: pop
    //   497: getfield mm0 : Lf/YA0;
    //   500: getfield Dv0 : Lf/SA;
    //   503: dup
    //   504: astore_1
    //   505: aload_0
    //   506: aload_1
    //   507: aload_0
    //   508: aload_1
    //   509: aload_0
    //   510: aload_1
    //   511: dup
    //   512: ldc 15.0
    //   514: invokevirtual Dl0 : (F)V
    //   517: invokevirtual cM : ()Lf/nJ0;
    //   520: ldc_w 3.0
    //   523: invokevirtual Xj0 : (F)Lf/nJ0;
    //   526: pop
    //   527: getfield Wr : [Lf/mc;
    //   530: iconst_0
    //   531: aaload
    //   532: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
    //   535: aload_0
    //   536: getfield Wr : [Lf/mc;
    //   539: iconst_1
    //   540: aaload
    //   541: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
    //   544: invokevirtual zm0 : ()Lf/nJ0;
    //   547: pop
    //   548: getfield Wr : [Lf/mc;
    //   551: iconst_2
    //   552: aaload
    //   553: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
    //   556: aload_0
    //   557: getfield Wr : [Lf/mc;
    //   560: iconst_3
    //   561: aaload
    //   562: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
    //   565: invokevirtual zm0 : ()Lf/nJ0;
    //   568: pop
    //   569: getfield Wr : [Lf/mc;
    //   572: iconst_4
    //   573: aaload
    //   574: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
    //   577: aload_0
    //   578: getfield Wr : [Lf/mc;
    //   581: iconst_5
    //   582: aaload
    //   583: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
    //   586: invokevirtual zm0 : ()Lf/nJ0;
    //   589: pop
    //   590: getfield Dv0 : Lf/SA;
    //   593: new f/JG0
    //   596: dup
    //   597: invokespecial <init> : ()V
    //   600: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
    //   603: invokevirtual sV : ()Lf/nJ0;
    //   606: invokevirtual zm0 : ()Lf/nJ0;
    //   609: pop
    //   610: getfield Dv0 : Lf/SA;
    //   613: aload_0
    //   614: getfield mm0 : Lf/YA0;
    //   617: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
    //   620: invokevirtual zm0 : ()Lf/nJ0;
    //   623: pop
    //   624: getfield Dv0 : Lf/SA;
    //   627: new f/JG0
    //   630: dup
    //   631: invokespecial <init> : ()V
    //   634: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
    //   637: invokevirtual sV : ()Lf/nJ0;
    //   640: invokevirtual zm0 : ()Lf/nJ0;
    //   643: pop
    //   644: getfield Dv0 : Lf/SA;
    //   647: aload_0
    //   648: getfield IT : Lf/p30;
    //   651: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
    //   654: invokevirtual kp0 : ()Lf/nJ0;
    //   657: invokevirtual NT : ()Lf/nJ0;
    //   660: invokevirtual ti0 : ()Lf/nJ0;
    //   663: pop
    //   664: getfield Wr : [Lf/mc;
    //   667: iconst_2
    //   668: invokevirtual oY : ([Lf/Un;I)V
    //   671: return
  }
  
  public static void sy0(wg0 paramwg0, Y paramY, j40 paramj40) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Vs : Lf/nn0;
    //   4: dup
    //   5: astore_3
    //   6: ifnull -> 145
    //   9: aload_0
    //   10: dup
    //   11: aload_3
    //   12: invokevirtual jf0 : (Lf/JG0;)Z
    //   15: pop
    //   16: aconst_null
    //   17: putfield Vs : Lf/nn0;
    //   20: iconst_m1
    //   21: istore_3
    //   22: iconst_0
    //   23: istore #4
    //   25: iload #4
    //   27: iconst_4
    //   28: if_icmpge -> 61
    //   31: aload_2
    //   32: getfield Zs : Lf/Q90;
    //   35: getfield En0 : [S
    //   38: iload #4
    //   40: saload
    //   41: iconst_1
    //   42: if_icmpge -> 51
    //   45: iload #4
    //   47: istore_3
    //   48: goto -> 61
    //   51: iload #4
    //   53: iconst_1
    //   54: iadd
    //   55: i2b
    //   56: istore #4
    //   58: goto -> 25
    //   61: iload_3
    //   62: ifle -> 95
    //   65: aload_0
    //   66: aload_2
    //   67: aload_1
    //   68: getfield Lh : Lf/nH0;
    //   71: dup
    //   72: getfield p1 : S
    //   75: istore_0
    //   76: getfield Wy : I
    //   79: istore_1
    //   80: getfield Jg : I
    //   83: istore_2
    //   84: iload_0
    //   85: iload_1
    //   86: iload_2
    //   87: iconst_1
    //   88: iload_3
    //   89: invokevirtual ZN : (SIISB)V
    //   92: goto -> 145
    //   95: aload_0
    //   96: dup
    //   97: dup
    //   98: dup2
    //   99: new f/Uh
    //   102: dup
    //   103: aload_0
    //   104: aload_1
    //   105: aload_2
    //   106: invokespecial <init> : (Lf/wg0;Lf/Y;Lf/j40;)V
    //   109: putfield Da0 : Lf/Uh;
    //   112: getstatic f/F40.ef0 : Lf/F40;
    //   115: sipush #157
    //   118: bipush #39
    //   120: invokestatic Qf0 : (Lf/F40;II)Ljava/lang/String;
    //   123: bipush #10
    //   125: bipush #32
    //   127: invokevirtual replace : (CC)Ljava/lang/String;
    //   130: invokevirtual Lo : (Ljava/lang/String;)V
    //   133: getfield Da0 : Lf/Uh;
    //   136: astore_0
    //   137: invokevirtual Ub : ()I
    //   140: aload_0
    //   141: swap
    //   142: invokevirtual si : (Lf/JG0;I)V
    //   145: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 1
    //   #2	-> 12
    //   #3	-> 32
    //   #4	-> 35
    //   #5	-> 40
    //   #6	-> 68
    //   #7	-> 72
    //   #8	-> 76
    //   #9	-> 80
    //   #10	-> 89
    //   #11	-> 112
    //   #12	-> 130
    //   #13	-> 137
  }
  
  public final void LM(throws paramthrows) {
    Un[] arrayOfUn;
    int i;
    if ((i = this.Ts) >= 0 && i < (arrayOfUn = this.cw0).length)
      VA0.c90(this[i]); 
  }
  
  public final boolean i2(oa0 paramoa0) {
    // Byte code:
    //   0: aload_1
    //   1: getfield cz0 : I
    //   4: invokestatic Wm0 : (I)Z
    //   7: ifeq -> 267
    //   10: aload_1
    //   11: invokevirtual oO : ()Z
    //   14: ifeq -> 267
    //   17: aload_1
    //   18: getfield GG0 : I
    //   21: getstatic f/BM.bC : Lf/BM;
    //   24: invokestatic J20 : (ILf/BM;)Z
    //   27: ifeq -> 60
    //   30: aload_0
    //   31: getfield cw0 : [Lf/Un;
    //   34: aload_0
    //   35: getfield Ts : I
    //   38: aaload
    //   39: dup
    //   40: astore_0
    //   41: getfield kN : Z
    //   44: ifeq -> 265
    //   47: aload_0
    //   48: getfield TG0 : Lf/protected;
    //   51: getfield oh0 : [Ljava/lang/Runnable;
    //   54: invokestatic Fz0 : ([Ljava/lang/Runnable;)V
    //   57: goto -> 265
    //   60: aload_0
    //   61: getfield IT : Lf/p30;
    //   64: ifnull -> 93
    //   67: aload_1
    //   68: getfield GG0 : I
    //   71: getstatic f/BM.lc : Lf/BM;
    //   74: invokestatic J20 : (ILf/BM;)Z
    //   77: ifeq -> 93
    //   80: aload_0
    //   81: getfield IT : Lf/p30;
    //   84: getfield TG0 : Lf/protected;
    //   87: getfield oh0 : [Ljava/lang/Runnable;
    //   90: invokestatic Fz0 : ([Ljava/lang/Runnable;)V
    //   93: aload_1
    //   94: getfield GG0 : I
    //   97: getstatic f/BM.M8 : Lf/BM;
    //   100: invokestatic J20 : (ILf/BM;)Z
    //   103: ifeq -> 125
    //   106: aload_0
    //   107: getfield Ts : I
    //   110: iconst_1
    //   111: iadd
    //   112: dup
    //   113: istore_1
    //   114: aload_0
    //   115: getfield WU : I
    //   118: irem
    //   119: ifne -> 233
    //   122: goto -> 238
    //   125: aload_1
    //   126: getfield GG0 : I
    //   129: getstatic f/BM.Oq : Lf/BM;
    //   132: invokestatic J20 : (ILf/BM;)Z
    //   135: ifeq -> 168
    //   138: aload_0
    //   139: getfield Ts : I
    //   142: dup
    //   143: istore_1
    //   144: iconst_1
    //   145: iadd
    //   146: aload_0
    //   147: getfield WU : I
    //   150: irem
    //   151: iconst_1
    //   152: if_icmpne -> 158
    //   155: goto -> 238
    //   158: aload_0
    //   159: iload_1
    //   160: iconst_1
    //   161: isub
    //   162: putfield Ts : I
    //   165: goto -> 238
    //   168: aload_1
    //   169: getfield GG0 : I
    //   172: getstatic f/BM.ni : Lf/BM;
    //   175: invokestatic J20 : (ILf/BM;)Z
    //   178: ifeq -> 198
    //   181: aload_0
    //   182: getfield Ts : I
    //   185: aload_0
    //   186: getfield WU : I
    //   189: isub
    //   190: dup
    //   191: istore_1
    //   192: ifge -> 233
    //   195: goto -> 238
    //   198: aload_1
    //   199: getfield GG0 : I
    //   202: getstatic f/BM.N70 : Lf/BM;
    //   205: invokestatic J20 : (ILf/BM;)Z
    //   208: ifeq -> 238
    //   211: aload_0
    //   212: getfield Ts : I
    //   215: aload_0
    //   216: getfield WU : I
    //   219: iadd
    //   220: dup
    //   221: istore_1
    //   222: aload_0
    //   223: getfield cw0 : [Lf/Un;
    //   226: arraylength
    //   227: if_icmplt -> 233
    //   230: goto -> 238
    //   233: aload_0
    //   234: iload_1
    //   235: putfield Ts : I
    //   238: aload_0
    //   239: getfield Ts : I
    //   242: dup
    //   243: istore_1
    //   244: iflt -> 265
    //   247: iload_1
    //   248: aload_0
    //   249: getfield cw0 : [Lf/Un;
    //   252: dup
    //   253: astore_0
    //   254: arraylength
    //   255: if_icmpge -> 265
    //   258: aload_0
    //   259: iload_1
    //   260: aaload
    //   261: invokestatic c90 : (Lf/JG0;)Z
    //   264: pop
    //   265: iconst_1
    //   266: ireturn
    //   267: aload_0
    //   268: aload_1
    //   269: invokespecial i2 : (Lf/oa0;)Z
    //   272: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 1
    //   #2	-> 4
    //   #3	-> 11
    //   #4	-> 18
    //   #5	-> 21
    //   #6	-> 41
    //   #7	-> 48
    //   #8	-> 51
    //   #9	-> 54
    //   #10	-> 61
    //   #11	-> 68
    //   #12	-> 71
    //   #13	-> 84
    //   #14	-> 87
    //   #15	-> 90
    //   #16	-> 94
    //   #17	-> 97
    //   #18	-> 126
    //   #19	-> 129
    //   #20	-> 169
    //   #21	-> 172
    //   #22	-> 199
    //   #23	-> 202
    //   #24	-> 269
  }
  
  public final void d40() {
    super.d40();
  }
  
  public final void oY(Un[] paramArrayOfUn, int paramInt) {
    this.Ts = 0;
    this.WU = 2;
    this.cw0 = paramArrayOfUn;
    if (paramArrayOfUn.length == 0)
      return; 
    VA0.c90(paramArrayOfUn[0]);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/nn0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */