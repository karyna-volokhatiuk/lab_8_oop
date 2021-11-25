package proxy_pattern;

public class ProxyPatternDemo {
    public static void main(){
        Image demoImage = new ProxyImage("image1.jpg");
        demoImage.display();
        demoImage.display();
    }
}
