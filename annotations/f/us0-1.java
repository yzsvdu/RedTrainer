/*    */ package f;public final class us0 extends Qa0 implements r60 { public final Ip nE; public final Un Fi; public Un Z10; public final cG CH0; public us0(js paramjs, cG paramcG) { // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: dup
/*    */     //   2: aload_0
/*    */     //   3: dup
/*    */     //   4: aload_2
/*    */     //   5: aload_1
/*    */     //   6: aload_0
/*    */     //   7: iconst_0
/*    */     //   8: iconst_0
/*    */     //   9: invokespecial <init> : (ZZ)V
/*    */     //   12: invokevirtual lv : ()V
/*    */     //   15: putfield CH0 : Lf/cG;
/*    */     //   18: ldc 'disconnection-widget'
/*    */     //   20: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   23: new f/Ip
/*    */     //   26: dup
/*    */     //   27: aload_0
/*    */     //   28: swap
/*    */     //   29: dup
/*    */     //   30: invokespecial <init> : ()V
/*    */     //   33: putfield nE : Lf/Ip;
/*    */     //   36: ldc 'confirm-panel'
/*    */     //   38: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   41: new f/MS
/*    */     //   44: dup
/*    */     //   45: astore_1
/*    */     //   46: invokespecial <init> : ()V
/*    */     //   49: new f/da
/*    */     //   52: dup
/*    */     //   53: dup2
/*    */     //   54: astore_3
/*    */     //   55: aload_1
/*    */     //   56: invokespecial <init> : (Lf/Zq0;)V
/*    */     //   59: <illegal opcode> G80 : ()Lf/LPt7;
/*    */     //   64: invokevirtual Kh0 : (Lf/LPt7;)V
/*    */     //   67: ldc 'textarea'
/*    */     //   69: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   72: new java/lang/StringBuilder
/*    */     //   75: dup
/*    */     //   76: astore #4
/*    */     //   78: invokespecial <init> : ()V
/*    */     //   81: invokevirtual Lv : ()I
/*    */     //   84: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   87: astore #5
/*    */     //   89: getstatic f/cG.D7 : Lf/cG;
/*    */     //   92: if_acmpne -> 296
/*    */     //   95: getstatic f/km.iE0 : Lf/r9;
/*    */     //   98: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   101: pop
/*    */     //   102: invokestatic Jt : ()Ljava/util/Map;
/*    */     //   105: invokeinterface isEmpty : ()Z
/*    */     //   110: ifne -> 296
/*    */     //   113: aload #4
/*    */     //   115: aload_0
/*    */     //   116: aload #4
/*    */     //   118: aload #5
/*    */     //   120: ldc 'https://pokemmo.com/tampering'
/*    */     //   122: ldc 'https://pokemmo.com/tampering-as'
/*    */     //   124: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/*    */     //   127: invokevirtual KK : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
/*    */     //   130: ldc '&nbsp;'
/*    */     //   132: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   135: pop
/*    */     //   136: ldc ''
/*    */     //   138: astore #5
/*    */     //   140: getstatic f/km.iE0 : Lf/r9;
/*    */     //   143: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   146: pop
/*    */     //   147: invokestatic Jt : ()Ljava/util/Map;
/*    */     //   150: invokeinterface entrySet : ()Ljava/util/Set;
/*    */     //   155: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   160: astore #6
/*    */     //   162: aload #6
/*    */     //   164: invokeinterface hasNext : ()Z
/*    */     //   169: ifeq -> 244
/*    */     //   172: aload #5
/*    */     //   174: aload #6
/*    */     //   176: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   181: checkcast java/util/Map$Entry
/*    */     //   184: astore #7
/*    */     //   186: invokevirtual isEmpty : ()Z
/*    */     //   189: ifne -> 201
/*    */     //   192: aload #5
/*    */     //   194: ldc '\\n'
/*    */     //   196: invokestatic tF0 : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   199: astore #5
/*    */     //   201: aload #5
/*    */     //   203: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   206: aload #7
/*    */     //   208: invokeinterface getValue : ()Ljava/lang/Object;
/*    */     //   213: checkcast java/lang/String
/*    */     //   216: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   219: ldc ' ('
/*    */     //   221: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   224: aload #7
/*    */     //   226: invokeinterface getKey : ()Ljava/lang/Object;
/*    */     //   231: checkcast java/lang/String
/*    */     //   234: ldc ')'
/*    */     //   236: invokestatic Vr0 : (Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   239: astore #5
/*    */     //   241: goto -> 162
/*    */     //   244: aload_0
/*    */     //   245: dup
/*    */     //   246: aload #4
/*    */     //   248: sipush #6825
/*    */     //   251: aload #5
/*    */     //   253: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   256: invokevirtual KK : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
/*    */     //   259: new f/Un
/*    */     //   262: dup
/*    */     //   263: aload_0
/*    */     //   264: swap
/*    */     //   265: dup
/*    */     //   266: sipush #6826
/*    */     //   269: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   272: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   275: putfield Z10 : Lf/Un;
/*    */     //   278: iconst_1
/*    */     //   279: invokevirtual sk0 : (Z)V
/*    */     //   282: getfield Z10 : Lf/Un;
/*    */     //   285: <illegal opcode> run : ()Ljava/lang/Runnable;
/*    */     //   290: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   293: goto -> 304
/*    */     //   296: aload_0
/*    */     //   297: aload #4
/*    */     //   299: aload #5
/*    */     //   301: invokevirtual KK : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
/*    */     //   304: aload_0
/*    */     //   305: dup
/*    */     //   306: dup
/*    */     //   307: dup2
/*    */     //   308: aload_1
/*    */     //   309: aload #4
/*    */     //   311: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   314: invokevirtual Oh : (Ljava/lang/String;)V
/*    */     //   317: new f/Un
/*    */     //   320: dup
/*    */     //   321: astore_1
/*    */     //   322: aload_0
/*    */     //   323: aload_2
/*    */     //   324: aload_1
/*    */     //   325: aload_0
/*    */     //   326: aload_1
/*    */     //   327: dup
/*    */     //   328: bipush #52
/*    */     //   330: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   333: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   336: putfield Fi : Lf/Un;
/*    */     //   339: iconst_0
/*    */     //   340: invokevirtual sk0 : (Z)V
/*    */     //   343: <illegal opcode> run : (Lf/us0;Lf/cG;)Ljava/lang/Runnable;
/*    */     //   348: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   351: getfield nE : Lf/Ip;
/*    */     //   354: dup
/*    */     //   355: invokevirtual d7 : ()Lf/cr0;
/*    */     //   358: aload_3
/*    */     //   359: invokevirtual Ya : (Lf/JG0;)Lf/U90;
/*    */     //   362: aload_0
/*    */     //   363: getfield Z10 : Lf/Un;
/*    */     //   366: invokevirtual Ya : (Lf/JG0;)Lf/U90;
/*    */     //   369: aload_1
/*    */     //   370: invokevirtual Ya : (Lf/JG0;)Lf/U90;
/*    */     //   373: invokevirtual Em0 : ()Lf/U90;
/*    */     //   376: invokevirtual WN : (Lf/U90;)V
/*    */     //   379: getfield nE : Lf/Ip;
/*    */     //   382: dup
/*    */     //   383: invokevirtual mE0 : ()Lf/g0;
/*    */     //   386: aload_3
/*    */     //   387: invokevirtual Ya : (Lf/JG0;)Lf/U90;
/*    */     //   390: aload_0
/*    */     //   391: getfield Z10 : Lf/Un;
/*    */     //   394: invokevirtual Ya : (Lf/JG0;)Lf/U90;
/*    */     //   397: aload_1
/*    */     //   398: invokevirtual Ya : (Lf/JG0;)Lf/U90;
/*    */     //   401: invokevirtual rK0 : (Lf/U90;)V
/*    */     //   404: getfield nE : Lf/Ip;
/*    */     //   407: invokevirtual J8 : (Lf/JG0;)V
/*    */     //   410: invokestatic XU : ()Z
/*    */     //   413: putfield eh : Z
/*    */     //   416: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 194
/*    */     //   #2	-> 203
/*    */     //   #3	-> 208
/*    */     //   #4	-> 234
/*  1 */     //   #5	-> 253 } private void aW(cG paramcG) { if (!this.Fi.kN)
/*  2 */       return;  ra0(); if (paramcG == cG.df0 || paramcG == cG.JP || paramcG == cG.pK0 || paramcG == cG.D7 || paramcG == cG.t90) { UB0.Kg0
/*  3 */         .K7 = false; return; }  R8 r8; if ((r8 = km.u4) != null) Ch0();  } public final void LM(throws paramthrows) { VA0.c90(this.Fi); this(paramthrows); char c; fx0 fx0; switch (this.CH0.ordinal()) { default: c = 'ߐ'; break;case 9: case 10: case 11: c = '✐'; break;case 3: case 4: case 6: case 7: case 8: c = 'ᎈ'; break; }  fx0.rl0(c); fx0.ha(); fx0.NY = (() -> this.Fi.sk0(true)); } public final boolean i2(oa0 paramoa0) { if (B8.Wm0(paramoa0.cz0) && paramoa0.oO() && (
/*    */       
/*  5 */       h1.J20(paramoa0.GG0, BM.bC) || 
/*    */       
/*  7 */       h1.J20(paramoa0.GG0, BM.lc))) {
/*    */ 
/*    */       
/* 10 */       hm.Fz0(this.Fi.TG0.oh0); return true;
/* 11 */     }  return super.i2(paramoa0); }
/*    */ 
/*    */   
/*    */   public final void d40() {
/*    */     super.d40();
/*    */     QI();
/*    */     this.nE.mM();
/*    */     this.nE.js0(et.Wi0);
/*    */   }
/*    */   
/*    */   public final void V90(throws paramthrows) {
/*    */     if (km.XU()) {
/*    */       BA();
/*    */     } else {
/*    */       VA0.c90(this.Fi);
/*    */     } 
/*    */     super.V90(paramthrows);
/*    */   }
/*    */   
/*    */   public final void KK(StringBuilder paramStringBuilder, String paramString) {
/*    */     paramStringBuilder.append("<div style=\"word-wrap: break-word; font-family: default; text-align: center;");
/*    */     paramStringBuilder.append(" \\\">");
/*    */     String str;
/*    */     if ((str = paramString.replaceAll("\\n", "<br/>")).matches(".*https://([a-z\\.\\-]+)?pokemmo.com.*"))
/*    */       str = replaceAll("(https://([a-z\\.\\-]+)?pokemmo\\.com\\S*)", "<a style=\"display: inline; float: left; font: link\" href=\"$1\">$1</a>"); 
/*    */     paramStringBuilder.append(this);
/*    */     paramStringBuilder.append("</div>");
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/us0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */