public class Billing {

    public Billing(){

    }

    public Double computeBill(Double price){
        Double tax=price*0.08;
        return price+tax;
    }

    public Double computeBill(Double price, Integer ordered){
        Double order=price*ordered;
        Double tax=order*0.08;
        return order+tax;
    }


    public Double computeBill(Double price, Integer ordered, Double coupon){
        Double order=price*ordered;
        Double tax=order*0.08;
        Double desc=order*coupon;
        return (order-desc)+tax;
    }
}