/*  1 */ package f;public final class lPT1 extends Kl0 { public final void sM() { boolean bool; if (R00() == 1) { bool = true; } else { bool = false; }  this.RZ = bool; if (bool) {
/*  2 */       au(); (r8()).sE.getClass();
/*  3 */       this
/*  4 */         .Ws.get();
/*  5 */       (r8()).sE.getClass();
/*  6 */       (r8()).sE
/*    */         
/*  8 */         .Pd0 = this.Ws.getInt();
/*    */       
/* 10 */       (r8()).sE
/*    */         
/* 12 */         .TF0 = this.Ws.getInt();
/*    */       
/* 14 */       (r8()).sE
/*    */         
/* 16 */         .My = this.Ws.getInt();
/*    */       
/* 18 */       this.Gn = this.Ws.getInt();
/*    */       
/* 20 */       this.P8 = this.Ws.getInt();
/*    */     }  }
/*    */ 
/*    */   
/*    */   public boolean RZ;
/*    */   public int Gn;
/*    */   public int P8;
/*    */   
/*    */   public lPT1(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   static {
/*    */     C00.gd(lPT1.class);
/*    */   }
/*    */   
/*    */   public final void Dl0() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield RZ : Z
/*    */     //   4: ifeq -> 113
/*    */     //   7: aload_0
/*    */     //   8: getfield d : Lf/LPt3;
/*    */     //   11: checkcast f/c4
/*    */     //   14: dup
/*    */     //   15: astore_1
/*    */     //   16: getfield VL0 : I
/*    */     //   19: iconst_2
/*    */     //   20: if_icmpne -> 41
/*    */     //   23: aload_0
/*    */     //   24: aload_1
/*    */     //   25: iconst_3
/*    */     //   26: putfield VL0 : I
/*    */     //   29: new f/u3
/*    */     //   32: dup
/*    */     //   33: astore_1
/*    */     //   34: invokespecial <init> : ()V
/*    */     //   37: aload_1
/*    */     //   38: invokevirtual dr0 : (Lf/Bi;)V
/*    */     //   41: aload_0
/*    */     //   42: invokevirtual r8 : ()Lf/ro;
/*    */     //   45: aload_0
/*    */     //   46: dup
/*    */     //   47: getfield Gn : I
/*    */     //   50: istore_0
/*    */     //   51: getfield P8 : I
/*    */     //   54: istore_1
/*    */     //   55: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   58: pop
/*    */     //   59: getstatic f/A1.L7 : Lf/A1;
/*    */     //   62: new f/Ia0
/*    */     //   65: dup
/*    */     //   66: invokespecial <init> : ()V
/*    */     //   69: sipush #4000
/*    */     //   72: invokestatic qX : (I)I
/*    */     //   75: ldc 45000
/*    */     //   77: iadd
/*    */     //   78: i2l
/*    */     //   79: invokevirtual ac0 : (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
/*    */     //   82: pop
/*    */     //   83: getstatic f/L70.gq : Lf/L70;
/*    */     //   86: dup
/*    */     //   87: dup
/*    */     //   88: iload_0
/*    */     //   89: invokestatic currentTimeMillis : ()J
/*    */     //   92: ldc2_w 1000
/*    */     //   95: ldiv
/*    */     //   96: l2i
/*    */     //   97: iload_1
/*    */     //   98: isub
/*    */     //   99: istore_0
/*    */     //   100: putfield Vo0 : I
/*    */     //   103: iload_0
/*    */     //   104: putfield wU : I
/*    */     //   107: invokevirtual run : ()V
/*    */     //   110: goto -> 123
/*    */     //   113: aload_0
/*    */     //   114: getfield d : Lf/LPt3;
/*    */     //   117: checkcast f/c4
/*    */     //   120: invokevirtual Sa : ()V
/*    */     //   123: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 8
/*    */     //   #2	-> 11
/*    */     //   #3	-> 16
/*    */     //   #4	-> 26
/*    */     //   #5	-> 29
/*    */     //   #6	-> 59
/*    */     //   #7	-> 62
/*    */     //   #8	-> 83
/*    */     //   #9	-> 89
/*    */     //   #10	-> 100
/*    */     //   #11	-> 104
/*    */     //   #12	-> 114
/*    */     //   #13	-> 117
/*    */   }
/*    */   
/*    */   public final void Cx() {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/lPT1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */