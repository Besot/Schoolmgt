package org.schoolmanagement.school.serviceImpli;

import org.schoolmanagement.school.entities.Applicant;
import org.schoolmanagement.school.entities.RequestBook;
import org.schoolmanagement.school.entities.enums.Role;
import org.schoolmanagement.school.services.ApplicantServices;
import org.schoolmanagement.school.services.BookInterface;
import org.schoolmanagement.school.services.LibraryInterface;

import java.util.*;

public class ServicesImpl implements ApplicantServices {
    @Override
    public void admitStudent(Applicant applicant) {

//
//
//        // A Ternary operator to determine admission status based on minimum cut off mark of 60
//        boolean admissionTerm = applicant.getAge()>= 12;
//        String admissionStatus = admissionTerm? applicant.getScore()+" You have been offered ADMISSION": "You didn't meet the CUT-OFF MARK!";
//
//        System.out.println(admissionStatus);



    }

//    public static class FunctionalInterfaceImpl {
//        private final Queue<RequestBook> firstComeFirstServed = new LinkedList<>();
//        final PriorityQueue<RequestBook> teacherSeniorJuniorPriority = new PriorityQueue<>(Comparator.comparing(RequestBook::getPriority));
//        private final Map<String, Integer> bookQuantity = new HashMap<>();
//
//
//        public LibraryInterface<String, String, Role> fifoRequest = (nameOfRequester, bookTitle, requesterRole) -> {
//            if (bookIsAvailable(bookTitle)) {
//                firstComeFirstServed.add(new RequestBook(nameOfRequester, bookTitle, requesterRole));
//                System.out.println(nameOfRequester + ", a " + requesterRole + " requested the book '" + bookTitle);
//            } else {
//                System.out.println( nameOfRequester+", Book titled: " + bookTitle + " is not available.");
//            }
//        };
//
//        public void grantFifoRequest() {
//            System.out.println();
//            try {
//                firstComeFirstServed.stream()
//                        .filter(requestBook -> bookIsAvailable(requestBook.getBookTitle()))
//                        .forEach(requestBook -> {
//                            try {
//                                giveBooks.initialize(requestBook.getBookTitle(), 1);
//                                System.out.println("Issued " + requestBook.getBookTitle() + " to "+ requestBook.getNameOfRequester()+ " a " + requestBook.getRequester());
//                            } catch (Exception e) {
//                                System.out.println("Kindly attend to error"+e.getMessage());
//                            }
//                        });
//            } catch (Exception e) {
//                System.out.println("Attend to error"+e.getMessage());
//            }
//        }
//
//
//        public LibraryInterface<String, String, Role> priorityRequest = (nameOfRequester, bookTitle, requester) -> {
//            if (bookIsAvailable(bookTitle)) {
//                teacherSeniorJuniorPriority.add(new RequestBook(nameOfRequester, bookTitle, requester));
//                System.out.println(nameOfRequester + ", a " + requester + " requested the book '" + bookTitle);
//            } else {
//                System.out.println(nameOfRequester+", Book titled: " + bookTitle + " is not available.");
//            }
//        };
//
//        public void grantPriorityRequest() {
//            try{
//                for (Role priorityPosition : Role.values()) {
//                    List<RequestBook> currentPriorityRequests = teacherSeniorJuniorPriority.stream()
//                            .filter(request -> request.getRequester() == priorityPosition && bookIsAvailable(request.getBookTitle()))
//                            .toList();
//                    for (RequestBook request : currentPriorityRequests) {
//                        try {
//                            giveBooks.initialize(request.getBookTitle(),1);
//                            System.out.println("Issued '" + request.getBookTitle() + "' with priority to "+ request.getNameOfRequester()+" a " + request.getRequester() + ".");
//                        } catch(Exception e){
//                            System.out.println(" Fix the error : " + e.getMessage());
//                        }
//                    }
//                    teacherSeniorJuniorPriority.removeAll(currentPriorityRequests);
//                }
//            } catch (Exception e) {
//                System.out.println("Fix the error: " + e.getMessage());
//            }
//        }
//
//
//
//        public boolean bookIsAvailable  (String bookTitle) {
//            bookQuantity.computeIfAbsent(bookTitle, k -> 0);
//            return bookQuantity.get(bookTitle) > 0;
//        }
//        // bookQuantity::put is adding the inputted book quantity to my hashmap
//        public BookInterface<String , Integer> addBook = bookQuantity::put;
//        private int getBookQuantity(String bookTitle) {
//            return bookQuantity.getOrDefault(bookTitle, 0);
//        }
//
//        public BookInterface<String, Integer> giveBooks =(bookTitle,  count) -> {
//            int currentCount = getBookQuantity(bookTitle);
//            if (currentCount >= count) {
//                bookQuantity.put(bookTitle, currentCount - count);
//            } else {
//                System.out.println("Not enough copies of '" + bookTitle + "' available.");
//            }
//        };
//        public void displayBookAvailability(){
//            System.out.println("Book Availability:");
//            bookQuantity.forEach((key, value)->System.out.println(key + ": " + value));
//        }
//
//
//    }
}
