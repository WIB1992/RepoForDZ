package com.dmitriev.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProjectKey implements Serializable {

    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "customer_id")
    private int customerId;

    public ProjectKey() {
    }

    public ProjectKey(int employeeId, int customerId) {
        this.employeeId = employeeId;
        this.customerId = customerId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectKey that = (ProjectKey) o;
        return employeeId == that.employeeId && customerId == that.customerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, customerId);
    }
}
