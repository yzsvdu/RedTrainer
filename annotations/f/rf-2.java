/*  1 */ package f;public final class rf extends Ab0 { public final Pd EI0; public KI0 hm; public KI0 Ys0; public float Nul; public KI0 b5; public float Vo; public float ny0; public boolean Mq; public boolean Xu0; public rf(Tb paramTb) { super(paramTb); Pd pd; this(); this.EI0 = this; this.Xu0 = false; } public final void xH(float paramFloat) { this.Vo = f; KI0 kI02; float f; if ((kI02 = this.b5) != null && (f = this.Vo + paramFloat) >= this.ny0) { for (Hc0 hc0 = kI02.fu0.Jg.r30(); hc0.hasNext(); ((Kj0)hc0.next()).WW.L = false); this
/*  2 */         .Xu0 = true; this.EI0.free(this.b5); this.b5 = null; }  if (this.Xu0) { this.e7.o6(); this.Xu0 = false; }  int j; if ((kI02 = this.hm) == null || (j = kI02.lV) == 0 || kI02.fu0 == null) return;  if (j != 0)
/*  3 */     { paramFloat = kI02.nS * paramFloat; if (!nx0.is(kI02.QK)) { int m; float f1 = kI02.lk + paramFloat; if (kI02.nS < 0.0F) { float f2; m = (int)Math.abs(((f2 = kI02.QK) - f1) / f2); f2 = Math.abs(((f2 = kI02.QK) - f1) % kI02.QK); kI02.lk = kI02.QK - f2; } else { m = (int)Math.abs(m / kI02.QK); kI02.lk = Math.abs(kI02.lk % kI02.QK); }  } else { j = 1; }  int k = 0; while (true) { if (k < j) { int m; if ((m = kI02.lV) > 0) kI02.lV = m - 1;  J3 j3; if (kI02.lV != 0 && (j3 = kI02.R4) != null) j3.Od0();  if (kI02.lV == 0) { float f3, f2 = (j - 1 - k) * (paramFloat = kI02.QK); if ((k = paramFloat cmp 0.0F) < 0) { f3 = paramFloat - kI02.lk; } else { f3 = kI02.lk; }  f2 += f3; if (k < 0) paramFloat = 0.0F;  kI02.lk = paramFloat; J3 j31; if ((j31 = kI02.R4) != null) j31.ev();  float f1 = f2; break; }  k++; continue; }  paramFloat = -1.0F; break; }  }  int i; KI0 kI03; if ((i = paramFloat cmp 0.0F) >= 0 && (
/*  4 */       kI03 = this.Ys0) != null) { zm0(kI03, this.Nul); this.Ys0 = null; if (i > 0) xH(paramFloat);  return; }  KI0 kI01; if ((kI01 = this.b5) != null) { d4 d41 = kI01.fu0; float f1 = kI01.Fk0 + kI01.lk, f2 = kI03.Fk0 + kI03.lk, f3 = this.Vo / this.ny0; d4 d42; if ((d42 = (kI03 = this.hm).fu0) == null || f3 == 0.0F)
/*    */       
/*    */       { 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 17 */         if (!this.rC) { Ab0.Dl(null, null, 1.0F, d41, f1); this.e7.o6(); } else { throw new JU("Call end() first"); }  return; }  if (d41 == null || f3 == 1.0F) { if (!this.rC) { Ab0.Dl(null, null, 1.0F, d42, f2); this.e7.o6(); } else { throw new JU("Call end() first"); }  return; }  boolean bool; if (!(bool = this.rC)) { if (!bool) { this.rC = true; float f4 = 1.0F; f7 f7; Ab0.Dl(f7 = Ab0.Da, this.Lpt4, f4, d41, f1); if (this.rC) { Ab0.Dl(f7, this.Lpt4, f3, d42, f2); if (this.rC) { oc oc; (oc = f7.sh()).getClass(); while (oc.hasNext()) { yO yO; AL aL = (AL)(yO = oc.next()).mm; eo eo1 = aL.gp; TG0 tG0 = aL.Ca0; eo eo2 = aL.fc; ((zP)(oc.next()).Lb).Bf0.mT(eo1, tG0, eo2); this.Lpt4.free(yO.mm); }  Ab0.Da.t9(); this.e7.o6(); this.rC = false; } else { throw new JU("You must call begin() first"); }  } else { throw new JU("You must call begin() before adding an animation"); }  } else { throw new JU("You must call end() after each call to being()"); }  } else { throw new JU("Call end() first"); }  }
/* 18 */     else { d4 d4 = (kI01 = this.hm).fu0; float f1 = this.hm.Fk0 + kI01.lk;
/* 19 */       if (!this.rC) { Ab0.Dl(null, null, 1.0F, d4, f1); this.e7.o6(); return; }  throw new JU("Call end() first"); }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void zm0(KI0 paramKI0, float paramFloat) {
/*    */     KI0 kI0;
/*    */     if ((kI0 = this.hm) == null || kI0.lV == 0) {
/*    */       this.hm = paramKI0;
/*    */       return;
/*    */     } 
/*    */     if (!this.Mq && paramKI0 != null && kI0.fu0 == paramKI0.fu0) {
/*    */       paramKI0.lk = kI0.lk;
/*    */       this.EI0.free(kI0);
/*    */       this.hm = paramKI0;
/*    */     } else {
/*    */       if ((kI0 = this.b5) != null) {
/*    */         for (Hc0 hc0 = kI0.fu0.Jg.r30(); hc0.hasNext(); ((Kj0)hc0.next()).WW.L = false);
/*    */         this.EI0.free(this.b5);
/*    */       } 
/*    */       this.b5 = this.hm;
/*    */       this.hm = paramKI0;
/*    */       this.Vo = 0.0F;
/*    */       this.ny0 = paramFloat;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final KI0 lY(String paramString, int paramInt, float paramFloat, J3 paramJ3) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: fconst_0
/*    */     //   2: fstore #5
/*    */     //   4: ifnonnull -> 9
/*    */     //   7: aconst_null
/*    */     //   8: areturn
/*    */     //   9: aload_0
/*    */     //   10: getfield e7 : Lf/Tb;
/*    */     //   13: dup
/*    */     //   14: astore #6
/*    */     //   16: getfield Ly : Lf/fQ;
/*    */     //   19: getfield Z8 : I
/*    */     //   22: istore #7
/*    */     //   24: iconst_0
/*    */     //   25: istore #8
/*    */     //   27: iload #8
/*    */     //   29: iload #7
/*    */     //   31: if_icmpge -> 69
/*    */     //   34: aload #6
/*    */     //   36: getfield Ly : Lf/fQ;
/*    */     //   39: iload #8
/*    */     //   41: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   44: checkcast f/d4
/*    */     //   47: dup
/*    */     //   48: astore #9
/*    */     //   50: getfield Ge : Ljava/lang/String;
/*    */     //   53: aload_1
/*    */     //   54: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   57: ifeq -> 63
/*    */     //   60: goto -> 72
/*    */     //   63: iinc #8, 1
/*    */     //   66: goto -> 27
/*    */     //   69: aconst_null
/*    */     //   70: astore #9
/*    */     //   72: aload #9
/*    */     //   74: ifnull -> 148
/*    */     //   77: fload_3
/*    */     //   78: aload_0
/*    */     //   79: getfield EI0 : Lf/Pd;
/*    */     //   82: invokevirtual obtain : ()Ljava/lang/Object;
/*    */     //   85: checkcast f/KI0
/*    */     //   88: dup
/*    */     //   89: astore_0
/*    */     //   90: aload #9
/*    */     //   92: aload_0
/*    */     //   93: fload #5
/*    */     //   95: aload_0
/*    */     //   96: fload_3
/*    */     //   97: aload_0
/*    */     //   98: iload_2
/*    */     //   99: aload_0
/*    */     //   100: aload #4
/*    */     //   102: aload_0
/*    */     //   103: aload #9
/*    */     //   105: putfield fu0 : Lf/d4;
/*    */     //   108: putfield R4 : Lf/J3;
/*    */     //   111: putfield lV : I
/*    */     //   114: putfield nS : F
/*    */     //   117: putfield Fk0 : F
/*    */     //   120: getfield Cd0 : F
/*    */     //   123: fload #5
/*    */     //   125: fsub
/*    */     //   126: dup
/*    */     //   127: fstore_1
/*    */     //   128: putfield QK : F
/*    */     //   131: fconst_0
/*    */     //   132: fcmpg
/*    */     //   133: ifge -> 139
/*    */     //   136: goto -> 141
/*    */     //   139: fconst_0
/*    */     //   140: fstore_1
/*    */     //   141: aload_0
/*    */     //   142: dup
/*    */     //   143: fload_1
/*    */     //   144: putfield lk : F
/*    */     //   147: areturn
/*    */     //   148: new f/JU
/*    */     //   151: dup
/*    */     //   152: ldc_w 'Unknown animation: '
/*    */     //   155: aload_1
/*    */     //   156: invokestatic tF0 : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   159: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   162: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 16
/*    */     //   #2	-> 19
/*    */     //   #3	-> 79
/*    */     //   #4	-> 148
/*    */     //   #5	-> 152
/*    */     //   #6	-> 159
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/rf.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */