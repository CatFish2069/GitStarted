class Ascending extends Thread{
public void run(){
for(int i=0;i<=50;i++){
System.out.println("Ascending Thread: "+i);
}
}
}

class Descending extends Thread{
public void run(){
for(int i=50;i>=0;i--){
System.out.println("Descending Thread: "+i);
}
}
}

public class AscendingDescending{
public static void main(String args[]){
Ascending a = new Ascending();
a.start();
Descending d = new Descending();
d.start();
}
}