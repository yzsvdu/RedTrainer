/*  1 */ package f;public final class OX implements Runnable { private void LPT5(Y paramY, int paramInt) { if (pA.Dg0
/*  2 */       .WH != null)
/*    */     { SE0[] arrayOfSE0; String[] arrayOfString;
/*  4 */       (arrayOfString = new String[2])[0] = paramY.JG0(); (new String[2])[1] = (paramInt + 1) + "";
/*  5 */       js.vu0.Pu(-1, Ml0.sB(1415, arrayOfString));
/*    */       
/*  7 */       xJ0 xJ0 = pA.Dg0.WH;
/*    */       
/*  9 */       short s = paramY.Lh.p1;
/* 10 */       int i = paramY.Lh.Wy; if (paramInt >= 0) { if (paramInt < (
/* 11 */           arrayOfSE0 = xJ0.sN).length)
/* 12 */           arrayOfSE0[paramInt]
/* 13 */             .Kh(i, s, true);  } else { arrayOfSE0
/* 14 */           .getClass(); }  }  this.qs.VJ(paramY); }
/*    */ 
/*    */   
/*    */   public OX(ck paramck, Y paramY) {}
/*    */   
/*    */   public final void run() {
/*    */     // Byte code:
/*    */     //   0: new f/B3
/*    */     //   3: dup
/*    */     //   4: astore_1
/*    */     //   5: invokespecial <init> : ()V
/*    */     //   8: iconst_0
/*    */     //   9: istore_2
/*    */     //   10: iload_2
/*    */     //   11: bipush #9
/*    */     //   13: if_icmpge -> 85
/*    */     //   16: aload_1
/*    */     //   17: new f/Hk0
/*    */     //   20: dup
/*    */     //   21: astore_3
/*    */     //   22: aload_0
/*    */     //   23: dup
/*    */     //   24: aload_3
/*    */     //   25: new java/lang/StringBuilder
/*    */     //   28: dup
/*    */     //   29: invokespecial <init> : ()V
/*    */     //   32: iload_2
/*    */     //   33: iconst_1
/*    */     //   34: iadd
/*    */     //   35: dup
/*    */     //   36: istore #4
/*    */     //   38: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   41: ldc ''
/*    */     //   43: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   46: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   49: sipush #1413
/*    */     //   52: swap
/*    */     //   53: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   56: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   59: getfield SR : Lf/Y;
/*    */     //   62: iload_2
/*    */     //   63: <illegal opcode> run : (Lf/OX;Lf/Y;I)Ljava/lang/Runnable;
/*    */     //   68: putfield rv : Ljava/lang/Runnable;
/*    */     //   71: getfield aV : Ljava/util/ArrayList;
/*    */     //   74: aload_3
/*    */     //   75: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   78: pop
/*    */     //   79: iload #4
/*    */     //   81: istore_2
/*    */     //   82: goto -> 10
/*    */     //   85: aload_1
/*    */     //   86: aload_0
/*    */     //   87: getfield qs : Lf/ck;
/*    */     //   90: getfield Lg0 : Lf/Un;
/*    */     //   93: invokestatic Yo : (Lf/B3;Lf/JG0;)Lf/F7;
/*    */     //   96: pop
/*    */     //   97: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 68
/*    */     //   #2	-> 71
/*    */     //   #3	-> 87
/*    */     //   #4	-> 90
/*    */     //   #5	-> 93
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/OX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */