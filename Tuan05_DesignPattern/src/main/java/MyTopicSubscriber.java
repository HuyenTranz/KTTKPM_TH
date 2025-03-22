public class MyTopicSubscriber implements Observer {
    private String name;
    private Subject subject;
    public MyTopicSubscriber(String nm) {
        this.name = nm;
    }
    @Override
    public void update() {
        String msg = (String) subject.getUpdate(this);
        System.out.println("MyTopicSubscriber.update" + " name: " + this.name + " - message: " +msg);
    }

    @Override
    public void setSubject(Subject sub) {
        this.subject = sub;
    }
}
