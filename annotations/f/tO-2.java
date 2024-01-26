/* 1 */ package f;public final class tO extends O0 { public final void LPt2(byte paramByte, short paramShort1, short paramShort2) { super.LPt2(paramByte, paramShort1, paramShort2); Hl0 hl0; tO tO1; if (this != (tO1 = (hl0 = this.Gj0).Bq0)) { paramShort1 = 0; paramShort2 = 1000; switch (this.Il0
/* 2 */         .hC0) { case 5491: paramShort1 = 5495; break;case 5490: paramShort1 = 5492; break;case 5489: paramShort1 = 5496; paramShort2 = 1350; break;case 5488: paramShort1 = 5497; break;case 5487: paramShort1 = 5498; break;case 5486: paramShort1 = 5494; paramShort2 = 1200; break;case 5485: paramShort1 = 5493; paramShort2 = 1350; break; }  if (paramShort1 < 1) { tO1
/* 3 */           .wI0(false); this.u1.wI0(false); this.Hs.wI0(false); this.SE.wI0(false); }
/*   */       else
/* 5 */       { LPT3 lPT3 = Of.eH.On0(paramShort1);
/* 6 */         short s = this.Il0.op0;
/* 7 */         this.Bq0.LPt2((byte)0, paramShort1, s); this.u1.E1(lPT3.X50());
/* 8 */         int i = paramShort2 * this.Il0.op0;
/* 9 */         this.Hs.E1(Ml0.Go(1926, NumberFormat.getInstance().format(paramShort2))); this.SE.E1(Ml0.Go(1925, NumberFormat.getInstance().format(i))); this.Bq0.wI0(true); this.u1.wI0(true); this.Hs.wI0(true); this.SE.wI0(true); }
/*   */        }
/*   */      }
/*   */ 
/*   */   
/*   */   public tO(Hl0 paramHl0) {
/*   */     super((short)0, 0, (short)0, (short)0, true);
/*   */     this.gc = 12;
/*   */     this.x80 = 6;
/*   */     Xu("item-slot");
/*   */   }
/*   */   
/*   */   public final void Tm0(Y paramY) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: dup
/*   */     //   2: getfield Gj0 : Lf/Hl0;
/*   */     //   5: getfield Bq0 : Lf/tO;
/*   */     //   8: if_acmpne -> 12
/*   */     //   11: return
/*   */     //   12: aload_1
/*   */     //   13: ifnull -> 155
/*   */     //   16: aload_1
/*   */     //   17: getfield Bp0 : Lf/LPT3;
/*   */     //   20: dup
/*   */     //   21: astore_2
/*   */     //   22: ifnonnull -> 26
/*   */     //   25: return
/*   */     //   26: aload_1
/*   */     //   27: getfield Lh : Lf/nH0;
/*   */     //   30: dup
/*   */     //   31: astore_3
/*   */     //   32: getfield Sf0 : S
/*   */     //   35: dup
/*   */     //   36: istore #4
/*   */     //   38: iconst_1
/*   */     //   39: if_icmple -> 117
/*   */     //   42: getstatic f/js.vu0 : Lf/js;
/*   */     //   45: ldc f/AD0
/*   */     //   47: invokestatic Bv0 : (Lf/JG0;Ljava/lang/Class;)Lf/JG0;
/*   */     //   50: checkcast f/AD0
/*   */     //   53: dup
/*   */     //   54: astore_3
/*   */     //   55: ifnull -> 64
/*   */     //   58: aload_3
/*   */     //   59: invokestatic c90 : (Lf/JG0;)Z
/*   */     //   62: pop
/*   */     //   63: return
/*   */     //   64: aload_2
/*   */     //   65: getfield Iu : I
/*   */     //   68: invokestatic OH0 : (I)Ljava/lang/String;
/*   */     //   71: sipush #8583
/*   */     //   74: swap
/*   */     //   75: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*   */     //   78: astore_2
/*   */     //   79: new f/AD0
/*   */     //   82: dup
/*   */     //   83: astore_3
/*   */     //   84: aload_2
/*   */     //   85: iload #4
/*   */     //   87: new f/pk0
/*   */     //   90: dup
/*   */     //   91: astore_2
/*   */     //   92: aload_0
/*   */     //   93: aload_1
/*   */     //   94: invokespecial <init> : (Lf/tO;Lf/Y;)V
/*   */     //   97: aload_2
/*   */     //   98: aconst_null
/*   */     //   99: invokespecial <init> : (Ljava/lang/String;ILf/q5;Lf/JG0;)V
/*   */     //   102: getstatic f/js.vu0 : Lf/js;
/*   */     //   105: dup
/*   */     //   106: aload_3
/*   */     //   107: swap
/*   */     //   108: invokevirtual Ub : ()I
/*   */     //   111: invokevirtual si : (Lf/JG0;I)V
/*   */     //   114: goto -> 162
/*   */     //   117: aload_0
/*   */     //   118: aload_1
/*   */     //   119: aload_0
/*   */     //   120: aload_3
/*   */     //   121: dup
/*   */     //   122: getfield p1 : S
/*   */     //   125: istore_0
/*   */     //   126: getfield Nj : B
/*   */     //   129: iload_0
/*   */     //   130: iload #4
/*   */     //   132: invokevirtual LPt2 : (BSS)V
/*   */     //   135: getfield Lh : Lf/nH0;
/*   */     //   138: getfield Wy : I
/*   */     //   141: pop
/*   */     //   142: getfield Gj0 : Lf/Hl0;
/*   */     //   145: getfield Mv0 : Lf/Un;
/*   */     //   148: invokestatic c90 : (Lf/JG0;)Z
/*   */     //   151: pop
/*   */     //   152: goto -> 162
/*   */     //   155: aload_0
/*   */     //   156: iconst_0
/*   */     //   157: iconst_0
/*   */     //   158: iconst_0
/*   */     //   159: invokevirtual LPt2 : (BSS)V
/*   */     //   162: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 17
/*   */     //   #2	-> 27
/*   */     //   #3	-> 32
/*   */     //   #4	-> 42
/*   */     //   #5	-> 45
/*   */     //   #6	-> 65
/*   */     //   #7	-> 75
/*   */     //   #8	-> 102
/*   */     //   #9	-> 108
/*   */     //   #10	-> 111
/*   */     //   #11	-> 122
/*   */     //   #12	-> 126
/*   */     //   #13	-> 132
/*   */     //   #14	-> 135
/*   */     //   #15	-> 138
/*   */     //   #16	-> 142
/*   */   }
/*   */   
/*   */   public final void EX(nY paramnY) {
/*   */     d40();
/*   */   }
/*   */   
/*   */   public final void d40() {
/*   */     uh0(48, 48);
/*   */     RI(48, 48);
/*   */     Tm(48, 48);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/tO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */