/* 1 */ package f;public final class q2 extends GLFWCharCallback { public final void invoke(long paramLong, int paramInt) { if ((paramInt & 0xFF00) == 63232) return;  char c = (char)paramInt; this.OG.jF0.Ai
/* 2 */       .AW
/* 3 */       .df0();
/* 4 */     long l = System.nanoTime(); synchronized (this.OG.hl0) { null
/* 5 */         .Ou.oU(2); this.OG.hl0.Jo0(l); this.OG.hl0.Ou.oU(c);
/*   */       /* monitor exit FieldReferenceExpression{lastType=ObjectType{f/Td0}, expression=FieldReferenceExpression{lastType=ObjectType{f/aY}, expression=ThisExpression{ObjectType{f/q2}}, name=OG, descriptor=Lf/aY;}, name=hl0, descriptor=Lf/Td0;} */
/*   */       return; }
/*   */      }
/*   */ 
/*   */   
/*   */   public q2(aY paramaY) {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/q2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */