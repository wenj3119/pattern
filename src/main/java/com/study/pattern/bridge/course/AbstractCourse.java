package com.study.pattern.bridge.course;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class AbstractCourse implements ICourse{
    private INote note;
    private IVideo video;

    public INote getNote() {
        return note;
    }

    public void setNote(INote note) {
        this.note = note;
    }

    public IVideo getVideo() {
        return video;
    }

    public void setVideo(IVideo video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "AbstractCourse{" +
                "note=" + note +
                ", video=" + video +
                '}';
    }
}
