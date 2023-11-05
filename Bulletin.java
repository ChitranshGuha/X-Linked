public class Bulletin extends Notice {
    private String noticeContent;

    public Bulletin(String noticeContent) {
        super(noticeContent);
        this.noticeContent = noticeContent;
    }

    @Override
    public void display() {
        System.out.println("Bulletin: " + noticeContent);
    }
}
