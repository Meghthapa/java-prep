package DataEncapsulation;

import java.util.Collections;

/**
 * Created by meght on 4/4/2018.
 */
public class DataEncapsulation {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Thapa Industries");
        company.addEmployees("Samyra");
        company.addEmployees("Sangam");
        company.addEmployees("Megh");

        company.printSorted();
        company.addEmployees(null);
        company.printSorted();
    }

}
