/**
 * This file was generated by the JPA Modeler
 */
package io.github.jeddict.jnosql.employee;

import org.jnosql.artemis.Entity;

@Entity
public class FullTimeEmployee extends CompanyEmployee {

    private long salary;

    private long pension;

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public long getPension() {
        return pension;
    }

    public void setPension(long pension) {
        this.pension = pension;
    }

}