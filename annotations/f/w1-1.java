/* 1 */ package f;public final class w1 implements MQ, Runnable { public final void Ge(int paramInt1, int paramInt2) { int i = paramInt2 - paramInt1 + 1; Ga ga; int j; this.RF
/* 2 */       .nN = (j = (ga = this.RF).nN) + i; int k;
/* 3 */     if ((k = this.RF.Zb0) >= paramInt1 && j >= this
/* 4 */       .y00.length) hq(k += i); 
/* 5 */     if ((j = this.go) >= paramInt1) { i = j + i;
/* 6 */       RJ rJ = RJ.EH; zy0(i, false, rJ); }  if (paramInt1 <= this
/* 7 */       .Zb0 + this
/* 8 */       .y00.length - 1 && paramInt2 >= k) this
/* 9 */         .Pe = true;  }
/*   */ 
/*   */   
/*   */   public w1(Ga paramGa) {}
/*   */   
/*   */   public final void AE(int paramInt1, int paramInt2) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield RF : Lf/Ga;
/*   */     //   4: dup
/*   */     //   5: dup2
/*   */     //   6: astore_0
/*   */     //   7: iload_2
/*   */     //   8: iload_1
/*   */     //   9: isub
/*   */     //   10: iconst_1
/*   */     //   11: iadd
/*   */     //   12: istore_3
/*   */     //   13: getfield nN : I
/*   */     //   16: iload_3
/*   */     //   17: isub
/*   */     //   18: putfield nN : I
/*   */     //   21: getfield Zb0 : I
/*   */     //   24: dup
/*   */     //   25: istore #4
/*   */     //   27: iload_2
/*   */     //   28: iload #4
/*   */     //   30: aload_0
/*   */     //   31: getfield y00 : [Lf/x9;
/*   */     //   34: arraylength
/*   */     //   35: iadd
/*   */     //   36: iconst_1
/*   */     //   37: isub
/*   */     //   38: istore #5
/*   */     //   40: if_icmple -> 54
/*   */     //   43: aload_0
/*   */     //   44: iload #4
/*   */     //   46: iload_3
/*   */     //   47: isub
/*   */     //   48: invokevirtual hq : (I)V
/*   */     //   51: goto -> 71
/*   */     //   54: iload #4
/*   */     //   56: iload_2
/*   */     //   57: if_icmpgt -> 71
/*   */     //   60: iload #5
/*   */     //   62: iload_1
/*   */     //   63: if_icmplt -> 71
/*   */     //   66: aload_0
/*   */     //   67: iload_1
/*   */     //   68: invokevirtual hq : (I)V
/*   */     //   71: aload_0
/*   */     //   72: getfield go : I
/*   */     //   75: dup
/*   */     //   76: istore #4
/*   */     //   78: iload_2
/*   */     //   79: if_icmple -> 101
/*   */     //   82: aload_0
/*   */     //   83: iload #4
/*   */     //   85: iload_3
/*   */     //   86: isub
/*   */     //   87: istore_0
/*   */     //   88: getstatic f/RJ.EH : Lf/RJ;
/*   */     //   91: astore_1
/*   */     //   92: iload_0
/*   */     //   93: iconst_0
/*   */     //   94: aload_1
/*   */     //   95: invokevirtual zy0 : (IZLf/RJ;)V
/*   */     //   98: goto -> 124
/*   */     //   101: iload #4
/*   */     //   103: iload_1
/*   */     //   104: if_icmplt -> 124
/*   */     //   107: iload #4
/*   */     //   109: iload_2
/*   */     //   110: if_icmpgt -> 124
/*   */     //   113: aload_0
/*   */     //   114: getstatic f/RJ.EH : Lf/RJ;
/*   */     //   117: astore_0
/*   */     //   118: iconst_m1
/*   */     //   119: iconst_0
/*   */     //   120: aload_0
/*   */     //   121: invokevirtual zy0 : (IZLf/RJ;)V
/*   */     //   124: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 13
/*   */     //   #2	-> 18
/*   */     //   #3	-> 21
/*   */     //   #4	-> 31
/*   */     //   #5	-> 48
/*   */     //   #6	-> 72
/*   */     //   #7	-> 88
/*   */   }
/*   */   
/*   */   public final void kR() {
/*   */     boolean bool;
/*   */     Ga ga;
/*   */     cQ cQ;
/*   */     if ((cQ = (ga = this.RF).my) != null) {
/*   */       bool = cQ.pu();
/*   */     } else {
/*   */       bool = false;
/*   */     } 
/*   */     this.nN = bool;
/*   */     RJ rJ = RJ.EH;
/*   */     zy0(-1, false, this);
/*   */     hq(0);
/*   */     this.Pe = true;
/*   */   }
/*   */   
/*   */   public final void run() {
/*   */     Ga ga;
/*   */     this.RF.hq((ga = this.RF).qz0.Ny0 * this.rI0);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/w1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */