package com.jap.customers;


import java.util.*;

public class CustomerService {
    // This method returns the customer's loyalty points in sorted order
public List<Integer> getListOfCustomersSortedByLoyaltyPoints(List<Customer> customerList, LoyaltyPointComparator loyaltyPointComparator){
    List<Integer> integerList=new ArrayList<>();
    Collections.sort(customerList,loyaltyPointComparator);
    for (Customer customer : customerList) {
        integerList.add(customer.getLoyaltyPoints());
    }

    return integerList;
}

    public static void main(String[] args) {
        List<Customer> customerList=Arrays.asList(new Customer(12,"sangti", "male",true,"mon",20),
                new Customer(13,"Khenou", "male",true,"mon",60),
                new Customer(14,"angjei", "male",true,"mon",30),
                new Customer(15,"jaitok", "male",true,"mon",50)
                );

        CustomerService cs=new CustomerService();
        System.out.println("cs.getListOfCustomersSortedByLoyaltyPoints(customerList,new LoyaltyPointComparator()) = " + cs.getListOfCustomersSortedByLoyaltyPoints(customerList, new LoyaltyPointComparator()));
    }

}
