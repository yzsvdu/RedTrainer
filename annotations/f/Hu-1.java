package f;

public final class Hu extends dQ {
  public Hu() {
    Xu("server-status-info");
    wI0(false);
    mp.LPt7(new Sy0(this));
  }
  
  public final void v60() {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: getstatic f/mp.tp0 : Lorg/w3c/dom/Element;
    //   5: dup
    //   6: astore_2
    //   7: ifnonnull -> 16
    //   10: ldc ''
    //   12: astore_2
    //   13: goto -> 280
    //   16: aload_2
    //   17: ldc 'info'
    //   19: astore_1
    //   20: ldc 'theme'
    //   22: invokeinterface hasAttribute : (Ljava/lang/String;)Z
    //   27: ifeq -> 79
    //   30: getstatic f/mp.tp0 : Lorg/w3c/dom/Element;
    //   33: ldc 'theme'
    //   35: invokeinterface getAttribute : (Ljava/lang/String;)Ljava/lang/String;
    //   40: astore_2
    //   41: ldc 'success'
    //   43: aload_2
    //   44: invokevirtual equals : (Ljava/lang/Object;)Z
    //   47: ifne -> 77
    //   50: ldc 'info'
    //   52: aload_2
    //   53: invokevirtual equals : (Ljava/lang/Object;)Z
    //   56: ifne -> 77
    //   59: ldc 'warning'
    //   61: aload_2
    //   62: invokevirtual equals : (Ljava/lang/Object;)Z
    //   65: ifne -> 77
    //   68: ldc 'danger'
    //   70: aload_2
    //   71: invokevirtual equals : (Ljava/lang/Object;)Z
    //   74: ifeq -> 79
    //   77: aload_2
    //   78: astore_1
    //   79: ldc ''
    //   81: astore_2
    //   82: ldc ''
    //   84: astore_3
    //   85: getstatic f/mp.tp0 : Lorg/w3c/dom/Element;
    //   88: ldc 'string'
    //   90: invokeinterface getElementsByTagName : (Ljava/lang/String;)Lorg/w3c/dom/NodeList;
    //   95: astore #4
    //   97: iconst_0
    //   98: istore #5
    //   100: iload #5
    //   102: aload #4
    //   104: invokeinterface getLength : ()I
    //   109: if_icmpge -> 214
    //   112: aload #4
    //   114: iload #5
    //   116: invokeinterface item : (I)Lorg/w3c/dom/Node;
    //   121: dup
    //   122: astore #6
    //   124: instanceof org/w3c/dom/Element
    //   127: ifne -> 133
    //   130: goto -> 208
    //   133: aload #6
    //   135: checkcast org/w3c/dom/Element
    //   138: dup
    //   139: astore #6
    //   141: ldc 'lang'
    //   143: invokeinterface hasAttribute : (Ljava/lang/String;)Z
    //   148: ifeq -> 200
    //   151: ldc 'en'
    //   153: aload #6
    //   155: ldc 'lang'
    //   157: invokeinterface getAttribute : (Ljava/lang/String;)Ljava/lang/String;
    //   162: invokevirtual equals : (Ljava/lang/Object;)Z
    //   165: ifeq -> 171
    //   168: goto -> 200
    //   171: getstatic f/h1.pB0 : Ljava/lang/String;
    //   174: aload #6
    //   176: ldc 'lang'
    //   178: invokeinterface getAttribute : (Ljava/lang/String;)Ljava/lang/String;
    //   183: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   186: ifeq -> 208
    //   189: aload #6
    //   191: invokeinterface getTextContent : ()Ljava/lang/String;
    //   196: astore_3
    //   197: goto -> 208
    //   200: aload #6
    //   202: invokeinterface getTextContent : ()Ljava/lang/String;
    //   207: astore_2
    //   208: iinc #5, 1
    //   211: goto -> 100
    //   214: aload_3
    //   215: invokevirtual isEmpty : ()Z
    //   218: ifeq -> 224
    //   221: goto -> 226
    //   224: aload_3
    //   225: astore_2
    //   226: aload_2
    //   227: invokevirtual isEmpty : ()Z
    //   230: ifeq -> 236
    //   233: goto -> 259
    //   236: aload_2
    //   237: ldc 'STRING'
    //   239: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   242: ifeq -> 250
    //   245: aload_2
    //   246: invokestatic LU : (Ljava/lang/String;)Ljava/lang/String;
    //   249: astore_2
    //   250: aload_2
    //   251: ldc 'STRING'
    //   253: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   256: ifeq -> 280
    //   259: ldc ''
    //   261: astore_2
    //   262: goto -> 280
    //   265: astore_2
    //   266: getstatic f/mp.PE0 : Lf/ik;
    //   269: ldc 'Unable to get serverstatus values'
    //   271: aload_2
    //   272: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   277: ldc ''
    //   279: astore_2
    //   280: aload_2
    //   281: invokevirtual isEmpty : ()Z
    //   284: ifne -> 348
    //   287: aload_1
    //   288: invokevirtual isEmpty : ()Z
    //   291: ifeq -> 297
    //   294: goto -> 348
    //   297: aload_0
    //   298: getfield wL : Ljava/lang/CharSequence;
    //   301: invokeinterface toString : ()Ljava/lang/String;
    //   306: aload_2
    //   307: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   310: ifeq -> 314
    //   313: return
    //   314: aload_0
    //   315: dup
    //   316: dup
    //   317: aload_2
    //   318: invokevirtual E1 : (Ljava/lang/String;)V
    //   321: new java/lang/StringBuilder
    //   324: dup
    //   325: invokespecial <init> : ()V
    //   328: ldc 'server-status-'
    //   330: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   333: aload_1
    //   334: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   337: invokevirtual toString : ()Ljava/lang/String;
    //   340: invokevirtual jz0 : (Ljava/lang/String;)V
    //   343: iconst_1
    //   344: invokevirtual wI0 : (Z)V
    //   347: return
    //   348: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 2
    //   #2	-> 20
    //   #3	-> 281
    //   #4	-> 298
    //   #5	-> 301
    //   #6	-> 307
    // Exception table:
    //   from	to	target	type
    //   16	19	265	java/lang/Exception
    //   20	27	265	java/lang/Exception
    //   30	40	265	java/lang/Exception
    //   41	47	265	java/lang/Exception
    //   50	56	265	java/lang/Exception
    //   59	65	265	java/lang/Exception
    //   68	74	265	java/lang/Exception
    //   79	81	265	java/lang/Exception
    //   82	84	265	java/lang/Exception
    //   85	95	265	java/lang/Exception
    //   100	109	265	java/lang/Exception
    //   112	121	265	java/lang/Exception
    //   124	127	265	java/lang/Exception
    //   133	138	265	java/lang/Exception
    //   141	148	265	java/lang/Exception
    //   151	165	265	java/lang/Exception
    //   171	186	265	java/lang/Exception
    //   189	196	265	java/lang/Exception
    //   200	207	265	java/lang/Exception
    //   214	218	265	java/lang/Exception
    //   226	230	265	java/lang/Exception
    //   236	242	265	java/lang/Exception
    //   245	249	265	java/lang/Exception
    //   250	256	265	java/lang/Exception
    //   259	261	265	java/lang/Exception
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Hu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */