package com.study.pattern.composite.general.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class Composite extends Component{
    private List<Component> mComponets;
    public Composite(String name) {
        super(name);
        this.mComponets = new ArrayList<>();
    }

    @Override
    public String operation() {
        StringBuilder builder = new StringBuilder(this.name);
        for(Component component : this.mComponets){
            builder.append("\n");
            builder.append(component.operation());
        }
        return builder.toString();
    }

    public boolean addChild(Component component){
        throw new UnsupportedOperationException("addChild not supported");
    }
    public boolean removeChild(Component component){
        throw new UnsupportedOperationException("removeChild not supported");
    }
    public Component getChild(int index){
        throw new UnsupportedOperationException("getChild not supported");
    }
}
