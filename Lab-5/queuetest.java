import java.lang.Exception;
import java.util.Scanner;
interface QueueImpl{
     void insert(int val);
     void delete();
     void display();
}
class QueueDemo implements QueueImpl {
    private int[] arr = new int[10];
    private int rear = -1;

    @Override
    public void insert(int val) {
        try{
            if (rear == 9) {
                throw new ArrayIndexOutOfBoundsException("Array is full!! cannot insert");
            }
            arr[++rear]=val;
            System.out.println("value inserted: "+ arr[rear]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("exception: "+e.getMessage());
        }
    }
    public void delete(){
        try{
            if(rear==-1)
            {   throw new Exception("Queue is empty");
            }
            int dval=arr[0];
            for(int i=0;i<rear;i++)
            {
                arr[i]=arr[i+1];
            }
            rear--;
            System.out.println("value deleted: "+ dval);
        }catch (Exception e){
            System.out.println("exception: "+e.getMessage());
        }
    }
    public void display(){
        try{
            if(rear==-1)
            {
               throw new Exception("Queue is empty!");
            }
            System.out.print("Queue: ");
            for(int i=0;i<rear;i++) System.out.print(arr[i]+"\t");
        }catch(Exception e){
            System.out.println("exception: "+e.getMessage());
        }
    }
}
public class queuetest {
    public static void main(String[] args) {
        QueueDemo myQueue = new QueueDemo();

        myQueue.insert(101);
        myQueue.insert(102);
        myQueue.display();

        myQueue.delete();
        myQueue.display();

        myQueue.delete();
        myQueue.delete();
    }
}
