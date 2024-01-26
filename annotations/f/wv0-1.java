package f;

import java.awt.Desktop;
import java.net.URI;

public final class wv0 {
  public CH wA0;
  
  public wv0(fa paramfa) {
    this.wA0 = new CH(paramfa.bl);
  }
  
  public final void mx(xa0 paramxa0, AF0 paramAF0) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield wA0 : Lf/CH;
    //   5: dup
    //   6: astore_0
    //   7: invokevirtual getClass : ()Ljava/lang/Class;
    //   10: pop
    //   11: getfield F70 : Ljava/lang/String;
    //   14: ifnonnull -> 32
    //   17: aload_2
    //   18: new f/JU
    //   21: ldc 'can't process a HTTP request without URL set'
    //   23: invokespecial <init> : (Ljava/lang/String;)V
    //   26: invokevirtual Hj0 : ()V
    //   29: goto -> 416
    //   32: aload_1
    //   33: getfield g9 : Ljava/lang/String;
    //   36: dup
    //   37: dup
    //   38: astore_3
    //   39: ldc 'HEAD'
    //   41: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   44: iconst_1
    //   45: ixor
    //   46: istore #4
    //   48: ldc 'POST'
    //   50: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   53: ifne -> 83
    //   56: aload_3
    //   57: ldc 'PUT'
    //   59: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   62: ifne -> 83
    //   65: aload_3
    //   66: ldc 'PATCH'
    //   68: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   71: ifeq -> 77
    //   74: goto -> 83
    //   77: iconst_0
    //   78: istore #5
    //   80: goto -> 86
    //   83: iconst_1
    //   84: istore #5
    //   86: aload_3
    //   87: ldc 'GET'
    //   89: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   92: ifne -> 123
    //   95: aload_3
    //   96: ldc 'HEAD'
    //   98: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   101: ifeq -> 107
    //   104: goto -> 123
    //   107: new java/net/URL
    //   110: dup
    //   111: astore #6
    //   113: aload_1
    //   114: getfield F70 : Ljava/lang/String;
    //   117: invokespecial <init> : (Ljava/lang/String;)V
    //   120: goto -> 205
    //   123: aload_1
    //   124: ldc ''
    //   126: astore #6
    //   128: getfield eb0 : Ljava/lang/String;
    //   131: dup
    //   132: astore #7
    //   134: ifnull -> 169
    //   137: ldc ''
    //   139: aload #7
    //   141: invokevirtual equals : (Ljava/lang/Object;)Z
    //   144: ifne -> 169
    //   147: new java/lang/StringBuilder
    //   150: dup
    //   151: invokespecial <init> : ()V
    //   154: ldc '?'
    //   156: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: aload #7
    //   161: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: invokevirtual toString : ()Ljava/lang/String;
    //   167: astore #6
    //   169: new java/net/URL
    //   172: dup
    //   173: astore #7
    //   175: new java/lang/StringBuilder
    //   178: dup
    //   179: aload_1
    //   180: swap
    //   181: invokespecial <init> : ()V
    //   184: getfield F70 : Ljava/lang/String;
    //   187: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: aload #6
    //   192: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: invokevirtual toString : ()Ljava/lang/String;
    //   198: invokespecial <init> : (Ljava/lang/String;)V
    //   201: aload #7
    //   203: astore #6
    //   205: aload_1
    //   206: aload_0
    //   207: dup
    //   208: dup2
    //   209: aload_1
    //   210: aload #6
    //   212: invokevirtual openConnection : ()Ljava/net/URLConnection;
    //   215: checkcast java/net/HttpURLConnection
    //   218: dup
    //   219: astore #6
    //   221: aload_3
    //   222: aload #6
    //   224: iload #4
    //   226: aload #6
    //   228: iload #5
    //   230: invokevirtual setDoOutput : (Z)V
    //   233: invokevirtual setDoInput : (Z)V
    //   236: invokevirtual setRequestMethod : (Ljava/lang/String;)V
    //   239: getfield jT : Z
    //   242: invokestatic setFollowRedirects : (Z)V
    //   245: monitorenter
    //   246: getfield Ap0 : Lf/f7;
    //   249: aload_1
    //   250: aload #6
    //   252: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   255: pop
    //   256: getfield T7 : Lf/f7;
    //   259: aload_1
    //   260: aload_2
    //   261: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   264: pop
    //   265: monitorexit
    //   266: getfield Hq : Ljava/util/HashMap;
    //   269: invokevirtual entrySet : ()Ljava/util/Set;
    //   272: invokeinterface iterator : ()Ljava/util/Iterator;
    //   277: astore_3
    //   278: aload_3
    //   279: invokeinterface hasNext : ()Z
    //   284: ifeq -> 325
    //   287: aload #6
    //   289: aload_3
    //   290: invokeinterface next : ()Ljava/lang/Object;
    //   295: checkcast java/util/Map$Entry
    //   298: dup
    //   299: astore #4
    //   301: invokeinterface getKey : ()Ljava/lang/Object;
    //   306: checkcast java/lang/String
    //   309: aload #4
    //   311: invokeinterface getValue : ()Ljava/lang/Object;
    //   316: checkcast java/lang/String
    //   319: invokevirtual addRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   322: goto -> 278
    //   325: aload_0
    //   326: aload #6
    //   328: aload_1
    //   329: aload #6
    //   331: aload_1
    //   332: getfield s30 : I
    //   335: invokevirtual setConnectTimeout : (I)V
    //   338: getfield s30 : I
    //   341: invokevirtual setReadTimeout : (I)V
    //   344: getfield Ep0 : Lf/f7;
    //   347: aload_1
    //   348: aload_0
    //   349: getfield iu : Ljava/util/concurrent/ThreadPoolExecutor;
    //   352: new f/const
    //   355: dup
    //   356: aload_0
    //   357: iload #5
    //   359: aload_1
    //   360: aload #6
    //   362: aload_2
    //   363: invokespecial <init> : (Lf/CH;ZLf/xa0;Ljava/net/HttpURLConnection;Lf/AF0;)V
    //   366: invokevirtual submit : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   369: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   372: pop
    //   373: goto -> 416
    //   376: astore_3
    //   377: aload_3
    //   378: aload_0
    //   379: monitorexit
    //   380: athrow
    //   381: pop
    //   382: aload_0
    //   383: dup
    //   384: dup
    //   385: dup2
    //   386: aload_2
    //   387: invokevirtual Hj0 : ()V
    //   390: monitorenter
    //   391: getfield Ap0 : Lf/f7;
    //   394: aload_1
    //   395: invokevirtual HH : (Ljava/lang/Object;)Ljava/lang/Object;
    //   398: pop
    //   399: getfield T7 : Lf/f7;
    //   402: aload_1
    //   403: invokevirtual HH : (Ljava/lang/Object;)Ljava/lang/Object;
    //   406: pop
    //   407: getfield Ep0 : Lf/f7;
    //   410: aload_1
    //   411: invokevirtual HH : (Ljava/lang/Object;)Ljava/lang/Object;
    //   414: pop
    //   415: monitorexit
    //   416: return
    //   417: aload_0
    //   418: monitorexit
    //   419: athrow
    //   420: aload_0
    //   421: dup
    //   422: dup
    //   423: dup2
    //   424: monitorenter
    //   425: getfield Ap0 : Lf/f7;
    //   428: aload_1
    //   429: invokevirtual HH : (Ljava/lang/Object;)Ljava/lang/Object;
    //   432: pop
    //   433: getfield T7 : Lf/f7;
    //   436: aload_1
    //   437: invokevirtual HH : (Ljava/lang/Object;)Ljava/lang/Object;
    //   440: pop
    //   441: getfield Ep0 : Lf/f7;
    //   444: aload_1
    //   445: invokevirtual HH : (Ljava/lang/Object;)Ljava/lang/Object;
    //   448: pop
    //   449: monitorexit
    //   450: athrow
    //   451: aload_0
    //   452: monitorexit
    //   453: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 11
    //   #2	-> 18
    //   #3	-> 33
    //   #4	-> 39
    //   #5	-> 114
    //   #6	-> 117
    //   #7	-> 128
    //   #8	-> 137
    //   #9	-> 184
    //   #10	-> 187
    //   #11	-> 239
    //   #12	-> 242
    //   #13	-> 246
    //   #14	-> 266
    //   #15	-> 269
    //   #16	-> 332
    //   #17	-> 335
    //   #18	-> 338
    //   #19	-> 341
    //   #20	-> 391
    //   #21	-> 424
    //   #22	-> 425
    //   #23	-> 450
    // Exception table:
    //   from	to	target	type
    //   32	36	381	java/lang/Exception
    //   39	44	381	java/lang/Exception
    //   48	53	381	java/lang/Exception
    //   56	62	381	java/lang/Exception
    //   65	71	381	java/lang/Exception
    //   86	92	381	java/lang/Exception
    //   95	101	381	java/lang/Exception
    //   107	110	381	java/lang/Exception
    //   113	126	381	java/lang/Exception
    //   128	131	381	java/lang/Exception
    //   137	144	381	java/lang/Exception
    //   147	167	381	java/lang/Exception
    //   169	172	381	java/lang/Exception
    //   175	178	381	java/lang/Exception
    //   179	201	381	java/lang/Exception
    //   205	218	381	java/lang/Exception
    //   221	246	381	java/lang/Exception
    //   246	255	376	finally
    //   256	264	376	finally
    //   265	277	381	java/lang/Exception
    //   278	284	381	java/lang/Exception
    //   287	298	381	java/lang/Exception
    //   301	372	381	java/lang/Exception
    //   377	381	381	java/lang/Exception
    //   382	390	420	finally
    //   391	398	417	finally
    //   399	406	417	finally
    //   407	414	417	finally
    //   425	432	451	finally
    //   433	440	451	finally
    //   441	448	451	finally
  }
  
  public final boolean Zq(String paramString) {
    if (q00.Ar)
      try {
        String[] arrayOfString;
        (arrayOfString = new String[2])[0] = "open";
        (new String[2])[1] = (new URI(paramString)).toString();
        return true;
      } finally {
        null;
      }  
    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE))
      try {
        return true;
      } finally {
        null;
      }  
    if (q00.Sk)
      try {
        String[] arrayOfString;
        (arrayOfString = new String[2])[0] = "xdg-open";
        (new String[2])[1] = (new URI(paramString)).toString();
        return true;
      } finally {
        null;
      }  
    return false;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/wv0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */