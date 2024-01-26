/* 1 */ package f;public final class iQ { public final String toString() { Calendar calendar; (calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"))).setTimeInMillis(this.hp); return "[isEnabled=" + AA0() + " start_month=" + this.LF + " start_day=" + this.Rh + " end_month=" + this.s80 + " end_day=" + this.Oe + " start_year=" + calendar.get(1) + " duration=" + ((int)((this.vB - this.hp) / 1000L) / 3600) + 
/* 2 */       "hrs ]"; }
/*   */ 
/*   */   
/*   */   public byte LF;
/*   */   public byte Rh;
/*   */   public byte s80;
/*   */   public byte Oe;
/*   */   public long hp;
/*   */   public long vB;
/*   */   
/*   */   public iQ(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4) {
/*   */     this.LF = paramByte1;
/*   */     this.Rh = paramByte2;
/*   */     this.s80 = paramByte3;
/*   */     this.Oe = paramByte4;
/*   */     JZ();
/*   */   }
/*   */   
/*   */   public final boolean AA0() {
/*   */     long l = System.currentTimeMillis();
/*   */     if (this.vB < l)
/*   */       JZ(); 
/*   */     return (this.hp <= l && this.vB >= l);
/*   */   }
/*   */   
/*   */   public final int be() {
/*   */     return (int)((this.vB - System.currentTimeMillis()) / 1000L);
/*   */   }
/*   */   
/*   */   public final void JZ() {
/*   */     calendar1.set(1, calendar1.get(1) - 1);
/*   */     calendar1.set(11, 0);
/*   */     calendar1.set(12, 0);
/*   */     calendar1.set(13, 0);
/*   */     calendar1.set(14, 0);
/*   */     calendar1.set(2, this.LF - 1);
/*   */     Calendar calendar1;
/*   */     (calendar1 = Calendar.getInstance(TimeZone.getTimeZone("UTC"))).set(5, this.Rh);
/*   */     this.hp = Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTimeInMillis();
/*   */     calendar2.set(1, calendar2.get(1) - 1);
/*   */     calendar2.set(11, 0);
/*   */     calendar2.set(12, 0);
/*   */     calendar2.set(13, 0);
/*   */     calendar2.set(14, 0);
/*   */     calendar2.set(2, this.s80 - 1);
/*   */     Calendar calendar2;
/*   */     (calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"))).set(5, this.Oe + 1);
/*   */     this.vB = l;
/*   */     long l;
/*   */     if ((l = Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTimeInMillis()) <= this.hp) {
/*   */       calendar2.set(1, calendar2.get(1) + 1);
/*   */       this.vB = calendar2.getTimeInMillis();
/*   */     } 
/*   */     while (this.hp < System.currentTimeMillis() && this.vB < System.currentTimeMillis()) {
/*   */       calendar1.set(1, calendar1.get(1) + 1);
/*   */       calendar2.set(1, calendar2.get(1) + 1);
/*   */       this.hp = calendar1.getTimeInMillis();
/*   */       this.vB = calendar2.getTimeInMillis();
/*   */     } 
/*   */     Calendar.getInstance(TimeZone.getTimeZone("UTC")).setTimeInMillis(this.hp);
/*   */     Calendar.getInstance(TimeZone.getTimeZone("UTC")).setTimeInMillis(this.vB);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/iQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */