/*  1 */ package f;public final class W10 extends Kl0 { public HashMap gr; public final void sM() { int i; byte b; for (i = Gc0(), b = 0; b < i; ) { this.gr
/*    */ 
/*    */         
/*  4 */         .put(Short.valueOf(this.Ws.getShort()), DO.kk(this.Ws.get())); b++; }  for (i = R00(), b = 0; b < i; )
/*    */     { Lw lw;
/*  6 */       DO dO = DO.kk(this.Ws.get()); this(); this.mX.put(dO, lw); int j; byte b1; for (j = Gc0(), b1 = 0; b1 < j; ) { lw
/*    */           
/*  8 */           .Ye0(this.Ws.getShort()); b1++; }  b++; }  } public final HashMap mX; public W10(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); HashMap<Object, Object> hashMap; this(); this.gr = this; this(); this.mX = this; } public final void Cx() { for (UD0 uD0 : (On.v30()).iI0.values()) { DO dO; if ((dO = (DO)this.gr.get(Short.valueOf(uD0.AP))) == null) dO = DO.U7;  uD0.ee = dO; uD0.G2.clear(); DO[] arrayOfDO; int i; byte b; for (i = (arrayOfDO = DO.MZ).length, b = 0; b < i; ) { DO dO1 = arrayOfDO[b]; if (((Lw)this.mX.get(dO1))
/*    */           
/* 10 */           .Fb(uD0.AP)) uD0
/* 11 */             .G2.add(dO1);  b++; }
/*    */        }
/*    */      Hy hy; pA pA;
/* 14 */     if ((pA = ((R8)r8()).YG0.MH0) != null && (
/* 15 */       hy = this.yb0) != null)
/* 16 */       Id0();  }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/W10.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */