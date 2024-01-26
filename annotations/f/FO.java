/* 1 */
package f;

public abstract class FO extends JG0 {
    public final void jq(String paramString) {
        this.Nj0.R
/* 2 */.add(new Rb(paramString));
        R8 r8;
        /* 3 */
        if (!paramString.isEmpty() && (r8 = km.u4) != null) oD(paramString, ZY.ze);
    }

    /*   */
    /*   */
    /*   */   public Dk0 Nj0;
    /*   */   public Ip ib;

    /*   */
    /*   */
    public FO() {
        /*   */
        Xu("battlegui");
        /*   */
        (this.Nj0 = new Dk0()).Xu("battle-text");
        /*   */
        (this.ib = new Ip()).Xu("/battle-panel");
        /*   */
        J8(this.ib);
        /*   */
        J8(this.Nj0);
        /*   */
    }

    /*   */
    /*   */
    public boolean i2(oa0 paramoa0) {
        /*   */
        return super.i2(paramoa0);
        /*   */
    }

    /*   */
    /*   */
    public final void EX(nY paramnY) {
        /*   */
        this.ib.Tm(km.wI0.dG(), 240);
        /*   */
    }

    /*   */
    /*   */
    public abstract void d40();
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/FO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */