package com.designpattern.CompositeDesignPattern.HumanExample;

import java.util.List;

/**
 * @Author: lxq
 * @Date: 2020/12/29 17:52
 */
public interface EmployeeRepo {

    List<Long> getDepartmentEmployeeIds(long id);

    double getEmployeeSalary(Long employeeId);
}
