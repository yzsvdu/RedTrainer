/* 1 */
package f;

public final class Rp0 extends throws{public final void update(){R8();long l;this.Q30=Math.max(0,(int)((l=System.currentTimeMillis())-this.fC));this.fC=l;
        /*   */     try{int i;
        /* 3 */       if((i=this.El0)!=0&&l-this.EJ0>i){this.EJ0=l;this.El0=33;this.lO.sj=true;W50(9);}}catch(NullPointerException nullPointerException){}catch(IndexOutOfBoundsException indexOutOfBoundsException){}catch(ConcurrentModificationException concurrentModificationException){}
        /* 4 */     Oj.Q3(this.my);MH0();QF();Pp();uW();LW();}
/*   */
/*   */
/*   */   public Rp0(Oj paramOj,js paramjs,tw paramtw,kS paramkS,xR paramxR,Tm paramTm){
        /*   */     super(paramjs,paramtw,paramkS,paramxR,paramTm);
        /*   */   }
/*   */
/*   */   public final boolean Qg0(int paramInt1,int paramInt2,int paramInt3,boolean paramBoolean){
        /*   */     if(km.Lpt1.vG0())
        /*   */       return true;
        /*   */     JG0 jG0;
        /*   */     if(Pw.Ag0&&(jG0=Oj.Qs0(this.my).Va0(paramInt1,paramInt2))!=null){
        /*   */       if(jG0.Va0(paramInt1,paramInt2)!=null)
        /*   */         jG0=jG0.Va0(paramInt1,paramInt2);
        /*   */       if(jG0.dA().contains("tooltip-help"))
        /*   */         return super.Qg0(paramInt1,paramInt2,paramInt3,paramBoolean);
        /*   */       if(Bz.FC0){
        /*   */         I i2;
        /*   */         if(jG0.xk0()==null){
        /*   */           this(jG0);
        /*   */         }else{
        /*   */           i2=jG0.xk0();
        /*   */         }
        /*   */         if(!i2.X60()){
        /*   */           i2.sz(new pRn((byte)0,(byte)-1,(byte)0,(byte)-6),750);
        /*   */           mX mX=jG0.mA();
        /*   */           jG0.hn(this.my.mT);
        /*   */           i2.md(new Q10(jG0,mX,i2));
        /*   */         }
        /*   */         jG0.Vo0(i2);
        /*   */         jG0.qe0();
        /*   */       }
        /*   */       String str2=jG0.xp0();
        /*   */       String str3=jG0.dA();
        /*   */       int i=jG0.a40();
        /*   */       int j=jG0.CB();
        /*   */       int k=jG0.kG0();
        /*   */       int m=jG0.kz0();
        /*   */       int n=jG0.qF();
        /*   */       int i1=jG0.Hy();
        /*   */       short s=jG0.dN();
        /*   */       s=jG0.VJ0();
        /*   */       String str1=jG0.getClass().getName()+"\n"+jG0.getClass().getName()+"\n"+str2+"\nPos: "+str3+" "+i+"\nSize: "+j+" "+k+"\nInner Size: "+m+" "+n+"\nBorder LR: "+jG0.getClass().getName()+"\n"+jG0.getClass().getName()+"\n"+str2+"\nPos: "+str3+" "+i+"\nSize: "+j+" "+k+"\nInner Size: "+m+" "+n+" "+s+"\nBorder TB: "+jG0.getClass().getName()+"\n"+jG0.getClass().getName()+"\n"+str2+"\nPos: "+str3+" "+i+"\nSize: "+j+" "+k+"\nInner Size: "+m+" "+n+"\nBorder LR: "+jG0.getClass().getName()+"\n"+jG0.getClass().getName()+"\n"+str2+"\nPos: "+str3+" "+i+"\nSize: "+j+" "+k+"\nInner Size: "+m+" "+n+" "+s+" "+s+"\n\nSTATES: \n";
        /*   */       byte b;
        /*   */       Ll[]arrayOfLl;
        /*   */       (arrayOfLl=new Ll[b=2])[0]=Na.Zj0;
        /*   */       (new Ll[b=2])[1]=Na.I7;
        /*   */       for(j=0;j<b; j++){
        /*   */         Ll ll;
        /*   */         str1=str1+str1+" = "+(ll=arrayOfLl[j]).G8()+"\n";
        /*   */       }
        /*   */       if(UB0.PU.gt0()){
        /*   */         if(Bz.at)
        /*   */           js.N2().ln0(str1);
        /*   */         System.out.println(str1);
        /*   */       }
        /*   */       if(Bz.Ac)
        /*   */         js.N2().j90(jG0,str1,et.F30);
        /*   */     }
        /*   */     return super.Qg0(paramInt1,paramInt2,paramInt3,paramBoolean);
        /*   */   }}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Rp0.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */