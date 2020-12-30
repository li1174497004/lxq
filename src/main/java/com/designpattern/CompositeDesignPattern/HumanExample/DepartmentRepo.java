package com.designpattern.CompositeDesignPattern.HumanExample;

import java.util.List;

/**
 * @Author: lxq
 * @Date: 2020/12/29 17:51
 */
public interface DepartmentRepo {

    List<Long> getSubDepartmentIds(long id);
}
