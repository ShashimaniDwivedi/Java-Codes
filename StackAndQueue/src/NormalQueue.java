class NormalQueue {
  int front =0;
  int arr[];
  int size = 0;
  int cap = 0;
  NormalQueue(int c) {
    this.cap = c;
    arr=new int[cap];
  }
  void Enqueue(int x) { // TC->0(1)
    if (isFull()) {
      System.out.println("Queue is Full");
    }
    arr[size] = x;
    size++;
    System.out.println("Inserted Element is : "+x);
  }

  void Dequeue() { //TC->O(n)
    if (isEmpty()) {
      System.out.println("Queue is Empty");
    }
    else {
      System.out.println("Deleted Element is : " + arr[front]);
      for (int i = 0; i < size - 1; i++) {
        arr[i] = arr[i + 1];
      }
      size--;
    }
  }

  void Disp() {
     System.out.print("Element in Queue are : ");
    for (int i = front; i < size; i++) {
    System.out.print(arr[i]+" ");
   }
  }

  void getFront() {
    if (isEmpty()) {
      System.out.println("Queue is Empty");
    }
    System.out.println(arr[front]);
  }

  void getRear() {
   if (isEmpty()) {
      System.out.println("Queue is Empty");
    }
    System.out.println(arr[size]);
  }

  void size() {
    if (isEmpty()) {
      System.out.println("Queue is Empty : ");
    }
    System.out.println("Size of Queue is : " + size);
  }

  boolean isFull() {
    return cap == size;
  }

  boolean isEmpty() {
    return size == 0;
  }
  public static void main(String[] args) {
    NormalQueue nq = new NormalQueue(5);
    nq.Enqueue(23);
    nq.Enqueue(46);
    nq.Enqueue(78);
    nq.Enqueue(34);
    nq.Enqueue(67);
    try{
    nq.Enqueue(99);
    }
    catch (Exception e) {
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