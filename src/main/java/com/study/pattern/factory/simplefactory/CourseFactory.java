package com.study.pattern.factory.simplefactory;

/**
 * @Author wenjun
 * @Date 2020/9/16
 * @Description
 */
public class CourseFactory {
   /* public ICourse create(String className){
        if("java".equals(className)){
            return new JavaCourse();
        }else if("python".equals(className)){
            return new PyCourse();
        }else{
            return null;
        }
    }*/
   /* public ICourse create(String className){
        try {
            if (!(null == className || "".equals(className))) {
                return (ICourse) Class.forName(className).newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }*/
    public ICourse create(Class<? extends ICourse> clazz){
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
