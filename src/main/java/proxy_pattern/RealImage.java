package proxy_pattern;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println(fileName + " is loading");
    }

    @Override
    public void display(){
        System.out.println(fileName + " is displaying");
    }

}
