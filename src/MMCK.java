
package queue;

public class MMCK {
    private  double λ,mu,r,rho;
    private int c,n,k;

    public MMCK(double λ, double mu, int c, int k) {
        this.λ = λ;
        this.mu = mu;
        this.c = c;
        this.k = k;
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
    public double sumtion2() { 
        double sum = 0; 
        for (int i = 0; i <= c - 1; i++) { 
            double a = Math.pow(r, i);
            double b = factorial(i); 
            double d = c - i; 
            double u = d * (a / b); 
            sum = sum + u;
        }
        return sum;
    }

    public double P0() {
        double p0=0.0,U;
        double a = sumtion();
        double rc = Math.pow(r, c);
        double factc = factorial(c);
        double E = rc / factc;
        if (rho != 1) {
            double g = Math.pow(rho, (k - c + 1)); 
            double f = (1 - g) / (1 - rho); 
            U = a + (E * f); 
            p0 = 1 / U;
        } 
        else if (rho == 1) { 
            U = a + (E * (k - c + 1)); 
            p0 = 1 / U;
        } 
        return p0;
    }
    public double Pn(int n) { 
        double pn=0;
        double rc = Math.pow(r, c);
        double a = P0();
        double b = Math.pow(r, n);
        double c = factorial(n);
        if (n >= 0 && n < c) { 
            pn = (b / c) * a;
        }
        else if (n >= c) {
            double u = Math.pow(c, n - c);
            pn = (b / (u * rc)) * a;
        }
        return pn;
    }
    public double lq() {
        double a = factorial(c);
        double b = Math.pow(r, c);
        double d = P0(); 
        double E = (1 - rho) * (1 - rho);
        double A = Math.pow(rho, k - c+ 1);
        double B = Math.pow(rho, k - c);
        double u = (rho * b * d) / (a * E); 
        double v = (1 - (A) - ((1 - rho) * ( k- c + 1) * (B)));
        double Lq = u * v;
        return Lq;
    }
    
    public double l() {     
        double a = sumtion2();
        double b = P0();
        double d = a * b;
        double x = lq(); 
        double l = x + c - d; 
        return l;
    }
    public double wq() { 
        double x = lq(); 
        double b = Pn(k);
        double λ_dach = λ * (1 - b);
        double Wq = x / (λ_dach); 
        return Wq; 
    }
    public double w() {
        double b = Pn(k);
        double λ_dach = λ * (1 - b);
        double y = l(); 
        double W = y / λ_dach;
        return W;
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
    public String getpk() {
        double temp = (double) Pn(this.k);
        temp = Math.round(temp*100.0)/100.0;
        return String.valueOf(temp);
    }

}
