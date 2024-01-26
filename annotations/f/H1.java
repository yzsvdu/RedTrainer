/*  1 */ package f;public final class H1 implements con { public final void ng(Object paramObject, int paramInt, float[] paramArrayOffloat) { float f2; eF0 eF0 = (eF0)paramObject; switch (paramInt) { default: if (!pD0)
/*    */         {
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
/*    */ 
/*    */           
/* 25 */           throw new AssertionError();
/*    */         }
/*    */         return;
/*    */       case 8:
/*    */         this.As0.a = paramArrayOffloat[0];
/*    */         return;
/*    */       case 7:
/*    */         f1 = paramArrayOffloat[0];
/*    */         if (this.Bz != f1)
/*    */           this.Bz = f1; 
/*    */         return;
/*    */       case 6:
/*    */         f1 = paramArrayOffloat[0];
/*    */         f2 = paramArrayOffloat[1];
/*    */         if (this.kq != f1 || this.DG != f2) {
/*    */           this.kq = f1;
/*    */           this.DG = f2;
/*    */           return;
/*    */         } 
/*    */         return;
/*    */       case 5:
/*    */         f2 = paramArrayOffloat[0];
/*    */         if (this.kq != (f1 = this.kq) || this.DG != f2) {
/*    */           this.kq = f1;
/*    */           this.DG = f2;
/*    */           return;
/*    */         } 
/*    */         return;
/*    */       case 4:
/*    */         f1 = paramArrayOffloat[0];
/*    */         f2 = this.DG;
/*    */         if (this.kq != f1 || f2 != f2) {
/*    */           this.kq = f1;
/*    */           this.DG = f2;
/*    */           return;
/*    */         } 
/*    */         return;
/*    */       case 3:
/*    */         f1 = paramArrayOffloat[0];
/*    */         if (this.bs != f1)
/*    */           this.bs = f1; 
/*    */         f1 = paramArrayOffloat[1];
/*    */         if (this.kl != f1) {
/*    */           this.kl = f1;
/*    */           return;
/*    */         } 
/*    */         return;
/*    */       case 2:
/*    */         f1 = paramArrayOffloat[0];
/*    */         if (this.kl != f1) {
/*    */           this.kl = f1;
/*    */           return;
/*    */         } 
/*    */         return;
/*    */       case 1:
/*    */         break; }
/*    */     
/*    */     float f1 = paramArrayOffloat[0];
/*    */     if (this.bs != f1)
/*    */       this.bs = f1;  }
/*    */ 
/*    */   
/*    */   public final int Uu0(Object paramObject, int paramInt, float[] paramArrayOffloat) {
/*    */     // Byte code:
/*    */     //   0: iload_2
/*    */     //   1: aload_1
/*    */     //   2: checkcast f/eF0
/*    */     //   5: astore_0
/*    */     //   6: tableswitch default -> 52, 1 -> 173, 2 -> 160, 3 -> 139, 4 -> 126, 5 -> 113, 6 -> 92, 7 -> 79, 8 -> 63
/*    */     //   52: getstatic f/H1.pD0 : Z
/*    */     //   55: ifeq -> 185
/*    */     //   58: iconst_0
/*    */     //   59: istore_0
/*    */     //   60: goto -> 183
/*    */     //   63: aload_3
/*    */     //   64: aload_0
/*    */     //   65: getfield As0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   68: getfield a : F
/*    */     //   71: iconst_0
/*    */     //   72: swap
/*    */     //   73: fastore
/*    */     //   74: iconst_1
/*    */     //   75: istore_0
/*    */     //   76: goto -> 183
/*    */     //   79: aload_3
/*    */     //   80: aload_0
/*    */     //   81: getfield Bz : F
/*    */     //   84: iconst_0
/*    */     //   85: swap
/*    */     //   86: fastore
/*    */     //   87: iconst_1
/*    */     //   88: istore_0
/*    */     //   89: goto -> 183
/*    */     //   92: aload_3
/*    */     //   93: aload_0
/*    */     //   94: aload_3
/*    */     //   95: aload_0
/*    */     //   96: getfield kq : F
/*    */     //   99: iconst_0
/*    */     //   100: swap
/*    */     //   101: fastore
/*    */     //   102: getfield DG : F
/*    */     //   105: iconst_1
/*    */     //   106: swap
/*    */     //   107: fastore
/*    */     //   108: iconst_2
/*    */     //   109: istore_0
/*    */     //   110: goto -> 183
/*    */     //   113: aload_3
/*    */     //   114: aload_0
/*    */     //   115: getfield DG : F
/*    */     //   118: iconst_0
/*    */     //   119: swap
/*    */     //   120: fastore
/*    */     //   121: iconst_1
/*    */     //   122: istore_0
/*    */     //   123: goto -> 183
/*    */     //   126: aload_3
/*    */     //   127: aload_0
/*    */     //   128: getfield kq : F
/*    */     //   131: iconst_0
/*    */     //   132: swap
/*    */     //   133: fastore
/*    */     //   134: iconst_1
/*    */     //   135: istore_0
/*    */     //   136: goto -> 183
/*    */     //   139: aload_3
/*    */     //   140: aload_0
/*    */     //   141: aload_3
/*    */     //   142: aload_0
/*    */     //   143: getfield bs : F
/*    */     //   146: iconst_0
/*    */     //   147: swap
/*    */     //   148: fastore
/*    */     //   149: getfield kl : F
/*    */     //   152: iconst_1
/*    */     //   153: swap
/*    */     //   154: fastore
/*    */     //   155: iconst_2
/*    */     //   156: istore_0
/*    */     //   157: goto -> 183
/*    */     //   160: aload_3
/*    */     //   161: aload_0
/*    */     //   162: getfield kl : F
/*    */     //   165: iconst_0
/*    */     //   166: swap
/*    */     //   167: fastore
/*    */     //   168: iconst_1
/*    */     //   169: istore_0
/*    */     //   170: goto -> 183
/*    */     //   173: aload_3
/*    */     //   174: aload_0
/*    */     //   175: getfield bs : F
/*    */     //   178: iconst_0
/*    */     //   179: swap
/*    */     //   180: fastore
/*    */     //   181: iconst_1
/*    */     //   182: istore_0
/*    */     //   183: iload_0
/*    */     //   184: ireturn
/*    */     //   185: new java/lang/AssertionError
/*    */     //   188: dup
/*    */     //   189: invokespecial <init> : ()V
/*    */     //   192: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 52
/*    */     //   #2	-> 65
/*    */     //   #3	-> 68
/*    */     //   #4	-> 81
/*    */     //   #5	-> 86
/*    */     //   #6	-> 96
/*    */     //   #7	-> 101
/*    */     //   #8	-> 102
/*    */     //   #9	-> 107
/*    */     //   #10	-> 115
/*    */     //   #11	-> 120
/*    */     //   #12	-> 128
/*    */     //   #13	-> 133
/*    */     //   #14	-> 143
/*    */     //   #15	-> 148
/*    */     //   #16	-> 149
/*    */     //   #17	-> 154
/*    */     //   #18	-> 162
/*    */     //   #19	-> 167
/*    */     //   #20	-> 175
/*    */     //   #21	-> 180
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/H1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */