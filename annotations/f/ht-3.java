/* 1 */ package f;public final class ht extends me { public final void Ad0(short[] paramArrayOfshort) { if (paramArrayOfshort[0] == 382) { eo eo; char c = Character.MIN_VALUE; this(); short s;
/* 2 */       if ((s = this.im0.xk0.sa0) != 12) { Lr0 lr0; switch (s) { default: eo
/* 3 */               .TG0(2.125F, 0.0F, 0.6F); break;case 138: eo.TG0(1.875F, -0.01F, 0.5F); break;case 137: eo.TG0(2.125F, -0.01F, 0.7F); break;case 139: eo.TG0(0.25F, -0.01F, 2.125F); c = '㿿'; break; }  eo.y = 0.5F; eo.uu(4.0F); this(this); km.u4
/* 4 */           .hB0 = lr0;
/* 5 */         float f1 = eo.x, f2 = eo.y, f3 = eo.z; this.pK.fB0(false, (short)0, c, 8.0F, f1, f2, f3, (short)36);
/* 6 */         this.pK.wI
/*   */           
/* 8 */           .C00 = new fK0(lr0);
/*   */         return; }
/*   */        }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final Matrix4 ed0 = new Matrix4();
/*   */   public lpt1 CB0;
/*   */   public tg pK;
/*   */   
/*   */   public ht(pI parampI, tg paramtg) {
/*   */     super(parampI);
/*   */     C20 c20;
/*   */     ig ig;
/*   */     fQ fQ;
/*   */     this.pK = paramtg;
/*   */     Wo wo = km.mI0.AN;
/*   */     this(wo.Vz().B8("/a/1/3/0"));
/*   */     Q1 q1 = Q1.tB((new ig()).Em0(0).l2());
/*   */     this(36);
/*   */     byte b;
/*   */     for (b = 2; b < 16; b++)
/*   */       fQ.Com3(uv.vb0(ig.Em0(b).l2())); 
/*   */     for (b = 16; b < 36; b++)
/*   */       fQ.Com3(eB.ki0(ig.Em0(b).l2())); 
/*   */     this(ig.Em0(1).l2());
/*   */     eI eI = eI.Lj();
/*   */     Wd wd = c20.bl;
/*   */     eI.getClass();
/*   */     this.CB0 = eI.Jc(q1.Nt[0], wd, fQ);
/*   */     short s;
/*   */     if ((s = parampI.Eb()) != 12) {
/*   */       eo eo2;
/*   */       float f1;
/*   */       float f2;
/*   */       switch (s) {
/*   */         default:
/*   */           this.CB0.mh.g7(2.125F, -0.01F, 0.6F);
/*   */           this.CB0.Of.pp0.Tz(2.125F, -0.01F, 0.6F);
/*   */           eo2 = this.CB0.Of.s60;
/*   */           f1 = 2.125F;
/*   */           f2 = 0.6F;
/*   */           break;
/*   */         case 138:
/*   */           this.CB0.mh.g7(1.875F, -0.01F, 0.5F);
/*   */           this.CB0.Of.pp0.Tz(1.875F, -0.01F, 0.5F);
/*   */           eo2 = this.CB0.Of.s60;
/*   */           f1 = 1.875F;
/*   */           f2 = 0.5F;
/*   */           break;
/*   */         case 137:
/*   */           this.CB0.mh.g7(2.125F, -0.01F, 0.7F);
/*   */           this.CB0.Of.pp0.Tz(2.125F, -0.01F, 0.7F);
/*   */           eo2 = this.CB0.Of.s60;
/*   */           f1 = 2.125F;
/*   */           f2 = 0.7F;
/*   */           break;
/*   */         case 139:
/*   */           this.CB0.mh.g7(0.25F, -0.01F, 2.125F);
/*   */           this.CB0.mh.N8(eo2 = eo.Y, 90.0F);
/*   */           this.CB0.Of.Uc(ed0.WU().N8(eo2, 90.0F));
/*   */           this.CB0.Of.pp0.Tz(0.25F, -0.01F, 2.125F);
/*   */           eo2 = this.CB0.Of.s60;
/*   */           f1 = 0.25F;
/*   */           f2 = 2.125F;
/*   */           break;
/*   */       } 
/*   */       eo2.Tz(f1, -0.01F, f2);
/*   */       eo eo1 = this.CB0.Of.pp0;
/*   */       this.CB0.Of.kX(eo1, this.CB0.Of.s60);
/*   */       kc(this.CB0);
/*   */       byte b1 = 0;
/*   */       switch (parampI.Xg0()) {
/*   */         case 375:
/*   */         case 379:
/*   */           b1 = 20;
/*   */           break;
/*   */         case 372:
/*   */           b1 = 19;
/*   */           break;
/*   */         case 366:
/*   */         case 369:
/*   */           b1 = 18;
/*   */           break;
/*   */         case 320:
/*   */           b1 = 9;
/*   */           break;
/*   */         case 318:
/*   */           b1 = 8;
/*   */           break;
/*   */         case 251:
/*   */         case 252:
/*   */           b1 = 11;
/*   */           break;
/*   */         case 159:
/*   */           b1 = 22;
/*   */           break;
/*   */         case 131:
/*   */         case 132:
/*   */         case 133:
/*   */           b1 = 16;
/*   */           break;
/*   */         case 91:
/*   */           b1 = 13;
/*   */           break;
/*   */         case 51:
/*   */         case 90:
/*   */         case 92:
/*   */           b1 = 12;
/*   */           break;
/*   */         case 27:
/*   */           b1 = 10;
/*   */           break;
/*   */       } 
/*   */       this.CB0.k = 0.25F;
/*   */       this.CB0.ml0(0, true);
/*   */       this.CB0.ml0(b1, true);
/*   */       return;
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ht.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */