package com.study.pattern.composite.demo.safe;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class Folder extends Directory{
    private List<Directory> dirs ;
    private Integer level;
    public Folder(String name,Integer level) {
        super(name);
        this.level = level;
        this.dirs = new ArrayList<>();
    }

    @Override
    public void show() {
        System.out.println(this.name);
        for(Directory directory : dirs){
            if(this.level != null){
                for(int i = 0; i < this.level; i ++){
                    System.out.print("   ");
                }
                for(int i = 0 ; i < this.level; i ++){
                    if(i == 0){
                        System.out.print("+");
                    }
                    System.out.print("-");
                }
            }
            directory.show();
        }
    }
    public boolean add(Directory dir){
        return this.dirs.add(dir);
    }
    public boolean remove(Directory dir){
        return this.dirs.remove(dir);
    }
    public Directory get(int index){
        return this.dirs.get(index);
    }

    public void list(){
        for(Directory dir : dirs){
            System.out.println(dir.name);
        }
    }
}
