package com.study.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author wenjun
 * @Date 2020/9/25
 * @Description
 */
public class Leader implements IEmployee{
    private Map<String,IEmployee> employees = new HashMap<>();

    public Leader(){
        this.employees.put("爬虫",new EmployeeA());
        this.employees.put("海报图",new EmployeeB());
    }

    @Override
    public void doing(String task) {
        if(!employees.containsKey(task)){
            System.out.println("这个任务完成不了,超出能力范围");
        }else{
            employees.get(task).doing(task);
        }

    }
}
