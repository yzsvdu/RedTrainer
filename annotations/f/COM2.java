/* 1 */ package f;public final class COM2 extends Kl0 { public final void sM() { boolean bool; this
/* 2 */       .UU = this.Ws.getInt(); if (R00() == 1) { bool = true; } else { bool = false; }  this.c0 = bool; this.or = ee0(Gc0()); }
/*   */ 
/*   */   
/*   */   public static HashMap sI = new HashMap<>();
/*   */   public int UU;
/*   */   public boolean c0;
/*   */   public byte[] or;
/*   */   
/*   */   public COM2(c4 paramc4, ByteBuffer paramByteBuffer) {
/*   */     super(paramc4, paramByteBuffer);
/*   */   }
/*   */   
/*   */   public final void Cx() {
/*   */     // Byte code:
/*   */     //   0: getstatic f/COM2.sI : Ljava/util/HashMap;
/*   */     //   3: aload_0
/*   */     //   4: getfield UU : I
/*   */     //   7: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   10: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   13: checkcast java/io/ByteArrayOutputStream
/*   */     //   16: dup
/*   */     //   17: astore_1
/*   */     //   18: ifnonnull -> 44
/*   */     //   21: new java/io/ByteArrayOutputStream
/*   */     //   24: dup
/*   */     //   25: astore_1
/*   */     //   26: invokespecial <init> : ()V
/*   */     //   29: getstatic f/COM2.sI : Ljava/util/HashMap;
/*   */     //   32: aload_0
/*   */     //   33: getfield UU : I
/*   */     //   36: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   39: aload_1
/*   */     //   40: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   43: pop
/*   */     //   44: aload_1
/*   */     //   45: aload_0
/*   */     //   46: getfield or : [B
/*   */     //   49: invokevirtual write : ([B)V
/*   */     //   52: goto -> 56
/*   */     //   55: pop
/*   */     //   56: aload_0
/*   */     //   57: getfield c0 : Z
/*   */     //   60: ifeq -> 159
/*   */     //   63: getstatic f/COM2.sI : Ljava/util/HashMap;
/*   */     //   66: aload_0
/*   */     //   67: getfield UU : I
/*   */     //   70: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   73: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   76: pop
/*   */     //   77: new f/qj0
/*   */     //   80: dup
/*   */     //   81: dup
/*   */     //   82: astore_0
/*   */     //   83: aload_1
/*   */     //   84: invokevirtual toByteArray : ()[B
/*   */     //   87: invokespecial <init> : ([B)V
/*   */     //   90: getfield yo : Z
/*   */     //   93: ifne -> 146
/*   */     //   96: aload_0
/*   */     //   97: getfield Wv : I
/*   */     //   100: dup
/*   */     //   101: istore_0
/*   */     //   102: bipush #19
/*   */     //   104: if_icmplt -> 131
/*   */     //   107: iload_0
/*   */     //   108: bipush #20
/*   */     //   110: if_icmple -> 116
/*   */     //   113: goto -> 131
/*   */     //   116: getstatic f/km.u4 : Lf/R8;
/*   */     //   119: sipush #5803
/*   */     //   122: invokestatic OH0 : (I)Ljava/lang/String;
/*   */     //   125: invokevirtual Pq : (Ljava/lang/String;)V
/*   */     //   128: goto -> 159
/*   */     //   131: getstatic f/km.u4 : Lf/R8;
/*   */     //   134: sipush #5030
/*   */     //   137: invokestatic OH0 : (I)Ljava/lang/String;
/*   */     //   140: invokevirtual Pq : (Ljava/lang/String;)V
/*   */     //   143: goto -> 159
/*   */     //   146: aload_0
/*   */     //   147: dup
/*   */     //   148: dup
/*   */     //   149: iconst_0
/*   */     //   150: putfield Fj0 : Z
/*   */     //   153: putstatic f/km.Ll0 : Lf/qj0;
/*   */     //   156: invokevirtual run : ()V
/*   */     //   159: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 90
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   44	55	55	java/io/IOException
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/COM2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */