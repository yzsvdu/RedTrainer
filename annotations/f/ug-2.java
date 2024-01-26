/*  1 */ package f;public final class ug extends Wr { public Cb[] ZA = new Cb[0]; public Zz0 K1; public boolean l0 = false; public final void LM(throws paramthrows) { P3.lF.gL(this); R8 r8; if ((r8 = km.u4) == null) return;  Dq0 dq0; if ((dq0 = r8.R3) == null)
/*  2 */       return;  CM(dq0); } public Predicate tH0 = ug::MO; public ug() { Xu("playereffectsframe"); this.K1 = new Zz0(); EP(1); HM(this::XH); jJ0(true); No(true); J8(this.K1); } private void XH(PropertyChangeEvent paramPropertyChangeEvent) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield l0 : Z
/*    */     //   4: ifne -> 8
/*    */     //   7: return
/*    */     //   8: aload_1
/*    */     //   9: invokevirtual getPropertyName : ()Ljava/lang/String;
/*    */     //   12: ldc 'x'
/*    */     //   14: swap
/*    */     //   15: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   18: ifeq -> 44
/*    */     //   21: getstatic f/h1.YV : I
/*    */     //   24: aload_0
/*    */     //   25: getfield Kd : I
/*    */     //   28: dup
/*    */     //   29: istore_0
/*    */     //   30: if_icmpeq -> 77
/*    */     //   33: iload_0
/*    */     //   34: putstatic f/h1.YV : I
/*    */     //   37: iconst_1
/*    */     //   38: putstatic f/h1.Gh0 : Z
/*    */     //   41: goto -> 77
/*    */     //   44: aload_1
/*    */     //   45: invokevirtual getPropertyName : ()Ljava/lang/String;
/*    */     //   48: ldc 'y'
/*    */     //   50: swap
/*    */     //   51: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   54: ifeq -> 77
/*    */     //   57: aload_0
/*    */     //   58: getfield er0 : I
/*    */     //   61: istore_0
/*    */     //   62: getstatic f/h1.AI : I
/*    */     //   65: iload_0
/*    */     //   66: if_icmpeq -> 77
/*    */     //   69: iload_0
/*    */     //   70: putstatic f/h1.AI : I
/*    */     //   73: iconst_1
/*    */     //   74: putstatic f/h1.Gh0 : Z
/*    */     //   77: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 25
/*    */     //   #2	-> 34
/*    */     //   #3	-> 58
/*  2 */     //   #4	-> 62 } public final void ED0(throws paramthrows) { synchronized (P3.lF) { ConcurrentHashMap<?, ?> concurrentHashMap; if ((concurrentHashMap = P3.bx).containsKey(ug.class)) ((List)concurrentHashMap.get(ug.class)).remove(this);  return; }  } public final void EX(nY paramnY) {} public final void d40() { super.d40(); Tb0(); } public final void Tb0() { if (km.XU()) { Ez(et.T90, 100, 0); this.dy = false; this.fs0 = false;
/*  3 */       EP(1); } else { EP(1); this
/*  4 */         .dy = true;
/*  5 */       this.fs0 = true;
/*  6 */       if (h1.YV >= 0 && h1.AI >= 0)
/*    */       {
/*    */ 
/*    */ 
/*    */         
/* 11 */         ME(Math.min(h1.YV, km.wI0.dG() - this.xY), Math.min(h1.AI, km.wI0.k1() - this.HC)); }  this
/* 12 */         .l0 = true; }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void CQ(boolean paramBoolean) {
/*    */     if (paramBoolean && !this.dP) {
/*    */       Cb[] arrayOfCb;
/*    */       int i;
/*    */       byte b;
/*    */       for (i = (arrayOfCb = this.ZA).length, b = 0; b < i; ) {
/*    */         Cb cb;
/*    */         Lh0 lh0;
/*    */         if ((lh0 = (cb = arrayOfCb[b]).kj0) != null) {
/*    */           if (lh0.X4 > 0)
/*    */             lh0.X4 = Math.max(lh0.E50 - (int)(System.currentTimeMillis() / 1000L), 0); 
/*    */           int j;
/*    */           if ((j = cb.kj0.X4) != cb.PL0) {
/*    */             cb.PL0 = j;
/*    */             cb.rt0();
/*    */             cb.ln();
/*    */           } 
/*    */         } 
/*    */         b++;
/*    */       } 
/*    */     } 
/*    */     super.CQ(paramBoolean);
/*    */   }
/*    */   
/*    */   public final void CM(Dq0 paramDq0) {
/*    */     qw0 qw0;
/*    */     this.K1.gx();
/*    */     Cb[] arrayOfCb = (Cb[])(new iL(qw0)).stream().filter(this.tH0).sorted(Comparator.comparingInt(Lh0::CU)).limit(10L).map(Cb::new).toArray(ug::Qa0);
/*    */     this.K1.of0((JG0[])arrayOfCb);
/*    */     mM();
/*    */   }
/*    */   
/*    */   public final void V90(throws paramthrows) {
/*    */     Cb[] arrayOfCb;
/*    */     int i;
/*    */     byte b;
/*    */     for (i = (arrayOfCb = this.ZA).length, b = 0; b < i; ) {
/*    */       Cb cb;
/*    */       Lh0 lh0;
/*    */       if ((lh0 = (cb = arrayOfCb[b]).kj0) != null) {
/*    */         if (lh0.X4 > 0)
/*    */           lh0.X4 = Math.max(lh0.E50 - (int)(System.currentTimeMillis() / 1000L), 0); 
/*    */         int j;
/*    */         if ((j = cb.kj0.X4) != cb.PL0) {
/*    */           cb.PL0 = j;
/*    */           cb.rt0();
/*    */           cb.ln();
/*    */         } 
/*    */       } 
/*    */       b++;
/*    */     } 
/*    */     super.V90(paramthrows);
/*    */   }
/*    */   
/*    */   public final void vR(Predicate paramPredicate) {
/*    */     this.tH0 = paramPredicate;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ug.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */