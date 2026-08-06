
package Stack;

public class Custom_Stack {
    int[] data;
    private static final int DEFAULT_SIZE = 5;
    int pointer = -1;
    int size;

    public Custom_Stack() {
        this(DEFAULT_SIZE);
    }

    public Custom_Stack(int size) {
        data=new int[size];
    }

    public boolean isFull() {
        return pointer == size - 1;
    }

    public boolean isEmpty() {
        return pointer == -1;
    }

    public boolean push(int val) {
//        if (isFull()) {
//            System.out.println("Stack is full");
//            return false;
//        }

        data[++pointer] = val;
        return true;
    }

    public int  pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int delete = data[pointer];
        pointer--;
        return delete;
    }

    public int peek() {
        if (isFull()) {
            System.out.println("Peek element");
            return -1;
        }
        System.out.println(data[pointer]);
        return 0;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i <= pointer; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.println();
    }


    static void main() {
        Custom_Stack stack=new Custom_Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();
//        stack.pop();
//        stack.display();
//        stack.peek();
//        stack.display();

        System.out.println("Popped: " + stack.pop());

        stack.display();

        System.out.println("Top Element: " + stack.peek());
        stack.display();

    }

}
/*
public class Custom extends Custom_Stack {
            public Custom(int size) {
                super(size);
            }

            public boolean push(int val) {
                if (isFull()) {
                    int[] temp = new int[size * 2];
                    for (int i = 0; i < size; i++) {
                        temp[i] = data[i];
                    }
                    data = temp;
                }
                return super.push(val);
            }
        }*/

