/*  1 */ package f;public final class DU extends O0 { public final void LPt2(byte paramByte, short paramShort1, short paramShort2) { this.J4 = 0; super.LPt2(paramByte, paramShort1, paramShort2); wX wX1; if (this != (wX1 = this.ND).B4) {
/*    */       short s;
/*  3 */       if ((s = this.NF0.hC0) < 1) {
/*  4 */         hd((short)0); return;
/*    */       }  LPT3 lPT3;
/*  6 */       if (!(lPT3 = Of.eH.On0(s)).lF0() || lPT3
/*  7 */         .bj0 == 1446) {
/*    */         hd((short)0); return;
/*    */       } 
/* 10 */       hd(this.NF0.op0);
/*    */     }  }
/*    */ 
/*    */   
/*    */   public int J4 = 0;
/*    */   
/*    */   public DU(wX paramwX) {
/*    */     super((short)0, 0, (short)0, (short)0, bool);
/*    */     if (km.XU()) {
/*    */       this.gc = 25;
/*    */       this.x80 = 25;
/*    */       E20();
/*    */     } else {
/*    */       this.gc = 12;
/*    */       this.x80 = 6;
/*    */     } 
/*    */     Xu("item-slot");
/*    */   }
/*    */   
/*    */   public final void Tm0(Y paramY) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: getfield ND : Lf/wX;
/*    */     //   5: getfield B4 : Lf/DU;
/*    */     //   8: if_acmpne -> 12
/*    */     //   11: return
/*    */     //   12: aload_1
/*    */     //   13: ifnull -> 167
/*    */     //   16: aload_1
/*    */     //   17: getfield Bp0 : Lf/LPT3;
/*    */     //   20: dup
/*    */     //   21: astore_2
/*    */     //   22: ifnonnull -> 26
/*    */     //   25: return
/*    */     //   26: aload_2
/*    */     //   27: invokevirtual lF0 : ()Z
/*    */     //   30: ifne -> 46
/*    */     //   33: getstatic f/km.u4 : Lf/R8;
/*    */     //   36: sipush #8572
/*    */     //   39: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   42: invokevirtual Pq : (Ljava/lang/String;)V
/*    */     //   45: return
/*    */     //   46: aload_1
/*    */     //   47: getfield Lh : Lf/nH0;
/*    */     //   50: dup
/*    */     //   51: astore_3
/*    */     //   52: getfield Sf0 : S
/*    */     //   55: dup
/*    */     //   56: istore #4
/*    */     //   58: iconst_1
/*    */     //   59: if_icmple -> 137
/*    */     //   62: getstatic f/js.vu0 : Lf/js;
/*    */     //   65: ldc f/AD0
/*    */     //   67: invokestatic Bv0 : (Lf/JG0;Ljava/lang/Class;)Lf/JG0;
/*    */     //   70: checkcast f/AD0
/*    */     //   73: dup
/*    */     //   74: astore_3
/*    */     //   75: ifnull -> 84
/*    */     //   78: aload_3
/*    */     //   79: invokestatic c90 : (Lf/JG0;)Z
/*    */     //   82: pop
/*    */     //   83: return
/*    */     //   84: aload_2
/*    */     //   85: getfield Iu : I
/*    */     //   88: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   91: sipush #8575
/*    */     //   94: swap
/*    */     //   95: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   98: astore_2
/*    */     //   99: new f/AD0
/*    */     //   102: dup
/*    */     //   103: astore_3
/*    */     //   104: aload_2
/*    */     //   105: iload #4
/*    */     //   107: new f/Fj0
/*    */     //   110: dup
/*    */     //   111: astore_2
/*    */     //   112: aload_0
/*    */     //   113: aload_1
/*    */     //   114: invokespecial <init> : (Lf/DU;Lf/Y;)V
/*    */     //   117: aload_2
/*    */     //   118: aload_0
/*    */     //   119: invokespecial <init> : (Ljava/lang/String;ILf/q5;Lf/JG0;)V
/*    */     //   122: getstatic f/js.vu0 : Lf/js;
/*    */     //   125: dup
/*    */     //   126: aload_3
/*    */     //   127: swap
/*    */     //   128: invokevirtual Ub : ()I
/*    */     //   131: invokevirtual si : (Lf/JG0;I)V
/*    */     //   134: goto -> 179
/*    */     //   137: aload_0
/*    */     //   138: aload_1
/*    */     //   139: aload_0
/*    */     //   140: aload_3
/*    */     //   141: dup
/*    */     //   142: getfield p1 : S
/*    */     //   145: istore_0
/*    */     //   146: getfield Nj : B
/*    */     //   149: iload_0
/*    */     //   150: iload #4
/*    */     //   152: invokevirtual LPt2 : (BSS)V
/*    */     //   155: getfield Lh : Lf/nH0;
/*    */     //   158: getfield Wy : I
/*    */     //   161: putfield J4 : I
/*    */     //   164: goto -> 179
/*    */     //   167: aload_0
/*    */     //   168: dup
/*    */     //   169: iconst_0
/*    */     //   170: iconst_0
/*    */     //   171: iconst_0
/*    */     //   172: invokevirtual LPt2 : (BSS)V
/*    */     //   175: iconst_0
/*    */     //   176: putfield J4 : I
/*    */     //   179: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 5
/*    */     //   #2	-> 17
/*    */     //   #3	-> 27
/*    */     //   #4	-> 47
/*    */     //   #5	-> 52
/*    */     //   #6	-> 62
/*    */     //   #7	-> 65
/*    */     //   #8	-> 85
/*    */     //   #9	-> 95
/*    */     //   #10	-> 122
/*    */     //   #11	-> 128
/*    */     //   #12	-> 131
/*    */     //   #13	-> 142
/*    */     //   #14	-> 146
/*    */     //   #15	-> 152
/*    */     //   #16	-> 155
/*    */     //   #17	-> 158
/*    */     //   #18	-> 161
/*    */   }
/*    */   
/*    */   public final void EX(nY paramnY) {
/*    */     d40();
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     if (km.XU()) {
/*    */       uh0(100, 100);
/*    */       RI(100, 100);
/*    */       Tm(100, 100);
/*    */     } else {
/*    */       uh0(48, 48);
/*    */       RI(48, 48);
/*    */       Tm(48, 48);
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/DU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */