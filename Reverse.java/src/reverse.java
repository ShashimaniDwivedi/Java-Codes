
    public class reverse {
        public static void main(String[] args) {

            //Case 1: PWJAVA->AVAJWP
            System.out.println("*********CASE 1*********");
            String str1 = "pwjava";
            String str2 = "";
            for (int i = str1.length()-1; i >= 0; i--) {
                str2 = str2 + str1.charAt(i);
            }
            System.out.println("Before reversing : " +str1);
            System.out.println("After reversing : " +str2);

            //Case 2: PW JAVA->JAVA PW
            System.out.println("********CASE 2***********");
            String str3 = "pw java";
            String str4 = "";
            String array[] = str3.split(" ");
            for (int i = array.length - 1; i >= 0; i--) {
                str4 = str4 + array[i] + " ";
            }
            System.out.println("Before reversing : " +str3);
            System.out.println("After reversing : " +str4);

            //Case 3: PW JAVA->WP AVAJ
            System.out.println("**********CASE 3*********");
            String str5 = "pw java";
            String str6 = "";
            String arr[]=str5.split(" ");
            for(String element:arr)
            {
                for (int i = element.length() - 1; i >= 0; --i)
                {
                    str6 = str6 + element.charAt(i);
                }
                str6+=" ";
            }
            System.out.println("Before reversing : " + str5);
            System.out.println("After reversing : " + str6);

            //CASE 4:PW JAVA ->AVAJ WP

             System.out.println("**********CASE 4*********");
            String str7 = "pw java";
            String str8 = "";
                for (int i = str7.length() - 1; i >= 0; i--)
                {
                    str8 = str8 + str7.charAt(i);
                }
                str8=str8+" ";
            System.out.println("Before reversing " + str7);
            System.out.println("After reversing " + str8);
        }
    }

