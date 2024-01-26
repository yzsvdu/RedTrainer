/*    */ package f;public final class iC extends TF0 { public iC(Mw paramMw) {} public final Object COm7(It paramIt, bM0 parambM0) {
/*  2 */     String str = (String)COm9.aD0(paramIt, parambM0, "name", String.class, null);
/*  3 */     bM0 bM01 = parambM0.Jb("color"); Color color;
/*  4 */     if ((color = (Color)paramIt.Uj0(Color.class, null, bM01)) != null)
/*  5 */     { ES eS2; ES eS1; if (eS1 = this.Un0.zD(str) instanceof c3)
/*  6 */       { eS2 = ((c3)this).rG(color); } else if (this instanceof r80) { r80 r80; eS2 = this;
/*  7 */         this((r80)eS2); (new r80())
/*    */           
/*  9 */           .Fi = new Cz0(r80.Fi, color); eS2 = r80; } else if (this instanceof RO)
/*    */       { Ui0 ui02, ui01;
/* 11 */         if (ui01 = (eS2 = this).LH0 instanceof COm5)
/* 12 */         { this((COm5)ui01); } else { this(ui01); }  ui02.vr(color);
/* 13 */         float f = ((uB)eS2).uz;
/*    */         
/* 15 */         ui02.Kf(f, ((uB)eS2).B90); this(ui02); rO
/*    */           
/* 17 */           .e = ((uB)eS2).e;
/*    */         
/* 19 */         rO.jM = ((uB)eS2).jM;
/*    */         
/* 21 */         rO.Ji = ((uB)eS2).Ji;
/*    */         RO rO;
/* 23 */         (rO = new RO()).Xm0 = ((uB)eS2).Xm0; eS2 = rO;
/*    */         
/*    */          }
/*    */       
/*    */       else
/*    */       
/*    */       { 
/* 30 */         throw new JU(
/* 31 */             B40.df("Unable to copy, unknown drawable type: ")
/* 32 */             .append(getClass()).toString()); }  boolean bool; if (bool = eS2 instanceof uB) { String str1; uB uB = (uB)eS2; if (this instanceof uB) { str1 = ((uB)this).sD + " (" + color + ")"; } else { str1 = " (" + color + ")"; }  uB.sD = this; }  if (bool)
/* 33 */         ((uB)eS2).sD = parambM0.as0 + " (" + str + ", " + color + ")";  return eS2; }  throw new kN("TintedDrawable missing color: " + parambM0);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/iC.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */