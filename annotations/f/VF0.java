/* 1 */ package f;public final class VF0 extends Qa0 implements r60 { public static final DecimalFormat Bx = new DecimalFormat("#0.00"); public final DateFormat gh0; public final pA BY; private void j0() { UA0 uA0; if ((uA0 = this.cF.tf0) != null)
/* 2 */       UB0.Kg0.fN(this);  } public Vq0 MR; public final HashMap GY; public jd cF; public VF0(pA parampA, byte paramByte, yX[] paramArrayOfyX) { // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: dup
/*   */     //   2: dup2
/*   */     //   3: dup2
/*   */     //   4: aload_1
/*   */     //   5: aload_0
/*   */     //   6: dup
/*   */     //   7: dup2
/*   */     //   8: invokestatic XU : ()Z
/*   */     //   11: iconst_1
/*   */     //   12: invokespecial <init> : (ZZ)V
/*   */     //   15: invokestatic i20 : ()Lf/cE;
/*   */     //   18: invokevirtual PH : ()Ljava/util/Locale;
/*   */     //   21: astore_1
/*   */     //   22: iconst_3
/*   */     //   23: iconst_3
/*   */     //   24: aload_1
/*   */     //   25: invokestatic getDateTimeInstance : (IILjava/util/Locale;)Ljava/text/DateFormat;
/*   */     //   28: putfield gh0 : Ljava/text/DateFormat;
/*   */     //   31: new f/Vq0
/*   */     //   34: dup
/*   */     //   35: invokespecial <init> : ()V
/*   */     //   38: putfield MR : Lf/Vq0;
/*   */     //   41: new java/util/HashMap
/*   */     //   44: dup
/*   */     //   45: invokespecial <init> : ()V
/*   */     //   48: putfield GY : Ljava/util/HashMap;
/*   */     //   51: putfield BY : Lf/pA;
/*   */     //   54: ldc 'matchmaking-stats-frame'
/*   */     //   56: invokevirtual Xu : (Ljava/lang/String;)V
/*   */     //   59: sipush #5670
/*   */     //   62: invokestatic OH0 : (I)Ljava/lang/String;
/*   */     //   65: invokevirtual Lo : (Ljava/lang/String;)V
/*   */     //   68: <illegal opcode> run : (Lf/VF0;)Ljava/lang/Runnable;
/*   */     //   73: invokevirtual TG0 : (Ljava/lang/Runnable;)V
/*   */     //   76: iconst_1
/*   */     //   77: invokevirtual EP : (I)V
/*   */     //   80: new java/util/ArrayList
/*   */     //   83: dup
/*   */     //   84: dup
/*   */     //   85: getstatic f/DO.hP : [Lf/DO;
/*   */     //   88: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
/*   */     //   91: invokespecial <init> : (Ljava/util/Collection;)V
/*   */     //   94: getstatic f/DO.cO : [Lf/DO;
/*   */     //   97: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
/*   */     //   100: invokevirtual addAll : (Ljava/util/Collection;)Z
/*   */     //   103: pop
/*   */     //   104: invokevirtual iterator : ()Ljava/util/Iterator;
/*   */     //   107: astore_1
/*   */     //   108: aload_1
/*   */     //   109: invokeinterface hasNext : ()Z
/*   */     //   114: ifeq -> 246
/*   */     //   117: aload_1
/*   */     //   118: invokeinterface next : ()Ljava/lang/Object;
/*   */     //   123: checkcast f/DO
/*   */     //   126: dup
/*   */     //   127: astore #4
/*   */     //   129: getstatic f/DO.u : Lf/DO;
/*   */     //   132: if_acmpne -> 152
/*   */     //   135: new f/ec0
/*   */     //   138: dup
/*   */     //   139: astore #5
/*   */     //   141: getstatic f/ky.ag0 : Lf/ky;
/*   */     //   144: aload #4
/*   */     //   146: invokespecial <init> : (Lf/ky;Lf/DO;)V
/*   */     //   149: goto -> 166
/*   */     //   152: new f/ec0
/*   */     //   155: dup
/*   */     //   156: astore #5
/*   */     //   158: getstatic f/ky.DL0 : Lf/ky;
/*   */     //   161: aload #4
/*   */     //   163: invokespecial <init> : (Lf/ky;Lf/DO;)V
/*   */     //   166: aload #4
/*   */     //   168: aload_0
/*   */     //   169: getfield MR : Lf/Vq0;
/*   */     //   172: aload #5
/*   */     //   174: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   177: aconst_null
/*   */     //   178: swap
/*   */     //   179: invokevirtual WS : (Lf/JG0;Ljava/lang/String;)Lf/Li0;
/*   */     //   182: dup
/*   */     //   183: astore #4
/*   */     //   185: aload_0
/*   */     //   186: new f/jd
/*   */     //   189: dup
/*   */     //   190: astore #6
/*   */     //   192: aload_0
/*   */     //   193: aload #6
/*   */     //   195: aload_0
/*   */     //   196: aload #4
/*   */     //   198: aload #5
/*   */     //   200: iload_2
/*   */     //   201: aload_3
/*   */     //   202: invokespecial <init> : (Lf/VF0;Lf/Li0;Lf/ec0;B[Lf/yX;)V
/*   */     //   205: getfield GY : Ljava/util/HashMap;
/*   */     //   208: aload #4
/*   */     //   210: aload #6
/*   */     //   212: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   215: pop
/*   */     //   216: aload #5
/*   */     //   218: aload #4
/*   */     //   220: <illegal opcode> run : (Lf/VF0;Lf/jd;Lf/ec0;Lf/Li0;)Ljava/lang/Runnable;
/*   */     //   225: invokevirtual jr0 : (Ljava/lang/Runnable;)V
/*   */     //   228: getstatic f/DO.fm0 : Lf/DO;
/*   */     //   231: if_acmpne -> 108
/*   */     //   234: aload_0
/*   */     //   235: getfield MR : Lf/Vq0;
/*   */     //   238: aload #4
/*   */     //   240: invokevirtual dA0 : (Lf/Li0;)V
/*   */     //   243: goto -> 108
/*   */     //   246: aload_0
/*   */     //   247: dup
/*   */     //   248: getfield MR : Lf/Vq0;
/*   */     //   251: invokevirtual J8 : (Lf/JG0;)V
/* 2 */     //   254: return } private void sF0(jd paramjd, ec0 paramec0, Li0 paramLi0) { this.cF = paramjd; paramjd.p2 = paramec0; if (paramLi0.EC0 == null) paramLi0.qs0(paramjd.sl());  } public final void yV(throws paramthrows) { super.yV(paramthrows); if (this.cF != null)
/*   */       UB0.Kg0.fN(this::j0);  }
/*   */   public final void mM() { if (km.XU())
/* 5 */     { SM(); Tm(this.Bo0.xY, this.Bo0.HC); } else { super.mM(); }  } public final boolean i2(oa0 paramoa0) { pA pA1; VF0 vF0; if (this.cF == null) return super.i2(paramoa0);  if (B8.Wm0(paramoa0.cz0) && paramoa0.oO()) { if (js.com3(this.BY)) return super.i2(paramoa0);  if (h1.J20(paramoa0.GG0, BM.lc) && !this.cF.VW.p3())
/*   */       
/* 7 */       { if ((vF0 = (pA1 = this.BY).L90) != null) { vF0
/* 8 */             .ra0(); this.L90 = null; }  return true; }  }
/* 9 */      return super.i2((oa0)vF0); }
/*   */ 
/*   */   
/*   */   public final void mR() {
/*   */     pA pA1;
/*   */     VF0 vF0;
/*   */     if ((vF0 = (pA1 = this.BY).L90) != null) {
/*   */       vF0.ra0();
/*   */       this.L90 = null;
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/VF0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */