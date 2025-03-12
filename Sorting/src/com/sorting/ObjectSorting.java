package com.sorting;

import java.util.Arrays;

class Customer implements Comparable<Customer> {


     int cid;
     String cname;
     String email;
     int phone;

     public Customer() {

     }

     public Customer(int cid, String cname, String email, int phone) {
         this.cid = cid;
         this.cname = cname;
         this.email = email;
         this.phone = phone;
     }

     public String toString() {
         return " cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone ;
     }
    @Override
    public int compareTo(Customer cust) {
        return this.email.compareTo(cust.email);
    }
 }

     public class ObjectSorting {
        public static void main(String[] args) {
        Customer cust1 = new Customer(10, "Raj", "raj@gmail.com", 123456);
        Customer cust2 = new Customer(2, "Akash", "akash@gmail.com", 123456);
        Customer cust3 = new Customer(9, "Ravi", "ravi@gmail.com", 123456);
        Customer cust4 = new Customer(4, "Ramesh", "ramesh@gmail.com", 123456);

        Customer [] cust = {cust1, cust2, cust3, cust4};
        Arrays.sort(cust);


        for(Customer c : cust){
            System.out.println(c);
        }

     }
}


