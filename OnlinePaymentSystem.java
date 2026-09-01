    abstract class Payment{
        protected String customerName;
        protected double amount;

        Payment(String customerName, double amount){
            this.customerName = customerName;
            this.amount = amount;
        }

        abstract void makePayment();
        abstract void display();
    }

    class creditCard extends Payment{
        private int cardNumber;

        creditCard(String customerName, double amount, int cardnumber){
            super(customerName, amount);
            this.cardNumber = cardNumber;
        }

        @Override
        void makePayment(){
            System.out.print("Payment made using credit card");
        }
        @Override
        public void display(){
            System.out.println("Customer Name: " +  customerName);
            System.out.println("Amount: " +  amount);


        }
    }

    class UPI extends Payment{
        private int upiId;

        UPI(String customerName, double amount, int upiId){
            super(customerName, amount);
            this.upiId = upiId;
        }

        @Override
        void makePayment(){
            System.out.print("Payment made using upi ");
        }

        @Override
        public void display(){
            System.out.println("Customer Name: " +  customerName);
            System.out.println("Amount: " +  amount);


        }
    }

    public class OnlinePaymentSystem {
        public static void main(String[] args){

            Payment c1 = new creditCard("Binitta", 30000, 123456);
            Payment u1 = new UPI("Jaimon", 5000, 321);

            c1.makePayment();
            c1.display();

            u1.makePayment();
            u1.display();

        }
    }
