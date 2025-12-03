public class BranchCoverageSource {

    public void executeBranches(int a, int b, int c, int d) {        
        int z = 0;
        if (a > d && a < c + b && c < d) {
            switch (a + c) {
                case 3:               
                    return;
                case 8:
                    a = b - d;
                case 12:
                    d = a + b;
                    break;
                default:
                    c = a;
                    a = b;
            }
        } else {
            if (c > b && a < d) {
                c++;
            } else {
                return;
            }
        }        
        while (z < 10) {
            z++;
            if (d < c) {
                break;
            }
            if (b == a) {
                break;
            }
            if (b == d) {
                break;
            }
            b++;
            c++;
        }        
        if ((a < b && b < c) || (a < c && b > d)) {            
            return;
        } else {
            return;
        }
    }

}
