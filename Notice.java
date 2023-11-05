public abstract class Notice {
    protected String noticeContent;

    public Notice(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public abstract void display();
}
