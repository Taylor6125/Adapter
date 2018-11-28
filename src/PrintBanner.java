public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    public void printweak() {
        showWithParen();
    }

    public void printStrong() {
        showWithAster();
    }
}
