
package queue;


public class MM1 {
    // We suppose λ, u in Minutes so we create a function to convert them to Minutes if not created in main

    private double λ, u, n, ρ;

    private double P0; // = 1 - ρ

    // Expected number of the customers in the system
    private double L; // = λ / (u-λ) = λ * W
    // Expected number of the customers in the queue
    private double Lq; // = (λ * λ) / u * (u-λ) = λ * Wq
    // Expected waiting time in the system
    double W; // 1 / (u-λ)
    // Expected waiting time in the queue
    double Wq; //  λ / u * (u-λ);

    public MM1(double λ, double u) {
        this.λ = λ;
        this.u = u;
    }


    public void has_λ_u() {

        this.L = this.λ / (this.u - this.λ);
        if(this.L < 0)
            this.L = 0;
        this.Lq = Math.pow(this.λ, 2) / (this.u * (this.u - this.λ));
        if(this.Lq < 0)
            this.Lq = 0;
        this.W = 1 / (this.u - this.λ);
        if(this.W < 0)
            this.W = 0;
        this.Wq = this.λ / (this.u * (this.u - this.λ));
        if(this.Wq < 0)
            this.Wq = 0;
        this.ρ = λ / u;

    }
    
    
    public float getλ_has_u_W(double w){ //String state
        // w = λ / u(u-λ)
         this.λ = w * Math.pow(this.u, 2) / (1 + w * this.u );
         //if(state.equals("="))
         //    return "λ = " + this.λ;
         // else if (state.equals(">="))
         //    return "λ >= " + this.λ;
         //else if (state.equals("<="))
             return (float)this.λ;
        //return null;
         
    }

    public String getL() {
        double temp = (double) L;
        temp = Math.round(temp*100.0)/100.0;
        return String.valueOf(temp);
    }

    public String getLq() {

        double temp = (double) Lq;
        temp = Math.round(temp*100.0)/100.0;
        return String.valueOf(temp);
    }
    
    public String getλ(){
        float temp = (float) λ;
        return String.valueOf(temp);
    }
    
    // Probability that there's a customers in the system
    public double probabilityCustomerOccupied() {
        // = 1-P0 = 1-(1-ρ) = ρ
        return this.ρ;
    }

    public String getP0() { // Get probability of no customers in the System
        float temp = (float) (1 - this.ρ);
        if( temp < 0 )
            temp = 0;
        return String.valueOf(temp);
    }

    public String getW() {
        double temp = (double) W;
        temp = Math.round(temp*100.0)/100.0;
        return String.valueOf(temp);
    }

    public String getWq() {
        
        double temp = (double) Wq;
        temp = Math.round(temp*100.0)/100.0;
        return String.valueOf(temp);
    }


    public void setλ(double λ) {
        this.λ = λ;
    }

    public void setU(double u) {
        this.u = u;
    }

    public void setλU(double λ, double u) {
        this.λ = λ;
        this.u = u;
    }

    public void λ_HourToMin() {
        this.λ = this.λ / 60;
    }

    public void u_HourToMin() {
        this.u = this.u / 60;
    }

    public void λu_HourToMin() {
        this.λ = this.λ / 60;
        this.u = this.u / 60;
    }

    public void λ_SecToMin() {
        this.λ = this.λ * 60;
    }

    public void u_SecToMin() {
        this.u = this.u * 60;
    }
    
    public void w_HourToMin(){
        this.W *=60;
    }
    
    public void W_SecToMin(){
        this.W /=60;
    }
    
    /* Convert 1/λ => λ
    With assumption than we initialized λ with 1/λ
    */
    public void time_to_λ(){
        this.λ = 1/this.λ;
    }
    
    /* Convert 1/λ => λ
    With assumption than we initialized λ with 1/λ
    */
    public void time_to_u(){
        this.u = 1/this.u;
    }
    

}
