package stringBuilder1;

public class StringBuilderClass1 {
    public static void main(String[] args) {

                String name = "Bred";
                String lastName = " Pitt ";
                int age = 49;
                System.out.println(name.length());  // 4
                System.out.println(name);  //Bred
                System.out.println(name.concat(lastName));
                System.out.println(name + lastName + age);

                // First way

                StringBuilder sb1 = new StringBuilder();
                System.out.println(sb1.capacity()); // 16

                // Second way

                StringBuilder sb2 = new StringBuilder(8);
                System.out.println(sb2.capacity());  // 8

                // Third way

                StringBuilder sb3 = new StringBuilder("Good Morning!");
                System.out.println(sb3);
                System.out.println(sb3.capacity());  // oldCapacity + newCapacity ==> 16 + 13 = 29
                StringBuilder sb4 = new StringBuilder("Hello");
                System.out.println(sb4.capacity());  // 16 + 5 = 21
                System.out.println(sb4);  // Hello
                System.out.println(sb4.toString());  // Hello
                System.out.println("________________________________");



                StringBuilder sb5 = new StringBuilder("Welcome");
              // sb5.append(" to");
              // sb5.append(" Bishkek");
                sb5.append(" to").append(" Bishkek").append("!!!");
                System.out.println(sb5);

                // 1. .append()  --> string + string

                StringBuilder sb11 = new StringBuilder("Digital");
                sb11.append("Nomads");
                System.out.println(sb11);

                // 2. .append(int i)  --> string + integer

                StringBuilder sb22 = new StringBuilder("iPhone");
                sb22.append(13);
                System.out.println(sb22);  // iphone13

                // 3. .append(Object o)  -->  string + object

                StringBuilder sb33 = new StringBuilder("My new ");
                sb33.append(sb22);
                System.out.println(sb33);  // My new iPhone13
                sb22.append(true);
                System.out.println("SB22: " + sb22);  // SB22: iPhone13true
                sb22.append(23.6f);
                System.out.println("SB22: " + sb22.toString());  // SB22: iPhone13true23.6

                // .toString()
                System.out.println(sb33.toString());  // My new iPhone13

                // .insert()

                StringBuilder sb6 = new StringBuilder("Yelow");
                sb6.insert(2,"L");  // YeLlow
                System.out.println(sb6);
                StringBuilder sb7 = new StringBuilder("AsanUson");
                sb7.insert(4, " uulu ");  // Asan uulu Uson
                System.out.println(sb7);
                // WindowsXP
                StringBuilder sb8 = new StringBuilder("Windows");
                sb8.insert(7, "XP");
                System.out.println(sb8);
                System.out.println(sb8.indexOf("X")); // 7


                // .replace()


                //                                    0123456
                StringBuilder sb9 = new StringBuilder("HelloHi"); // elloH
                sb9.replace(1,5,"amigos");
                System.out.println(sb9);
                // KingsMan
                StringBuilder sb10 = new StringBuilder("KingsLion!");
                sb10.replace(5, 9, "Man");  // KingsMan!
                System.out.println(sb10);

                // .reverse()

                StringBuilder sb12 = new StringBuilder("Welcome!");
                System.out.println(sb12);
                sb12.reverse();
                System.out.println(sb12);
                // taC
                StringBuilder sb13 = new StringBuilder("Cat");
                System.out.println(sb13);  // Cat
                sb13.reverse();
                System.out.println(sb13);  // taC


                // .delete()


                //                                      012345678910
                StringBuilder sb14 = new StringBuilder("MacBookPro"); //Book
                sb14.delete(3,7);
                System.out.println(sb14);
                //Mercedes
                //                                      01234567891011
                StringBuilder sb15 = new StringBuilder("MercedesBenz");
                sb15.delete(8, 12);
                System.out.println(sb15);  // Mercedes


                // .deleteCharAt()


                //                                    01234
                StringBuilder sb = new StringBuilder("Boook");
                sb.deleteCharAt(3);
                System.out.println(sb);  // Book


                // capacity()


                // StringBuilder()
                StringBuilder s1 = new StringBuilder();
                System.out.println(s1.capacity());  // 16
                s1.append("2021");
                System.out.println(s1.capacity());  // 16
                s1.append("123456789012");  // 12 + 4 = 16
                System.out.println(s1.capacity());  // 16
                s1.append("123");  // 19
                System.out.println(s1.capacity()); //34  --> 16 * 2 + 2
                s1.append("34567890897765432vbcd");  //21 + 19 = 40  34*2+2=70
                System.out.println("Last result: " + s1.capacity()); //70
                // formula --> (oldCapacity * 2) + 2
                // Capacity by default = 16
                // value > 16  ---> 16*2+2=34
                // value > 34  ---> 34*2+2=70
                // value > 70  ---> 70*2+2=142
                // 21
                //  *2
                StringBuilder s2 = new StringBuilder(5);
                System.out.println(s2.capacity());
                // 21
                // 17
                // 16
                // deprecated  --> ustarelo


                // .subString()


                                                  //    01234567
              StringBuilder message = new StringBuilder("Message");
              String substringMethod = message.substring(4,7); //age
              System.out.println(substringMethod); //age
                                              //  0123456
              StringBuilder legend = new StringBuilder("Legend");
              String subStringMethod = legend.substring(3,6);
              System.out.println(subStringMethod);  // end
              // .indexOf()  --> Me
              //                                                        0                    2
              String indexOfMethod = message.substring(message.indexOf("M"),message.indexOf("s"));
              System.out.println(indexOfMethod); //Me
              String indexOfMethod2 = message.substring(0,2);
              System.out.println(indexOfMethod2);

              // nit
              //                                         0123456
              StringBuilder monitor = new StringBuilder("Monitor");
              String indexOf3 = monitor.substring(monitor.indexOf("n"), monitor.lastIndexOf("o"));
              System.out.println(indexOf3);

              // .length()

              System.out.println(monitor.length()); // 7

         // .charAt()


                System.out.println(monitor.charAt(6));  // 6
                 // Pool ---> without [new]
                 // Heap ---> with [new]
                String java = "Java"; // pool
                String language = "Java"; // pool
                String javaLang = "java"; // pool
                String javjav = new String("Java"); // Heap
                System.out.println(java == language); // true
                System.out.println(java.equals(language)); // true
                System.out.println(java.equalsIgnoreCase(javaLang)); // true
                System.out.println(language == javjav); // false
                System.out.println("_______________________________");

        // StringBuilder is mutable

                StringBuilder name1 = new StringBuilder("same");  // same name
                StringBuilder name2 = new StringBuilder("same");
                System.out.println(name1 == name2);  //false
                StringBuilder name3 = name1.append(" name");      // same name
                System.out.println(name3);  // same name
                System.out.println(name1);  // same name
                System.out.println("_______________________________");

        // String immutable

                String str1 = "Hello";  // Hello
                String str2 = "Hello";
                System.out.println(str1==str2);  // true
                String str3 = str1.concat(" world!");  // Hello world!
                System.out.println(str3); // Hello world!
                System.out.println(str1); // Hello
        // String: StringMethods works inside SOUT, otherwise StringMethods is ignored ---> immutable
        // StringBuilder: StringBuilderMethods works anywhere (inside/outside of SOUT) ---> mutable
                System.out.println("_______________________________");


        // .hashCode  with String


                String phone1 = "Phone";
                String phone2 = "Phone";
                System.out.println(phone1==phone2);  // true
                System.out.println(phone1 + "\n" + phone2);
                System.out.println("|||||||||||||");
                System.out.println(phone1.hashCode() + "\n" + phone2.hashCode());
                System.out.println("_______________________________");


        // .hashCode  with StringBuilder


                StringBuilder key1 = new StringBuilder("Key");
                StringBuilder key2 = new StringBuilder("Key");
                System.out.println(key1 == key2); // false
                System.out.println(key1 + "\n" + key2);
                System.out.println("|||||||||||||");
                System.out.println(key1.hashCode() + "\n" + key2.hashCode());
                System.out.println("_______________________________");

        // StringBuffer

                StringBuffer strBuff = new StringBuffer("Welcome");
                System.out.println(strBuff);
                strBuff.reverse();
                System.out.println(strBuff);

            }
        }
