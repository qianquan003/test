package com.xi.ListDemo;

import com.xi.model.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/12/26.
 */
public class MergeList {
    public void queryList() {
        List<Object[]> incomeList = new ArrayList();
        incomeList.add(new Object[]{1, "2015-10-11", 1, "LZL-980-2-402-D-20120511", 22.11, 0});
        incomeList.add(new Object[]{2, "2015-10-12", 2, "GYL-99-6-602-D-20120511", 55.55, 0});
        incomeList.add(new Object[]{3, "2015-10-13", 3, "GYL-99-6-602-D-20120511", 42.00, 0});
        List<Object[]> costList = new ArrayList();
        costList.add(new Object[]{1, "2015-10-11", 0, "", 0, 20.22});
        costList.add(new Object[]{2, "2015-10-12", 2, "", 0, 33.33});
        costList.add(new Object[]{3, "2015-10-13", 0, "", 0, 32.00});
        //combine two list
        List<Employee> list = combineList(incomeList, costList);
        if (list.size() > 0) {
            for (Employee emp : list) {
                System.out.println("emp.getEmpId():" + emp.getEmpId());
                System.out.println("emp.getEntryDate():" + emp.getEntryDate());
                System.out.println("emp.getContratId():" + emp.getContratId());
                System.out.println("emp.getContratNo():" + emp.getContratNo());
                System.out.println("emp.getIncome():" + emp.getIncome());
                System.out.println("emp.getCost():" + emp.getCost());
            }
        } else {
            System.out.println("no data");
        }
    }

    public List<Employee> combineList(List<Object[]> resList1, List<Object[]> resList2) {
        List<Object[]> paraList = new ArrayList<Object[]>();
        if (resList1 != null) {
            paraList.addAll(resList1);
            System.out.println("resList1.size():" + resList1.size());
        } else {
            System.out.println("resList1.size():no data");
        }
        if (resList2 != null) {
            paraList.addAll(resList2);
        }
        List<Employee> list = new ArrayList<Employee>();
        for (Object[] obj : paraList) {
            Employee emp = new Employee();
            if (obj[0] != null) {
                emp.setEmpId(Integer.valueOf(obj[0].toString()));
            }
            if (obj[1] != null) {
                emp.setEntryDate(obj[1].toString());
            }
            Integer coid = 0;
            if (obj[2] != null) {
                coid = Integer.valueOf(obj[2].toString());
            }
            String cono = null;
            if (obj[3] != null) {
                cono = obj[3].toString();
            }
            Double income = 0d;
            if (obj[4] != null) {
                income = Double.valueOf(obj[4].toString());
            }
            Double cost = 0d;
            if (obj[5] != null) {
                cost = Double.valueOf(obj[5].toString());
            }
            //combine
            if (!list.contains(emp)) {
                emp.setContratId(coid);
                emp.setContratNo(cono);
                emp.setIncome(income);
                emp.setCost(cost);
                list.add(emp);
            } else {
                int index = list.indexOf(emp);
                emp = list.get(index);
                if (coid != null && coid != 0) {
                    emp.setContratId(coid);
                }
                if (cono != null && cono != "") {
                    emp.setContratNo(cono);
                }
                if (income != null && income != 0) {
                    emp.setIncome(income);
                }
                if (cost != null && cost != 0) {
                    emp.setCost(cost);
                }
                list.set(index, emp);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        MergeList ml = new MergeList();
        ml.queryList();
    }
}
