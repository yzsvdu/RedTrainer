/*  1 */ package f;public final class BS extends O0 { public int Hs0; public BS() { super((short)0, 0, (short)0, (short)0, true); this.Hs0 = 0; if (km.XU()) { this.gc = 25; this.x80 = 25;
/*  2 */       this.hC0
/*  3 */         .V1 = 2.0F;
/*  4 */       Xu("itemplate"); } else { this.gc = 12; this.x80 = 6; Xu("item-slot"); }
/*  5 */      } public final boolean i2(oa0 paramoa0) { if (B8.Wm0(paramoa0.cz0) && paramoa0.oO() && h1.J20(paramoa0.GG0, BM.bC)) { this.Tw0.run(); return true; }  return super.i2(paramoa0); } public final void qb0() { if (km.Nr()) { super.qb0(); } else { hm.Fz0(this.TG0.oh0); this.jl = 100; short s;
/*  6 */       if ((s = this.hC0) < 1) { s6(""); this
/*  7 */           .z4 = null; zn(); }
/*    */       else
/*  9 */       { LPT3 lPT3 = Of.eH.On0(s); if (this.op0 > -1)
/*    */         { String str;
/* 11 */           if ((str = this.op0 + "x " + Ml0.OH0(lPT3.Iu)).length() > 20) str = str.substring(0, 17) + "...";  s6(str); } else { s6(""); }
/*    */          }
/*    */        }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void LPt2(byte paramByte, short paramShort1, short paramShort2) {
/*    */     this.Hs0 = 0;
/*    */     super.LPt2(paramByte, paramShort1, paramShort2);
/*    */   }
/*    */   
/*    */   public final void Tm0(Y paramY) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ifnull -> 139
/*    */     //   4: aload_1
/*    */     //   5: getfield Bp0 : Lf/LPT3;
/*    */     //   8: dup
/*    */     //   9: astore_2
/*    */     //   10: ifnonnull -> 16
/*    */     //   13: goto -> 151
/*    */     //   16: aload_1
/*    */     //   17: getfield Lh : Lf/nH0;
/*    */     //   20: dup
/*    */     //   21: astore_3
/*    */     //   22: getfield Sf0 : S
/*    */     //   25: dup
/*    */     //   26: istore #4
/*    */     //   28: iconst_1
/*    */     //   29: if_icmple -> 109
/*    */     //   32: getstatic f/js.vu0 : Lf/js;
/*    */     //   35: ldc f/AD0
/*    */     //   37: invokestatic Bv0 : (Lf/JG0;Ljava/lang/Class;)Lf/JG0;
/*    */     //   40: checkcast f/AD0
/*    */     //   43: dup
/*    */     //   44: astore_3
/*    */     //   45: ifnull -> 56
/*    */     //   48: aload_3
/*    */     //   49: invokestatic c90 : (Lf/JG0;)Z
/*    */     //   52: pop
/*    */     //   53: goto -> 151
/*    */     //   56: aload_2
/*    */     //   57: getfield Iu : I
/*    */     //   60: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   63: sipush #8033
/*    */     //   66: swap
/*    */     //   67: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   70: astore_2
/*    */     //   71: new f/AD0
/*    */     //   74: dup
/*    */     //   75: astore_3
/*    */     //   76: aload_2
/*    */     //   77: iload #4
/*    */     //   79: new f/Wc0
/*    */     //   82: dup
/*    */     //   83: astore_2
/*    */     //   84: aload_0
/*    */     //   85: aload_1
/*    */     //   86: invokespecial <init> : (Lf/BS;Lf/Y;)V
/*    */     //   89: aload_2
/*    */     //   90: aconst_null
/*    */     //   91: invokespecial <init> : (Ljava/lang/String;ILf/q5;Lf/JG0;)V
/*    */     //   94: getstatic f/js.vu0 : Lf/js;
/*    */     //   97: dup
/*    */     //   98: aload_3
/*    */     //   99: swap
/*    */     //   100: invokevirtual Ub : ()I
/*    */     //   103: invokevirtual si : (Lf/JG0;I)V
/*    */     //   106: goto -> 151
/*    */     //   109: aload_0
/*    */     //   110: aload_1
/*    */     //   111: aload_0
/*    */     //   112: aload_3
/*    */     //   113: dup
/*    */     //   114: getfield p1 : S
/*    */     //   117: istore_0
/*    */     //   118: getfield Nj : B
/*    */     //   121: iload_0
/*    */     //   122: iload #4
/*    */     //   124: invokevirtual LPt2 : (BSS)V
/*    */     //   127: getfield Lh : Lf/nH0;
/*    */     //   130: getfield Wy : I
/*    */     //   133: putfield Hs0 : I
/*    */     //   136: goto -> 151
/*    */     //   139: aload_0
/*    */     //   140: dup
/*    */     //   141: iconst_0
/*    */     //   142: iconst_0
/*    */     //   143: iconst_0
/*    */     //   144: invokevirtual LPt2 : (BSS)V
/*    */     //   147: iconst_0
/*    */     //   148: putfield Hs0 : I
/*    */     //   151: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 5
/*    */     //   #2	-> 17
/*    */     //   #3	-> 22
/*    */     //   #4	-> 32
/*    */     //   #5	-> 35
/*    */     //   #6	-> 57
/*    */     //   #7	-> 67
/*    */     //   #8	-> 94
/*    */     //   #9	-> 100
/*    */     //   #10	-> 103
/*    */     //   #11	-> 114
/*    */     //   #12	-> 118
/*    */     //   #13	-> 124
/*    */     //   #14	-> 127
/*    */     //   #15	-> 130
/*    */     //   #16	-> 133
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     if (km.XU()) {
/*    */       uh0(300, 100);
/*    */       RI(300, 100);
/*    */       Tm(300, 100);
/*    */     } else {
/*    */       uh0(48, 48);
/*    */       RI(48, 48);
/*    */       Tm(48, 48);
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/BS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */