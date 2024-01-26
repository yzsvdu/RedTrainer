/*  1 */ package f;public final class aI0 { public final void YP(int paramInt, UD0 paramUD0) { if (paramUD0 == null || this.to
/*  2 */       .Fb(paramUD0.AP)) return;  this.to
/*    */       
/*  4 */       .Ye0(paramUD0.AP); Mr0 mr0; if ((mr0 = (Mr0)this.Lm0.get(Integer.valueOf(paramInt))) == null) { this(paramInt); this.Lm0.put(Integer.valueOf(paramInt), mr0); }  mr0.com5
/*    */       
/*  6 */       .put(Short.valueOf(paramUD0.AP), paramUD0); UD0 uD0;
/*  7 */     if ((uD0 = paramUD0.FW) != null)
/*  8 */       YP(paramInt - 2, uD0);  for (Vx0 vx0 : paramUD0
/*  9 */       .WI) {
/*    */ 
/*    */       
/* 12 */       UD0 uD01 = On.v30().lpT3(vx0.uf0); int i = paramInt + 1; Mr0 mr01;
/* 13 */       if ((mr01 = (Mr0)this.Lm0.get(Integer.valueOf(i))) == null) { this(i); this.Lm0.put(Integer.valueOf(i), mr01); }  mr01.Kn
/*    */         
/* 15 */         .put(Short.valueOf(vx0.uf0), vx0);
/* 16 */       YP(paramInt + 2, uD01);
/*    */     }  }
/*    */ 
/*    */   
/*    */   public Lw to;
/*    */   public TreeMap Lm0;
/*    */   
/*    */   public aI0(UD0 paramUD0) {
/*    */     Lw lw;
/*    */     TreeMap<Object, Object> treeMap;
/*    */     this();
/*    */     this.to = this;
/*    */     this();
/*    */     this.Lm0 = this;
/*    */     YP(0, paramUD0);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/aI0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */