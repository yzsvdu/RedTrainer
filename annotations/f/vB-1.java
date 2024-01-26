/* 1 */ package f;public final class vB extends jT { public final void in0(Pj paramPj) { C7 c7; pRn pRn; PS pS = this.Oe; if (this.NUl) { pRn = pS.f2; } else { pRn = ((PS)pRn).Kp; }  if (pRn != null)
/* 2 */     { float f1 = pRn.pT(), f2 = pRn.bf(), f3 = pRn.x3(), f4 = pRn.Zg0(); tw tw; C7 c71;
/* 3 */       if ((c71 = (tw = (tw)paramPj.f20).Ma)
/* 4 */         .JJ == null)
/* 5 */       { C7 c72; this(c71); c71.JJ = c72; }  c71.prn *= f1; c71.cu0 *= f2; c71.ew0 *= f3; c71.JS *= f4; tw
/* 6 */         .Ma = c71.JJ;
/* 7 */       xF0(paramPj); ((tw)paramPj.f20).w1(); } else { super
/* 8 */         .xF0(paramPj); }
/*   */      }
/*   */ 
/*   */   
/*   */   public final PS Oe;
/*   */   public final String X20;
/*   */   public final int Dx;
/*   */   public final int Nh0;
/*   */   public GE iz;
/*   */   public boolean Et0;
/*   */   
/*   */   public vB(xc paramxc, PS paramPS, String paramString, int paramInt1, int paramInt2, boolean paramBoolean) {
/*   */     super(paramxc);
/*   */     pe pe = paramPS.ZU;
/*   */     this.Oe = paramPS;
/*   */     this.X20 = paramString;
/*   */     this.Dx = paramInt1;
/*   */     this.Nh0 = paramInt2;
/*   */     if (paramBoolean) {
/*   */       GE gE;
/*   */       if ((gE = this.iz) == null) {
/*   */         this.iz = ((t90)pe).getFont().ag0();
/*   */       } else {
/*   */         gE.RV();
/*   */       } 
/*   */       gE = this.iz;
/*   */       R3 r3;
/*   */       this.iw0 = (int)(r3 = ((t90)pe).cacheText(gE, paramString, paramInt1, paramInt2)).e20;
/*   */       this.RA0 = (int)r3.Df0;
/*   */     } else {
/*   */       this.RA0 = ((t90)pe).getLineHeight();
/*   */     } 
/*   */     if (this.iz == null)
/*   */       this.iw0 = ((t90)pe).computeTextWidth(paramString, paramInt1, paramInt2); 
/*   */   }
/*   */   
/*   */   public final void LpT1() {
/*   */     if (this.Et0)
/*   */       return; 
/*   */     GE gE;
/*   */     if ((gE = this.iz) != null) {
/*   */       gE.RV();
/*   */       this.iz = null;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void xF0(Pj paramPj) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield NUl : Z
/*   */     //   4: ifeq -> 15
/*   */     //   7: aload_1
/*   */     //   8: getfield mV : Lf/Sa0;
/*   */     //   11: astore_2
/*   */     //   12: goto -> 20
/*   */     //   15: aload_1
/*   */     //   16: getfield Vx : Lf/Sa0;
/*   */     //   19: astore_2
/*   */     //   20: aload_0
/*   */     //   21: getfield iz : Lf/GE;
/*   */     //   24: dup
/*   */     //   25: astore_3
/*   */     //   26: ifnull -> 80
/*   */     //   29: aload_0
/*   */     //   30: getfield Oe : Lf/PS;
/*   */     //   33: getfield ZU : Lf/pe;
/*   */     //   36: aload_0
/*   */     //   37: dup
/*   */     //   38: getfield mx : I
/*   */     //   41: aload_1
/*   */     //   42: getfield Vm : I
/*   */     //   45: iadd
/*   */     //   46: istore_0
/*   */     //   47: getfield dF : I
/*   */     //   50: aload_1
/*   */     //   51: getfield nH : I
/*   */     //   54: iadd
/*   */     //   55: istore_1
/*   */     //   56: checkcast f/t90
/*   */     //   59: dup
/*   */     //   60: astore #4
/*   */     //   62: aload_3
/*   */     //   63: iload_1
/*   */     //   64: aload #4
/*   */     //   66: invokevirtual getBaseLine : ()I
/*   */     //   69: isub
/*   */     //   70: istore_1
/*   */     //   71: aload_2
/*   */     //   72: iload_0
/*   */     //   73: iload_1
/*   */     //   74: invokevirtual drawFromCache : (Lf/GE;Lf/fB0;II)V
/*   */     //   77: goto -> 148
/*   */     //   80: aload_0
/*   */     //   81: getfield Oe : Lf/PS;
/*   */     //   84: getfield ZU : Lf/pe;
/*   */     //   87: aload_0
/*   */     //   88: dup
/*   */     //   89: getfield mx : I
/*   */     //   92: aload_1
/*   */     //   93: getfield Vm : I
/*   */     //   96: iadd
/*   */     //   97: istore_3
/*   */     //   98: getfield dF : I
/*   */     //   101: aload_1
/*   */     //   102: getfield nH : I
/*   */     //   105: iadd
/*   */     //   106: istore_1
/*   */     //   107: checkcast f/t90
/*   */     //   110: dup
/*   */     //   111: astore #4
/*   */     //   113: aload_2
/*   */     //   114: aload_0
/*   */     //   115: dup
/*   */     //   116: dup
/*   */     //   117: iload_1
/*   */     //   118: aload #4
/*   */     //   120: invokevirtual getBaseLine : ()I
/*   */     //   123: isub
/*   */     //   124: istore_0
/*   */     //   125: getfield X20 : Ljava/lang/String;
/*   */     //   128: astore_1
/*   */     //   129: getfield Dx : I
/*   */     //   132: istore_2
/*   */     //   133: getfield Nh0 : I
/*   */     //   136: istore #4
/*   */     //   138: iload_3
/*   */     //   139: iload_0
/*   */     //   140: aload_1
/*   */     //   141: iload_2
/*   */     //   142: iload #4
/*   */     //   144: invokevirtual drawText : (Lf/fB0;IILjava/lang/CharSequence;II)I
/*   */     //   147: pop
/*   */     //   148: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 8
/*   */     //   #2	-> 21
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */