package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeaseTest {
    @Test void basicTest() {
        Lease lease = new Lease("Bob", 101, 100.00, "Term");

        // Test constructor values.

        // Tenant name.
        String name = lease.getTenantName();
        assertEquals("Bob", name);

        // Apartment number.
        int apartmentNum = lease.getApartmentNum();
        assertEquals(101, apartmentNum);

        // Monthly rent.
        double rent = lease.getMonthlyRent();
        assertEquals(100.00, rent);

        // Lease term.
        String term = lease.getLeaseTerm();
        assertEquals("Term", term);

        // Test setters and getters methods.

        // Tenant name.
        String testName = "Maria";
        lease.setTenantName(testName);
        String testingName = lease.getTenantName();
        assertEquals(testName, testingName);

        // Apartment number.
        int testApartmentNum = 102;
        lease.setApartmentNum(testApartmentNum);
        int testingApartmentNum = lease.getApartmentNum();
        assertEquals(testApartmentNum, testingApartmentNum);

        // Monthly rent.
        double testRent = 500.00;
        lease.setMonthlyRent(testRent);
        double testingRent = lease.getMonthlyRent();
        assertEquals(testRent, testingRent);

        // Lease term.
        String testTerm = "Is a term.";
        lease.setLeaseTerm(testTerm);
        String testingTerm = lease.getLeaseTerm();
        assertEquals(testTerm, testingTerm);
    }

    @ Test void testPetFee() {
        Lease lease = new Lease("Steve", 103, 200.00, "Term");
        // Testing rent value has changed before and after the addPetFee() method.
        System.out.println("Monthly rent before pet fee is: " + lease.getMonthlyRent() + ".");
        lease.addPetFee();
        System.out.println("Monthly rent after pet fee is: " + lease.getMonthlyRent() + ".");
    }
}