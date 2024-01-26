/* 1 */ package f;public final class aM0 { public final f1 LY(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, byte paramByte) { try { this.cV.lock(); int i; Integer integer = Integer.valueOf(i = paramByte * 268435456 + paramInt2); this.PC0.Qf(); Reference<Reference> reference;
/* 2 */       if ((reference = (Reference)this.PC0.oa.get(integer)) == null) { reference = null; } else { reference = reference.get(); }
/* 3 */        f1 f1; if ((f1 = (f1)reference) == null) { this(paramInt1, paramInt2, paramByteBuffer); MB0 mB0 = this.PC0; mB0
/* 4 */           .oa
/* 5 */           .remove(Integer.valueOf(i));
/* 6 */         this.PC0.Qn0(Integer.valueOf(i), f1); }  return f1; } finally { this.cV.unlock(); }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final aM0 Ij0 = new aM0();
/*   */   public MB0 PC0 = d9.tp();
/*   */   public ReentrantLock cV = new ReentrantLock();
/*   */   
/*   */   public static final aM0 nG0() {
/*   */     return Ij0;
/*   */   }
/*   */   
/*   */   public final f1 Fo0(int paramInt1, int paramInt2, s40 params40) {
/*   */     ByteBuffer byteBuffer = params40.pr();
/*   */     paramInt1 = params40.in();
/*   */     return LY(paramInt1, paramInt2, this, paramInt1);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/aM0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */