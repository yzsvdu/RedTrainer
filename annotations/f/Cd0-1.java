/* 1 */
package f;

public abstract class Cd0 {
    public final void remove() {
        int i;
        LF0 lF0;
        if ((i = this.pF0) == -1 && (lF0 = this.Mp).B6) {
            lF0.B6 = false;
            lF0.uv = null;
        } else if (i >= 0) {
            long[] arrayOfLong;
            Object[] arrayOfObject;
            int j;
            int k;
            long l;
            for (arrayOfLong = this.Mp.j3, arrayOfObject = this.Mp.L8, j = this.Mp.mc0, k = i + 1 & j; (l = arrayOfLong[k]) != 0L; ) {
                LF0 lF01 = this.Mp;
                int m;
                if ((k - (m = (int) ((l ^ l >>> 32L) * -7046029254386353131L >>> lF01.Vk0)) & j) > (i - m & j)) {
                    arrayOfLong[i] = l;
                    arrayOfObject[
                            /* 2 */               i] = arrayOfObject[k];
                    i = k;
                }
                k = k + 1 & j;
            }
            arrayOfLong[i] = 0L;
            arrayOfObject[i] = null;
            if (i != this.pF0) this.EY--;
        } else {
            throw new IllegalStateException("next must be called before remove.");
        }
        this.pF0 = -2;
        this.Mp.hm--;
    }

    /*   */
    /*   */
    /*   */   public boolean zb0;
    /*   */   public final LF0 Mp;
    /*   */   public int EY;
    /*   */   public int pF0;
    /*   */   public boolean SJ = true;

    /*   */
    /*   */
    public Cd0(LF0 paramLF0) {
        /*   */
        this.Mp = paramLF0;
        /*   */
        We0();
        /*   */
    }

    /*   */
    /*   */
    public final void We0() {
        /*   */
        this.pF0 = -2;
        /*   */
        this.EY = -1;
        /*   */
        if (this.Mp.B6) {
            /*   */
            this.zb0 = true;
            /*   */
        } else {
            /*   */
            hn();
            /*   */
        }
        /*   */
    }

    /*   */
    /*   */
    public final void hn() {
        /*   */
        long[] arrayOfLong;
        /*   */
        int i = (arrayOfLong = this.Mp.j3).length;
        /*   */
        this.EY = j;
        /*   */
        int j;
        /*   */
        while ((j = this.EY + 1) < i) {
            /*   */
            if (arrayOfLong[j] != 0L) {
                /*   */
                this.zb0 = true;
                /*   */
                return;
                /*   */
            }
            /*   */
        }
        /*   */
        this.zb0 = false;
        /*   */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Cd0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */