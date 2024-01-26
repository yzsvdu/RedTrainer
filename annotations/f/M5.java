package f;

public final class M5 extends UA {
  public M5() {
    super("ba ");
  }
  
  public final void Vt(String[] paramArrayOfString) {
    // Byte code:
    //   0: aload_1
    //   1: iconst_0
    //   2: istore_0
    //   3: iconst_0
    //   4: istore_2
    //   5: arraylength
    //   6: iconst_2
    //   7: if_icmpge -> 16
    //   10: ldc '>ba <spawn|despawn|reset|setsprite|info> [team_id] [slot_id]'
    //   12: invokestatic Ue : (Ljava/lang/String;)V
    //   15: return
    //   16: getstatic f/km.MR : Lf/Gp0;
    //   19: ifnonnull -> 33
    //   22: getstatic f/mk.vx : Lf/mk;
    //   25: ldc 'You need to be in battle in order to use this command.'
    //   27: ldc 'red'
    //   29: invokevirtual r10 : (Ljava/lang/String;Ljava/lang/String;)V
    //   32: return
    //   33: aload_1
    //   34: arraylength
    //   35: iconst_3
    //   36: if_icmpne -> 61
    //   39: aload_1
    //   40: iconst_2
    //   41: aaload
    //   42: invokestatic parseByte : (Ljava/lang/String;)B
    //   45: istore_0
    //   46: goto -> 61
    //   49: pop
    //   50: getstatic f/mk.vx : Lf/mk;
    //   53: ldc 'Error parsing team_id check your request.'
    //   55: ldc 'red'
    //   57: invokevirtual r10 : (Ljava/lang/String;Ljava/lang/String;)V
    //   60: return
    //   61: aload_1
    //   62: arraylength
    //   63: iconst_4
    //   64: if_icmple -> 96
    //   67: aload_1
    //   68: dup
    //   69: iconst_2
    //   70: aaload
    //   71: invokestatic parseByte : (Ljava/lang/String;)B
    //   74: istore_0
    //   75: iconst_3
    //   76: aaload
    //   77: invokestatic parseByte : (Ljava/lang/String;)B
    //   80: istore_2
    //   81: goto -> 96
    //   84: pop
    //   85: getstatic f/mk.vx : Lf/mk;
    //   88: ldc 'Error parsing team_id check your request.'
    //   90: ldc 'red'
    //   92: invokevirtual r10 : (Ljava/lang/String;Ljava/lang/String;)V
    //   95: return
    //   96: getstatic f/km.MR : Lf/Gp0;
    //   99: dup
    //   100: dup
    //   101: astore_3
    //   102: iload_0
    //   103: iload_2
    //   104: invokevirtual N0 : (BB)Lf/hm0;
    //   107: dup
    //   108: astore_2
    //   109: getfield if : Lf/C30;
    //   112: astore #4
    //   114: invokevirtual nI : ()B
    //   117: iload_0
    //   118: invokestatic Sr0 : (B)B
    //   121: if_icmpne -> 129
    //   124: iconst_1
    //   125: istore_0
    //   126: goto -> 131
    //   129: iconst_0
    //   130: istore_0
    //   131: aload_1
    //   132: iconst_1
    //   133: aaload
    //   134: ldc 'setsprite'
    //   136: invokevirtual equals : (Ljava/lang/Object;)Z
    //   139: ifeq -> 216
    //   142: aload_1
    //   143: arraylength
    //   144: iconst_5
    //   145: if_icmpne -> 210
    //   148: aload_2
    //   149: dup
    //   150: aload_1
    //   151: aload_2
    //   152: invokevirtual Jx : ()S
    //   155: pop
    //   156: iconst_4
    //   157: aaload
    //   158: invokestatic parseShort : (Ljava/lang/String;)S
    //   161: dup
    //   162: istore_1
    //   163: putfield bh0 : S
    //   166: invokestatic v30 : ()Lf/On;
    //   169: iload_1
    //   170: invokevirtual lpT3 : (S)Lf/UD0;
    //   173: putfield hU : Lf/UD0;
    //   176: new f/EJ
    //   179: dup
    //   180: astore_1
    //   181: aload_2
    //   182: iload_0
    //   183: aload_3
    //   184: invokespecial <init> : (Lf/hm0;ZLf/Gp0;)V
    //   187: getstatic f/vo.tI : Ljava/util/LinkedList;
    //   190: aload_1
    //   191: invokevirtual add : (Ljava/lang/Object;)Z
    //   194: pop
    //   195: goto -> 215
    //   198: pop
    //   199: getstatic f/mk.vx : Lf/mk;
    //   202: ldc 'Error parsing monster_id check your request.'
    //   204: ldc 'red'
    //   206: invokevirtual r10 : (Ljava/lang/String;Ljava/lang/String;)V
    //   209: return
    //   210: ldc '>ba setsprite <team_id> <slot_id> <monster_id>'
    //   212: invokestatic Ue : (Ljava/lang/String;)V
    //   215: return
    //   216: aload_1
    //   217: iconst_1
    //   218: aaload
    //   219: ldc 'info'
    //   221: invokevirtual equals : (Ljava/lang/Object;)Z
    //   224: ifeq -> 397
    //   227: aload #4
    //   229: dup
    //   230: dup2
    //   231: ldc '\\n'
    //   233: invokestatic Ue : (Ljava/lang/String;)V
    //   236: new java/lang/StringBuilder
    //   239: dup
    //   240: invokespecial <init> : ()V
    //   243: ldc '>> pos = '
    //   245: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   248: aload_2
    //   249: getfield if : Lf/C30;
    //   252: getfield ec : I
    //   255: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   258: ldc ' / '
    //   260: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: aload_2
    //   264: getfield if : Lf/C30;
    //   267: getfield hv : I
    //   270: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   273: invokevirtual toString : ()Ljava/lang/String;
    //   276: invokestatic Ue : (Ljava/lang/String;)V
    //   279: new java/lang/StringBuilder
    //   282: dup
    //   283: invokespecial <init> : ()V
    //   286: ldc '>> alpha = '
    //   288: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: aload_2
    //   292: getfield if : Lf/C30;
    //   295: getfield ik : I
    //   298: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   301: invokevirtual toString : ()Ljava/lang/String;
    //   304: invokestatic Ue : (Ljava/lang/String;)V
    //   307: new java/lang/StringBuilder
    //   310: dup
    //   311: invokespecial <init> : ()V
    //   314: ldc '>> scale x/y = '
    //   316: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   319: aload_2
    //   320: getfield if : Lf/C30;
    //   323: getfield Xm0 : F
    //   326: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   329: ldc ' / '
    //   331: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   334: aload_2
    //   335: getfield if : Lf/C30;
    //   338: getfield ad : F
    //   341: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   344: invokevirtual toString : ()Ljava/lang/String;
    //   347: invokestatic Ue : (Ljava/lang/String;)V
    //   350: new java/lang/StringBuilder
    //   353: dup
    //   354: invokespecial <init> : ()V
    //   357: ldc '>> scale y = '
    //   359: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: aload_2
    //   363: getfield if : Lf/C30;
    //   366: getfield ad : F
    //   369: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   372: invokevirtual toString : ()Ljava/lang/String;
    //   375: invokestatic Ue : (Ljava/lang/String;)V
    //   378: invokevirtual tr0 : ()I
    //   381: istore_0
    //   382: invokevirtual ce0 : ()I
    //   385: istore_1
    //   386: iload_0
    //   387: putfield yg : I
    //   390: iload_1
    //   391: putfield aQ : I
    //   394: goto -> 470
    //   397: aload_1
    //   398: iconst_1
    //   399: aaload
    //   400: ldc 'reset'
    //   402: invokevirtual equals : (Ljava/lang/Object;)Z
    //   405: ifeq -> 470
    //   408: aload #4
    //   410: dup
    //   411: aload_2
    //   412: dup
    //   413: aload #4
    //   415: dup
    //   416: dup2
    //   417: dup2
    //   418: dup2
    //   419: fconst_1
    //   420: putfield Xm0 : F
    //   423: fconst_1
    //   424: putfield ad : F
    //   427: sipush #255
    //   430: putfield ik : I
    //   433: invokevirtual go0 : ()V
    //   436: invokevirtual tr0 : ()I
    //   439: istore_0
    //   440: invokevirtual ce0 : ()I
    //   443: istore_1
    //   444: iload_0
    //   445: putfield yg : I
    //   448: iload_1
    //   449: putfield aQ : I
    //   452: aload_3
    //   453: invokevirtual YI : (Lf/Gp0;)I
    //   456: istore_0
    //   457: aload_3
    //   458: invokevirtual ya : (Lf/Gp0;)I
    //   461: istore_1
    //   462: iload_0
    //   463: putfield ec : I
    //   466: iload_1
    //   467: putfield hv : I
    //   470: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 22
    //   #2	-> 25
    //   #3	-> 34
    //   #4	-> 50
    //   #5	-> 53
    //   #6	-> 62
    //   #7	-> 85
    //   #8	-> 88
    //   #9	-> 96
    //   #10	-> 109
    //   #11	-> 114
    //   #12	-> 163
    //   #13	-> 176
    //   #14	-> 187
    //   #15	-> 199
    //   #16	-> 202
    //   #17	-> 210
    //   #18	-> 249
    //   #19	-> 252
    //   #20	-> 255
    //   #21	-> 264
    //   #22	-> 267
    //   #23	-> 270
    //   #24	-> 292
    //   #25	-> 295
    //   #26	-> 298
    //   #27	-> 320
    //   #28	-> 323
    //   #29	-> 326
    //   #30	-> 335
    //   #31	-> 338
    //   #32	-> 341
    //   #33	-> 363
    //   #34	-> 366
    //   #35	-> 369
    //   #36	-> 387
    //   #37	-> 399
    //   #38	-> 420
    //   #39	-> 424
    //   #40	-> 430
    //   #41	-> 436
    //   #42	-> 445
    //   #43	-> 453
    //   #44	-> 463
    // Exception table:
    //   from	to	target	type
    //   39	45	49	java/lang/NumberFormatException
    //   67	74	84	java/lang/NumberFormatException
    //   75	80	84	java/lang/NumberFormatException
    //   156	161	198	java/lang/NumberFormatException
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/M5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */