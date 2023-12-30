class CircularQueue {
  int size = 0;
  int cap = 0;
  int arr[];
  int front = 0;

  CircularQueue(int x) {
    this.cap = x;
    arr=new int[cap];
  }
  void Enqueue(int Data) {
     if(isFull())
     {
       System.out.println("Queue is Full");
       return;
     }
     int rear = getRear();
     rear = (rear + 1) % cap;
     arr[rear] = Data;
     System.out.println("Inserted Element is : "+arr[rear]);
     size++;
  }

  void Dequeue() {
    if (isEmpty()) {
      System.out.println("Queue is Empty");
      return;
    }
    System.out.println("Deleted Element is : "+arr[front]);
    front = (front + 1) % cap;
    size--;
   
  }
  
  void Disp() {
    System.out.print("Element in Queue are : ");
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  boolean isEmpty() {
    return size == 0;
  }

  boolean isFull() {
    return (size == cap);
  }

  int getFront() {
    if (isEmpty()) {
      return -1;
    }
      return front;
  }

  int getRear() {
     if (isEmpty()) {
       return -1;
    }
    return (front+size-1)%cap;
  }

  void size() {
    if (isEmpty()) {
      System.out.println("No element in the queue");
    }
    else {
      System.out.println("Size of the queue is: " + size);
    }
  }
  
  public static void main(String[] args) {
    CircularQueue nq = new CircularQueue(5);
    nq.Enqueue(23);
    nq.Enqueue(46);
    nq.Enqueue(78);
    nq.Enqueue(34);
    nq.Enqueue(67);
    try {
      nq.Enqueue(99);
    } catch (Exception e) {
      System.out.println("Overflow! Cannot add element to the queue.");
    }
    nq.Disp();
    System.out.println();
    nq.size();
    nq.Dequeue();
    nq.Dequeue();
    nq.Dequeue();
    nq.Dequeue();
    nq.Dequeue();
    nq.Dequeue();
  }
}