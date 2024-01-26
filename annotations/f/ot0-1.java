/*  1 */ package f;public final class ot0 extends TF0 { public final Object COm7(It paramIt, bM0 parambM0) { Color color; boolean bool; if (parambM0.eR == 
/*  2 */       nc.O80) { bool = true; } else { bool = false; }  if (bool)
/*  3 */     { color = (Color)this.RI.Oz0(Color.class, parambM0.DX()); } else { Class<String> clazz = String.class; Object object = null; paramIt.getClass(); bM0 bM01;
/*  4 */       if ((bM01 = parambM0.Jb("hex")) != null) object = paramIt.Uj0(this, null, bM01);  String str;
/*  5 */       if ((str = (String)object) != null) { color = Color.valueOf(this); } else { Color color1; Class<float> clazz1 = float.class; object = Float.valueOf(0.0F);
/*  6 */         if ((bM01 = parambM0.Jb("r")) != null) object = paramIt.Uj0(this, null, bM01); 
/*  7 */         float f3 = ((Float)object).floatValue(); Object object1 = Float.valueOf(0.0F); bM0 bM02;
/*  8 */         if ((bM02 = parambM0.Jb("g")) != null) object1 = paramIt.Uj0(this, null, bM02); 
/*  9 */         float f4 = ((Float)object1).floatValue(); Object object2 = Float.valueOf(0.0F); bM0 bM03;
/* 10 */         if ((bM03 = parambM0.Jb("b")) != null) object2 = paramIt.Uj0(this, null, bM03); 
/* 11 */         float f2 = ((Float)object2).floatValue(); object2 = Float.valueOf(1.0F);
/* 12 */         if ((bM03 = parambM0.Jb("a")) != null) object2 = paramIt.Uj0(this, null, bM03); 
/* 13 */         float f1 = ((Float)object2).floatValue(); this(f3, f4, f2, f1); color = color1; }  }  return this; }
/*    */ 
/*    */   
/*    */   public ot0(Mw paramMw) {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ot0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */