/*  1 */ package f;public final class Ec0 extends GS implements Np0 { private void Gj0(kf paramkf, hm0 paramhm0) { Wl wl; if ((wl = km.wI0.K7) != null) { if (this
/*  2 */         .He) {
/*    */         LV lV;
/*  4 */         this((byte)0, O5.AU.xa(paramhm0, (short)366));
/*  5 */         paramkf.YP
/*  6 */           .add(lV);
/*    */       } 
/*  8 */       (paramkf.AD.a0(this.dv0))
/*  9 */         .h30 = this.OF0;
/* 10 */       wl.yw0(this.dv0, (short)366);
/* 11 */       paramkf.AD
/* 12 */         .Bn(paramkf, this.dv0); }
/*    */      }
/*    */ 
/*    */   
/*    */   public final byte dv0;
/*    */   public final byte so0;
/*    */   public final byte OF0;
/*    */   public final boolean He;
/*    */   
/*    */   public Ec0(byte paramByte1, byte paramByte2, byte paramByte3, boolean paramBoolean) {
/*    */     this.dv0 = paramByte1;
/*    */     this.so0 = paramByte2;
/*    */     this.OF0 = paramByte3;
/*    */     this.He = paramBoolean;
/*    */   }
/*    */   
/*    */   private void PQ(kf paramkf) {
/*    */     Wl wl;
/*    */     if ((wl = km.wI0.K7) != null) {
/*    */       (paramkf.AD.a0(this.dv0)).h30 = 0;
/*    */       wl.qg0(this.dv0, (short)366);
/*    */       paramkf.AD.Bn(paramkf, this.dv0);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final byte YG0() {
/*    */     return -29;
/*    */   }
/*    */   
/*    */   public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield so0 : B
/*    */     //   4: dup
/*    */     //   5: istore_1
/*    */     //   6: ifne -> 85
/*    */     //   9: aload_0
/*    */     //   10: getstatic f/F40.ef0 : Lf/F40;
/*    */     //   13: bipush #15
/*    */     //   15: aload #7
/*    */     //   17: getfield AD : Lf/Gp0;
/*    */     //   20: aload_0
/*    */     //   21: getfield dv0 : B
/*    */     //   24: sipush #140
/*    */     //   27: swap
/*    */     //   28: invokevirtual iD : (IB)I
/*    */     //   31: invokestatic Qf0 : (Lf/F40;II)Ljava/lang/String;
/*    */     //   34: astore_1
/*    */     //   35: getfield He : Z
/*    */     //   38: ifeq -> 65
/*    */     //   41: aload_2
/*    */     //   42: ifnull -> 65
/*    */     //   45: aload #7
/*    */     //   47: aload_0
/*    */     //   48: aload #7
/*    */     //   50: aload_2
/*    */     //   51: invokevirtual hT : (Lf/kf;Lf/hm0;)Ljava/lang/Runnable;
/*    */     //   54: astore_0
/*    */     //   55: aload_1
/*    */     //   56: ldc ''
/*    */     //   58: aload_0
/*    */     //   59: invokevirtual r00 : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V
/*    */     //   62: goto -> 133
/*    */     //   65: aload #7
/*    */     //   67: aload_0
/*    */     //   68: aload #7
/*    */     //   70: aload_2
/*    */     //   71: invokevirtual hT : (Lf/kf;Lf/hm0;)Ljava/lang/Runnable;
/*    */     //   74: astore_0
/*    */     //   75: aload_1
/*    */     //   76: ldc ''
/*    */     //   78: aload_0
/*    */     //   79: invokevirtual RV : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V
/*    */     //   82: goto -> 133
/*    */     //   85: iload_1
/*    */     //   86: iconst_1
/*    */     //   87: if_icmpne -> 133
/*    */     //   90: aload #7
/*    */     //   92: aload_0
/*    */     //   93: aload #7
/*    */     //   95: getstatic f/F40.ef0 : Lf/F40;
/*    */     //   98: bipush #15
/*    */     //   100: aload #7
/*    */     //   102: getfield AD : Lf/Gp0;
/*    */     //   105: aload_0
/*    */     //   106: getfield dv0 : B
/*    */     //   109: sipush #142
/*    */     //   112: swap
/*    */     //   113: invokevirtual iD : (IB)I
/*    */     //   116: invokestatic Qf0 : (Lf/F40;II)Ljava/lang/String;
/*    */     //   119: astore_0
/*    */     //   120: <illegal opcode> run : (Lf/Ec0;Lf/kf;)Ljava/lang/Runnable;
/*    */     //   125: astore_1
/*    */     //   126: aload_0
/*    */     //   127: ldc ''
/*    */     //   129: aload_1
/*    */     //   130: invokevirtual RV : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V
/*    */     //   133: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 17
/*    */     //   #2	-> 21
/*    */     //   #3	-> 56
/*    */     //   #4	-> 71
/*    */     //   #5	-> 76
/*    */     //   #6	-> 95
/*    */     //   #7	-> 102
/*    */     //   #8	-> 106
/*    */     //   #9	-> 127
/*    */   }
/*    */   
/*    */   public final boolean Lt() {
/*    */     return this.He ? true : super.Lt();
/*    */   }
/*    */   
/*    */   public final Runnable hT(kf paramkf, hm0 paramhm0) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: aload_2
/*    */     //   3: <illegal opcode> run : (Lf/Ec0;Lf/kf;Lf/hm0;)Ljava/lang/Runnable;
/*    */     //   8: areturn
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ec0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */