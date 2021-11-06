package methods;

public class JavaMethods1 {

            public static void main(String[] args) {

                int maxNum = Math.max(4,9);
                System.out.println(maxNum);  // 9
                JavaMethods1 obj = new JavaMethods1();
                // System.out.println(obj.maximumNumber(6,2));
                System.out.println(maximumNumber(6,2));
                System.out.println(obj.sum(5,5));  // 10
            }

             //                             6         2
            public static int maximumNumber(int num1, int num2){
                int result;
                if (num1 > num2){  // 6 > 2 == 6
                    return num1;
                }else {
                    return num2;  // = 2
                }
            }
            public int sum(int a, int b){
                return a + b;
            }
        }
// Java Methods: 1. Pre-Defined method    --> creates by Java
//               2. User-Defined method   --> create by developers
// Java Methods: 1. Static     --> belongs to current class, have an access in current class
//               2. Non-Static --> have an access anywhere(current class, parallel class, same package, different package)
//                  Static  --> call itself in mainMethod(currentClass)
//                  Non-Static --> we have to create an object, and via object we can call method




