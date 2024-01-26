/* 1 */ package f;public final class r5 extends x60 { public final void Da0(String[] paramArrayOfString) { if (paramArrayOfString.length < 2) { km.u4.oD("/testanimation2 <skill_id>", ZY.ih); return; }  try { short s = Short.parseShort(paramArrayOfString[1]); Gp0 gp0; if ((gp0 = km.MR) == null) return;  if (km.wI0.K7 == null)
/* 2 */         return;  try { float f; Constructor constructor; if ((constructor = Class.forName("com.pokeemu.client.graphics.animation.battle.auto.special.Animation" + s).asSubclass(wb.class).getConstructor(new Class[] { hm0.class })) == null) return;  boolean bool = false; (new Object[1])[bool] = gp0.N0((byte)0, (byte)0); wb wb; (wb = (wb)newInstance(new Object[1])).SK(gp0.N0((byte)1, (byte)0));
/* 3 */         km.wI0.K7
/*   */           
/* 5 */           .u4 = O3();
/* 6 */         R8 r8 = km.u4; StringBuilder stringBuilder = (new StringBuilder()).append("length = "); So so;
/* 7 */         if ((so = ((wb)newInstance(new Object[1])).synchronized) != null) { if ((f = so.sV()) < 1.0F) throw new IllegalStateException("");  } else { f = 0.0F; }
/* 8 */          oD(stringBuilder.append(f * 1000.0F).toString(), ZY.ih); } catch (Exception exception) { printStackTrace(); }  return; } catch (NumberFormatException numberFormatException) { km.u4.oD("/testanimation2 <skill_id>", ZY.ih);
/*   */       return; }
/*   */      }
/*   */ 
/*   */   
/*   */   public r5() {
/*   */     super("/testanimation2");
/*   */   }
/*   */   
/*   */   public final int Gs0() {
/*   */     return 8;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/r5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */