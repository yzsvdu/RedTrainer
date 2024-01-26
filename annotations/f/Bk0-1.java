/*  1 */ package f;public final class Bk0 extends JG0 implements fi { public final void d40() { this.TL0.mM(); mM(); if (km.Nr()) { if (this.Kd + this
/*  2 */         .xY > 
/*  3 */         km.wI0.dG() - this
/*  4 */         .xY)
/*    */       
/*  6 */       { int i = km.wI0.dG() - this.xY;
/*    */         
/*  8 */         ME(i, this.er0); }  if (this
/*  9 */         .er0 + this
/* 10 */         .HC > 
/* 11 */         km.wI0.k1())
/*    */       {
/*    */ 
/*    */         
/* 15 */         ME(this.Kd, km.wI0.k1() - this.HC); }  }
/*    */      }
/*    */ 
/*    */   
/*    */   public HashMap DF0;
/*    */   public Ip TL0;
/*    */   public int GX;
/*    */   
/*    */   public Bk0() {
/*    */     HashMap<Object, Object> hashMap;
/*    */     this();
/*    */     this.DF0 = hashMap;
/*    */     Xu("/link-status");
/*    */     this();
/*    */     this.TL0 = ip;
/*    */     Ip ip;
/*    */     (ip = new Ip()).Xu("content");
/*    */   }
/*    */   
/*    */   public final void nq(HH paramHH) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield DF0 : Ljava/util/HashMap;
/*    */     //   4: aload_1
/*    */     //   5: getfield Ia0 : I
/*    */     //   8: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   11: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   14: checkcast f/X90
/*    */     //   17: ifnull -> 21
/*    */     //   20: return
/*    */     //   21: aload_1
/*    */     //   22: aload_0
/*    */     //   23: new f/X90
/*    */     //   26: dup
/*    */     //   27: astore_2
/*    */     //   28: aload_0
/*    */     //   29: aload_1
/*    */     //   30: invokespecial <init> : (Lf/Bk0;Lf/HH;)V
/*    */     //   33: getfield DF0 : Ljava/util/HashMap;
/*    */     //   36: aload_1
/*    */     //   37: getfield Ia0 : I
/*    */     //   40: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   43: aload_2
/*    */     //   44: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   47: pop
/*    */     //   48: getfield Ia0 : I
/*    */     //   51: aload_0
/*    */     //   52: getfield GX : I
/*    */     //   55: if_icmpne -> 63
/*    */     //   58: iconst_1
/*    */     //   59: istore_1
/*    */     //   60: goto -> 65
/*    */     //   63: iconst_0
/*    */     //   64: istore_1
/*    */     //   65: aload_0
/*    */     //   66: aload_2
/*    */     //   67: aload_0
/*    */     //   68: aload_2
/*    */     //   69: dup
/*    */     //   70: getfield Cj : Lf/dQ;
/*    */     //   73: iload_1
/*    */     //   74: invokevirtual wI0 : (Z)V
/*    */     //   77: invokevirtual MJ0 : ()V
/*    */     //   80: invokevirtual Ub : ()I
/*    */     //   83: invokevirtual si : (Lf/JG0;I)V
/*    */     //   86: invokestatic XU : ()Z
/*    */     //   89: ifeq -> 112
/*    */     //   92: aload_0
/*    */     //   93: bipush #105
/*    */     //   95: istore_0
/*    */     //   96: getfield DF0 : Ljava/util/HashMap;
/*    */     //   99: invokevirtual size : ()I
/*    */     //   102: bipush #80
/*    */     //   104: imul
/*    */     //   105: bipush #-40
/*    */     //   107: iadd
/*    */     //   108: istore_1
/*    */     //   109: goto -> 130
/*    */     //   112: aload_0
/*    */     //   113: bipush #10
/*    */     //   115: istore_0
/*    */     //   116: getfield DF0 : Ljava/util/HashMap;
/*    */     //   119: invokevirtual size : ()I
/*    */     //   122: bipush #46
/*    */     //   124: imul
/*    */     //   125: sipush #200
/*    */     //   128: iadd
/*    */     //   129: istore_1
/*    */     //   130: aload_2
/*    */     //   131: dup
/*    */     //   132: iload_0
/*    */     //   133: iload_1
/*    */     //   134: invokevirtual ME : (II)Z
/*    */     //   137: pop
/*    */     //   138: invokevirtual mM : ()V
/*    */     //   141: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 5
/*    */     //   #2	-> 8
/*    */     //   #3	-> 37
/*    */     //   #4	-> 40
/*    */     //   #5	-> 48
/*    */     //   #6	-> 52
/*    */     //   #7	-> 70
/*    */     //   #8	-> 80
/*    */     //   #9	-> 86
/*    */     //   #10	-> 134
/*    */     //   #11	-> 138
/*    */   }
/*    */   
/*    */   public final void EX(nY paramnY) {}
/*    */   
/*    */   public final boolean RE0() {
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final void V90(throws paramthrows) {
/*    */     super.V90(paramthrows);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Bk0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */