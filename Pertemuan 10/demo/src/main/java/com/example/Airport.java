// package com.example;

// public class Airport{
//     public static void main(String[] args) {
//         Flight economyFlight = new Flight("1","Economy");
//         Flight businessFlight = new Flight("2","Business");

//         Passenger james = new Passenger("James",true);
//         Passenger mike = new Passenger("Mike",false);
//         Passenger alvito = new  Passenger("Alvito",false);

//         businessFlight.addPassenger(james);
//         businessFlight.removePassenger(james);
//         businessFlight.addPassenger(mike);
//         economyFlight.addPassenger(mike);
//         businessFlight.addPassenger(alvito);

//         System.out.println("Business flight passengers list:");
//         for (Passenger passenger: businessFlight.getPassengersList()){
//             System.out.println(passenger.getName());
//         }
//         System.out.println("Economy flight passengers list:");
//         for (Passenger passenger: economyFlight.getPassengersList()){
//             System.out.println(passenger.getName());
//    }
// }
// }