/* 1 */ package f;public final class Mm extends UA { public final void Vt(String[] paramArrayOfString) { if (paramArrayOfString.length < 4) { UA.Ue(">animtest [id] [team_id] [slot_id]"); return; }  Gp0 gp0 = km.MR; try { byte b1 = Byte.parseByte(paramArrayOfString[2]), b2 = Byte.parseByte(paramArrayOfString[3]); try { (new Object[1])[0] = N0(b1, b2); try { float f; LV lV; this((byte)0, wb.SK(N0((byte)0, (byte)0))); wb wb; (wb = Class.forName("com.pokeemu.client.graphics.animation.battle.auto.special.Animation" + paramArrayOfString[1]).getConstructor(new Class[] { hm0.class }).newInstance(new Object[1])).O3();
/* 2 */           km.wI0.K7.LW
/* 3 */             .YP
/* 4 */             .add(lV);
/* 5 */           StringBuilder stringBuilder = (new StringBuilder()).append("Duration = "); So so;
/* 6 */           if ((so = (Class.forName("com.pokeemu.client.graphics.animation.battle.auto.special.Animation" + paramArrayOfString[1]).getConstructor(new Class[] { hm0.class }).newInstance(new Object[1])).synchronized) != null) { if ((f = so.sV()) < 1.0F) throw new IllegalStateException("");  } else { f = 0.0F; }
/* 7 */            UA.Ue(append(f).toString()); return; } catch (Exception exception) { null.printStackTrace(); return; }  } catch (NoSuchMethodException noSuchMethodException) { null.printStackTrace(); UA.Ue(">animtest [id]"); return; }  } catch (Exception exception) { UA.Ue(">animtest [id]");
/*   */       return; }
/*   */      }
/*   */ 
/*   */   
/*   */   public Mm() {
/*   */     super("animtest");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Mm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */