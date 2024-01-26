/* 1 */ package f;public final class XM extends mL { public final void sM() { this
/* 2 */       .YH = this.Ws.getInt(); int i;
/*   */     byte b;
/* 4 */     for (this.Ex0 = this.Ws.getShort(), this.XK0 = new ArrayList(), i = R00(), b = 0; b < i; ) {
/*   */       b60 b60;
/*   */       
/* 7 */       this(this.Ws.getInt(), this.Ws.getShort()); int j; byte b1; for (j = R00(), b1 = 0; b1 < j; ) { GS gS; if ((gS = tl()) != null) b60
/* 8 */             .JX.add(gS);  b1++; }  this
/* 9 */         .XK0.add(b60); b++;
/*   */     }  }
/*   */ 
/*   */   
/*   */   public int YH;
/*   */   public short Ex0;
/*   */   public ArrayList XK0;
/*   */   
/*   */   public XM(c4 paramc4, ByteBuffer paramByteBuffer) {
/*   */     super(paramByteBuffer, paramc4);
/*   */   }
/*   */   
/*   */   public final void Cx() {
/*   */     // Byte code:
/*   */     //   0: getstatic f/km.MR : Lf/Gp0;
/*   */     //   3: dup
/*   */     //   4: astore_1
/*   */     //   5: ifnull -> 94
/*   */     //   8: aload_1
/*   */     //   9: getfield dd : Lf/rK;
/*   */     //   12: getstatic f/rK.Az : Lf/rK;
/*   */     //   15: if_acmpne -> 53
/*   */     //   18: getstatic f/km.MR : Lf/Gp0;
/*   */     //   21: astore_1
/*   */     //   22: new f/l0
/*   */     //   25: dup
/*   */     //   26: astore_2
/*   */     //   27: aload_0
/*   */     //   28: dup
/*   */     //   29: dup
/*   */     //   30: getfield YH : I
/*   */     //   33: istore_0
/*   */     //   34: getfield Ex0 : S
/*   */     //   37: istore_3
/*   */     //   38: getfield XK0 : Ljava/util/ArrayList;
/*   */     //   41: astore #4
/*   */     //   43: iload_0
/*   */     //   44: iload_3
/*   */     //   45: aload #4
/*   */     //   47: invokespecial <init> : (ISLjava/util/ArrayList;)V
/*   */     //   50: goto -> 85
/*   */     //   53: getstatic f/km.MR : Lf/Gp0;
/*   */     //   56: astore_1
/*   */     //   57: new f/jp
/*   */     //   60: dup
/*   */     //   61: astore_2
/*   */     //   62: aload_0
/*   */     //   63: dup
/*   */     //   64: dup
/*   */     //   65: getfield YH : I
/*   */     //   68: istore_0
/*   */     //   69: getfield Ex0 : S
/*   */     //   72: istore_3
/*   */     //   73: getfield XK0 : Ljava/util/ArrayList;
/*   */     //   76: astore #4
/*   */     //   78: iload_0
/*   */     //   79: iload_3
/*   */     //   80: aload #4
/*   */     //   82: invokespecial <init> : (ISLjava/util/ArrayList;)V
/*   */     //   85: aload_1
/*   */     //   86: getfield W : Ljava/util/LinkedList;
/*   */     //   89: aload_2
/*   */     //   90: invokevirtual add : (Ljava/lang/Object;)Z
/*   */     //   93: pop
/*   */     //   94: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 9
/*   */     //   #2	-> 12
/*   */     //   #3	-> 86
/*   */     //   #4	-> 90
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/XM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */