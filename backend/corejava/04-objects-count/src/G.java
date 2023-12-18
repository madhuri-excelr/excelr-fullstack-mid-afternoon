class G 

{

        static int count;

        G(){

        }

        G(int i){

        }

        G(int i, int j){

        }

        {

                count ++;

        }

        public static void main(String[] args) 

        {

                G obj1 = new G();

                G obj2 = new G();

                G obj3 = new G(20);

                G obj4 = new G();

                G obj5 = new G();

                G obj6 = new G(1, 4);

                G obj7 = new G();

                G obj8 = new G();

                G obj9 = new G();

                G obj10 = new G(7, 8);

                System.out.println(count);

        }
}