class Parent {
        int phno;
        String name;

        public Parent(int phno, String name) {
        }

        public Parent() {

        }

        void display() {
            System.out.println(phno);
            System.out.println(name);
        }
    }
    class child extends Parent {
        String child_name;

        child(int phno, String name, String child_name) {
            //super.display();
            super(phno, name);
            this.child_name = child_name;
        }

        void show() {
            System.out.println(child_name);
        }
    }




       /* static class child extends Parent{
            String child_Name;

         *//*child(int phno,String name,String child_Name) {
             //super(phno, name);
             super();
         }*//*

            public child() {

            }
        }
        public void main(String[] args){
            child ch= new child();
            child();
        }
    }

*/

