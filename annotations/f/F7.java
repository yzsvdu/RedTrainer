/*  1 */ package f;public final class F7 extends io { public int LN = 0; public int eZ = 0; public static void Gp0(hu paramhu, JG0 paramJG0) { this(paramJG0); F7 f7; JG0 jG0; if ((jG0 = (new F7()).qp(0, paramhu, paramJG0, false)) != null)
/*  2 */     { int i = paramJG0.Kd - jG0.xY;
/*  3 */       jG0.Ol0(i, paramJG0.yR()); c2(jG0); }  f7.Ev0(); } public boolean HF = true; public F7(JG0 paramJG0) { super(paramJG0); Xu("menumanager"); } public static F7 Yo(B3 paramB3, JG0 paramJG0) { this(paramJG0); F7 f7; JG0 jG0; if ((jG0 = (new F7()).qp(0, paramB3, paramJG0, true)) != null) c2(jG0);  f7.Ev0(); return f7; } public static void YK0(int paramInt, B3 paramB3, Qv0 paramQv0) { this(paramQv0); F7 f7; JG0 jG0; if ((jG0 = (new F7()).qp(0, paramB3, paramQv0, false)) != null) { int i = paramQv0.Kd; int j = paramQv0.er0; if ((paramInt & 0x2) != 0) j -= paramQv0.HC + jG0.HC;  if ((paramInt & 0x4) != 0) { j += paramQv0.HC; } else if ((paramInt & 0x1) != 0)
/*  4 */       { j = paramQv0.HC / 2 + j; }  if ((paramInt & 0x10) != 0) i += paramQv0
/*  5 */           .xY;  if ((paramInt & 0x8) != 0) { i -= jG0.xY; } else if ((paramInt & 0x1) != 0)
/*  6 */       { i = paramQv0.xY / 2 + i; }  jG0.Ol0(i, j); c2(jG0); }  f7.Ev0(); } public static void T1(hu paramhu, JG0 paramJG0, int paramInt1, int paramInt2) { this(paramJG0); F7 f7; JG0 jG0; if ((jG0 = (new F7()).qp(0, paramhu, paramJG0, false)) != null) { jG0.Ol0(paramInt1, paramInt2); c2(jG0); }
/*    */      f7.Ev0(); }
/*  8 */   public static void om(B3 paramB3, Un paramUn, O0 paramO0) { this(paramUn); F7 f7; JG0 jG0; if ((jG0 = (new F7()).qp(0, paramB3, paramUn, false)) != null) { int i = paramO0.Kd; jG0.Ol0(paramO0.xY / 2 + i - jG0.xY / 2, paramO0.er0 - jG0.HC - 3); c2(jG0); }  f7.Ev0(); }
/*    */    public static void c2(JG0 paramJG0) {
/* 10 */     paramJG0.Tm(Math.min(Math.max(paramJG0.Bo0.xY, paramJG0.AW()), paramJG0.xY), Math.min(Math.max(paramJG0.Bo0.HC, paramJG0.HY()), paramJG0.HC));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 20 */     paramJG0.Ol0(Math.max(0, Math.min(paramJG0.Bo0.xY - paramJG0.xY, paramJG0.Kd)), Math.max(0, Math.min(paramJG0.Bo0.HC - paramJG0.HC, paramJG0.er0)));
/*    */   }
/*    */   
/*    */   public final void jA0() {
/*    */     super.jA0();
/*    */     js.vu0.al = false;
/*    */   }
/*    */   
/*    */   public final boolean sR(oa0 paramoa0) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield HF : Z
/*    */     //   4: ifeq -> 13
/*    */     //   7: aload_0
/*    */     //   8: aload_1
/*    */     //   9: invokespecial sR : (Lf/oa0;)Z
/*    */     //   12: pop
/*    */     //   13: aload_1
/*    */     //   14: getfield cz0 : I
/*    */     //   17: invokestatic Wm0 : (I)Z
/*    */     //   20: ifeq -> 347
/*    */     //   23: aload_1
/*    */     //   24: invokevirtual oO : ()Z
/*    */     //   27: ifeq -> 347
/*    */     //   30: aload_1
/*    */     //   31: getfield GG0 : I
/*    */     //   34: dup
/*    */     //   35: istore_2
/*    */     //   36: getstatic f/BM.ni : Lf/BM;
/*    */     //   39: invokestatic J20 : (ILf/BM;)Z
/*    */     //   42: ifeq -> 51
/*    */     //   45: aload_0
/*    */     //   46: invokevirtual DX : ()V
/*    */     //   49: iconst_1
/*    */     //   50: ireturn
/*    */     //   51: iload_2
/*    */     //   52: getstatic f/BM.N70 : Lf/BM;
/*    */     //   55: invokestatic J20 : (ILf/BM;)Z
/*    */     //   58: ifeq -> 67
/*    */     //   61: aload_0
/*    */     //   62: invokevirtual uE0 : ()V
/*    */     //   65: iconst_1
/*    */     //   66: ireturn
/*    */     //   67: iload_2
/*    */     //   68: getstatic f/BM.bC : Lf/BM;
/*    */     //   71: invokestatic J20 : (ILf/BM;)Z
/*    */     //   74: ifeq -> 230
/*    */     //   77: aload_0
/*    */     //   78: dup
/*    */     //   79: getfield eZ : I
/*    */     //   82: invokevirtual m5 : (I)Lf/JG0;
/*    */     //   85: dup
/*    */     //   86: astore_1
/*    */     //   87: ifnonnull -> 92
/*    */     //   90: iconst_1
/*    */     //   91: ireturn
/*    */     //   92: aload_1
/*    */     //   93: invokevirtual Ub : ()I
/*    */     //   96: aload_0
/*    */     //   97: getfield LN : I
/*    */     //   100: dup
/*    */     //   101: istore_2
/*    */     //   102: if_icmpgt -> 107
/*    */     //   105: iconst_1
/*    */     //   106: ireturn
/*    */     //   107: aload_1
/*    */     //   108: iload_2
/*    */     //   109: invokevirtual lPt3 : (I)Lf/JG0;
/*    */     //   112: dup
/*    */     //   113: astore_1
/*    */     //   114: instanceof f/Un
/*    */     //   117: ifeq -> 228
/*    */     //   120: aload_1
/*    */     //   121: checkcast f/Un
/*    */     //   124: getfield TG0 : Lf/protected;
/*    */     //   127: instanceof f/xo
/*    */     //   130: ifne -> 148
/*    */     //   133: aload_0
/*    */     //   134: dup
/*    */     //   135: dup
/*    */     //   136: getfield eZ : I
/*    */     //   139: iconst_1
/*    */     //   140: iadd
/*    */     //   141: putfield eZ : I
/*    */     //   144: iconst_0
/*    */     //   145: putfield LN : I
/*    */     //   148: aload_0
/*    */     //   149: invokevirtual Ub : ()I
/*    */     //   152: aload_0
/*    */     //   153: getfield eZ : I
/*    */     //   156: dup
/*    */     //   157: istore_1
/*    */     //   158: if_icmple -> 228
/*    */     //   161: aload_0
/*    */     //   162: iload_1
/*    */     //   163: invokevirtual m5 : (I)Lf/JG0;
/*    */     //   166: dup
/*    */     //   167: astore_1
/*    */     //   168: ifnonnull -> 173
/*    */     //   171: iconst_1
/*    */     //   172: ireturn
/*    */     //   173: aload_1
/*    */     //   174: invokevirtual Ub : ()I
/*    */     //   177: aload_0
/*    */     //   178: getfield LN : I
/*    */     //   181: dup
/*    */     //   182: istore_2
/*    */     //   183: if_icmple -> 195
/*    */     //   186: aload_1
/*    */     //   187: iload_2
/*    */     //   188: invokevirtual lPt3 : (I)Lf/JG0;
/*    */     //   191: invokestatic c90 : (Lf/JG0;)Z
/*    */     //   194: pop
/*    */     //   195: aload_0
/*    */     //   196: dup
/*    */     //   197: getfield eZ : I
/*    */     //   200: invokevirtual lPt3 : (I)Lf/JG0;
/*    */     //   203: instanceof f/rS
/*    */     //   206: ifeq -> 228
/*    */     //   209: aload_0
/*    */     //   210: dup
/*    */     //   211: getfield eZ : I
/*    */     //   214: invokevirtual lPt3 : (I)Lf/JG0;
/*    */     //   217: checkcast f/rS
/*    */     //   220: iconst_0
/*    */     //   221: bipush #60
/*    */     //   223: bipush #100
/*    */     //   225: invokevirtual Uo0 : (III)V
/*    */     //   228: iconst_1
/*    */     //   229: ireturn
/*    */     //   230: iload_2
/*    */     //   231: getstatic f/BM.lc : Lf/BM;
/*    */     //   234: invokestatic J20 : (ILf/BM;)Z
/*    */     //   237: ifeq -> 347
/*    */     //   240: aload_0
/*    */     //   241: getfield eZ : I
/*    */     //   244: dup
/*    */     //   245: istore_1
/*    */     //   246: ifne -> 273
/*    */     //   249: aload_0
/*    */     //   250: getfield es0 : Ljava/lang/Runnable;
/*    */     //   253: dup
/*    */     //   254: astore_1
/*    */     //   255: ifnull -> 267
/*    */     //   258: aload_1
/*    */     //   259: invokeinterface run : ()V
/*    */     //   264: goto -> 271
/*    */     //   267: aload_0
/*    */     //   268: invokevirtual tp0 : ()V
/*    */     //   271: iconst_1
/*    */     //   272: ireturn
/*    */     //   273: aload_0
/*    */     //   274: invokevirtual Ub : ()I
/*    */     //   277: iload_1
/*    */     //   278: if_icmple -> 295
/*    */     //   281: aload_0
/*    */     //   282: dup
/*    */     //   283: invokevirtual Ub : ()I
/*    */     //   286: iconst_1
/*    */     //   287: isub
/*    */     //   288: invokevirtual fG0 : (I)Lf/JG0;
/*    */     //   291: pop
/*    */     //   292: goto -> 273
/*    */     //   295: aload_0
/*    */     //   296: dup
/*    */     //   297: dup2
/*    */     //   298: getfield eZ : I
/*    */     //   301: iconst_1
/*    */     //   302: isub
/*    */     //   303: dup
/*    */     //   304: istore_1
/*    */     //   305: putfield eZ : I
/*    */     //   308: iconst_0
/*    */     //   309: putfield LN : I
/*    */     //   312: iload_1
/*    */     //   313: invokevirtual m5 : (I)Lf/JG0;
/*    */     //   316: dup
/*    */     //   317: astore_1
/*    */     //   318: ifnonnull -> 323
/*    */     //   321: iconst_1
/*    */     //   322: ireturn
/*    */     //   323: aload_1
/*    */     //   324: invokevirtual Ub : ()I
/*    */     //   327: aload_0
/*    */     //   328: getfield LN : I
/*    */     //   331: dup
/*    */     //   332: istore_0
/*    */     //   333: if_icmple -> 345
/*    */     //   336: aload_1
/*    */     //   337: iload_0
/*    */     //   338: invokevirtual lPt3 : (I)Lf/JG0;
/*    */     //   341: invokestatic c90 : (Lf/JG0;)Z
/*    */     //   344: pop
/*    */     //   345: iconst_1
/*    */     //   346: ireturn
/*    */     //   347: aload_1
/*    */     //   348: getfield cz0 : I
/*    */     //   351: invokestatic Wm0 : (I)Z
/*    */     //   354: ifeq -> 359
/*    */     //   357: iconst_1
/*    */     //   358: ireturn
/*    */     //   359: aload_0
/*    */     //   360: aload_1
/*    */     //   361: invokespecial sR : (Lf/oa0;)Z
/*    */     //   364: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 14
/*    */     //   #2	-> 17
/*    */     //   #3	-> 24
/*    */     //   #4	-> 31
/*    */     //   #5	-> 36
/*    */     //   #6	-> 124
/*    */     //   #7	-> 127
/*    */     //   #8	-> 250
/*    */     //   #9	-> 274
/*    */     //   #10	-> 283
/*    */     //   #11	-> 298
/*    */     //   #12	-> 348
/*    */     //   #13	-> 361
/*    */   }
/*    */   
/*    */   public final JG0 m5(int paramInt) {
/*    */     if (Ub() <= paramInt)
/*    */       return null; 
/*    */     JG0 jG0;
/*    */     if (jG0 = lPt3(paramInt) instanceof rS) {
/*    */       if (Ub() < 1)
/*    */         return null; 
/*    */       if ((jG0 = lPt3(0)).Ub() < 1)
/*    */         return null; 
/*    */       jG0 = lPt3(0);
/*    */     } 
/*    */     return this;
/*    */   }
/*    */   
/*    */   public final boolean jv() {
/*    */     boolean bool;
/*    */     if (bool = super.jv())
/*    */       js.vu0.al = true; 
/*    */     return bool;
/*    */   }
/*    */   
/*    */   public final void uE0() {
/*    */     JG0 jG0;
/*    */     if ((jG0 = m5(this.eZ)) == null)
/*    */       return; 
/*    */     int i;
/*    */     if (jG0.Ub() > (i = this.LN) + 1) {
/*    */       int j = i + 1;
/*    */       JG0 jG01;
/*    */       if (jG01 = jG0.lPt3(j) instanceof Un) {
/*    */         VA0.c90(jG01);
/*    */       } else {
/*    */         uE0();
/*    */       } 
/*    */       if (lPt3(this.eZ) instanceof rS)
/*    */         ((rS)lPt3(this.eZ)).Uo0(this.LN * jG01.HC, 60, 100); 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void DX() {
/*    */     if (this.LN != 0) {
/*    */       JG0 jG02;
/*    */       if ((jG02 = m5(this.eZ)) == null)
/*    */         return; 
/*    */       int i = this.LN - 1;
/*    */       JG0 jG01;
/*    */       if (jG01 = jG02.lPt3(i) instanceof Un) {
/*    */         VA0.c90(jG01);
/*    */       } else {
/*    */         DX();
/*    */       } 
/*    */       if (lPt3(this.eZ) instanceof rS)
/*    */         ((rS)lPt3(this.eZ)).Uo0(this.LN * jG01.HC, 60, 100); 
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/F7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */