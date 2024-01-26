package f;

import java.util.ArrayList;
import java.util.Collection;

public final class l0 extends SI0 {
  public int eC;
  
  public short Un;
  
  public Collection con;
  
  public l0(int paramInt, short paramShort, ArrayList paramArrayList) {
    this.eC = paramInt;
    this.Un = paramShort;
    this.con = paramArrayList;
  }
  
  public final void p4(kf paramkf) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic currentTimeMillis : ()J
    //   4: lstore_2
    //   5: getfield AD : Lf/Gp0;
    //   8: dup
    //   9: astore #4
    //   11: aload_0
    //   12: getfield eC : I
    //   15: invokevirtual fa : (I)Lf/hm0;
    //   18: dup
    //   19: astore #5
    //   21: ifnonnull -> 44
    //   24: aload_1
    //   25: ldc 'Error has occured, could not find\\n attacker with object id: '
    //   27: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: aload_0
    //   31: getfield eC : I
    //   34: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   37: invokevirtual toString : ()Ljava/lang/String;
    //   40: invokevirtual Kq : (Ljava/lang/String;)V
    //   43: return
    //   44: aload_0
    //   45: getfield Un : S
    //   48: dup
    //   49: istore #6
    //   51: iflt -> 61
    //   54: aload #5
    //   56: iload #6
    //   58: putfield eH0 : S
    //   61: aload_0
    //   62: aload_1
    //   63: new f/I0
    //   66: dup
    //   67: astore #6
    //   69: aload #5
    //   71: invokespecial <init> : (Lf/hm0;)V
    //   74: getfield YP : Ljava/util/LinkedList;
    //   77: aload #6
    //   79: invokevirtual add : (Ljava/lang/Object;)Z
    //   82: pop
    //   83: sipush #16384
    //   86: istore #6
    //   88: getfield con : Ljava/util/Collection;
    //   91: invokeinterface iterator : ()Ljava/util/Iterator;
    //   96: astore #7
    //   98: aload #7
    //   100: invokeinterface hasNext : ()Z
    //   105: ifeq -> 130
    //   108: aload #7
    //   110: invokeinterface next : ()Ljava/lang/Object;
    //   115: checkcast f/b60
    //   118: iload #6
    //   120: invokevirtual Fc0 : (S)Z
    //   123: ifeq -> 98
    //   126: iconst_1
    //   127: goto -> 131
    //   130: iconst_0
    //   131: ifeq -> 174
    //   134: aload_1
    //   135: iconst_1
    //   136: newarray byte
    //   138: dup
    //   139: astore #4
    //   141: iconst_0
    //   142: iconst_2
    //   143: bastore
    //   144: iconst_1
    //   145: anewarray java/lang/String
    //   148: dup
    //   149: astore #6
    //   151: aload #5
    //   153: invokevirtual Ek : ()Ljava/lang/String;
    //   156: iconst_0
    //   157: swap
    //   158: aastore
    //   159: ldc 310367
    //   161: aload #4
    //   163: aload #6
    //   165: invokestatic Nq0 : (I[B[Ljava/lang/String;)Ljava/lang/String;
    //   168: invokevirtual Kq : (Ljava/lang/String;)V
    //   171: goto -> 467
    //   174: aload_0
    //   175: aload_1
    //   176: iconst_2
    //   177: newarray byte
    //   179: dup
    //   180: dup
    //   181: astore #6
    //   183: iconst_0
    //   184: iconst_2
    //   185: bastore
    //   186: iconst_1
    //   187: iconst_3
    //   188: bastore
    //   189: iconst_2
    //   190: anewarray java/lang/String
    //   193: dup
    //   194: dup
    //   195: astore #7
    //   197: aload #5
    //   199: invokevirtual Ek : ()Ljava/lang/String;
    //   202: iconst_0
    //   203: swap
    //   204: aastore
    //   205: invokestatic cw : ()Lf/yk0;
    //   208: aload_0
    //   209: getfield Un : S
    //   212: invokevirtual mP : (S)Lf/WD;
    //   215: getfield iz : I
    //   218: invokestatic OH0 : (I)Ljava/lang/String;
    //   221: iconst_1
    //   222: swap
    //   223: aastore
    //   224: ldc 310268
    //   226: aload #6
    //   228: aload #7
    //   230: invokestatic Nq0 : (I[B[Ljava/lang/String;)Ljava/lang/String;
    //   233: invokevirtual Kq : (Ljava/lang/String;)V
    //   236: getfield con : Ljava/util/Collection;
    //   239: invokeinterface iterator : ()Ljava/util/Iterator;
    //   244: astore #6
    //   246: aload #6
    //   248: invokeinterface hasNext : ()Z
    //   253: ifeq -> 467
    //   256: aload #6
    //   258: invokeinterface next : ()Ljava/lang/Object;
    //   263: checkcast f/b60
    //   266: dup
    //   267: astore #7
    //   269: getfield a0 : I
    //   272: dup
    //   273: istore #8
    //   275: ifne -> 285
    //   278: aload #5
    //   280: astore #8
    //   282: goto -> 294
    //   285: aload #4
    //   287: iload #8
    //   289: invokevirtual fa : (I)Lf/hm0;
    //   292: astore #8
    //   294: aload #8
    //   296: ifnonnull -> 320
    //   299: aload_1
    //   300: ldc 'Error has occured, could not find\\n target with object id: '
    //   302: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   305: aload #7
    //   307: getfield a0 : I
    //   310: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   313: invokevirtual toString : ()Ljava/lang/String;
    //   316: invokevirtual Kq : (Ljava/lang/String;)V
    //   319: return
    //   320: aload_0
    //   321: invokestatic cw : ()Lf/yk0;
    //   324: aload_0
    //   325: getfield Un : S
    //   328: invokevirtual mP : (S)Lf/WD;
    //   331: invokevirtual getClass : ()Ljava/lang/Class;
    //   334: pop
    //   335: sipush #8192
    //   338: istore #9
    //   340: getfield con : Ljava/util/Collection;
    //   343: invokeinterface iterator : ()Ljava/util/Iterator;
    //   348: astore #10
    //   350: aload #10
    //   352: invokeinterface hasNext : ()Z
    //   357: ifeq -> 382
    //   360: aload #10
    //   362: invokeinterface next : ()Ljava/lang/Object;
    //   367: checkcast f/b60
    //   370: iload #9
    //   372: invokevirtual Fc0 : (S)Z
    //   375: ifeq -> 350
    //   378: iconst_1
    //   379: goto -> 383
    //   382: iconst_0
    //   383: ifne -> 409
    //   386: aload_1
    //   387: new f/Op
    //   390: dup
    //   391: astore #9
    //   393: aload_1
    //   394: aload #5
    //   396: iconst_0
    //   397: invokespecial <init> : (Lf/kf;Lf/hm0;B)V
    //   400: getfield YP : Ljava/util/LinkedList;
    //   403: aload #9
    //   405: invokevirtual add : (Ljava/lang/Object;)Z
    //   408: pop
    //   409: aload #7
    //   411: getfield JX : Ljava/util/ArrayList;
    //   414: invokevirtual iterator : ()Ljava/util/Iterator;
    //   417: astore #9
    //   419: aload #9
    //   421: invokeinterface hasNext : ()Z
    //   426: ifeq -> 246
    //   429: aload_1
    //   430: aload #5
    //   432: aload_0
    //   433: aload #9
    //   435: invokeinterface next : ()Ljava/lang/Object;
    //   440: checkcast f/GS
    //   443: astore #10
    //   445: getfield Un : S
    //   448: istore #11
    //   450: aload #8
    //   452: aload #10
    //   454: iconst_0
    //   455: iconst_0
    //   456: iload #11
    //   458: iconst_0
    //   459: aload #7
    //   461: invokevirtual j90 : (Lf/hm0;Lf/hm0;Lf/GS;ZZSZLf/b60;)V
    //   464: goto -> 419
    //   467: aload_1
    //   468: dup
    //   469: dup
    //   470: ldc ''
    //   472: invokevirtual Uu : (Ljava/lang/String;)V
    //   475: new f/AY
    //   478: dup
    //   479: astore #4
    //   481: aload #5
    //   483: invokespecial <init> : (Lf/hm0;)V
    //   486: getfield YP : Ljava/util/LinkedList;
    //   489: aload #4
    //   491: invokevirtual add : (Ljava/lang/Object;)Z
    //   494: pop
    //   495: new f/r7
    //   498: dup
    //   499: astore #4
    //   501: aload_1
    //   502: checkcast f/qq0
    //   505: invokespecial <init> : (Lf/qq0;)V
    //   508: getfield YP : Ljava/util/LinkedList;
    //   511: aload #4
    //   513: invokevirtual add : (Ljava/lang/Object;)Z
    //   516: pop
    //   517: getstatic f/Bz.mr0 : Z
    //   520: ifeq -> 542
    //   523: aload_1
    //   524: new f/i5
    //   527: dup
    //   528: astore_1
    //   529: aload_0
    //   530: lload_2
    //   531: invokespecial <init> : (Lf/l0;J)V
    //   534: getfield YP : Ljava/util/LinkedList;
    //   537: aload_1
    //   538: invokevirtual add : (Ljava/lang/Object;)Z
    //   541: pop
    //   542: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 5
    //   #2	-> 12
    //   #3	-> 15
    //   #4	-> 25
    //   #5	-> 31
    //   #6	-> 34
    //   #7	-> 45
    //   #8	-> 58
    //   #9	-> 63
    //   #10	-> 74
    //   #11	-> 88
    //   #12	-> 136
    //   #13	-> 209
    //   #14	-> 212
    //   #15	-> 215
    //   #16	-> 218
    //   #17	-> 223
    //   #18	-> 236
    //   #19	-> 239
    //   #20	-> 269
    //   #21	-> 289
    //   #22	-> 300
    //   #23	-> 307
    //   #24	-> 310
    //   #25	-> 340
    //   #26	-> 387
    //   #27	-> 400
    //   #28	-> 411
    //   #29	-> 414
    //   #30	-> 445
    //   #31	-> 461
    //   #32	-> 486
    //   #33	-> 495
    //   #34	-> 508
    //   #35	-> 517
    //   #36	-> 534
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/l0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */