/*  1 */ package f;public final class EW extends Qa0 implements r60 { public final int zC0; public final Ip h2; private void rl0(int paramInt) { if (!this.zn.kN)
/*  2 */       return;  ra0(); this
/*  3 */       .e20
/*  4 */       .W3(new S20(paramInt));
/*  5 */     this.YG0.S8(paramInt); JG0 jG0; R8 r8;
/*  6 */     if ((r8 = km.u4) != null && (jG0 = VA0.q10) != null) BA();  }
/*    */   public final Un zn; public EW(int paramInt1, wQ paramwQ, String paramString, Xv0 paramXv0, int paramInt2) { // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: aload_0
/*    */     //   2: dup
/*    */     //   3: iload_1
/*    */     //   4: aload_0
/*    */     //   5: iconst_0
/*    */     //   6: iconst_0
/*    */     //   7: invokespecial <init> : (ZZ)V
/*    */     //   10: putfield zC0 : I
/*    */     //   13: ldc 'confirm-widget'
/*    */     //   15: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   18: new f/Ip
/*    */     //   21: dup
/*    */     //   22: astore #6
/*    */     //   24: aload_0
/*    */     //   25: aload #6
/*    */     //   27: dup
/*    */     //   28: invokespecial <init> : ()V
/*    */     //   31: putfield h2 : Lf/Ip;
/*    */     //   34: ldc 'confirm-panel'
/*    */     //   36: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   39: new f/MS
/*    */     //   42: dup
/*    */     //   43: astore #7
/*    */     //   45: invokespecial <init> : ()V
/*    */     //   48: new f/da
/*    */     //   51: dup
/*    */     //   52: dup2
/*    */     //   53: astore #8
/*    */     //   55: aload #7
/*    */     //   57: invokespecial <init> : (Lf/Zq0;)V
/*    */     //   60: <illegal opcode> G80 : ()Lf/LPt7;
/*    */     //   65: invokevirtual Kh0 : (Lf/LPt7;)V
/*    */     //   68: ldc 'textarea'
/*    */     //   70: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   73: new java/lang/StringBuilder
/*    */     //   76: dup
/*    */     //   77: astore #9
/*    */     //   79: invokespecial <init> : ()V
/*    */     //   82: invokevirtual ordinal : ()I
/*    */     //   85: dup
/*    */     //   86: istore #10
/*    */     //   88: iconst_2
/*    */     //   89: if_icmpeq -> 381
/*    */     //   92: iload #10
/*    */     //   94: iconst_3
/*    */     //   95: if_icmpeq -> 371
/*    */     //   98: iload #10
/*    */     //   100: bipush #14
/*    */     //   102: if_icmpeq -> 361
/*    */     //   105: iload #10
/*    */     //   107: tableswitch default -> 132, 5 -> 207, 6 -> 197, 7 -> 187
/*    */     //   132: iload #10
/*    */     //   134: tableswitch default -> 176, 17 -> 351, 18 -> 341, 19 -> 331, 20 -> 321, 21 -> 305, 22 -> 217, 23 -> 217
/*    */     //   176: sipush #2074
/*    */     //   179: aload_3
/*    */     //   180: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   183: astore_2
/*    */     //   184: goto -> 388
/*    */     //   187: sipush #2069
/*    */     //   190: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   193: astore_2
/*    */     //   194: goto -> 388
/*    */     //   197: sipush #2070
/*    */     //   200: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   203: astore_2
/*    */     //   204: goto -> 388
/*    */     //   207: sipush #2075
/*    */     //   210: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   213: astore_2
/*    */     //   214: goto -> 388
/*    */     //   217: aload_2
/*    */     //   218: getstatic f/wQ.Iv0 : Lf/wQ;
/*    */     //   221: if_acmpne -> 231
/*    */     //   224: sipush #2080
/*    */     //   227: istore_2
/*    */     //   228: goto -> 235
/*    */     //   231: sipush #2081
/*    */     //   234: istore_2
/*    */     //   235: aload_3
/*    */     //   236: invokestatic y0 : (Ljava/lang/String;)Lf/wQ;
/*    */     //   239: dup
/*    */     //   240: astore #4
/*    */     //   242: getstatic f/wQ.l8 : Lf/wQ;
/*    */     //   245: if_acmpeq -> 257
/*    */     //   248: aload #4
/*    */     //   250: invokevirtual Nw : ()I
/*    */     //   253: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   256: astore_3
/*    */     //   257: iload #5
/*    */     //   259: bipush #10
/*    */     //   261: if_icmpge -> 275
/*    */     //   264: sipush #8049
/*    */     //   267: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   270: astore #4
/*    */     //   272: goto -> 282
/*    */     //   275: iload #5
/*    */     //   277: invokestatic za : (I)Ljava/lang/String;
/*    */     //   280: astore #4
/*    */     //   282: iload_2
/*    */     //   283: iconst_2
/*    */     //   284: anewarray java/lang/String
/*    */     //   287: dup
/*    */     //   288: dup
/*    */     //   289: astore_2
/*    */     //   290: iconst_0
/*    */     //   291: aload_3
/*    */     //   292: aastore
/*    */     //   293: iconst_1
/*    */     //   294: aload #4
/*    */     //   296: aastore
/*    */     //   297: aload_2
/*    */     //   298: invokestatic sB : (I[Ljava/lang/String;)Ljava/lang/String;
/*    */     //   301: astore_2
/*    */     //   302: goto -> 388
/*    */     //   305: aload #4
/*    */     //   307: invokevirtual D70 : ()Ljava/lang/String;
/*    */     //   310: sipush #2077
/*    */     //   313: swap
/*    */     //   314: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   317: astore_2
/*    */     //   318: goto -> 388
/*    */     //   321: sipush #2078
/*    */     //   324: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   327: astore_2
/*    */     //   328: goto -> 388
/*    */     //   331: sipush #2076
/*    */     //   334: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   337: astore_2
/*    */     //   338: goto -> 388
/*    */     //   341: sipush #2079
/*    */     //   344: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   347: astore_2
/*    */     //   348: goto -> 388
/*    */     //   351: sipush #2073
/*    */     //   354: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   357: astore_2
/*    */     //   358: goto -> 388
/*    */     //   361: sipush #2072
/*    */     //   364: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   367: astore_2
/*    */     //   368: goto -> 388
/*    */     //   371: sipush #2068
/*    */     //   374: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   377: astore_2
/*    */     //   378: goto -> 388
/*    */     //   381: sipush #2071
/*    */     //   384: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   387: astore_2
/*    */     //   388: aload_0
/*    */     //   389: dup
/*    */     //   390: aload #6
/*    */     //   392: dup
/*    */     //   393: dup
/*    */     //   394: dup2
/*    */     //   395: aload #7
/*    */     //   397: aload #9
/*    */     //   399: aload_0
/*    */     //   400: aload #9
/*    */     //   402: aload_2
/*    */     //   403: invokevirtual sl0 : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
/*    */     //   406: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   409: invokevirtual Oh : (Ljava/lang/String;)V
/*    */     //   412: new f/Un
/*    */     //   415: dup
/*    */     //   416: astore_2
/*    */     //   417: aload_0
/*    */     //   418: iload_1
/*    */     //   419: aload_2
/*    */     //   420: aload_0
/*    */     //   421: aload_2
/*    */     //   422: dup
/*    */     //   423: bipush #52
/*    */     //   425: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   428: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   431: putfield zn : Lf/Un;
/*    */     //   434: iconst_0
/*    */     //   435: invokevirtual sk0 : (Z)V
/*    */     //   438: <illegal opcode> run : (Lf/EW;I)Ljava/lang/Runnable;
/*    */     //   443: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   446: invokevirtual d7 : ()Lf/cr0;
/*    */     //   449: aload #8
/*    */     //   451: invokevirtual Ya : (Lf/JG0;)Lf/U90;
/*    */     //   454: aload_2
/*    */     //   455: invokevirtual Ya : (Lf/JG0;)Lf/U90;
/*    */     //   458: invokevirtual Em0 : ()Lf/U90;
/*    */     //   461: invokevirtual WN : (Lf/U90;)V
/*    */     //   464: invokevirtual mE0 : ()Lf/g0;
/*    */     //   467: aload #8
/*    */     //   469: invokevirtual Ya : (Lf/JG0;)Lf/U90;
/*    */     //   472: aload_2
/*    */     //   473: invokevirtual Ya : (Lf/JG0;)Lf/U90;
/*    */     //   476: invokevirtual rK0 : (Lf/U90;)V
/*    */     //   479: invokevirtual J8 : (Lf/JG0;)V
/*    */     //   482: invokestatic XU : ()Z
/*    */     //   485: putfield eh : Z
/*  7 */     //   488: return } public final void LM(throws paramthrows) { VA0.c90(this.zn); (new fx0(paramthrows)).rl0(10000); (new fx0(paramthrows)).ha(); (new fx0(paramthrows)).NY = (() -> this.zn.sk0(true)); } public final boolean i2(oa0 paramoa0) { if (B8.Wm0(paramoa0.cz0) && paramoa0.oO() && (h1.J20(paramoa0.GG0, BM.bC) || h1.J20(paramoa0.GG0, BM.lc))) {
/*    */ 
/*    */       
/* 10 */       hm.Fz0(this.zn.TG0.oh0); return true;
/* 11 */     }  return super.i2(paramoa0); }
/*    */ 
/*    */   
/*    */   public final void d40() {
/*    */     super.d40();
/*    */     this.h2.mM();
/*    */     QI();
/*    */     this.h2.js0(et.Wi0);
/*    */   }
/*    */   
/*    */   public final void V90(throws paramthrows) {
/*    */     if (km.XU()) {
/*    */       BA();
/*    */     } else {
/*    */       VA0.c90(this.zn);
/*    */     } 
/*    */     super.V90(paramthrows);
/*    */   }
/*    */   
/*    */   public final void sl0(StringBuilder paramStringBuilder, String paramString) {
/*    */     paramStringBuilder.append("<div style=\"word-wrap: break-word; font-family: default; text-align: center;");
/*    */     paramStringBuilder.append(" \\\">");
/*    */     String str;
/*    */     if ((str = paramString.replaceAll("\\n", "<br/>")).contains("https://pokemmo.com/code_of_conduct"))
/*    */       str = replace("https://pokemmo.com/code_of_conduct", "<a style=\"display: inline; float: left; font: link\" href=\"https://pokemmo.com/code_of_conduct\">https://pokemmo.com/code_of_conduct</a>"); 
/*    */     paramStringBuilder.append(this);
/*    */     paramStringBuilder.append("<br/>");
/*    */     paramStringBuilder.append("<br/>");
/*    */     paramStringBuilder.append("</div>");
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/EW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */