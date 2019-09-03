package queue;

public class queueclient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		queusingarray queue=new queusingarray(6);
		for(int i=1;i<=5;i++)
		{
			queue.enqueue(i*10);
		}
		queue.display();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.display();
		queue.enqueue(60);
		queue.enqueue(70);
		queue.display();
		queue.dequeue();
		queue.dequeue();
		queue.display();
		
	
	}

}
