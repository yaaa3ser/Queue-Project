
package queue;

public class MMC {
    private  double λ,mu,r,rho;
    private int c,n;

    public MMC(double λ, double mu, int c) {
        this.λ = λ;
        this.mu = mu;
        this.c = c;
        this.r = (this.λ/this.mu);
        this.rho = this.r/this.c;
    }
    
    public int factorial(int a) {
        if (a == 0) {
            return 1;
        } else {
            return(a * factorial(a-1));
        }
    }
    public double sumtion() { 
        double sum = 0;
        for (int i = 0; i <= c - 1; i++) { 
            double f = factorial(i);
            double u = Math.pow(r, i); 
            double v = u / f; 
            sum = sum + v;
        }
        return sum;
    }
    
    public double P0() {
        double p0=0.0,U;
        double a = sumtion();
        double rc = Math.pow(r, c);
        double factc = factorial(c);
        if (rho < 1) {
            U = a + ((c * rc) / (factc * (c - r)));
            p0 = 1 / U;
        } 
        else if (rho >= 1) { 
            U = a + (((1 / factc) * rc) * ((c * mu) / ((c * mu) - λ))); 
            p0 = 1 / U;
        } 
        return p0;
    }
    
    
    public double l(){
        return lq()+r;
    }
    public double lq() { 
        double rc = Math.pow(r, c);
        double a = P0(); 
        double d = factorial(c - 1);
        double x = (c * mu) - (λ); 
        double y = Math.pow(x, 2); 
        double u = rc * λ * mu; 
        double f = d * y;
        double Lq = (u / f) * (a);
        return Lq;
    } 
    
    public double wq() {
        return lq() / λ;        
    }
    public double w(){
        return wq()+1/mu;
    }
    
    public String getL() {
        double temp = (double) l();
        temp = Math.round(temp*100.0)/100.0;
        return String.valueOf(temp);
    }

    public String getLq() {
        double temp = (double) lq();
        temp = Math.round(temp*100.0)/100.0;
        return String.valueOf(temp);
    }
    public String getW() {
        double temp = (double) w();
        temp = Math.round(temp*100.0)/100.0;
        return String.valueOf(temp);
    }

    public String getWq() {
        double temp = (double) wq();
        temp = Math.round(temp*100.0)/100.0;
        return String.valueOf(temp);
    }
}
